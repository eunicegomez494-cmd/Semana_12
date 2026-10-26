package Repaso_Interfases;

import Biblioteca.AudioLibro;

public class E7 {
    public static void main(String[] args) {
        AudioLibro a = new AudioLibro("Cuentos");
        System.out.println(a.describir());
        System.out.println(a.prestar("Luis"));
        System.out.println(a.multa(4));
    }
}
