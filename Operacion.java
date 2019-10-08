/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones1;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
class Operacion {
    public int[]arreglo= new int[20];
    public int opcion;
    //constructor
    
    public Operacion(){
        
        this.mostrarMenu();
        
    }
    //muestre el menu en pantalla
    public void mostrarMenu(){
        System.out.println("Opciones: \n"
                + "1. LLenar Array \n"
                + "2. Escribir Array \n"
                + "3. Sumatoria \n"
                + "4. Productoria \n"
                + "5. Tamaño del Array \n"
                + "6. Opcion SALIR \n"
                + "Escoja opcion");
        Scanner lectura = new Scanner(System.in);
        opcion=lectura.nextInt();
        this.cargarOpcion(opcion);
        
    }
     //lee el arreglo 
    public void leerArreglo(){
        System.out.println("Ingreso a la opcion numero 1");
    
    
    
}
    //Escribir arreglo
    public void escribirArreglo(){
        System.out.println("Ingreso a la opcion numero 2");
        
    }
    
    //Genera sumatoria
    public void sumatoria(){
        System.out.println("Ingreso a la opcion numero 3");
        
    }
    //Genera productoria
    public void productoria(){
        System.out.println("Ingreso a la opcion numero 4");
        
    }
    
    public void cargarOpcion(int op){
        
        //System.out.println("La opcion escogida es" +op);
        
        switch (op){
            
            case 1:
                this.leerArreglo();
                break;
            case 2:
                this.escribirArreglo();
                break;
            case 3: 
                this.sumatoria();
                break;
            case 4: 
                this.productoria();
                break;
                
                
               
            
            
            
            
            
        }
        
        
    }
    
    
}
