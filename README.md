Dans le cadre du cours SI, nous avons implanté une API permettant de modifier une base de données en soumettant des requêtes via URL.

Le projet est une pointeuse pour des intervenants dans le cadre de l'UBO. Cela permet aux intervenants de préciser quels cours ils ont assurés afin de pouvoir compter leurs heures.

Donc, nous avons différents types d'entités : des utilisateurs, des vacataires (qui sont des utilisateurs) et des cours.

Pour ce projet nous avons donc implanté une gestion CRUD des vacataires, des utilisateurs et des cours. Les vacataires ne sont pas reliés aux utilisateurs dû à quelques bugs non résolus sur un extends.

Pour lancer l'API, une base de données nommée Test doit être créer afin que l'API puisse y créer les tables nécessaires au fonctionnement de celle-ci.

Pour tester la jointure de cours et vacataire il faut au préalable remplir directement dans la base de données la table de jointure.

Nous avons aussi implémenter le SWAGGER pour l'API.

Dans le dossier nous avons mis un fichier Peuplemente.sql contenant les requêtes permettant de remplir les tables de la base de données.
