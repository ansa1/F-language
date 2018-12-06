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
    left=factor (op=('<' | '<=' | '>' | '>=' | '=' | '/=') right=factor)?
;
factor
:
    left=term (op=('+' | '-') right=term)*
;
term
:
    left=unary (op=('*' | '/') right=unary)*
;
unary
:
    sign=('+' | '-')? exp=secondary
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
;
elementary
:
    bool_literal
    | complex_literal
    | real_literal
    | rational_literal
    | integer_literal
    | string_literal
    | identifier
;
function
:
    func_begin '(' (parameters)? ')'  (':' type)? body
;

func_begin
:
    'func'
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
    | ( '=>' expression)
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
    '{' map_element (',' map_element)* '}'
;
map_element
:
    elementary ':' elementary
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
    | print
;

print
:
    'print' (expression (',' expression)*)?
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
    for_loop | while_loop
;

for_loop
:
    'for' (identifier 'in')? expression ('..' expression)? loop_body
;

while_loop
:
    'while' expression loop_body
;

loop_body
:
    'loop' statements 'end'
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
     COMPLEX
;
rational_literal
:
    numerator=INTEGER '\\' denominator=INTEGER
;

INTEGER
:
    DIGIT+
;

COMPLEX
:
    REAL 'i' REAL
;

REAL
:
    INTEGER ('.' INTEGER)?
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