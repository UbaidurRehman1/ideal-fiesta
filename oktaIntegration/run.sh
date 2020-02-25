cd api_gateway_server;
mvn clean package -DskipTests
cd ../naming_server;
mvn clean package -DskipTests
cd ../PersonInfo;
mvn clean package -DskipTests
cd ..
docker-compose up --build