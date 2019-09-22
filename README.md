Parcours le dépôt et observe son contenu :

Bird, classe abstraite

Eagle, classe héritée de Bird

Swim, une interface

Penguin, classe héritée de Bird qui implémente Swim

Nature, que tu compileras et exécuteras pour tester que tout fonctionne 

Crée une interface Fly

Ajoute les méthodes suivantes à l'interface Fly :

takeOff
 sans argument, qui ne retourne rien
 
ascend
 qui prend un entier meters, qui retourne un entier
 
descend
 qui prend un entier meters, qui retourne un entier
 
land
 sans argument, qui ne retourne rien
 
glide
, sans argument, qui ne retourne rien et qui possède un 
comportement par défaut : afficher le texte "It glides into the air."

Faire implémenter l'interface Fly par la classe Eagle
Tu pourras décider des comportements des méthodes, mais 
il est obligatoire que chaque méthode affiche du texte dans la console.

Tu peux t'inspirer de l'implémentation de Swim par Penguin

Décommente l'appel des méthodes de Eagle dans Nature

Compile et teste Nature. 

Quand tout fonctionne, crée un dépôt git et envoie le tout sur GitHub

Partage le lien du dépôt GitHub en solution

Exemple de résultat lors de l'exécution de Nature :

 Eye Cherry takes off in the sky.
 
 Eye Cherry flies upward, altitude : 120
 
 Eye Cherry flies upward, altitude : 150
 
 It glides into the air.
 
 Eye Cherry flies downward, altitude : 10
 
 Eye Cherry is too high, it can't lands.
 
 Eye Cherry flies downward, altitude : 1
 
 Eye Cherry lands on the ground.
 