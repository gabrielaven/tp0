import java.time.LocalDate;

public class TiempoAnemico {
    private LocalDate fechaActual;

    public TiempoAnemico () {
        this.fechaActual = LocalDate.now();
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }
}