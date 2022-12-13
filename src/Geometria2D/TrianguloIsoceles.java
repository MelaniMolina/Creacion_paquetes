package Geometria2D;
import java.math.*;
import java.util.Scanner;

public class TrianguloIsoceles {
    Scanner sc = new Scanner(System.in);

    private double num1;
    private  double num2;
    private double num3;
    private double resultado;

    public TrianguloIsoceles(Scanner sc, double num1, double num2, double num3, double resultado) {
        this.sc = sc;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.resultado = resultado;
    }
    public void areatrianguloIsoceles(){
        do {
            System.out.print("\nIngrese la base del triangulo: ");
            num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while (num1 < 0);
        do {
            System.out.print("Ingrese la altura del triangulo: ");
            num2 = sc.nextDouble();
            if(num2 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while (num2 <0);
        resultado = (num1 * num2) / 2;
        System.out.println("\nEl area del triangulo es: " + resultado);
    }
    public void perimetrotrianguloIsoceles(){
        do {
            System.out.print("\nIngrese el valor de uno de sus lados lado: ");
            num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num1 < 0);
        do {
            System.out.print("Ingrese el valor de la base: ");
            num2 = sc.nextDouble();
            if(num2 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num2 < 0);
        resultado = Math.pow(num1,2) + num2;
        System.out.println("\nEl perimetro del triangulo es: " + resultado);
    }
    public void alturatrianguloIsoceles(){
        do {
            System.out.print("\nIngrese el valor de uno de sus lados lado: ");
            num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num1 < 0);
        do {
            System.out.print("Ingrese el valor de la base: ");
            num2 = sc.nextDouble();
            if(num2 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num2 < 0);
        resultado = Math.sqrt(Math.pow(num1,2)-Math.pow(num2,2)/4);
        System.out.println("\nLa altulra del triangulo es: " + resultado);
    }
}
