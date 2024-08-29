<%@ page contentType="text/html; charset=UTF-8"%>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Subir al Puente de Mando</title>
        <link rel="stylesheet" href="estilos.css">
    </head>

    <body>
        <h1>Ha aceptado subir al puente de mando</h1>
        <h2>Vas a subir al puente de mando</h2>
        <h3>¿Quién eres?</h3>
        <form method="POST" action="/proyecto-final/puente-si">
            <label>Escriba su nombre:</label>
            <input type="name" id="nombre-jugador" name="nombre-jugador" required>
            </br>
            <input type="submit" value="Enviar Respuesta"/>
        </form>
    </body>
</html>