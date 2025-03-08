import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        TiempoAnemico tiempo = new TiempoAnemico();
        LocalDate fecha = tiempo.getFechaActual();
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(  fecha.format(formatoLargo));
        System.out.println(fecha.format(formatoCorto));
        
        

        TiempoNoAnemico tiempo1 = new TiempoNoAnemico();

        System.out.println(tiempo1.obtenerFormatoLargo());
        System.out.println(tiempo1.obtenerFormatoCorto());
    }
}

