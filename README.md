# Postfix
this code translate the infix expression into postfix expression supporting only two binary operation addition and subtraction.
supporting the grammar with no left recusive properties that have the following form:                                                     
expr -> term rest
rest-> +term { print('+') } rest                                                                                                                | -term { print('-') } rest                                                                                                                                                                                                                                  
term -> 0 { print('0') } | term -> 1 { print('1') } |.........|term -> 9 { print('9') }  
