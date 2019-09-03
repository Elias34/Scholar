
package persona;


public class Persona {

   
    public static void main(String[] args) {
        Estudiante instancia1= new Estudiante();
        
        instancia1.nombre= "Marcos";
        instancia1.fecha_nacimiento= "2001-12-27";
        System.out.println("El nombre es "+instancia1.nombre);
        System.out.println("La fecjha de nacimiento es "+instancia1.fecha_nacimiento);
        System.out.println("la edad es: "+instancia1.CalcEdad());
        
                
                
                
        
        
        
        
        
        
        
        
    }
    public int CalcEdad(){
        return 10;
        
    }
    
}
