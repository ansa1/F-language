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
    Identifier (':'  type)?  'is'  expression
;
expressions
:
    expression (','  expression)*
;
expression
:
    relation (('and' | 'or' | 'xor') relation)?
;
relation
:
    factor (('<' | '<=' | '>' | '>=' | '=' | '/=') factor)?
;
factor
:
    term (('+' | '-') term)*
;
term
:
    unary (('*' | '/') unary)*
;
unary
:
    ('+' | '-')? secondary
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
    | (expression)?
    | '.' Identifier
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
    | Identifier
;
function
:
    'func' '(' (parameters)? ')'  (':' type)? body
;

fun_declaration
:
    Identifier ':' type
;

parameters
:
    fun_declaration (',' fun_declaration)*
;
body
:
    'do' statements 'end'
    | '=>' expression
;
tuple
:
    '(' tuple_element (',' tuple_element)* ')'
;
tuple_element
:
    (Identifier 'is')? elementary
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
    secondary (':=' expression)?
;
conditional
:
    'if' expression 'then' statements ('else' statements)? 'end'
;
loop
:
    'for' (Identifier 'in')? expression ('..' expression)? loop_body
    | ('while' expression)? loop_body
;
loop_body
:
    'loop'  statements 'end'
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

Identifier
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