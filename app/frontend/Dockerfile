# Usa la imagen base oficial de Node.js
FROM node:20.15.1

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo package.json y package-lock.json
COPY package*.json ./

# Instala las dependencias
RUN npm install

# Copia el resto del código de la aplicación
COPY . .

RUN npx create-react-app frontend

CMD ["npm", "run"]
