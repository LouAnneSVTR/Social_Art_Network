# Social_Art_Network
"Final version of our social network"

Ce projet utilise une connection avec Auth2 de gcp via le Framework Springboot.
Utilisation de Swagger pour les requêtes.
Vues pour le front. 

### Connexion à notre projet Google Cloud Platform
    $gcloud auth login
    $gcloud init

### Créer un docker image dans Google Cloud Platform
dans le cloud shell:

    $git pull
    $docker build . -t gcr.io/social-art-network/elastic
    $docker push gcr.io/social-art-network/elastic


###Lancer spring boot dans Google Cloud Platform
lancer:
    
    $gcloud app deploy

Si pas déjà fait


Aller à cette url : [Social_Art_Network](https://social-art-network.ew.r.appspot.com)


### Utiliser Swagger
Tous le long du projet, nous avons utilisé Swagger2 afin de réaliser des requêtes GET et principalement POST afin de vérifier que notre datastore fonctionne bien. Il est possible d'utiliser cet outil à l'aide du lien suivant :

https://social-art-network.ew.r.appspot.com/swagger-ui/

Exemple de lancement de requetes via Swagger : POST ENTITY

image::ReadMePhoto/Post_user_swaggerPNG[]

image::ReadMePhoto/Réponse_post_user_swaggerPNG[]

###Vue
Le front a été fait via Vue. Pour ruen le front il faut avoir installé au préalable la commande npm. Enuite, il faut se placer dans le dossier "social-art-network-web" pour lancer 

npm run serve.


Avec notre base de donnée locale (post effectué via swagger avec l'utilisateur "sauvetre"), on obtient : 

image::ReadMePhoto/Capture_ProfilePNG[]

### Problème authentication OAuth2

Nous avons commencé à utiliser l'authentification Springboot security avec OAuth2 de Google Cloud Platform, nous avons réussi à implémenter la connexion par Google, mais cela nous empêchait de réaliser des requetes GET ou Post sur notre base, car nous n'avons pas réussi à donner les droits d'accès à nos comptes Google.


#Améliorations necessaires

### Front avec Vue.js
Nous avons utilisé le framework Vue3js afin de réaliser le front de notre application. Nous avons réussi à utiliser les requêtes GET de nos bases dans le datastore afin d'afficher nos images et l'utilisateur qui l'a posté. Mais nous n'avons pas réussi à utiliser la requête POST afin d'ajouter des entités dans notre datastore (par exemple de nouvelle image ou de nouveaux utilisateurs) 

###POST image
Le post d'image fonctinne via swagger, comme montré dans la capture du profile, un utilisateur créer (toujours via swagger peut poser). Cependant, nous n'avons pas pu venir a bout du POST via Vue

###Like et follow
Les classes sont implémenté dans le backend Springboot mais incomplète. Pour les Like, il faudrait utiliser les bucket de google otament pour que cela scale.
De plus, nous n'avons pas pu utiliser ces classes dans notre front ce qui rend notre travail très incomplet.

### Conclusion
Travail mitigé, non terminé, nous regrettons de n'avoir que ce rendu a présenter. 