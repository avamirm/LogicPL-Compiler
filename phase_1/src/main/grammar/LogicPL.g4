grammar LogicPL;

logicPL
    :   (func)* main EOF
    ;

main
    : MAIN { System.out.println("MainBody"); } LBRACK body* RBRACK
    ;

varDec
    : VAR_TYPE (LBRACE INT_VALUE RBRACE)? ID { System.out.println("VarDec: " + $ID.getText()); } (ASSIGN expression)? (COMMA ID (ASSIGN expression)?)* SEMICOLON
    ;

print
    : { System.out.println("Built-in: print");} PRINT LPAR (query1 | query2 | ID) RPAR SEMICOLON
    ;

loop
    : { System.out.println("Loop: for");} FOR LPAR ID COLON ID RPAR LBRACK body* RBRACK
    ;

body
    : varDec
    | loop
    | implication
    | predicate
//    | query1
//    | query2
    | returnStatement
    | assignment
    | print
//    | expression
    | funcCallStmt  /////add function call statement
    ;

implication
    : { System.out.println("Implication"); } LPAR expression RPAR ARROW_FUNC LPAR rightImplicateStatement RPAR
    ;

predicate
    : PRED_NAME { System.out.println("Predicate: " + $PRED_NAME.getText()); } LPAR ID  RPAR SEMICOLON
    ;

query1
    : LBRACE QUESTION_MARK PRED_NAME LPAR ID RPAR RBRACE
    ;

query2
    : LBRACE PRED_NAME LPAR QUESTION_MARK RPAR RBRACE
    ;

func
    : funcDec COLON VAR_TYPE LBRACK funcBody RBRACK
    ;

funcBody
    : (body)* returnStatement (body)*
    | (body)* ///////////////////////////////////////////////
    ;

funcDec
    : FUNCTION ID { System.out.println("FunctionDec: " + $ID.getText()); } argsList
    ;

funcCallStmt
    : {System.out.println("FunctionCall");} funcCall SEMICOLON
    ;

funcCall
    : ID argCall
    ;

argCall
    : LPAR (expression COMMA)* (expression) RPAR
    | LPAR RPAR
    ;

argsList
    : LPAR (VAR_TYPE arg COMMA)* (VAR_TYPE arg) RPAR
    | LPAR RPAR
    ;

arg
    : ID { System.out.println("ArgumentDec: " + $ID.getText()); }
    ;

rightImplicateStatement
    : (predicate | returnStatement | assignment | funcCallStmt)+ ////add function call statement
    ;

returnStatement
    : RETURN {System.out.println("Return");} (expression)? SEMICOLON
    ;

expression
    : orExpression expression_
    ;

expression_
    : OR orExpression { System.out.println("Operator: ||"); } expression_
    |
    ;

orExpression
    : andExpression orExpression_
    ;

orExpression_
    : AND andExpression { System.out.println("Operator: &&"); } orExpression_
    |
    ;

andExpression
    : isNotExpression andExpression_
    ;

andExpression_
    : EQUAL isNotExpression { System.out.println("Operator: =="); } andExpression_
    | NOT_EQUAL isNotExpression { System.out.println("Operator: !="); } andExpression_
    |
    ;

isNotExpression
    : ltGtExpression isNotExpression_
    ;

isNotExpression_
    : LT ltGtExpression { System.out.println("Operator: <"); } isNotExpression_
    | LT_EQ ltGtExpression { System.out.println("Operator: <="); } isNotExpression_
    | GT ltGtExpression { System.out.println("Operator: >"); } isNotExpression_
    | GT_EQ ltGtExpression { System.out.println("Operator: >="); } isNotExpression_
    |
    ;

ltGtExpression
    : addSubExpression ltGtExpression_
    ;

ltGtExpression_
    : PLUS addSubExpression { System.out.println("Operator: +"); } ltGtExpression_
    | MINUS addSubExpression { System.out.println("Operator: -"); } ltGtExpression_
    |
    ;

addSubExpression
    : multiDivExpression addSubExpression_
    ;

addSubExpression_
    : MULT multiDivExpression { System.out.println("Operator: *"); } addSubExpression_
    | DIV multiDivExpression { System.out.println("Operator: /"); } addSubExpression_
    | MODE multiDivExpression { System.out.println("Operator: %"); } addSubExpression_
    |
    ;

multiDivExpression
    : PLUS braceOperator { System.out.println("Operator: +"); }
    | MINUS braceOperator { System.out.println("Operator: -"); }
    | NOT braceOperator { System.out.println("Operator: !"); }
    | braceOperator
    ;

braceOperator
    : braceOperator LBRACE expression RBRACE
    | factor LBRACE expression RBRACE
    | factor
    ;

factor
    : LPAR expression RPAR
    | INT_VALUE | '0'
    | BOOL_VALUE
    | ID (LBRACE expression RBRACE)?
    | FLOAT_VALUE
    | arrayType
    | funcCall
    | query1
    | query2
    ;

assignment
    : ID (LBRACE expression RBRACE)? ASSIGN expression SEMICOLON
    ;

arrayType
    : LBRACE ((expression) COMMA)* (expression) RBRACE
    ;

BOOL_VALUE
    : TRUE
    | FALSE
    ;

VAR_TYPE
    : INT
    | FLOAT
    | BOOL
    ;

FUNCTION
    : 'function'
    ;

MAIN
    : 'main'
    ;

INT
    : 'int'
    ;

FLOAT
    : 'float'
    ;

BOOL
    : 'boolean'
    ;

TRUE
    : 'true'
    ;

FALSE
    : 'false'
    ;

PRINT
    : 'print'
    ;

FOR
    : 'for'
    ;

RETURN
    : 'return'
    ;

PRED_NAME
    : UPPER_ALPH [a-zA-Z0-9]*
    ;

INT_VALUE
    : [1-9][0-9]*
//    | '0'
    ;

FLOAT_VALUE
    : '0' DOT [0-9]*
    | [1-9][0-9]*
    | '0' ///////////////////////////////////////zero
   ;

LINE_COMMENT
    : '#' ~[\r\n]*
      -> skip
    ;

fragment
NON_DIGIT
    : [a-zA-Z_]
    ;
fragment
DIGIT
    : [0-9]
    ;

fragment
LOWER_ALPH
    : [a-z]
    ;

fragment
UPPER_ALPH
    : [A-Z]
    ;

ID
    : LOWER_ALPH[a-zA-Z0-9_]*
    ;

WHITE_SPACE
    : [ \t]+
     -> skip
    ;

LPAR
    : '('
    ;

RPAR
    : ')'
    ;

LBRACE
    : '['
    ;

RBRACE
     : ']'
     ;

MINUS
    : '-'
    ;

PLUS
    : '+'
    ;

NOT
    : '!'
    ;

MULT
    : '*'
    ;

DIV
    : '/'
    ;

MODE
    : '%'
    ;

LT_EQ
    : '<='
    ;

LT
    : '<'
    ;

GT_EQ
    : '>='
    ;

GT
    : '>'
    ;

EQUAL
    : '=='
    ;

NOT_EQUAL
    : '!='
    ;

ARROW_FUNC
    : '=>'
    ;

AND
    : '&&'
    ;

OR
    : '||'
    ;

ASSIGN
    : '='
    ;

SEMICOLON
    : ';'
    ;

COMMA
    : ','
    ;

COLON
    : ':'
    ;

DOT
    : '.'
    ;

LBRACK
    : '{'
    ;

RBRACK
    : '}'
    ;

QUESTION_MARK
    : '?'
    ;

NEW_LINE
    :   (   '\r' '\n'?
    | '\n'  ) -> skip
    ;