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

----------------------------------------diagramme a ajouter lien lucidchart-----------------------------------------


        ---Design Pattern utilisé

pour ce mini projet nous avons a la fois utilise Factory method et Abstract Factory.
Le but du projet etant de permettre de choisir dynamiquement une strategie ainsi que le type de cible, il est plus judicieux d'utiliser Factory method et/ou Abstract Factory à la place d'un nombre incalculable de conditions (if....else)
Abstract Factory centralise la logique de creation des objets (cracker et cible),permet d'ajouter de nouvelles combinaisons et rend le systeme plus lisible et evolutif

en therme de structure nous avons :
    -crackerFactory : interface abstraite c'est le coeur du design patterb pouvant produire une combinaison d'une   strategie d'attaque et d'une cible ce qui permet de separer la logique de creation

    -LocalBruteForceFactory et OnlineBruteForceFactory : des fabrique concretes implementant crackerFactory chaque fabrique cree un objet cracker spécifique et une cibles specifique

    -PasswordCracker et Target : interfaces pour l'attaque et la cible definissant le comportement d'une attaque avec BruteForceCracker qui genere toute les combinaisons possibles et DictionnaryCracker qui teste avec une liste de mot de passe provenant d'un fichier. Target est l'interface qui presente la cible a attaquer avec LocalTarget pour une cible en console et OnlineTarget pour une cible via HTTP



        ---Variantes Implementées

Brute Force   ---   local      ---   LocalBruteForceFactory   ---  Genere toutes les combinaisons,test local

Dictionnaire  ---   local      ---   LocalDictionnaryFactory  ---  Charge un fichier texte et teste chaque mot

Brute Force   ---   en ligne   ---   OnlineBruteForceFactory  ---  Envoie des requettes HTTP avec cheque combinaison

Dictionnaire  ---   en ligne   ---   OnlineDictionnaryFactory ---  Envoie des requettes HTTP avec cheque mot du  -                                                                  fichier



        ---Pistes

--- le multithreading pour tester plusieur mot de passe a la fois et accelerer le processus
--- une interface graphique avec Swing ou JavaFX pour elargir la possibilite d'utilisation
--- des cibles plus complexes API REST Systeme avec Token