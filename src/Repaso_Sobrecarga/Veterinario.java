package Repaso_Sobrecarga;

public class Veterinario {
    static String atender(Mascota m) {
        return "mascota: " + m.sonido();
    }

    static String atender(Gato g) {
        return "gato: " + g.sonido();
    }
}