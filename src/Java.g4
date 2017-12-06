grammar Java;

mainClass: 'class Test' LBRACE
                            'public static void main(String[] args) ' LBRACE
                                instructions
                                code_return
                            RBRACE
                       RBRACE;

code: instructions;
instructions: (initialization | assignment | loop | ifelse) instructions| ;

code_return: 'return;';

initialization: INT name=VARNAME SEMICOLUMN;
assignment: name=VARNAME AS expression_sum SEMICOLUMN;

expression_sum: (expression_mul (sum=SUM | sub=SUB))* expression_mul;
expression_mul: (expression_atom (mul=MUL | div=DIV | mod=MOD))* expression_atom;
expression_atom: LPAREN expression_sum RPAREN | name=VARNAME | num=NUM;

loop: 'while' LPAREN condition_or RPAREN LBRACE code RBRACE;

condition_or:  (condition_and or=OR)* expr=condition_and;
condition_and: (condition_atom and=AND)* expr=condition_atom;
condition_atom: expression_sum op=int_op expression_sum
              | bconst=BOOL
              | NOT condition_atom
              | LPAREN condition_or RPAREN;

ifelse: 'if' LPAREN condition_or RPAREN LBRACE code RBRACE
       ('else' LBRACE code RBRACE)?;

INT: 'int';
VARNAME: ('a'..'z')+ ('0'..'9')*;
NUM: ('1'..'9')('0'..'9')* | '0';
BOOL: TRUE | FALSE;
TRUE: 'true';
FALSE: 'false';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMI: ',';
SEMICOLUMN: ';';

// op: SUM | SUB | MUL | DIV;
PP: '++';
MM: '--';
SUM: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';
AS:   '=';

int_op: GT | LS | GE | LE | NE | EQ;
GT:   '>';
LS:   '<';
GE:   '>=';
LE:   '<=';
NE:   '!=';
EQ:   '==';
OR:   '||';
AND: '&&';
NOT: '!';

WS: [ \t\n\r]+ -> skip;

