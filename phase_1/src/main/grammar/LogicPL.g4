grammar LogicPL;


logicPL
    : (func)* main EOF
    ;

main
    : MAIN { System.out.println("MainBody"); } LBRACK body* RBRACK
    ;

nonExpVal
    : (((MINUS { System.out.println("Operator: -"); } | PLUS { System.out.println("Operator: +"); }| ) (INT_VALUE | FLOAT_VALUE)) | '0' | BOOL_VALUE | ID)
      (COMMA(((MINUS { System.out.println("Operator: -"); }| PLUS { System.out.println("Operator: +"); }| ) (INT_VALUE | FLOAT_VALUE)) | '0' | BOOL_VALUE | ID))*
    ;

varDec
    : ((VAR_TYPE (LBRACE INT_VALUE RBRACE) ID { System.out.println("VarDec: " + $ID.getText()); } (ASSIGN LBRACE nonExpVal RBRACE)?)
       |(VAR_TYPE  ID { System.out.println("VarDec: " + $ID.getText()); } (ASSIGN expression)?))
      SEMICOLON

    ;
print
    : { System.out.println("Built-in: print");} PRINT LPAR (query1 | query2 | variable) RPAR SEMICOLON
    ;

loop
    : { System.out.println("Loop: for");} FOR LPAR ID COLON ID RPAR LBRACK body* RBRACK
    ;

body
    : varDec
    | loop
    | implication
    | predicate
    | returnStatement
    | assignment
    | print
    ;

implication
    : { System.out.println("Implication"); } LPAR expression RPAR ARROW_FUNC LPAR rightImplicateStatement RPAR
    ;

predicate
    : PRED_NAME { System.out.println("Predicate: " + $PRED_NAME.getText()); } LPAR variable  RPAR SEMICOLON
    ;

variable
    : ID LBRACE expression RBRACE
    | ID
    ;

query1
    : LBRACE QUESTION_MARK PRED_NAME { System.out.println("Predicate: " + $PRED_NAME.getText()); } LPAR variable RPAR RBRACE
    ;

query2
    : LBRACE PRED_NAME { System.out.println("Predicate: " + $PRED_NAME.getText()); } LPAR QUESTION_MARK RPAR RBRACE
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
    : body+
    ;

returnStatement
    : RETURN {System.out.println("Return");} (nonExpVal)? SEMICOLON
    ;

expression
    : orExp expression_
    ;

expression_
    : OR orExp expression_ { System.out.println("Operator: ||"); }
    |
    ;

orExp
    : andExp orExp_
    ;

orExp_
    : AND andExp orExp_ { System.out.println("Operator: &&"); }
    |
    ;

andExp
    : eqNoteqExp andExp_
    ;

andExp_
    : EQUAL eqNoteqExp andExp_ { System.out.println("Operator: =="); }
    | NOT_EQUAL eqNoteqExp andExp_ { System.out.println("Operator: !="); }
    |
    ;

eqNoteqExp
    : ltGtExp eqNoteqExp_
    ;

eqNoteqExp_
    : LT ltGtExp eqNoteqExp_ { System.out.println("Operator: <"); }
    | LT_EQ ltGtExp eqNoteqExp_ { System.out.println("Operator: <="); }
    | GT ltGtExp eqNoteqExp_ { System.out.println("Operator: >"); }
    | GT_EQ ltGtExp eqNoteqExp_ { System.out.println("Operator: >="); }
    |
    ;

ltGtExp
    : addSubExp ltGtExp_
    ;

ltGtExp_
    : PLUS addSubExp  ltGtExp_ { System.out.println("Operator: +"); }
    | MINUS addSubExp  ltGtExp_ { System.out.println("Operator: -"); }
    |
    ;

addSubExp
    : multiDivExp addSubExp_
    ;

addSubExp_
    : MULT multiDivExp  addSubExp_ { System.out.println("Operator: *"); }
    | DIV multiDivExp  addSubExp_ { System.out.println("Operator: /"); }
    | MODE multiDivExp  addSubExp_ { System.out.println("Operator: %"); }
    |
    ;

multiDivExp
    : PLUS braceOperator { System.out.println("Operator: +"); }
    | MINUS braceOperator { System.out.println("Operator: -"); }
    | NOT braceOperator { System.out.println("Operator: !"); }
    | braceOperator
    ;

braceOperator
    : factor LBRACE expression RBRACE braceOperator_
    | factor braceOperator_
    ;

braceOperator_
    : LBRACE expression RBRACE braceOperator_
    |
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
    ;

FLOAT_VALUE
    : '0' DOT [0-9]*
    | [1-9][0-9]* DOT [0-9]*
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

NOT_EQUAL
    : '!='
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