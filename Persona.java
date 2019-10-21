/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;


public class Persona {

    public String nombre, apellido, direccion, fecha_nacimiento;
    Scanner lectura= new Scanner (System.in);
  
    
    

//Constructor
    
     public Persona(String nom, String ape, String dire, String fec){
     this.nombre=nom;
     this.apellido=ape;
     this.direccion=dire;
     this.fecha_nacimiento=fec;
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public int op;
     
     
     public void mostrarMenu(){
         System.out.println("Bienvenido al menu\n"
                 + "1.LLenar el array con sus datos\n"
                 + "2.Mostrar sus datos\n"
                 + "3. Cerrar el programa\n"
                 + "Por Favor, escoja una opcion"); 
                 
         op=lectura.nextInt();
         
         
         
     }
     
   
     public void llenarArray(){
         Persona[]numeros=new Persona[5];
         System.out.println("Ingreso a la primera opcion");
         
         for (int i=0;i<numeros.length; i++){
         
          //Preguntar nombre
         System.out.println("Digite nombre");
        String nom = lectura.nextLine();
         
         //Preguntar apellido
         System.out.println("Digite apellido");
        String ape = lectura.nextLine();
         
         //Preguntar direccion
         System.out.println("Digite direccion");
        String dire = lectura.nextLine();
         
         //Preguntar fecha de nacimiento
         System.out.println("Digite fecha de nacimiento");
        String fec = lectura.nextLine();
     }
         
         
                 
             
        
        
  }
     
     public void mostrarArray(){
         
         
       
         
         
         
     }
     
     
     public void cargarOpcion(int op){
         
         switch (op){
             case 1: 
                 this.llenarArray();
                 break;
           
             case 2:
                 this.mostrarArray();
                 break;
                 
             case 3:
                 System.out.println("Usted decidio cerrar el programa, adios");
                 break;
                 
             default:
                 System.out.println("Verifique opcion");
                         
                 
                 
             
         }
         
         
         
         
         
         
     }
     
     
     
         
     }
    
   
    
    






