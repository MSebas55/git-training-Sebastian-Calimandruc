import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class MainEj1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, contadorCaras = 0, contadorCruces = 0;
        ArrayList<HiloCaraCruz> hilos = new ArrayList<HiloCaraCruz>();

        System.out.print("Introduce la cantidad de hilos: ");
        n = scanner.nextInt();
        scanner.close();

        // Crear y lanzar los hilos
        for (int i = 0; i < n; i++) {
            HiloCaraCruz h = new HiloCaraCruz();

            hilos.add(h);
            h.start();
        }

        // Esperamos a todos
        for (HiloCaraCruz h : hilos) {
            try {
                h.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        // Recuento de caras y cruces
        for (HiloCaraCruz h : hilos) {
            if (h.isCara()) {
                contadorCaras++;
            } else {
                contadorCruces++;
            }
        }

        System.out.println("Han salido " + contadorCaras + " caras y " + contadorCruces + " cruces");
    }

}