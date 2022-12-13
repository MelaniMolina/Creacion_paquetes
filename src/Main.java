import Geometria2D.Rectangulo;

import java.util.Scanner;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1=0, num2=0, resultado=0, num3=0, d = 0;
        Rectangulo r = new Rectangulo(num1, num2, num3, resultado);

        do {
            System.out.print("\nIngrese la base del rectangulo: ");
            num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while (num1 < 0);
        do {
            System.out.print("Ingrese la altura del rectangulo: ");
            num2 = sc.nextDouble();
            if(num2 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num2 < 0);

        System.out.println("\nEl area del rectangulo es: " +  r.arearectangulo());

    }
}
