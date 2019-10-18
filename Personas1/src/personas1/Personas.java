/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas1;


import java.util.Scanner;

/**
 *
 * @author estudiante
 */
class Personas {
    public int[]arreglo= new int[5];
    public int opcion;
    Scanner lectura=new Scanner (System.in);
    
    public String nombre,apellido, direccion,fecha_naciemiento;
    
    public Personas(String nom, String ape, String dire, String fec){
        this.nombre=nom;
        this.apellido=ape;
        this.direccion=dire;
        this.fecha_naciemiento=fec;
        
        
       
        this.mostrarMenu();
        
        
    }

   
    //Mostrar el menu en la pantalla
    public void mostrarMenu(){
        System.out.println("Bienvenido al programa\n"
                + "1. Ingresar datos de dicha Persona\n"
                + "2. Mostrar datos de dicha Persona\n"
                + "3. Cerrar\n"
                + "Por favor, escoja una opcion");
        
        int opcion=lectura.nextInt();
        this.cargarOpcion(opcion);
    }
    //Leer el arreglo de persona
    public void leerPersona(){
        for (int i=0; i<arreglo.length; i++)
            System.out.println("Digite nombre");
            nombre=lectura.nextLine();
            System.out.println("Digite apellido");
            apellido=lectura.nextLine();
            System.out.println("Digite direccion");
            direccion=lectura.nextLine();
            System.out.println("Digite fecha de naciemiento");
            apellido=lectura.nextLine();
            
            
    }
    
    public void escribirPersona(){
        
        
        
        
        
        
    }
    public void cargarOpcion(int op){
        
        switch(op) {
    
        case 1: this.leerPersona();
        break;
        
        case 2: this.escribirPersona();
        break;
        
        case 3: System.out.println("Ha decidido cerrar la programa, hasta la proxima");
        break;
        
        default: System.out.println("Opcion invalida");
        
     }
        
     
}    

}
   