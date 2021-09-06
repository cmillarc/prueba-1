Pre requisitos
Para usar la aplicacion es necesario instalar: Docker & Docker Compose.

en una terminal en la carpeta base ejecutar:

$ docker-compose up -d

para Crear las tablas y datos ejecutar sql en la carpeta :

prueba\app\src\main\resources\Data.sql

Para ejecutar la aplicacion rest entrar a:

http://localhost:8080/api/swagger-ui.html#/

Coordenadas, al ingresar ambos parametros retorna registro de bd con descripcion de las coordenadas.:

http://localhost:8080/api/swagger-ui.html#/pruebacontroller/coordenadaUsingGET

Usar datos de prueba lat: -33.45694, lng: -70.64827

Usuario, calida si existe un usuario, responde true si lo encuentra.

http://localhost:8080/api/swagger-ui.html#/pruebacontroller/usuarioUsingGET

Usar datos de prueba usuario, password.

Servicios de angular incompleso, solo quedo la base e integracion con docker, test unitarios en rest incompletos.
