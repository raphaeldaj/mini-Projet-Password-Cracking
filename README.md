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