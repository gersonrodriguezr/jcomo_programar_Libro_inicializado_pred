// Fig. 17.12: ConsultaCredito.java
// Este programa lee un archivo secuencialmente y muestra su
// contenido con base en el tipo de cuenta que solicita el usuario
// (saldo con cr�dito, saldo con d�bito o saldo de cero).
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.deitel.cap17.RegistroCuenta;

public class ConsultaCredito
{
   private OpcionMenu tipoCuenta;
   private Scanner entrada;
   private final static OpcionMenu[] opciones = { OpcionMenu.SALDO_CERO,
      OpcionMenu.SALDO_CREDITO, OpcionMenu.SALDO_DEBITO,
      OpcionMenu.FIN };

   // lee los registros del archivo y muestra s�lo los registros del tipo apropiado
   private void leerRegistros()
   {
      // objeto que se va a escribir en el archivo
      RegistroCuenta registro = new RegistroCuenta(); 

      try // lee registros
      {     
         // abre el archivo para leer desde el principio
         entrada = new Scanner( new File( "clientes.txt" ) );

         while ( entrada.hasNext() ) // recibe los valores del archivo
         {
            registro.establecerCuenta( entrada.nextInt() ); // lee n�mero de cuenta
            registro.establecerPrimerNombre( entrada.next() ); // lee primer nombre
            registro.establecerApellidoPaterno( entrada.next() ); // lee apellido paterno
            registro.establecerSaldo( entrada.nextDouble() ); // lee saldo

            // si el tipo de cuenta es apropiado, muestra el registro
            if ( debeMostrar( registro.obtenerSaldo() ) )
               System.out.printf( "%-10d%-12s%-12s%10.2f\n",
                  registro.obtenerCuenta(), registro.obtenerPrimerNombre(),
                  registro.obtenerApellidoPaterno(), registro.obtenerSaldo() );
         } // fin de while
      } // fin de try
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "El archivo no esta bien formado." );
         entrada.close();
         System.exit( 1 );
      } // fin de catch
      catch ( IllegalStateException stateException )
      {
         System.err.println( "Error al leer del archivo." );
         System.exit( 1 );
      } // fin de catch
      catch ( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "No se puede encontrar el archivo." );
         System.exit( 1 );
      } // fin de catch
      finally
      {
         if ( entrada != null )
            entrada.close(); // cierra el objeto Scanner y el archivo
      } // fin de finally
   } // fin del m�todo leerRegistros

   // usa el tipo de registro para determinar si el registro debe mostrarse
   private boolean debeMostrar( double saldo )
   {
      if ( ( tipoCuenta == OpcionMenu.SALDO_CREDITO )
         && ( saldo < 0 ) )
         return true;

      else if ( ( tipoCuenta == OpcionMenu.SALDO_DEBITO )
         && ( saldo > 0 ) )
         return true;

      else if ( ( tipoCuenta == OpcionMenu.SALDO_CERO )
         && ( saldo == 0 ) )
         return true;

      return false;
   } // fin del m�todo debeMostrar

   // obtiene solicitud del usuario
   private OpcionMenu obtenerSolicitud()
   {
      Scanner textoEnt = new Scanner( System.in );
      int solicitud = 1;

      // muestra opciones de solicitud
      System.out.printf( "\n%s\n%s\n%s\n%s\n%s\n",
         "Escriba solicitud", " 1 - Lista de cuentas con saldos de cero",
         " 2 - Lista de cuentas con saldos con credito",
         " 3 - Lista de cuentas con saldos con debito", " 4 - Finalizar ejecucion" );

      try // trata de recibir la opci�n del men� 
      {
         do // recibe solicitud del usuario
         {
            System.out.print( "\n? " );
            solicitud = textoEnt.nextInt();
         } while ( ( solicitud < 1 ) || ( solicitud > 4 ) );
      } // fin de try
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "Entrada invalida." );
         System.exit( 1 );
      } // fin de catch

      return opciones[ solicitud - 1 ]; // devuelve valor de enum para la opci�n
   } // fin del m�todo obtenerSolicitud

   public void procesarSolicitudes()
   {
      // obtiene la solicitud del usuario (saldo de cero, con cr�dito o con d�bito)
      tipoCuenta = obtenerSolicitud();

      while ( tipoCuenta != OpcionMenu.FIN )
      {
         switch ( tipoCuenta )
         {
            case SALDO_CERO:
               System.out.println( "\nCuentas con saldos de cero:\n" );
               break;
            case SALDO_CREDITO:
               System.out.println( "\nCuentas con saldos con credito:\n" );
               break;
            case SALDO_DEBITO:
               System.out.println( "\nCuentas con saldos con debito:\n" );
               break;
         } // fin de switch

         leerRegistros();
         tipoCuenta = obtenerSolicitud();
      } // fin de while
   } // fin del m�todo procesarSolicitudes
} // fin de la clase ConsultaCredito

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