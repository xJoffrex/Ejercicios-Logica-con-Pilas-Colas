package Ejercicio_01_sign;

import Materia.Controllers.GenericStack;


public class SignValidator {
    public static boolean GesValido(String cadena) {
        GenericStack<Character> stack = new GenericStack<>();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);                      //almacena cada caracter de la cadena

        
            if (c == '(' || c == '{' || c == '[') {
                stack.Gpush(c); 
            } else if (c == ')' || c == '}' || c == ']') {                  
                if (stack.GisEmpty()) {                         //Si solo tenemos cierre y no apertura retorna false
                    return false; 
                }
                char top = stack.Gpop();   
                if ((top == '(' && c != ')') || (top == '{' && c != '}') || (top == '[' && c != ']')) {   //condicion para validar el cierre con la apertura
                    return false; 
                }
            }
        }
        return stack.GisEmpty();
    }

}
