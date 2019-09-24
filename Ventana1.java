
package ventana1;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Ventana1 extends JFrame {
    public Ventana1(){
       this.setSize(500,500); //Estabeclemos el tamaño de la ventana1 
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
       Container cp = getContentPane();
       cp.setLayout (new FlowLayout());
       JLabel etiqueta = new JLabel ("Nombre:");
       JTextField texto = new JTextField(25);
       cp.add(etiqueta);
       cp.add(texto);
         
       
       JLabel etiqueta2 = new JLabel ("Apellido");
       JTextField texto2 = new JTextField(2);
       cp.add(etiqueta2);
       cp.add(texto2);
       
       JLabel etiqueta3 = new JLabel ("Fecha_de_nacimiento:");
       JTextField texto3 = new JTextField(20);
       cp.add(etiqueta3);
       cp.add(texto3);
       
       JLabel etiqueta4 = new JLabel ("Direccion");
       JTextField texto4 = new JTextField (25);
       cp.add(etiqueta4);
       cp.add(texto4);
       
       JLabel etiqueta5 = new JLabel ("Telefono");
       JTextField texto5 = new JTextField(28);
       cp.add(etiqueta5);
       cp.add(texto5);
       
       JLabel etiqueta6 = new JLabel ("Email");
       JTextField texto6 = new JTextField(28);
       cp.add(etiqueta6);
       cp.add(texto6);
       
       JLabel etiqueta7 = new JLabel ("Genero");
       JTextField texto7= new JTextField(25);
       cp.add(etiqueta7);
       cp.add(texto7);
       
       JButton boton = new JButton("Guardar");
       JButton boton2 = new JButton("Salir");
       cp.add(boton);
       cp.add(boton2);
               
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
