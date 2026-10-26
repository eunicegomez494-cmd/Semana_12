package Repaso_Interfases;

public class Quiz implements Calificable {
    @Override
    public int puntos() {
        return 0;
    }

    @Override
    public String nivel() {
        return "SIN NOTA";
    }
}
