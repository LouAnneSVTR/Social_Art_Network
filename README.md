# Social_Art_Network
"Fonal version of our social network"

gcloud auth login

gcloud init

dans le cloud shell:
git pull
docker build . -t gcr.io/social-art-network/elastic
docker push gcr.io/social-art-network/elastic

Swagger
http://<URL>/swagger-ui/

Front
sudo npm -g install @vue/cli //onstaller vue cli
vue create social-art_network-web //créer projet vue
npm run serve //run server vue