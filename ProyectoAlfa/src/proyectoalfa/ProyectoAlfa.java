
package proyectoalfa;

import java.util.Scanner;

public class ProyectoAlfa {

  
    public static void main(String[] args) {
 float num1, num2 ;
        Scanner obx = new Scanner (System.in);
        System.out.println("Introduce el numero1 :");
        num1 = obx.nextFloat();
        System.out.println("Introduce el numero 2 :");
        num2 = obx.nextFloat();
        System.out.println("Multiplicacion ="+ num1 * num2);
    }
    
}
