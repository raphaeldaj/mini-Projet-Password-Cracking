# mini-Projet-Password-Cracking

ce projet est une simulation de cassege de mot de passe utilisant le pattern Factory ou Fabrique permettant de tester deux types d'attaque 
    -les attaques Brute Force
    -les attaques Dictionnaires
cela peut se faire sur deux types de cibles
    -les cibles locales
    -les cibles en ligne
le but est de comprendre le fonctionnement de ces attaques tout en appliquant un design extensible et addaptable



        ---Objectifs Pedagigiques

-Implementer les design patterns Factory Methode et Abstract Factory
-Comprendre et simuler deux grandes techniques de cassage de mot de passe
-Appliquer la separation des responsabilites et l'extensibilite
-Ne pas confondre les attaques locales et celles en ligne
-Creer un mini site web comme cible d'attaque



        ---Architecture Logiciel
diagramme de classe
https://lucid.app/lucidchart/f6f28926-4635-45df-b0c7-a765bd4c1d72/edit?viewport_loc=-2142%2C-704%2C3837%2C1824%2C0_0&invitationId=inv_8bcc9878-03d3-48a7-8fd2-9e0efc868018


        ---Design Pattern utilisé

pour ce mini projet nous avons a la fois utilise Factory method et Abstract Factory.
Le but du projet etant de permettre de choisir dynamiquement une strategie ainsi que le type de cible, il est plus judicieux d'utiliser Factory method et/ou Abstract Factory à la place d'un nombre incalculable de conditions (if....else)
Abstract Factory centralise la logique de creation des objets (cracker et cible),permet d'ajouter de nouvelles combinaisons et rend le systeme plus lisible et evolutif

en therme de structure nous avons :
    -crackerFactory : interface abstraite c'est le coeur du design patterb definissant les methodes pour creer un objet passwordCracker un objet Target permettant ainsi la separation clair entre la creation des objet et leur utilisation

    -Les fabriques Concretes
    Elles sont au nombre de quatres

---LocalBruteForceFactory    : combine BruteForceCracker avec LocalTarget
---OnlineBruteForceFactory   : combine BruteForceCracker avec OnlineTarget
---LocalDictionnaryFactory   : combine DictionnaryCracker avec LocalTarget
---OnlineDictionnaryFactory  : combine DictionnaryCracker avec OnlineTarget

    -Les interfaces fonctionnelles

---PasswordCracker : defini le comportement des attaques
---Target : defini le type de cible


        ---Variantes Implementées

Brute Force   ---   local      ---   LocalBruteForceFactory   ---  Genere toutes les combinaisons,test local

Dictionnaire  ---   local      ---   LocalDictionnaryFactory  ---  Charge un fichier texte et teste chaque mot

Brute Force   ---   en ligne   ---   OnlineBruteForceFactory  ---  Envoie des requettes HTTP avec cheque combinaison

Dictionnaire  ---   en ligne   ---   OnlineDictionnaryFactory ---  Envoie des requettes HTTP avec cheque mot du  -                                                                  fichier



        ---Pistes

--- le multithreading pour tester plusieur mot de passe a la fois et accelerer le processus

--- une interface graphique avec Swing ou JavaFX pour elargir la possibilite d'utilisation

--- des cibles plus complexes API REST Systeme avec Token