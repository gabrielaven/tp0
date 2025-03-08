import java.time.LocalDate;

public class TiempoNoAnemico {
    private LocalDate fechaActual;

    public TiempoNoAnemico () {
        this.fechaActual = LocalDate.now();
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }
}