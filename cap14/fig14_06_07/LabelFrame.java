// Fig. 14.6: LabelFrame.java
// Demostraci�n de la clase JLabel.
import java.awt.FlowLayout; // especifica c�mo se van a ordenar los componentes
import javax.swing.JFrame; // proporciona las caracter�sticas b�sicas de una ventana
import javax.swing.JLabel; // muestra texto e im�genes
import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing
import javax.swing.Icon; // interfaz utilizada para manipular im�genes
import javax.swing.ImageIcon; // carga las im�genes

public class LabelFrame extends JFrame 
{
   private JLabel etiqueta1; // JLabel s�lo con texto
   private JLabel etiqueta2; // JLabel construida con texto y un icono
   private JLabel etiqueta3; // JLabel con texto adicional e icono

   // El constructor de LabelFrame agrega objetos JLabel a JFrame
   public LabelFrame()
   {
      super( "Prueba de JLabel" );
      setLayout( new FlowLayout() ); // establece el esquema del marco

      // Constructor de JLabel con un argumento String
      etiqueta1 = new JLabel( "Etiqueta con texto" );
      etiqueta1.setToolTipText( "Esta es etiqueta1" );
      add( etiqueta1 ); // agrega etiqueta1 a JFrame

      // Constructor de JLabel con argumentos de cadena, Icono y alineaci�n
      Icon insecto = new ImageIcon( getClass().getResource( "insecto1.png" ) );
      etiqueta2 = new JLabel( "Etiqueta con texto e icono", insecto, 
         SwingConstants.LEFT );
      etiqueta2.setToolTipText( "Esta es etiqueta2" );
      add( etiqueta2 ); // agrega etiqueta2 a JFrame

      etiqueta3 = new JLabel(); // Constructor de JLabel sin argumentos
      etiqueta3.setText( "Etiqueta con icono y texto en la parte inferior" );
      etiqueta3.setIcon( insecto ); // agrega icono a JLabel
      etiqueta3.setHorizontalTextPosition( SwingConstants.CENTER );
      etiqueta3.setVerticalTextPosition( SwingConstants.BOTTOM );
      etiqueta3.setToolTipText( "Esta es etiqueta3" );
      add( etiqueta3 ); // agrega etiqueta3 a JFrame
   } // fin del constructor de LabelFrame
} // fin de la clase LabelFrame


/**************************************************************************
 * (C) Copyright 1992-2012 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/