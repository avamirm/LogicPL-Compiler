import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import ast.node.Program;
import compileError.CompileError;
import main.grammar.LogicPLLexer;
import main.grammar.LogicPLParser;
import visitor.nameAnalyzer.NameAnalyzer;
import visitor.astPrinter.ASTPrinter;
import visitor.codeGenerator.CodeGenerator;

import org.antlr.v4.runtime.*;
import visitor.typeAnalyzer.TypeAnalyzer;

public class Main { 
        private FileWriter mainFile;
        public static void main(String[] args) throws java.io.IOException {

            CharStream reader = CharStreams.fromFileName(args[0]);
            LogicPLLexer lexer = new LogicPLLexer(reader);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LogicPLParser parser = new LogicPLParser(tokens);
            Program program = parser.program().p;


            NameAnalyzer nameAnalyzer = new NameAnalyzer();
            nameAnalyzer.visit(program);

            TypeAnalyzer typeAnalyzer = new TypeAnalyzer();
            typeAnalyzer.visit(program);
            if (typeAnalyzer.typeErrors.size() > 0){
                for(CompileError compileError: typeAnalyzer.typeErrors)
                    System.out.println(compileError.getMessage());
                return;
            }

            System.out.println("Compilation was Successful!!");
            CodeGenerator codeGenerator = new CodeGenerator();
            program.accept(codeGenerator);
//            runJasminFiles();
    }

//    private void runJasminFiles() {
//        try {
//            System.out.println("\n-------------------Generating Class Files-------------------");
//            File dir = new File("./output");
//            Process process = Runtime.getRuntime().exec("java -jar jasmin.jar *.j", null, dir);
//            printResults(process.getInputStream());
//            printResults(process.getErrorStream());
//            System.out.println("\n---------------------------Output---------------------------");
//            process = Runtime.getRuntime().exec("java Main", null, dir);
//            printResults(process.getInputStream());
//            printResults(process.getErrorStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void printResults(InputStream stream) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
//        String line;
//        try {
//            while ((line = reader.readLine()) != null)
//                System.out.println(line);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private void prepareOutputFolder() {
        String outputPath = "./output/";
        String jasminPath = "Utilities/jarFiles/jasmin.jar";
        String listClassPath = "Utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "Utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
             directory.mkdir();
        }
        catch(SecurityException ignored) {}
        copyFile(jasminPath, outputPath + "jasmin.jar");
        copyFile(listClassPath, outputPath + "List.j");
        copyFile(fptrClassPath, outputPath + "Fptr.j");

        try {
            String path = outputPath + "Main.j";
            File file = new File(path);
            file.createNewFile();
            mainFile = new FileWriter(path);
        } catch (IOException ignored) {}
    }

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException ignored) {}
    }

}