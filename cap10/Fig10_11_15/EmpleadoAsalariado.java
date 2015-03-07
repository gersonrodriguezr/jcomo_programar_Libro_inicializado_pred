// Fig. 10.14: EmpleadoAsalariado.java
// La clase EmpleadoAsalariado extiende a Empleado, que implementa a PorPagar.

public class EmpleadoAsalariado extends Empleado 
{
   private double salarioSemanal;

   // constructor con cuatro argumentos
   public EmpleadoAsalariado( String nombre, String apellido, String nss, 
      double salario )
   {
      super( nombre, apellido, nss ); // pasa argumentos al constructor de Empleado
      establecerSalarioSemanal( salario ); // valida y almacena el salario
   } // fin del constructor de EmpleadoAsalariado con cuatro argumentos

   // establece el salario
   public void establecerSalarioSemanal( double salario )
   {
      if (salario >= 0.0 )
         salarioSemanal = salario;
      else
         throw new IllegalArgumentException(
            "El salario semanal debe ser >= 0.0" );
   } // fin del método establecerSalarioSemanal

   // devuelve el salario
   public double obtenerSalarioSemanal()
   {
      return salarioSemanal;
   } // fin del método obtenerSalarioSemanal

   // calcula los ingresos; implementa el método de la interfaz PorPagar
   // que era abstracto en la superclase Empleado
   @Override
   public double obtenerMontoPago()
   {
      return obtenerSalarioSemanal();
   } // fin del método obtenerMontoPago

   // devuelve representación String de un objeto EmpleadoAsalariado
   @Override
   public String toString()
   {
      return String.format( "empleado asalariado: %s\n%s: $%,.2f", 
         super.toString(), "salario semanal", obtenerSalarioSemanal() );
   } // fin del método toString
} // fin de la clase EmpleadoAsalariado


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