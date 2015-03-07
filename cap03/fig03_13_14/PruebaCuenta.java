// Fig. 3.14: PruebaCuenta.java
// Entrada y salida de números de punto flotante con objetos Cuenta.
import java.util.Scanner;

public class PruebaCuenta
{
   // el método main empieza la ejecución de la aplicación de Java
   public static void main( String[] args ) 
   {
      Cuenta cuenta1 = new Cuenta( 50.00 ); // crea objeto Cuenta
      Cuenta cuenta2 = new Cuenta( -7.53 ); // crea objeto Cuenta

      // muestra el saldo inicial de cada objeto
      System.out.printf( "Saldo de cuenta1: $%.2f\n", 
         cuenta1.obtenerSaldo() );
      System.out.printf( "Saldo de cuenta2: $%.2f\n\n", 
         cuenta2.obtenerSaldo() );
      
      // crea objeto Scanner para obtener la entrada de la ventana de comandos
      Scanner entrada = new Scanner( System.in );
      double montoDeposito; // deposita el monto escrito por el usuario

      System.out.print( "Escriba el monto a depositar para cuenta1: " ); // indicador
      montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
      System.out.printf( "\nsumando %.2f al saldo de cuenta1\n\n", 
         montoDeposito );
      cuenta1.abonar( montoDeposito ); // suma al saldo de cuenta1

      // muestra los saldos
      System.out.printf( "Saldo de cuenta1: $%.2f\n", 
         cuenta1.obtenerSaldo() );
      System.out.printf( "Saldo de cuenta2: $%.2f\n\n", 
         cuenta2.obtenerSaldo() );

      System.out.print( "Escriba el monto a depositar para cuenta2: " ); // indicador
      montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
      System.out.printf( "\nsumando %.2f al saldo de cuenta2\n\n", 
         montoDeposito );
      cuenta2.abonar( montoDeposito ); // suma al saldo de cuenta2

      // muestra los saldos
      System.out.printf( "Saldo de cuenta1: $%.2f\n", 
         cuenta1.obtenerSaldo() );
      System.out.printf( "Saldo de cuenta2: $%.2f\n", 
         cuenta2.obtenerSaldo() );
   } // fin de main
} // fin de la clase PruebaCuenta


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