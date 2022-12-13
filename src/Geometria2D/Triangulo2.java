package Geometria2D;
import java.math.*;
import java.util.Scanner;

public class Triangulo2 {
    Scanner sc = new Scanner(System.in);
    private double num1;
    private  double num2;
    private double num3;
    private double resultado;

    public Triangulo2(double num1, double num2, double num3, double resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.resultado = resultado;
    }
    public void areatriangulo(){
        do {
            System.out.print("\nIngrese la base del triangulo: ");
            num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while (num1 < 0);
        do {
            System.out.print("Ingrese la atlura del triangulo: ");
            num2 = sc.nextDouble();
            if(num2 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while (num2 <0);
        resultado = (num1 * num2) / 2;
        System.out.println("\nEl area del triangulo es: " + resultado);
    }
    public void perimetrotriangulo(){
        do {
            System.out.print("\nIngrese el valor del primer lado: ");
            num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num1 < 0);
        do {
            System.out.print("Ingrese el valor del segundo lado: ");
            num2 = sc.nextDouble();
            if(num2 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num2 < 0);
        do {
            System.out.print("Ingrese el valor del tercer lado: ");
            num3 = sc.nextDouble();
            if(num3 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num3 < 0);
        resultado = num1 + num2 + num3;
        System.out.println("\nEl perimetro del triangulo es: " + resultado);
    }
    public void hipotenusa(){
        do{
            System.out.print("\nIngrese el valor del primer lado: ");
            num1 = sc.nextDouble();
            if (num1 < 0 ){
                System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresar por favor");
            }
        }while (num1 < 0);
        do{
            System.out.print("Ingrese el valor del segundo lado: ");
            num2 = sc.nextDouble();
            if (num2 < 0 ){
                System.out.println("\nEl valor ingresado es incorrecto vuelva a ingresar por favor");
            }
        }while (num2 < 0);
        num3 = (num1 * num1) + (num2 * num2);
        resultado = Math.sqrt(resultado);
        System.out.println("\nEl valor de la hipotenusa es: " + resultado);
    }
}
