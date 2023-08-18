grammar Grammar;
import Lexer;
// ? -> uno o nada
// * -> cero o mas
// + -> uno o mas
start: block EOF;
block: (stmts)*
     ; 
stmts: 
declaration (';')?
| pprint (';')?
    ;
//declaration: type_with_value_declaration #TypeValueDeclaration| implicit_type_with_value_declaration #ImplicitTypeValueDeclaration| type_only_declaration #TypeDeclaration;
declaration:type_declaration ID_PRIMITIVE COLON type IS_ expr #TypeValueDeclaration //var value
;  
pprint: 'print' '(' expr ')' #PrintExpr;

//type_with_value_declaration: type_declaration ID_PRIMITIVE COLON type IS_ expr;

//implicit_type_with_value_declaration: type_declaration ID_PRIMITIVE IS_ expr ;

//type_only_declaration: type_declaration ID_PRIMITIVE COLON type ;
type_declaration: DECLARATION_VAR | DECLARATION_LET;
type: (INT | FLOAT | STRING | BOOL);
expr: 
'(' expr ')' #ParenthesisExpr
| left=expr op=(PLUS|MINUS|MULTIPLY|DIVIDE|MODULO) right=expr #ArithmeticOperationExpr
//Primitives
| DIGIT_PRIMITIVE #DigitExpr
| STRING_PRIMITIVE #StringExpr
| ID_PRIMITIVE #IdExpr
| (TRU | FAL) #BoolExpr
;
