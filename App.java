import java.util.Scanner;
import Materia.Controllers.GenericStack;
import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- Menú ----");
            System.out.println("1. Validar signos");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Salir");
            System.out.print("Ingresa tu opción: ");

            if (!sc.hasNextInt()) {
                System.out.println("Ingresa un número valido");
                sc.nextLine();
                continue;
            }

            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Ingrese la cadena: ");
                String entrada = sc.nextLine();
                System.out.println("Signo valido?: " + SignValidator.GesValido(entrada));
            } else if (op == 2) {
                GenericStack<Integer> pila = new GenericStack<>();
                int[] valores = {6, 2, 0, 12, 11, 10, 9, 8, 5, 4, 7, 1, 3};

                for (int valor : valores) {
                    pila.Gpush(valor);
                }

                System.out.println("Pila original:");
                pila.GprintStack();
                System.out.println("Pila Ordenada");
                StackSorter.ordenar(pila);
                pila.GprintStack();
                

            } else if (op == 3) {
                System.out.println("Fin.");
                sc.close();
                return;
            } else {
                System.out.println("Opcion no valida");
            }
        }
    }
}
