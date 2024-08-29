<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Pregunta de Inicio</title>
        <link rel="stylesheet" href="estilos.css">
    </head>
    <body>
        <h1>¡Has perdido la memoria!</h1>
        <h2>¿Aceptas el reto de la Nave?</h2>
        <form method="POST" action="/proyecto-final/pregunta-inicial">

            <fieldset id="opciones-desafio">

              <legend id="legend-opciones">Elige con cuidado, ¡tu vida está en juego!</legend>

              <div>
                <input type="radio" id="si" name="aceptar-desafio" value="true" checked />
                <label for="si">Acepto el desafío porque soy muy valiente</label>
              </div>

              <div>
                <input type="radio" id="no" name="aceptar-desafio" value="false" />
                <label for="no">No acepto el desafío porque soy miedoso</label>
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