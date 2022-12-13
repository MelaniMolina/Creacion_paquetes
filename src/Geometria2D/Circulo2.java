package Geometria2D;

import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circulo2 {
    Scanner sc = new Scanner(System.in);
     double radio;
     double resultCir;
    public Circulo2(double radio, double resultCir) {
        this.radio = radio;
        this.resultCir = resultCir;
    }

    public void Ingreso_Area(){

        do {
            System.out.print("Ingrese el Radio del Circulo: ");
            radio=sc.nextDouble();
            if(radio<=0){
                System.out.println("Entrada no valida ");
            }
        }while(radio <= 0);
        resultCir = (PI*pow(radio,2));
        System.out.println("El Area del Cuadrado es: "+resultCir);
    }
    public  void Ingrese_Perimetro(){
        do {
            System.out.print("Ingrese el Radio del Circulo: ");
            radio=sc.nextDouble();
            if(radio<=0){
                System.out.println("Entrada no valida ");
            }
        }while(radio <= 0);
        resultCir = (2*PI*pow(radio,2));
        System.out.println("El Perimetro del Cuadrado es: "+resultCir);
    }

    public void  Ingrese_Diametro(){
        do {
            System.out.print("Ingrese el Radio del Circulo: ");
            radio=sc.nextDouble();
            if(radio<=0){
                System.out.println("Entrada no valida ");
            }
        }while(radio <= 0);
        resultCir = (radio/ PI);
        System.out.println("El Diametro del Cuadrado es: "+resultCir);
    }
}
