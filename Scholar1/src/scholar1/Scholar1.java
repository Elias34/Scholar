
package scholar1;


public class Scholar1 {

    
    public static void main(String[] args) {
       Empleado empleado1 = new Empleado();
       empleado1.nombre= "Marcos Elias";
       empleado1.apellido= "Caro Meza";
       empleado1.fecha_nacimiento= "2001-12-27";
       empleado1.calcEdad();
        System.out.println("El empleado se llama " +empleado1.nombre);
        System.out.println("El apellido del empleado es " +empleado1.apellido);
        System.out.println("la fecha del nacimiento del empleado es "+empleado1.fecha_nacimiento);
        System.out.println("La edad del empleado es "+empleado1.calcEdad());
        
                
    }
    
}
