public class Primitiva {
    public static void main(String[] args) {
        System.out.println("¡BIENVENIDO AL JUEGO DE LA PRIMITIVA!");

        int n = 0;

        for (int i = 1; i <= 6; i++) {
        n = (int)(Math.random() * 49) + 1;
        System.out.println("Número: " + n);
        }

    }
}