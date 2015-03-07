// Fig. 8.5: Tiempo2.java
// Declaración de la clase Tiempo2 con constructores sobrecargados. 

public class Tiempo2
{
   private int hora;   // 0 - 23
   private int minuto; // 0 - 59
   private int segundo; // 0 - 59

   // Constructor de Tiempo2 sin argumentos:
   // inicializa cada variable de instancia a cero
   public Tiempo2()
   {
      this( 0, 0, 0 ); // invoca al constructor de Tiempo2 con tres argumentos
   } // fin del constructor de Tiempo2 sin argumentos

   // Constructor de Tiempo2: se suministra hora, minuto y segundo con valor predeterminado de 0
   public Tiempo2( int h ) 
   { 
      this( h, 0, 0 ); // invoca al constructor de Tiempo2 con tres argumentos
   } // fin del constructor de Tiempo2 con un argumento

   // Constructor de Tiempo2: se suministran hora y minuto, segundo con valor predeterminado de 0
   public Tiempo2( int h, int m ) 
   { 
      this( h, m, 0 ); // invoca al constructor de Tiempo2 con tres argumentos
   } // fin del constructor de Tiempo2 con dos argumentos

   // Constructor de Tiempo2: se suministran hora, minuto y segundo
   public Tiempo2( int h, int m, int s ) 
   { 
      establecerTiempo( h, m, s ); // invoca a establecerTiempo para validar el tiempo
   } // fin del constructor de Tiempo2 con tres argumentos

   // Constructor de Tiempo2: se suministra otro objeto Tiempo2
   public Tiempo2( Tiempo2 tiempo )
   {
      // invoca al constructor de Tiempo2 con tres argumentos
      this( tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo() );
   } // fin del constructor de Tiempo2 con un objeto Tiempo2 como argumento

   // Métodos "establecer"
   // establece un nuevo valor de tiempo usando la hora universal; 
   // valida los datos
   public void establecerTiempo( int h, int m, int s )
   {
      establecerHora( h );   // establece la hora
      establecerMinuto( m ); // establece el minuto
      establecerSegundo( s ); // establece el segundo
   } // fin del método establecerTiempo

   // valida y establece la hora
   public void establecerHora( int h ) 
   {    
       if ( h >= 0 && h < 24 )
          hora = h;
       else
          throw new IllegalArgumentException( "hora debe ser de 0 a 23" );
   } // fin del método establecerHora

   // valida y establece el minuto
   public void establecerMinuto( int m ) 
   { 
       if ( m >= 0 && m < 60 ) 
          minuto = m;
       else
          throw new IllegalArgumentException( "minuto debe ser de 0 a 59");
   } // fin del método establecerMinuto

   // valida y establece el segundo 
   public void establecerSegundo( int s ) 
   { 
       if ( s >= 0 && s < 60 )
          segundo = ( ( s >= 0 && s < 60 ) ? s : 0 );
       else
          throw new IllegalArgumentException( "segundo debe ser de 0 a 59"); 
   } // fin del método establecerSegundo

   // Métodos "obtener"
   // obtiene el valor de la hora
   public int obtenerHora() 
   { 
      return hora; 
   } // fin del método obtenerHora

   // obtiene el valor del minuto
   public int obtenerMinuto() 
   { 
      return minuto; 
   } // fin del método obtenerMinuto

   // obtiene el valor del segundo
   public int obtenerSegundo() 
   { 
      return segundo; 
   } // fin del método obtenerSegundo

   // convierte a String en formato de hora universal (HH:MM:SS)
   public String aStringUniversal()
   {
      return String.format( 
         "%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo() );
   } // fin del método aStringUniversal

   // convierte a String en formato de hora estándar (H:MM:SS AM o PM)
   public String toString()
   {
      return String.format( "%d:%02d:%02d %s", 
         ( (obtenerHora() == 0 || obtenerHora() == 12) ? 12 : obtenerHora() % 12 ),
         obtenerMinuto(), obtenerSegundo(), ( obtenerHora() < 12 ? "AM" : "PM" ) );
   } // fin del método toString
} // fin de la clase Tiempo2

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