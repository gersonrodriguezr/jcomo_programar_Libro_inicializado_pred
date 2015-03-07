// Fig. 8.3: PruebaAccesoMiembros.java
// Los miembros private de la clase Tiempo1 no son accesibles.
public class PruebaAccesoMiembros 
{
   public static void main( String[] args )
   {
      Tiempo1 tiempo = new Tiempo1(); // crea e inicializa un objeto Tiempo1

      tiempo.hora = 7;    // error: hora tiene acceso privado en Tiempo1
      tiempo.minuto = 15; // error: minuto tiene acceso privado en Tiempo1
      tiempo.segundo = 30; // error: segundo tiene acceso privado en Tiempo1
   } // fin de main
} // fin de la clase PruebaAccesoMiembros



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