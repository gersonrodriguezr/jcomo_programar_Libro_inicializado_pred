// Fig. 11.46: DemoPanel.java
// Prueba de MarcoPanel.
import javax.swing.JFrame;

public class DemoPanel extends JFrame 
{
   public static void main( String[] args )
   { 
      MarcoPanel marcoPanel = new MarcoPanel(); 
      marcoPanel.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      marcoPanel.setSize( 450, 200 ); // establece el tamaño del marco
      marcoPanel.setVisible( true ); // muestra el marco
   } // fin de main
} // fin de la clase DemoPanel


/**************************************************************************
 * (C) Copyright 1992-2011 por Deitel & Associates, Inc. y                *
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
