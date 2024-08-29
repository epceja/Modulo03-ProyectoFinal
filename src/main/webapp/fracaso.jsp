<%@ page contentType="text/html; charset=UTF-8"%>
<!-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> -->
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Reto Rechazado</title>
        <link rel="stylesheet" href="estilos.css">
    </head>

    <body>
        <h1>
            <%=request.getSession().getAttribute("mensajeFracaso1")%>
        </h1>
        <h1>
            <%=request.getSession().getAttribute("mensajeFracaso2")%>
        </h1>
        <h2>
            <%=request.getSession().getAttribute("mensajeFracaso3")%>
        </h2>
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