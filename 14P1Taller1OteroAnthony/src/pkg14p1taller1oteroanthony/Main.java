/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14p1taller1oteroanthony;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     
    
     System.out.println("Nombre: Anthony Otero");
     System.out.println("Universidad: de las fuerzas armadas ESPE:");
     System.out.println("Calculadora en Java");  
     System.out.println("=======================================");
     
     Scanner Datos = new Scanner(System.in);
     System.out.println("Ingrese el primer numero:");
     int num1=Datos.nextInt();
     System.out.println("Ingrese el segundo numero: ");
     int num2=Datos.nextInt();
     
     int resultadoSum;
     resultadoSum = num1 + num2;
     System.out.println("La suma es " + num1 + " + " + num2 + " = " + resultadoSum);
     
     int resultadoRes;
     resultadoRes = num1 - num2;
     System.out.println("La resta es " + num1 + " - " + num2 + " = " + resultadoRes);
     
     int resultadomul;
     resultadomul = num1 * num2;
     System.out.println("La multiplicacion es " + num1 + " * " + num2 + " = " + resultadomul);
     
     int resultdivi;
     resultdivi = num1 / num2;
     System.out.println("La division es " + num1 + " / " + num2 + " = " + resultdivi);
    }

}
