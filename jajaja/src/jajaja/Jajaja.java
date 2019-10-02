
package jajaja;

import java.util.Scanner;


public class Jajaja {

    public static void main(String[] args) {
        
        int numeros[]= new int [5];
        Scanner leer = new Scanner(System.in);
        int index=0;
        
         for (int num:numeros){
             System.out.println("Digite numero: ");
             numeros[index]=leer.nextInt();
             index++;
         }
        
        
        
        
        
        
    }
    
}
