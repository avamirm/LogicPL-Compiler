grammar LogicPL;

@header{
import ast.node.*;
import ast.node.expression.*;
import ast.node.statement.*;
import ast.node.declaration.*;
import ast.node.expression.values.*;
import ast.node.expression.operators.*;
import ast.type.primitiveType.*;
import ast.type.*;
}

program returns[Program p]:
    {$p = new Program(); $p.setLine(0);}
    (f = functionDec {$p.addFunc($f.functionDeclaration);})*
    main = mainBlock {$p.setMain($main.main) ;}
    ;

functionDec returns[FuncDeclaration functionDeclaration]:
    {ArrayList<ArgDeclaration> args = new ArrayList<>();
     ArrayList<Statement> statements = new ArrayList<>();}
    FUNCTION name = identifier
    LPAR (arg1 = functionVarDec {args.add($arg1.argDeclaration);} (COMMA arg = functionVarDec {args.add($arg.argDeclaration);})*)? RPAR COLON returnType = type
    LBRACE ((stmt = statement {statements.add($stmt.statementRet);})+) RBRACE
    {$functionDeclaration = new FuncDeclaration($name.identifierRet, $returnType.typeRet, args, statements); $functionDeclaration.setLine($name.identifierRet.getLine());}
    ;

functionVarDec returns [ArgDeclaration argDeclaration]:
    t = type arg_iden = identifier {$argDeclaration = new ArgDeclaration($arg_iden.identifierRet, $t.typeRet); $argDeclaration.setLine($arg_iden.identifierRet.getLine());}
    ;

mainBlock returns [MainDeclaration main]:
    {ArrayList<Statement> mainStmts = new ArrayList<>();}
    m = MAIN LBRACE (s = statement {mainStmts.add($s.statementRet);})+ RBRACE
    {$main = new MainDeclaration(mainStmts); $main.setLine($m.getLine());}
    ;

statement returns [Statement stmtRet]:
    s1 = assignSmt {$stmtRet = $s1.assignStmtRet;}
	| (s2 = predicate SEMICOLON {$stmtRet = $s2.predicateRet;})
    | s3 = implication {$stmtRet = $s3.implicationRet;}
	| s4 = returnSmt {$stmtRet = $s4.returnRet;}
    | s5 = printSmt {$stmtRet = $s5.PrintStmtRet;}
	| s6 = forLoop {$stmtRet = $s6.forLoopRet;}
	| s7 = localVarDeclaration {$stmtRet = $s7.localvarDecRet;}
    ;

assignSmt returns [AssignStmt assignStmtRet]:
    v = variable line = ASSIGN e = expression SEMICOLON
    {$assignStmtRet = new AssignStmt($v.varRet,  $e.exprRet); $assignStmtRet.setLine($line.getLine());}
    ;

variable returns [Variable varRet]:
    idn = identifier {$varRet = $idn.identifierRet;}
	| name = identifier LBRACKET e = expression RBRACKET {$varRet = new ArrayAccess($name.identifierRet.getName(), $e.exprRet);
	$varRet.setLine($name.identifierRet.getLine()); }
    ;

localVarDeclaration returns [Statement localvarDecRet]:
    s1 = varDeclaration {$localvarDecRet = $s1.varDecRet;}
    | s2 = arrayDeclaration {$localvarDecRet = $s2.arrayDecRet;}
    ;

varDeclaration returns [VarDecStmt varDecRet]:
    t = type idn = identifier {$varDecRet = new VarDecStmt($idn.identifierRet, $t.typeRet);
	$varDecRet.setLine($idn.identifierRet.getLine());}
	(ASSIGN e = expression {$varDecRet.setInitialExpression($e.exprRet);})? SEMICOLON
    ;

arrayDeclaration returns [ArrayDecStmt arrayDecRet]:
	t = type LBRACKET INT_NUMBER RBRACKET
	idn = identifier {$arrayDecRet = new ArrayDecStmt($idn.identifierRet, $t.typeRet, $INT_NUMBER.int);
					$arrayDecRet.setLine($idn.identifierRet.getLine());}
	(init = arrayInitialValue {$arrayDecRet.setInitialValues($init.initialValues);})? SEMICOLON
	;

arrayInitialValue returns [ArrayList<Expression> initialValues]:
    ASSIGN arrList = arrayList {$initialValues = $arrList.values;}
    ;

arrayList returns [ArrayList<Expression> values]:
    {$values = new ArrayList<Expression>();}
    LBRACKET (v = value {$values.add($v.valueRet);}| idn = identifier {$values.add($idn.identifierRet);}) (COMMA (v_ = value {$values.add($v_.valueRet);}| idn_ = identifier {$values.add($idn_.identifierRet);}))* RBRACKET
    ;

printSmt returns [PrintStmt PrintStmtRet]:
	pLine = PRINT LPAR expr = printExpr RPAR SEMICOLON
    {$PrintStmtRet = new PrintStmt($expr.printExprRet); $PrintStmtRet.setLine($pLine.getLine());}
	;

printExpr returns [Expression printExprRet]:
    v = variable {$printExprRet = $v.v;}
    | q = query {$printExprRet = $q.queryRet;}
    ;

query returns [QueryExpression queryRet]:
	q1 = queryType1 {$queryRet = $q1.query1Ret;}
    | q2 = queryType2 {$queryRet = $q2.query2Ret;}
    ;

queryType1 returns [QueryExpression query1Ret]:
	LBRACKET line = QUARYMARK predId = predicateIdentifier LPAR var = variable RPAR RBRACKET
    {$query1Ret = new QueryExpression($preId.predicateIdentifierRet); $query1Ret.setLine($line.getLine()); $query1Ret.setVar($var.v);}
	;

queryType2 returns [QueryExpression query2Ret]:
	LBRACKET predId = predicateIdentifier LPAR line = QUARYMARK RPAR RBRACKET
    {$query2Ret = new QueryExpression($predId.predicateIdentifierRet); $query2Ret.setLine($line.getLine()); }
	;

returnSmt returns [ReturnStmt returnRet]:
    RETURN (v = value {$returnRet = new ReturnStmt($v.valueRet);} | idn = identifier {$returnRet = new ReturnStmt($idn.identifierRet);})? SEMICOLON
	{
		if ($returnRet == null)
		{
			$returnRet = new ReturnStmt(null);
		}
	}
    {$returnRet.setLine($RETURN.getLine());}
    ;

forLoop returns [ForloopStmt forLoopRet]:
    {ArrayList<Statement> bodyStmts = new ArrayList<>();}
	forLine = FOR LPAR idn = identifier COLON arrName = identifier RPAR LBRACE (
		(stmt = statement{bodystmts.add($stmt.statementRet)})*) RBRACE
    {$forLoopRet = new ForloopStmt($idn.identifierRet, $arrName.identifierRet, bodyStmts); $forLoopRet.setLine($forLine.getLine());}
	;

predicate returns [PredicateStmt predicateRet]:
 	predIdn = predicateIdentifier LPAR v = variable RPAR
	{$predicateRet = new PredicateStmt($predIdn.predicateIdentifierRet, $v.v); $predicateRet.setLine($predIdn.predicateIdentifierRet.getLine());}
    ;

implication returns [ImplicationStmt implicationRet]:
	{ArrayList<Statement> results = new ArrayList<>();}
    LPAR e = expression RPAR a = ARROW LPAR ((s = statement {results.add($s.statementRet);})+) RPAR
    {$implicationRet = new ImplicationStmt($e.exprRet, results); $implicationRet.setLine($a.getLine());}
    ;

expression returns [Expression exprRet]:
 	l = andExpr r = expression2
	{
		if ($r.exprRet != null)
		{
			$exprRet = new BinaryExpression($l.exprRet, $r.exprRet.getRight(), $r.exprRet.getBinaryOperator());
			$exprRet.setLine($r.exprRet.getLine());
		}
		else
		{
			$exprRet = $l.exprRet;
		}
	}
	;

expression2 returns [BinaryExpression binaryExprRet]:
	{BinaryExpression bep;}
	OR l = andExpr r = expression2
	{
		if ($r.binaryExprRet != null)
		{
			$bep = new BinaryExpression($l.binaryExprRet, $r.binaryExprRet.getRight(), $r.binaryExprRet.getBinaryOperator());
			$bep.setLine($r.binaryExprRet.getLine());
			$binaryExprRet = new BinaryExpression(null, $ee, BinaryOperator.or);
		}
		else
		{
			$binaryExprRet = new BinaryExpression(null, $l.binaryExprRet, BinaryOperator.or);
		}
	}
    {$binaryExprRet.setLine($OR.getLine());}
	| {$binaryExprRet = null;}
	;

andExpr returns [Expression exprRet]:
	l = eqExpr r = andExpr2
    {
		if ($r.exprRet != null)
		{
			$exprRet = new BinaryExpression($l.exprRet, $r.exprRet.getRight(), $r.exprRet.getBinaryOperator());
			$exprRet.setLine($r.exprRet.getLine());
		}
		else
		{
			$exprRet = $l.exprRet;
		}
	}
    ;

andExpr2 returns [BinaryExpression binaryExprRet]:
	{BinaryExpression bep;}
	AND l = eqExpr r = andExpr2
	{
		if ($r.binaryExprRet != null)
		{
			$bep = new BinaryExpression($l.binaryExprRet, $r.binaryExprRet.getRight(), $r.binaryExprRet.getBinaryOperator());
			$bep.setLine($r.binaryExprRet.getLine());
			$binaryExprRet = new BinaryExpression(null, $bep, BinaryOperator.and);
		}
		else
		{
			$binaryExprRet = new BinaryExpression(null, $l.binaryExprRet, BinaryOperator.and);
		}
	}
    {$binaryExprRet.setLine($AND.getLine());}
	| {$binaryExprRet = null;}
	;

eqExpr returns [Expression exprRet]:
	l = compExpr r = eqExpr2
    {
		if ($r.exprRet != null)
		{
			$exprRet = new BinaryExpression($l.exprRet, $r.exprRet.getRight(), $r.exprRet.getBinaryOperator());
			$exprRet.setLine($r.exprRet.getLine());
		}
		else
		{
			$exprRet = $l.exprRet;
		}
	}
    ;

eqExpr2 returns [BinaryExpression binaryExprRet]:
	{BinaryOperator bop; BinaryExpression bep;}
	(
		op = EQ {$bop = BinaryOperator.eq;}
		| op = NEQ {$bop = BinaryOperator.neq;})
		l = compExpr r = eqExpr2
		{
			if ($r.binaryExprRet != null)
			{
				$bep = new BinaryExpression($l.binaryExprRet, $r.binaryExprRet.getRight(), $r.binaryExprRet.getBinaryOperator());
				$bep.setLine($r.binaryExprRet.getLine());
				$binaryExprRet = new BinaryExpression(null, $bep, $opt);
			}
			else
			{
				$binaryExprRet = new BinaryExpression(null, $l.binaryExprRet, $opt);
			}
		}
    	{$binaryExprRet.setLine($op.getLine());}
	| {$binaryExprRet = null;}
	;

compExpr returns [Expression exprRet]:
	l = additive r = compExpr2
    {
		if ($r.exprRet != null)
		{
			$exprRet = new BinaryExpression($l.exprRet, $r.exprRet.getRight(), $r.exprRet.getBinaryOperator());
			$exprRet.setLine($r.exprRet.getLine());} else {$exprRet = $l.exprRet;
		}
	}
    ;

compExpr2 returns [BinaryExpression binaryExprRet]:
	{BinaryOperator bop; BinaryExpression bep;}
	(
		op = LT {$bop = BinaryOperator.lt;}
		| op = LTE {$bop = BinaryOperator.lte;}
		| op = GT {$bop = BinaryOperator.gt;}
		| op = GTE{$bop = BinaryOperator.gte;})
		l = additive r = compExpr2
		{
			if ($r.binaryExprRet != null)
			{
				$bep = new BinaryExpression($l.binaryExprRet, $r.binaryExprRet.getRight(), $r.binaryExprRet.getBinaryOperator());
				$bep.setLine($r.binaryExprRet.getLine());
				$binaryExprRet = new BinaryExpression(null, $bep, $bop);
			}
			else
			{
				$binaryExprRet = new BinaryExpression(null, $l.binaryExprRet, $bop);
			}
		}
    	{$binaryExprRet.setLine($op.getLine());}
		| {$binaryExprRet = null;}
		;

additive returns [Expression exprRet]:
 	l = multicative r = additive2
	{
		if ($r.exprRet != null)
		{
			$exprRet = new BinaryExpression($l.exprRet, $r.exprRet.getRight(), $r.exprRet.getBinaryOperator());
			$exprRet.setLine($r.exprRet.getLine());
		}
		else
		{
			$exprRet = $l.exprRet;
		}
	}
	;

additive2 returns [BinaryExpression binaryExprRet]:
	{BinaryOperator bop; BinaryExpression bep;}
	(
		op = PLUS {$bop = BinaryOperator.add;}
		| op = MINUS {$bop = BinaryOperator.sub;})
		l = multicative r = additive2
		{
			if ($r.binaryExprRet != null)
			{
				$bep = new BinaryExpression($l.binaryExprRet, $r.binaryExprRet.getRight(), $r.binaryExprRet.getBinaryOperator());
				$bep.setLine($r.binaryExprRet.getLine());
				$binaryExprRet = new BinaryExpression(null, $bep, $bop);}
			else
			{
				$binaryExprRet = new BinaryExpression(null, $l.binaryExprRet, $opt);
			}
		}
    	{$binaryExprRet.setLine($op.getLine());}
	| {$binaryExprRet = null;}
	;

multicative returns [Expression exprRet]:
	l =  unary r = multicative2
    {
		if ($r.exprRet != null)
		{
			$exprRet = new BinaryExpression($l.exprRet, $r.exprRet.getRight(), $r.exprRet.getBinaryOperator());
			$exprRet.setLine($r.exprRet.getLine());} else {$exprRet = $l.exprRet;
		}
	}
	;

multicative2 returns [BinaryExpression binaryExprRet]:
	{BinaryOperator bop; BinaryExpression bep;}
	(
		op = MULT {$bop = BinaryOperator.mult;}
		| op = MOD {$bop = BinaryOperator.mod;}
		| op = DIV {$bop = BinaryOperator.div;})
		l = unary r = multicative2
		{
			if ($r.binaryExprRet != null)
		    {
				$bep = new BinaryExpression($l.binaryExprRet, $r.binaryExprRet.getRight(), $r.binaryExprRet.getBinaryOperator());
		    	$bep.setLine($r.binaryExprRet.getLine());
				$binaryExprRet = new BinaryExpression(null, $bep, $bop);
			}
		    else
			{
				$binaryExprRet = new BinaryExpression(null, $l.binaryExprRet, $bop);
			}
		}
    	{$binaryExprRet.setLine($op.getLine());}
	| {$binaryExprRet = null;}
	;

unary returns [Expression exprRet]:
    otherRet = other {$exprRet = otherRet.exprRet;}
    | {UnaryOperator uop;}
    (
        PLUS {$uop = UnaryOperator.plus;}
        | MINUS {$uop = UnaryOperator.minus;}
        | NOT {$uop = UnaryOperator.not;}
        ) oth = other
        {exprRet = new UnaryExpression($uop, oth.exprRet); $exprRet.setLine($oth.getLine();)}
        ;

other returns[Expression exprRet]:
	LPAR expr = expression RPAR {$exprRet = expr.exprRet;}
	| var = variable {$exprRet = $var.v;}
	| val = value {$exprRet = $val.valueRet;}
	| q1 = queryType1 {$exprRet = $q1.query1Ret;}
	| funcCall = functionCall {$exprRet = $funcCall.funcCallRet;}
	;

functionCall returns[functionCall funcCallRet]:
	{ArrayList<Expression> exprs = new ArrayList<>();} name = identifier LPAR (
		arg = expression {exprs.add($arg.exprRet);} (
		COMMA e = expression {exprs.add($e.exprRet);})*)?
		RPAR {$funcCallRet = new FunctionCall(exprs, $name.identifierRet); $funcCallRet.setLine($name.identifierRet.getLine());}
	;

value returns[Value valueRet]:
	v = numericValue {$valueRet v.v}
	| t = TRUE {$valueRet = new BooleanValue(true); $valueRet.setLine($t.getLine());}
	| f = FALSE {$valueRet = new BooleanValue(false); $valueRet.setLine($f.getLine());}
	| MINUS v_ = numericValue {$v_.v.negateConstant(); $valueRet = $v_.v;}
	;

numericValue returns[Value v]:
	i = INT_NUMBER {$v = new IntValue($i.int);} {$v.setLine($i.getLine());}
	| f = FLOAT_NUMBER {$v = new FloatValue($f.float);} {$v.setLine($f.getLine());}
	;

identifier returns[Identifier identifierRet]:
	idn = IDENTIFIER {$identifierRet = new Var($idn.getText()); $identifierRet.setLine($idn.getLine());}
	;

predicateIdentifier returns[Identifier predicateIdentifierRet]:
	predIdn = PREDICATE_IDENTIFIER {$predicateIdentifierRet = new Identifier($predIdentifier.getText()); $predicateIdentifierRet.setLine($predIdentifier.getLine());}
	;

type returns[Type typeRet]:
	b = BOOLEAN {$typeRet = new BooleanType();}
	| i = INT {$typeRet = new IntType();}
	| f = FLOAT {$typeRet = new FloatType();}
	;

FUNCTION: 'function';
BOOLEAN: 'boolean';
INT: 'int';
FLOAT: 'float';
MAIN: 'main';
PRINT: 'print';
RETURN: 'return';
FOR: 'for';
TRUE: 'true';
FALSE: 'false';

LPAR: '(';
RPAR: ')';
COLON: ':';
COMMA: ',';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
ASSIGN: '=';
LBRACKET: '[';
RBRACKET: ']';
QUARYMARK: '?';
ARROW: '=>';
OR: '||';
AND: '&&';
EQ: '==';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
NEQ: '!=';
NOT: '!';

WS: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;

IDENTIFIER: [a-z][a-zA-Z0-9_]*;
PREDICATE_IDENTIFIER: [A-Z][a-zA-Z0-9]*;
INT_NUMBER: [0-9]+;
FLOAT_NUMBER: ([0-9]* [.])? [0-9]+;