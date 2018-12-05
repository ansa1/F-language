/*
The F language grammar used for generating antlr.FParser and antlr.FLexer via ANTLR 4.
*/
grammar F;

/*Basic concepts*/
translationunit
:
	(program)? EOF
;
program
:
    declaration  (';'  declaration)*
;
declaration
:
    (identifier (':' type)? 'is' expression)
;

expressions
:
    expression (','  expression)*
;
expression
:
    relation (op=('and' | 'or' | 'xor') relation)?
;
relation
:
    factor (op=('<' | '<=' | '>' | '>=' | '=' | '/=') factor)?
;
factor
:
    left=term (op=('+' | '-') right=term)*
;
term
:
    unary (op=('*' | '/') unary)*
;
unary
:
    sign=('+' | '-')? secondary
;
secondary
:
    primary (tail)?
;
primary
:
    elementary
    | function
    | tuple
    | map
    | list
    | '(' expression ')'
;
tail
:
    '(' (expressions)? ')'
    | '[' (expression)? ']'
    | '.' identifier (tail)?
    | '.' integer_literal
;
elementary
:
    bool_literal
    | integer_literal
    | real_literal
    | rational_literal
    | complex_literal
    | string_literal
    | identifier
;
function
:
    'func' '(' (parameters)? ')'  (':' type)? body
;

fun_declaration
:
    identifier ':' type
;

parameters
:
    fun_declaration (',' fun_declaration)*
;
body
:
    (body_start statements body_end)
    | ('=>' expression)
;

body_start
:
    'do'
;

body_end
:
    'end'
;
tuple
:
    '(' tuple_element (',' tuple_element)* ')'
;
tuple_element
:
    (identifier 'is')? elementary
;
map
:
    '{' map_element '}'
;
map_element
:
    string_literal ':' elementary
;
list
:
    '[' (expression (',' expression)*)? ']'
;
type
:
    'bool'
    | 'integer'
    | 'real'
    | 'rational'
    | 'complex'
    | 'string'
    | 'func'  '(' (type ( ','  type )*)? ')'  (':'  type)?
    | '{}'
    | '[' type ':' type ']'
    | '(' type ')'
;
statements
:
    statement (';'  statement)*
;
statement
:
    assignment_or_call
    | conditional
    | loop
    | 'return' (expression)?
    | 'break'
    | declaration
;
assignment_or_call
:
    identifier (tail)? (':=' expression)?
;
conditional
:
    'if' expression then_statement else_statement? 'end'
;

then_statement
:
    'then' statements
;

else_statement
:
    'else' statements
;

loop
:
    'for' (identifier 'in')? expression ('..' expression)? loop_body
    | ('while' expression)? loop_body
;
loop_body
:
    loop_body_start statements loop_body_end
;

loop_body_start
:
    'loop'
;

loop_body_end
:
    'end'
;

bool_literal
:
    'true'|'false'
;

integer_literal
:
    INTEGER
;
real_literal
:
    REAL
;
string_literal
:
    '\'' .+? '\''
    | '"' .+? '"'
;
complex_literal
:
    REAL 'i' REAL
;
rational_literal
:
    INTEGER '\\' INTEGER
;

INTEGER
:
    DIGIT+
;

REAL
:
    DIGIT+ ('.' DIGIT+)?
;

fragment
STRING
:
    .
;

identifier
:
    IdentifierName
;

IdentifierName
:
    [a-zA-Z_][a-zA-Z0-9_]*
;
fragment
DIGIT
:
	[0-9]
;

Whitespace
:
	[ \t]+ -> skip
;

Newline
:
	(
		'\r' '\n'?
		| '\n'
	) -> skip
;

MultiLineMacro
:
    '#' (~[\n]*? '\\' '\r'? '\n')+ ~[\n]+ -> channel(HIDDEN)
;