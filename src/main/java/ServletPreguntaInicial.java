import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/pregunta-inicial")
public class ServletPreguntaInicial extends HttpServlet {

    public void init() {
        System.out.println("Servlet para aceptar el reto ha iniciado");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        ServletInicioJuego.jugadorIntentos = ServletInicioJuego.jugadorIntentos + 1;
        String intentosJugador = String.valueOf(ServletInicioJuego.jugadorIntentos);
        request.getSession().setAttribute("jugador-intentos", intentosJugador);
        request.getSession().setAttribute("jugador-nombre", ServletInicioJuego.jugadorNombre);
        boolean aceptarDesafio = Boolean.parseBoolean(request.getParameter("aceptar-desafio"));
        try {
            if ( aceptarDesafio ) {
                response.sendRedirect("reto-aceptado.jsp");
            }else {
                request.getSession().setAttribute("mensajeFracaso1", "¡Reto Rechazado!");
                request.getSession().setAttribute("mensajeFracaso2", "Has rechazado el reto");
                request.getSession().setAttribute("mensajeFracaso3", "¡Adiós Gallina! ... ¡Perdiste!");
                response.sendRedirect("fracaso.jsp");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
