<%@ page contentType="text/html; charset=UTF-8"%>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Nombre Verdadero Triunfo</title>
        <link rel="stylesheet" href="estilos.css">
    </head>

    <body>
        <h1>¡Dijiste la verdad a cerca de tí!</h1>
        <h2>Has regresado a Casa</h2>
        <h2>¡Triunfaste! ... ¡Felicidades!</h2>
        <form method="POST" action="/proyecto-final/regresar-index">
            <input type="submit" value="Regresar al Inicio"/>
        </form>
        </br></br>
        <fieldset name="datos-juego" id="datos-juego">
            <legend>Datos del Juego</legend>
            <h5>
                <label>Nombre: </label>
                <%=request.getSession().getAttribute("jugador-nombre")%>
            </h5>
            <h5>
                <label>Intentos: </label>
                <%=request.getSession().getAttribute("jugador-intentos")%>
            </h5>
        </fieldset>
    </body>
</html>