

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        TiempoNoAnemico tiempo = new TiempoNoAnemico();
        LocalDate fecha = tiempo.getFechaActual();

        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(  fecha.format(formatoLargo));
        System.out.println(fecha.format(formatoCorto));
        
        
        //ANEMICO
        Tiempo tiempo1 = new Tiempo();

        System.out.println(tiempo1.obtenerFormatoLargo());
        System.out.println(tiempo1.obtenerFormatoCorto());
    }
}

