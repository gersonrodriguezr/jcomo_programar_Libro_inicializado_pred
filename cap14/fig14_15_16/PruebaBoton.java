// Fig. 15.16: PruebaBoton.java
// Prueba de MarcoBoton.
import javax.swing.JFrame;

public class PruebaBoton 
{
   public static void main( String[] args )
   { 
      MarcoBoton marcoBoton = new MarcoBoton(); // crea MarcoBoton
      marcoBoton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      marcoBoton.setSize( 300, 110 ); // establece el tamaño del marco
      marcoBoton.setVisible( true ); // muestra el marco
   } // fin de main
} // fin de la clase PruebaBoton

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
