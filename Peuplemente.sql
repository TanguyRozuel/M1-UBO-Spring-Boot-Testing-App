INSERT INTO cours(intitule) VALUES ('STR');
INSERT INTO cours(intitule) VALUES ('SOR');
INSERT INTO cours(intitule) VALUES ('SI');

INSERT INTO utilisateur(login,motDePasse,nom,prenom,mail) VALUES ('alorric','mdp1','Lorric','Alexandre','alexandre.lorric@gmail.com');
INSERT INTO utilisateur(login,motDePasse,nom,prenom,mail) VALUES ('trozuel','mdp2','Rozuel','Tanguy','tanguy.rozuel@gmail.com');
INSERT INTO utilisateur(login,motDePasse,nom,prenom,mail) VALUES ('akergus','mdp3','Kergus','Axel','axel.kergus@gmail.com');

INSERT INTO vacataire(nom,prenom,mail) VALUES ('Lorric','Alexandre','alexandre.lorric@gmail.com');
INSERT INTO vacataire(nom,prenom,mail) VALUES ('Rozuel','Tanguy','tanguy.rozuel@gmail.com');
INSERT INTO vacataire(nom,prenom,mail) VALUES ('Kergus','Axel','axel.kergus@gmail.com');


INSERT INTO vacataire_cours(vacataire_id,cours_id) VALUES (1,1);
INSERT INTO vacataire_cours(vacataire_id,cours_id) VALUES (1,2);
INSERT INTO vacataire_cours(vacataire_id,cours_id) VALUES (2,3);
