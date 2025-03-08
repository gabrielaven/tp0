import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tiempo {
    private LocalDate fechaActual;

    public Tiempo() {
        this.fechaActual = LocalDate.now();
    }

    public String obtenerFormatoLargo() {
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        return fechaActual.format(formatoLargo);
    }

    public String obtenerFormatoCorto() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaActual.format(formatoCorto);
    }
}