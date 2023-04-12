grammar LogicPL;

logicPL
    :   ')'* EOF
    ;

varDec
    //: VAR_TYPE ID ASSIGN (FLOAT_VALUE | INT_VALUE | BOOL_VALUE) //    varDeclare:  varType ID{ System.out.println("VarDec : " + $ID.getText()); } (ASSIGN expression)? (COMMA ID { System.out.println("VarDec : " + $ID.getText()); }(ASSIGN expression)?)*endLine
    : VAR_TYPE (LBRACE INT_VALUE RBRACE)? ID (ASSIGN expression)? (COMMA ID (ASSIGN expression)?)*
    ;

//varDec
//    :   VAR_TYPE ID { System.out.println("VarDec : " + $ID.getText()); } (ASSIGN expression)? SEMICOLON
//    |   assignment
//    ;

loop
    :   FOR LPAR ID COLON ID RPAR LBRACK loopBodyContent* RBRACK
    ;

loopBodyContent
    : varDec
    | loop
    | implication
    | predicate
    | query1
    | query2
    | func
    | returnStatement
    | assignment
    | expression
    ;

implication
    :   LPAR expression RPAR ARROW_FUNC LPAR rightImplicateStatement RPAR
    ;

predicate
    :   PRED_NAME LPAR ID RPAR
    ;

query1
    :   LBRACE '?' PRED_NAME LPAR ID RPAR RBRACE
    ;

query2
    :   LBRACE PRED_NAME LPAR '?' RPAR RBRACE
    ;

func
//    :   funcDec ':' (if_ | returnStatement)
//    |   funcDec ':' '{' body '}'
    :   funcDec COLON VAR_TYPE LBRACK ':' RBRACK
    ;

funcDec
    :   FUNCTION ID { System.out.println("FunctionDec : " + $ID.getText()); } argDec
    ;

argDec
    :   LPAR (VAR_TYPE arg COMMA)* (VAR_TYPE arg) RPAR
    |   LPAR RPAR
    ;

arg
    :   ID { System.out.println("ArgumentDec : " + $ID.getText()); }
    ;

//leftImplicateStatement
//    :   leftStatementSequence (leftStatementSequence)*
//    ;
//
//leftStatementSequence
//    :   expression
//    ;

rightImplicateStatement
    :   (rightStatementSequence)+
    ;

rightStatementSequence
    :   predicate
    |   returnStatement
    ;

returnStatement
    :   RETURN {System.out.println("Return");} expression SEMICOLON
    ;

expression
    :   expression OR orExpression { System.out.println("Operator : or"); }
    |   orExpression
    ;
//statement
//    :   varDeclare

orExpression
    :   orExpression AND andExpression { System.out.println("Operator : and"); }
    |   andExpression
    ;


andExpression
    :   andExpression EQUAL isNotExpression { System.out.println("Operator : is"); }
    |   andExpression NOT_EQUAL isNotExpression { System.out.println("Operator : not"); }
    |   isNotExpression
    ;

isNotExpression
    :   isNotExpression LT ltgtExpression { System.out.println("Operator : <"); }
    |   isNotExpression LT_EQ ltgtExpression { System.out.println("Operator : <="); }
    |   isNotExpression GT ltgtExpression { System.out.println("Operator : >"); }
    |   isNotExpression GT_EQ ltgtExpression { System.out.println("Operator : >="); }
    |   ltgtExpression
    ;

ltgtExpression
    :   ltgtExpression PLUS addSubExpression { System.out.println("Operator : +"); }
    |   ltgtExpression MINUS addSubExpression { System.out.println("Operator : -"); }
    |   addSubExpression
    ;

addSubExpression
    :   addSubExpression MULT mulDivExpression { System.out.println("Operator : *"); }
    |   addSubExpression DIV mulDivExpression { System.out.println("Operator : /"); }
    |   addSubExpression MODE mulDivExpression { System.out.println("Operator : /"); }
    |   mulDivExpression
    ;

mulDivExpression
    :   PLUS tildaNegOperator { System.out.println("Operator : +"); }
    |   MINUS tildaNegOperator { System.out.println("Operator : -"); }
    |   NOT tildaNegOperator { System.out.println("Operator : !"); }
    |   tildaNegOperator
    ;

tildaNegOperator
    :   tildaNegOperator LBRACE expression RBRACE
    |   factor_ LBRACE expression RBRACE
    |   factor_
    ;

//factor_
//    :   LPAR expression RPAR
////    |   functionCall
////    |   anonymousFunctionCall
////    |   anonymousFunction
//    |   INT_VALUE
//    |   BOOL_VALUE
//    |   ID
//    |   FLOAT_VALUE
//    |   arrayType
//    |   predicate
//    |   query1
//    |   query2
////    |   listType
//    ;

factor_
//    :   varDec
    :   LPAR expression RPAR
    |   INT_VALUE
    |   BOOL_VALUE
    |   ID (LBRACE expression RBRACE)?
    |   FLOAT_VALUE
    |   arrayType
//    |   predicate
    |   query1
    |   query2
//    |   loop
//    |   assignment
    ;

assignment
    :   ID (LBRACE expression RBRACE)? ASSIGN expression
    ;

arrayType
    : LBRACE ((expression) COMMA)* (expression) RBRACE
//    | LBRACE RBRACE
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
    | '0'
    ;

FLOAT_VALUE
    : '0' DOT [0-9]*
    | [1-9][0-9]*
   // | '0' ///////////////////////////////////////zero
   ;

LINE_COMMENT
    : '#' ~[\r\n]*
      -> skip
    ;

fragment
NON_DIGIT
    :   [a-zA-Z_]
    ;
fragment
DIGIT
    :   [0-9]
    ;

fragment
LOWER_ALPH
    :   [a-z]
    ;

fragment
UPPER_ALPH
    :   [A-Z]
    ;

ID
    : LOWER_ALPH[a-zA-Z0-9_]*
    ;

WHITE_SPACE
    :   [ \t]+
        -> skip
    ;
////////////////////////////////////////////////////////////
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
NEW_LINE
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;