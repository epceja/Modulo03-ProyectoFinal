<%@ page contentType="text/html; charset=UTF-8"%>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Reto Acptado</title>
        <link rel="stylesheet" href="estilos.css">
    </head>

    <body>
        <h1>Has aceptado el reto. Felicidades.</h1>
        <h2>¿Vas a subir al puente del Capitán?</h2>
        <form method="POST" action="/proyecto-final/reto-aceptado">
            <fieldset id="opciones-desafio">
              <legend>Elige con cuidado, ¡tu vida está en juego!</legend>

              <div>
                <input type="radio" id="si-puente" name="subir-puente" value="true" checked />
                <label for="si-puente">Acepto, quiero subir al puente de mando</label>
              </div>

              <div>
                <input type="radio" id="no-puente" name="subir-puente" value="false" />
                <label for="no-puente">No acepto subir al puente de mando</label>
              </div>
            </fieldset>
            </br>
            <input type="submit" value="Enviar Respuesta"/>
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