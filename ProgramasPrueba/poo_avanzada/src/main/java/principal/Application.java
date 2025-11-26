/*En Java cuando ponemos un punto, por ejemplo m. o p. veremos que nos salen las propiedades que hemos definido
 * pero que también nos salen otro tipo de funciones y propiedades que nosotros claramente no hemos definido, esto se debe
 * a que todas las clases heredan de objeto es como si en todas las clases tuvieran un extends Object por eso salen
 * esas funciones o constructores que no están definidos en nuestra clase pero sí que están definidos en la clase de 
 * object. No poner el extends Object equivale a ponerlo, todas las clases siempre heredan de Object.
 */
package principal;

public class Application {
  public static void main(String[] args) {
    Mosca m = new Mosca();
    Perro p = new Perro(4, "Boxer", "Pipa");
    System.out.println(m.nombreCientifico);
    System.out.println(m.getEdad());
    System.out.println(p.nombreHumano);
    System.out.println(p.nombreCientifico);
  }
}
