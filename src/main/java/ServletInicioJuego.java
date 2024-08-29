import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/inicio-juego")
public class ServletInicioJuego extends HttpServlet {
    public static String jugador = "";
    public static String jugadorNombre = "";
    public static int jugadorIntentos = 0;

    public void init() {
        System.out.println("Servlet de inicio del Juego ha iniciado");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        jugador = jugadorNombre;
        jugadorNombre = request.getParameter("jugador-nombre");
        if ( !jugador.equals(jugadorNombre)) {
            jugadorIntentos = 0;
        }
        request.getSession().setAttribute("jugador-intentos", jugadorIntentos);
        request.getSession().setAttribute("jugador-nombre", ServletInicioJuego.jugadorNombre);
        try {
            response.sendRedirect("pregunta-inicial.jsp");
            // La redirección también se puede hacer con:
            //request.getRequestDispatcher("pregunta-inicial.jsp");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
