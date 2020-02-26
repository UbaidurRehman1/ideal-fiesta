cd api_gateway_server;
mvn clean package -DskipTests
cd ../naming_server;
mvn clean package -DskipTests
cd ../PersonInfo;
mvn clean package -DskipTests
cd ..
cd employee-info-service
mvn clean package -DskipTests
cd ..
cd rest-client
mvn clean package -DskipTests
cd ..
cd auth-users-service
mvn clean package -DskipTests
cd ..
docker-compose up --build