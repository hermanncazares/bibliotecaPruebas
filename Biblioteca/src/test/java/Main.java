
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.modelo.Copia;
import org.modelo.EstadoCopia;
import org.modelo.Libro;
import org.modelo.Prestamo;
import org.modelo.TipoUsuario;
import org.modelo.Usuario;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Pepe", "Cañas", TipoUsuario.ESTUDIANTE, "123", "PepeCañas");
        Libro libro1 = new Libro("Pepito", "Harry", "A2SD2", 2);
        
        Copia copia1 = new Copia(EstadoCopia.DISPONIBLE, libro1);
        Copia copia2 = new Copia(EstadoCopia.DISPONIBLE, libro1);
        Copia copia3 = new Copia(EstadoCopia.DISPONIBLE, libro1);
        
        List<Copia> listaCopias1 = new ArrayList<Copia>();
        listaCopias1.add(copia1);
        listaCopias1.add(copia2);
        listaCopias1.add(copia3);
        
        
        Prestamo prestamo1 = new Prestamo(new Date(01/10/2020), new Date(02/10/2020), usuario1, listaCopias1);
        
        System.out.println(prestamo1);
    }
    
}
