/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_01;

import java.util.Scanner;

/**
 *Ingresar por teclado 5 notas y mostrar el promedio.
 * @author USUARIO
 */
public class Practica_07 {
public static void main(String args[]) {
Scanner dato=new Scanner(System.in);
float notas[]=new float[6]; int con=1;
float promedio,sum=0;
while(con<6) {
System.out.println("Ingrese la " + con + "° nota : "); notas[con]=dato.nextFloat();
sum=sum+notas[con]; con++;
}
promedio=sum/5;
System.out.println("Su promedio es : " + promedio);
}
}
