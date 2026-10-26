package Biblioteca;

public class AudioLibro extends Material implements Prestable {
    public AudioLibro(String titulo) {
        super(titulo);
    }

    @Override
    public int diasPrestamo() {
        return 10;
    }

    @Override
    public String prestar(String socio) {
        return titulo + " -> " + socio + " (audio)";
    }
}

