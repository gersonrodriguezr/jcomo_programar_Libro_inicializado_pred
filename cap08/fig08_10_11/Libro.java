// Fig. 8.10: Libro.java
// Declara un tipo enum con constructor y campos de instancia explícitos, 
// junto con métodos de acceso para estos campos

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
   private final String titulo; // título del libro
   private final String anioCopyright; // año de copyright

   // constructor de enum
   Libro( String tituloLibro, String anio ) 
   { 
      titulo = tituloLibro;
      anioCopyright = anio;
   } // fin de constructor de enum Libro

   // método de acceso para el campo titulo
   public String obtenerTitulo()
   {
      return titulo;
   } // fin del método obtenerTitulo

   // método de acceso para el campo anioCopyright
   public String obtenerAnioCopyright()
   {
      return anioCopyright;
   } // fin del método obtenerAnioCopyright
} // fin de enum Libro


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