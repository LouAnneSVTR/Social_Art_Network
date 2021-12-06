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

### Problème autentification OAuth2

Nous avons commencé à utiliser l'authentification Springboot security avec OAuth2 de Google Cloud Platform, nous avons réussi à implémenter la connexion par Google, mais cela nous empêchait de réaliser des requetes GET ou Post sur notre base, car nous n'avons pas réussi à donner les droits d'accès à nos comptes Google.

Front
sudo npm -g install @vue/cli //onstaller vue cli
vue create social-art_network-web //créer projet vue
npm run serve //run server vue