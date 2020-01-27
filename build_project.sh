cd ConfigServer && mvn clean install -DskipTests && cd .. &&

cd eureka && mvn clean install -DskipTests && cd ..  &&

cd media-player && mvn clean install -DskipTests && cd .. &&

cd movie-info && mvn clean install -DskipTests && cd ..  &&

docker-compose up -d --force-recreat