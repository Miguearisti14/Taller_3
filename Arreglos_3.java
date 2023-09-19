import java.util.Scanner;

public class Arreglos_3 {
  public static void main(String[] args) {
    // * Declaracion_Variables */
    Scanner scanner = new Scanner(System.in);

    // *Solicitud de informacion */
    System.out.println("Ingrese su nombre");
    String nombre = scanner.nextLine();

    System.out.println("Ingrese el numero de materias");
    int cantidadMaterias = scanner.nextInt();

    System.out.println("Ingrese la cantidad de notas para cada materia");
    int cantidadNotas = scanner.nextInt();

    // *Inicio de arreglos */
    double[][] notas = new double[cantidadMaterias][cantidadNotas];
    double[][] porcentajes = new double[cantidadMaterias][cantidadNotas];
    double[] promedios = new double[cantidadMaterias];
    String[] materias = new String[cantidadMaterias];

    // *Ciclo para ingresar las notas y porcentajes */
    for (int i = 0; i < cantidadMaterias; i++) {

      System.out.println("Ingrese la materia " + (i + 1));
      materias[i] = scanner.next();

      for (int x = 0; x < cantidadNotas; x++) {
        System.out.println("Ingrese la nota " + (x + 1));
        notas[i][x] = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje desde 0 hasta 100 de la nota " + (x + 1));
        porcentajes[i][x] = scanner.nextDouble();

      }

    }

    // *Sumatoria de las notas y porcentajes y calculo de los promedios */

    for (int i = 0; i < cantidadMaterias; i++) {
      double sumatoriaNotas = 0;
      double sumatoriaPromedios = 0;
      for (int n = 0; n < cantidadNotas; n++) {
        sumatoriaNotas += notas[i][n];
        sumatoriaPromedios += porcentajes[i][n];
      }

      promedios[i] = ((sumatoriaNotas * (sumatoriaPromedios / 100)) / cantidadNotas);
      System.out.println("El promedio es de la materia " + materias[i] + " es: " + promedios[i]);
    }

    scanner.close();
  }
}
