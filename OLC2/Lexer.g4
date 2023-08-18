lexer grammar Lexer;

INT: 'Int';
FLOAT: 'Float';
STRING: 'String';
BOOL: 'Bool';
CHAR: 'Character';
DECLARATION_VAR: 'var';
DECLARATION_LET: 'let';
SEMICOLON: ';';
COLON: ':';
DIGIT_PRIMITIVE: [0-9]+ ('.' [0-9]+)?;
STRING_PRIMITIVE: '"'~["]*'"';
ID_PRIMITIVE: ([a-zA-Z_])[a-zA-Z0-9_]*;
IS_: '=';
//Arithmetic
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';

//comparison
EQUALS: '==';
NOT_EQUALS: '!=';
GREATER: '>';
GREATER_EQUALS: '>=';
LESS: '<';
LESS_EQUALS: '<=';
//logic
AND: '&&';
OR: '||';
//Parenthesis
LPAREN: '(';
RPAREN: ')';
//Nil
NIL: 'nil';
//Boolean Values
TRU: 'true';
FAL: 'false';
//skip
WHITESPACE: [ \\\r\n\t]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
QUESTION: '?';
//Print
PRINT: 'print';
fragment
ESC_SEQ
    :   '\\' ('\\'|'@'|'['|']'|'.'|'#'|'+'|'-'|'!'|':'|' ')
    ;