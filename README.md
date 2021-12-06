# Social_Art_Network
"Final version of our social network"

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

### Problème authentication OAuth2

Nous avons commencé à utiliser l'authentification Springboot security avec OAuth2 de Google Cloud Platform, nous avons réussi à implémenter la connexion par Google, mais cela nous empêchait de réaliser des requetes GET ou Post sur notre base, car nous n'avons pas réussi à donner les droits d'accès à nos comptes Google.

#TODO ajouter image swagger2 erreur 403

## Front avec Vue.js
Nous avons utilisé le framework Vue3js afin de réaliser le front de notre application. Nous avons réussi à utiliser les requêtes GET de nos bases dans le datastore afin d'afficher nos images et l'utilisateur qui l'a posté. Mais nous n'avons pas réussi à utiliser la requête POST afin d'ajouter des entités dans notre datastore (par exemple de nouvelle image ou de nouveaux utilisateurs) 

