grammar hej;

@header {
package svenska.grammar;
}

code
: påstående ';' code
| påstående ';'
| EOF
;

påstående
: deklarering
| tilldelning
| utskrift
| upprepning
;

deklarering
: 'variabel' ID
| 'variabel' ID räkna
;

tilldelning
: ID '=' uttryck
;

utskrift
: 'skriv' uttryck
;

uttryck
: räkna
| atom
| villkor
;

atom
: ID
| INT
;

upprepning
: 'upprepa' villkor
code slut
;

slut
: 'slut'
;

räkna
: addera
| subtrahera
;

addera
: atom '+' uttryck
;

subtrahera
: atom '-' uttryck
;

villkor
: atom 'mindre' atom
| atom 'högre' atom
;

ID: ('a'..'z')+ ;
INT: ('0'..'9')+ ;
WS: [ \n\t\r]+ -> skip ;