# Social_Art_Network
"Fonal version of our social network"

gcloud auth login

gcloud init

dans le cloud shell:
git pull
docker build . -t gcr.io/social-art-network/elastic
docker push gcr.io/social-art-network/elastic