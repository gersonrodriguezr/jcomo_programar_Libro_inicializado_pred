// Fig. 8.19: PanelDibujo.java
// Programa que utiliza la clase MiLinea
// para dibujar líneas al azar.
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel
{
   private Random numerosAleatorios = new Random();   
   private MiLinea[] lineas; // arreglo de lineas

   // constructor, crea un panel con figuras al azar
   public PanelDibujo()
   {
      setBackground( Color.WHITE );
      
      lineas = new MiLinea[ 5 + numerosAleatorios.nextInt( 5 ) ];

      // crea lineas
      for ( int cuenta = 0; cuenta < lineas.length; cuenta++ )
      {
         // genera coordenadas aleatorias
         int x1 = numerosAleatorios.nextInt( 300 );
         int y1 = numerosAleatorios.nextInt( 300 );
         int x2 = numerosAleatorios.nextInt( 300 );
         int y2 = numerosAleatorios.nextInt( 300 );
         
         // genera un color aleatorio
         Color color = new Color( numerosAleatorios.nextInt( 256 ), 
            numerosAleatorios.nextInt( 256 ), numerosAleatorios.nextInt( 256 ) );
         
         // agrega la línea a la lista de líneas a mostrar en pantalla
         lineas[ cuenta ] = new MiLinea( x1, y1, x2, y2, color );
      } // fin de for
   } // fin del constructor de PanelDibujo

   // para cada arreglo de figuras, dibuja las figuras individuales
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      
      // dibuja las líneas
      for ( MiLinea linea : lineas )
         linea.dibujar( g );
   } // fin del método paintComponent
} // fin de la clase PanelDibujo


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