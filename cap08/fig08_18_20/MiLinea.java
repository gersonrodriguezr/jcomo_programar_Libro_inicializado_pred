// Fig. 8.18: MiLinea.java
// La clase MiLinea representa a una línea.
import java.awt.Color;
import java.awt.Graphics;

public class MiLinea
{
   private int x1; // coordenada x del primer punto final
   private int y1; // coordenada y del primer punto final
   private int x2; // coordenada x del segundo punto final
   private int y2; // coordenada y del segundo punto final
   private Color miColor; // el color de esta figura

   // constructor con valores de entrada
   public MiLinea( int x1, int y1, int x2, int y2, Color color )
   {
      this.x1 = x1; // establece la coordenada x del primer punto final
      this.y1 = y1; // establece la coordenada y del primer punto final
      this.x2 = x2; // establece la coordenada x del segundo punto final
      this.y2 = y2; // establece la coordenada y del segundo punto final
      miColor = color; // establece el color
   } // fin del constructor de MiLinea
   
   // Dibuja realmente la línea
   public void dibujar( Graphics g )
   {
      g.setColor( miColor );
      g.drawLine( x1, y1, x2, y2 );
   } // fin del método dibujar
} // fin de la clase MiLinea


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