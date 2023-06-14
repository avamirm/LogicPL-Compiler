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

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
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
            String result = program.accept(codeGenerator);
            System.out.println(result);
            FileWriter writerObj = new FileWriter("res.j", false);
            writerObj.write(result);
            writerObj.close();
        }
}