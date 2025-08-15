# Etapa 1: Build
FROM maven:3.9.2-eclipse-temurin-17 AS build
WORKDIR /app

# Copiar TODO el proyecto (módulos api y presentacion)
COPY . /app

# Construir solo el módulo 'presentacion' y sus dependencias
RUN mvn clean package -pl presentacion -am -DskipTests

# Etapa 2: Runtime
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copiar el JAR generado del módulo 'presentacion'
COPY --from=build /app/presentacion/target/*.jar app.jar

# Exponer el puerto
EXPOSE 9090

# Comando para correr la API
ENTRYPOINT ["java","-jar","app.jar"]


