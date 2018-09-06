package servletHTML;

/**
 *
 * @author Kagigi
 */
import Clases.Operaciones;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletCalc extends HttpServlet {
    private int n1;
    private int n2;
    private float r;
    private String ope;
    
    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException
    {
        n1= Integer.parseInt(peticion.getParameter("No1"));
        n2= Integer.parseInt(peticion.getParameter("No2"));
        ope = peticion.getParameter("Operacion");
        Operaciones op= new Operaciones();
        
            if(ope.equals("Suma")){
                r=op.Suma(n1, n2);
            }
            else{
                if(ope.equals("Resta"))
                    r=op.Resta(n1, n2);
                else{
                    if(ope.equals("Division"))
                        r=op.Divi(n1, n2);
                    else{
                        if(ope.equals("Multiplicacion"))
                            r=op.Multi(n1, n2);
                        else{
                            if(ope.equals("Seno"))
                                r=op.Sin(n1);
                            else{
                                if(ope.equals("Coseno"))
                                    r=op.Cos(n1);
                                else{
                                    if(ope.equals("Tangente"))
                                        r=op.Tan(n1);
                                    else{
                                        if(ope.equals("Logaritmo natural"))
                                            r=op.LogN(n1);
                                        else{
                                            if(ope.equals("Logaritmo base 10"))
                                                r=op.Log(n1);
                                            else{
                                                if(ope.endsWith("Exponente"))
                                                    r=op.Exp(n1);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        PrintWriter out= new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Respuesta</title><style type=\"text/css\">\n" +
        "@import url(\"Estilo.css\");\n"+"</style></head>");
        out.println("<body><div><center>");
        out.println("<br><hr><br>");
        out.println("<h3>El resultado de la operación es:"+ r + "</h3>");
        out.println("<br><hr><br>");
        out.println("<h2>Es todo, hasta luego</h2>");
        out.println("<img width=\"200\" align=\"MIDDLE\" alt=\"Hurray\" src=\"miku_bailando.gif\" heigth=\"200\">");
        out.println("</center></div></body>");
        out.println("</html>");
        out.close();
    }    
}
