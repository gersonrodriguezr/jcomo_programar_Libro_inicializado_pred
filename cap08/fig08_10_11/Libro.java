// Fig. 8.10: Libro.java
// Declara un tipo enum con constructor y campos de instancia expl�citos, 
// junto con m�todos de acceso para estos campos

public enum Libro
{    
   // declara constantes de tipo enum 
   JHTP( "Java How to Program", "2012" ),                        
   CHTP( "C How to Program", "2007" ),                           
   IW3HTP( "Internet & World Wide Web How to Program", "2008" ),
   CPPHTP( "C++ How to Program", "2012" ),                       
   VBHTP( "Visual Basic 2010 How to Program", "2011" ),
   CSHARPHTP( "Visual C# 2010 How to Program", "2011" );

   // campos de instancia 
   private final String titulo; // t�tulo del libro
   private final String anioCopyright; // a�o de copyright

   // constructor de enum
   Libro( String tituloLibro, String anio ) 
   { 
      titulo = tituloLibro;
      anioCopyright = anio;
   } // fin de constructor de enum Libro

   // m�todo de acceso para el campo titulo
   public String obtenerTitulo()
   {
      return titulo;
   } // fin del m�todo obtenerTitulo

   // m�todo de acceso para el campo anioCopyright
   public String obtenerAnioCopyright()
   {
      return anioCopyright;
   } // fin del m�todo obtenerAnioCopyright
} // fin de enum Libro


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