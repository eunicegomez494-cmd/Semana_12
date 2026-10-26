package Repaso_Sobrecarga;

public class MainMascota {
    public static void main(String[] args) {
        Mascota m = new Gato();
        Gato g = new Gato();

        System.out.println(Veterinario.atender(m));
        System.out.println(Veterinario.atender(g));
        System.out.println(Veterinario.atender((Gato) m));
        System.out.println(Veterinario.atender(new Mascota()));
    }
}
