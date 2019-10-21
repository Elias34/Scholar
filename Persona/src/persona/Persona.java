
package persona;

import java.util.Scanner;


public class Persona {
      
    
        public String nombre;
        public String apellido;
        public String fecha_nacimiento;
        public String identidad;
        
       String arreglo []  = new String[5];
       int persona []= new int[5];
       int grupoA;
               
       public String opcion;
       
        Persona Persona[]= new Persona[5];
         Scanner lectura = new Scanner (System.in);
         
        //constructor
         public Persona(){
         
        this.mostrarMenu();
        
    }
    //mostrar menu en pantalla
    public void mostrarMenu(){ 
        
        System.out.println("escoja opcion\n"+"1: Escribir el nombre\n"+"2: Escribir Apellido\n"+"3: Escribir fecha de nacimiento\n"
                + "4: Escribir identificacion\n"+"5: Escribir direccion");
        
        Scanner lectura = new Scanner (System.in);
        opcion = lectura.nextLine();
        //this.cargarOpcion(opcion);
                
    }
    
    public void leerArreglo(){
        System.out.println("EL ARREGLO ES:");
        
     for (int i =0; i<5; i++){
         
        grupoA[0].nombre= lectura.nextLine();
     }
        
    }
    // public void cargarArreglo(String op){
         
        // switch (op){
                 
                 //case 1:
                   //  this.leerArreglo();
                     //break;
                 //case 2:
                     //this.escribirArreglo();
                     //break;
                 
         }   
     }
}
     
             



