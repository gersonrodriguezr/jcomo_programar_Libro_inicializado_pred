// Fig. 3.13: Cuenta.java
// La clase Cuenta con un constructor para validar e
// inicializar la variable de instancia saldo de tipo double.

public class Cuenta
{   
   private double saldo; // variable de instancia que almacena el saldo

   // constructor  
   public Cuenta( double saldoInicial )
   {
      // valida que saldoInicial sea mayor que 0.0; 
      // si no lo es, saldo se inicializa con el valor predeterminado 0.0
      if ( saldoInicial > 0.0 ) 
         saldo = saldoInicial; 
   } // fin del constructor de Cuenta

   // abona (suma) un monto a la cuenta
   public void abonar( double monto )
   {      
      saldo = saldo + monto; // suma el monto al saldo 
   } // fin del m�todo abonar

   // devuelve el saldo de la cuenta
   public double obtenerSaldo()
   {
      return saldo; // proporciona el valor de saldo al m�todo que hizo la llamada
   } // fin del m�todo obtenerSaldo
} // fin de la clase Cuenta


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