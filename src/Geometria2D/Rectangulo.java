package Geometria2D;

import java.util.Scanner;

public class Rectangulo {
    Scanner sc = new Scanner(System.in);

     double num1;
     double num2;
    double resultado;

     double num3;

    public Rectangulo( double num1, double num2, double resultado, double num3) {
        this.sc = sc;
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = num1 * num2;
        this.num3 = num3;
    }

    public double arearectangulo(){
        resultado= num1 * num2;
        setResultado(resultado);
        return resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void perimetrorectangulo(){
        do {
            System.out.print("Ingrese la base del rectangulo: ");
            num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num1 < 0);
        do {
            System.out.println("Ingrese la altura rectangulo: ");
            num2 = sc.nextDouble();
            if(num2 < 0){
                System.out.println("\nEl dato ingresado es incorrecto ingese nuevamente por favor");
            }
        }while(num2 < 0);
        resultado = 2 * (num1 + num2);
        System.out.println("\nEl perimtero del rectangulo es: " + resultado);
    }
    public void volumenrectangulo(){
        do {
            System.out.print("\nIngrese el valor del largo del rectangulo: ");
            num1 = sc.nextDouble();
            if(num1 < 0){
                System.out.println("\nEl valor ingresado es incorrecto ingrese nuevamente por favor");
            }
        }while (num1 < 0);
        do {
            System.out.print("Ingrese el ancho del rectangulo: ");
            num2 = sc.nextDouble();
            if(num2 < 0){
                System.out.println("\nEl valor ingresado es incorrecto ingrese nuevamente por favor");
            }
        }while(num2 < 0);
        do{
            System.out.print("Ingrese la altura del resctangulo: ");
            num3 = sc.nextDouble();
            if (num3 < 0){
                System.out.println("\nEl valor ingresado es incorrecto ingrese nuevamente por favor");
            }
        }while (num3 < 0);
        resultado = num1 * num2 * num3;
        System.out.println("\nEl volumen del rectangulo es: " + resultado);
    }
}
