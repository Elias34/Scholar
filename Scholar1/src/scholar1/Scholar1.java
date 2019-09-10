
package scholar1;

import java.util.Scanner;


public class Scholar1 {

    
    public static void main(String[] args) {
      
       
       
       
        Empleado empleado1 = new Empleado();
       empleado1.nombre= "Marcos Elias";
       empleado1.apellido= "Caro Meza";
       empleado1.fecha_nacimiento= "12/27";
       
        System.out.println("El empleado se llama " +empleado1.nombre);
        System.out.println("El apellido del empleado es " +empleado1.apellido);
        System.out.println("la fecha del nacimiento del empleado es "+empleado1.fecha_nacimiento);
        
        Scanner lectura=new Scanner (System.in);
       int edad, año_nacimiento, año_actual;
        System.out.println("Ingrese el año de nacimiento de la persona");
        año_nacimiento=lectura.nextInt();
        System.out.println("Ingrese el año actual");
        año_actual=lectura.nextInt();
        edad=año_actual-año_nacimiento;
        System.out.println("La edad del empleado es " +edad);
        
       
    }
    
}
