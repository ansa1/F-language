/*
The F language grammar used for generating antlr.FParser and antlr.FLexer via ANTLR 4.
*/
grammar F;

/*Basic concepts*/
translationunit
:
	(primary)? EOF
;
program
:
    declaration  (';'  declaration)*
;
declaration
:
    identifier (':'  type)?  'is'  expression
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
    | '.' identifier
    | '.' integer_literal
;
elementary
:
    'false'
    | 'true'
    | integer_literal
    | real_literal
    | rational_literal
    | complex_literal
    | string_literal
    | identifier
;
function
:
    'func (' (parameters)? ')'  (':' type)? body
;
parameters
:
    declaration (',' declaration)*
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
    secondary (':=' expression)?
;
conditional
:
    'if' expression 'then' statements ('else' statements)? 'end'
;
loop
:
    'for' (identifier 'in')? expression ('..' expression)? loop_body
    | ('while' expression)? loop_body
;
loop_body
:
    'loop'  statements 'end'
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
    '\'' STRING '\''
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
    INTEGER ('.' INTEGER)?
;


NONDIGIT
:
	 [a-z]
;

STRING
:
    [A-Za-z0-9_]+
;

identifier
:
	identifiernondigit
;

identifiernondigit
:
	NONDIGIT+
;


DIGIT
:
	[0-9]
;

Whitespace
:
	[ \t]+ -> skip
;

MultiLineMacro
:
    '#' (~[\n]*? '\\' '\r'? '\n')+ ~[\n]+ -> channel(HIDDEN)
;