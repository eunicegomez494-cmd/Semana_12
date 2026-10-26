package Repaso_Interfases;

import Biblioteca.*;

public class Ej8 {
    public static void main(String[] args) {
        // Arreglo de tipo Material que contiene un EBook y una Revista
        Material[] m = { new EBook("K"), new Revista("R") };

        for (Material x : m) {
            // Llama a registrar (ligadura estática según el tipo Material)
            // y describir() (ligadura dinámica según el tipo real del objeto)
            System.out.println(Biblioteca.registrar(x) + " | " + x.describir());

            // Verificación de interfaz con instanceof y casting seguro
            if (x instanceof Digital) {
                System.out.println(((Digital) x).formato());
            }
        }

        // Casting de la Revista (m[1]) a Prestable para calcular multas usando constantes
        Prestable p = (Prestable) m[1];
        System.out.println(p.multa(2) + Prestable.MULTA_DIARIA);
    }
}