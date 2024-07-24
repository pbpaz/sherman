# Usa una imagen base que tenga Maven instalado
FROM maven:3.8.5-openjdk-17

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /usr/src/app

# Copia el archivo pom.xml y descarga las dependencias de Maven
COPY pom.xml .
RUN mvn -B dependency:resolve dependency:resolve-plugins

# Copia todo el código fuente y realiza la compilación
COPY src ./src
RUN mvn package

# Comando para iniciar la aplicación
CMD ["mvn", "spring-boot:run"]
