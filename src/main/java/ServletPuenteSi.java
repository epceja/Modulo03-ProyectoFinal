import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/puente-si")
public class ServletPuenteSi extends HttpServlet {
    public final String NUMEROS_Y_SIGNOS="0123456789|#$%&/()=\\\"";

    public void init() {
        System.out.println("Servlet de subir al puente de mando ha iniciado");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String nombreJugador = request.getParameter("nombre-jugador");
        try {
            //if ( nombreJugador.toUpperCase().matches("[A-Z]*") ) {
            if (nombreJugador.equals(ServletInicioJuego.jugadorNombre)) {
                response.sendRedirect("nombre-verdadero.jsp");
            }else {
                request.getSession().setAttribute("mensajeFracaso1", "¡Mentiste a cerca de tí mismo!");
                request.getSession().setAttribute("mensajeFracaso2", "Tu mentira ha sido revelada");
                request.getSession().setAttribute("mensajeFracaso3", "¡Adiós Mentiroso! ... ¡Perdiste!");
                response.sendRedirect("fracaso.jsp");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
