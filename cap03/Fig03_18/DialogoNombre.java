// Fig. 3.18: DialogoNombre.java
// Entrada básica con un cuadro de diálogo.
import javax.swing.JOptionPane;

public class DialogoNombre
{
   public static void main( String args[] )
   {
      // pide al usuario que escriba su nombre
      String nombre =                                          
         JOptionPane.showInputDialog( "Cual es su nombre?" );
      
      // crea el mensaje
      String mensaje =                                              
         String.format( "Bienvenido, %s, a la programacion en Java!", nombre );

      // muestra el mensaje para dar la bienvenida al usuario por su nombre 
      JOptionPane.showMessageDialog( null, mensaje );
   } // fin de main
} // fin de la clase DialogoNombre

/**************************************************************************
 * (C) Copyright 1992-2012 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigación y prueba de las teorías y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garantía de      *
 * ningún tipo, expresa o implícita, en relación con estos programas o    *
 * con la documentación contenida en estos libros. Los autores y el       *
 * editor no serán responsables en ningún caso por los daños consecuentes *
 * en conexión con, o que surjan de, el suministro, desempeño o uso de    *
 * estos programas.                                                       *
 *************************************************************************/