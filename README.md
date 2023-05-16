# Esercizio Rubrica Base

Creare un progetto java in cui un **Server** gestisce una rubrica telefonica (un *java.util.ArrayList\<E\>* di oggetti **Contatto**);
il **Client** si connette al **Server** e permette, tramite l'invio di un comando al server (una lettera, una parola, un numero.....quello che volete), 
di effettuare due tipi di operazione:
1 - inserimento di un nuovo contatto della rubrica, il Client prende in input nome e numero telefonico e lo invia al Server
2 - ricerca di un contatto tramite il nome: il Client invia il nome al Server, che, se lo trova nella rubrica, risponderà al Client con il numero di telefono corrispondente, altrimenti invierà un messaggio di errore.


VERSIONE PER L'EVENTUALE VOTO MAGGIORE
fare in modo che il Server possa accettare più Client contemporaneamente

## Attenzioni utilizzando java.util.Scanner

__Scanner in Java not working__ https://stackoverflow.com/questions/3236830/scanner-in-java-not-working

__Scanner is skipping nextLine() after using next() or nextFoo()?__ 
https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
