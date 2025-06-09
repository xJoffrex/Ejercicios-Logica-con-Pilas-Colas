package Ejercicio_02_sorting;
import Materia.Controllers.*;
public class StackSorter {
        public static void ordenar(GenericStack<Integer> stack) {
        GenericStack<Integer> temporal = new GenericStack<>();  //pila auxiliar

        while (!stack.GisEmpty()) {
            int temp = stack.Gpop();                            //temporal para guardar el ultimo elemento

            while (!temporal.GisEmpty() && temporal.Gpeek() > temp) {    //Si el peek de temporal es mayor se mueve de temporal a stack
                stack.Gpush(temporal.Gpop());                   // Mueve números de temporal a stack para ajustar los valores
            }

            temporal.Gpush(temp);                            //re acomoda los valores
        }

       
        while (!temporal.GisEmpty()) {
            stack.Gpush(temporal.Gpop()); //pila original con los números ya ordenados
        }
    }
}
