package Geometria2D;

import javax.sound.midi.Soundbank;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import java.util.Scanner;
public class Pentagono {
    Scanner sc = new Scanner(System.in);
    private double Lado;
    private double apotema;
    private double perimetro;

    private double angulo;
    private double result_Penta;

    public Pentagono(double lado, double apotema, double result_Penta,double perimetro,double angulo) {
        Lado = lado;
        this.apotema = apotema;
        this.result_Penta = result_Penta;
        this.perimetro =  perimetro;
        this.angulo=angulo;
    }
    public void Ingrese_Area(){
        do {
            System.out.print("Ingrese el Perimetro del Pentagono: ");
            perimetro=sc.nextDouble();
            if(perimetro<=0){
                System.out.println("Entrada no valida ");
            }
        }while(perimetro <= 0);

        do {
            System.out.print("Ingrese el Apotema del Pentagono: ");
            apotema=sc.nextDouble();
            if(apotema<=0){
                System.out.println("Entrada no valida ");
            }
        }while(apotema <= 0);
        result_Penta = (perimetro*apotema)/2;
        System.out.println("El Area del Cuadrado es: "+result_Penta);
    }
    public void Ingrese_Perimetro(){
        do {
            System.out.print("Ingrese el Numero de Lados del Pentagono: ");
            Lado=sc.nextDouble();
            if (Lado<=0){
                System.out.println("Entrada no valida ");
            }
        }while (Lado <= 0);
        do {
            System.out.print("Ingrese el Valor del Lado del Pentagono: ");
            Lado=sc.nextDouble();
            if (Lado<=0){
                System.out.println("Entrada no valida ");
            }
        }while (Lado<=0);
        result_Penta = Lado*Lado;
        System.out.println("El Perimetro del Pentagono es: "+result_Penta);
    }

    public void Ingrese_Apotema(){
        do{
            System.out.println("Ingrese el Valor del Lado del Pentanogo: ");
            Lado=sc.nextDouble();
            if (Lado<=0){
                System.out.println("Entrada no valida ");
            }
        }while (Lado<=0);
        do {
            System.out.println("Ingrese el Valor del Angulo: ");
            angulo = sc.nextDouble();
            if (angulo<=0){
                System.out.println("Entrada no valida ");
            }
        }while (angulo<=0);
        result_Penta = (Lado)/(2*(Math.tan(angulo)));
        System.out.println("El Apotema del Pentagono es: "+result_Penta  );
    }
}
