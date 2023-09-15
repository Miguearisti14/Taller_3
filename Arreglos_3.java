import java.util.Scanner;

public class Arreglos_3 {
  public static void main(String[] args) {
    //* Declaracion_Variables */
    Scanner scanner = new Scanner(System.in);
    int cantidadNotas;

    //*Solicitud de informacion */
    System.out.println("Ingrese su nombre");
    String nombre = scanner.nextLine();

    System.out.println("Ingrese la materia");
    String materia = scanner.nextLine();

    System.out.println("Ingrese la cantidad de notas");
    cantidadNotas = scanner.nextInt();

    //*Inicio de arreglos */
    double[] notas = new double[cantidadNotas];
    double[] porcentajes = new double[cantidadNotas];

    //*Ciclo para ingresar las notas y porcentajes */
    for (int i = 0; i < cantidadNotas; i++) {

      System.out.println("Ingrese la nota " + (i + 1));
      notas[i] = scanner.nextDouble();

      System.out.println("Ingrese el % de la nota " + (i + 1));
      porcentajes[i] = scanner.nextDouble();

    }

    //*Mensaje con los datos del usuario */
    System.out.println("Hola " + nombre + " Tus notas en " + materia + " son:");

    //*Ciclo para imprimir las notas */
    for (int i = 0; i < cantidadNotas; i++) {
      System.out.println(notas[i]);

    }

    //*Ciclo para imprimir los porcentajes */
    System.out.println("Los porcentajes de las notas son: ");
    for (int i = 0; i < cantidadNotas; i++) {

      System.out.println(porcentajes[i]);

    }

    //* Ciclo sumatoria de notas y porcentajes */
    double sumatoriaNotas = 0;
    double sumatoriaPorcentajes = 0;

    for (int i = 0; i < cantidadNotas; i++) {
      sumatoriaNotas += notas[i];
      sumatoriaPorcentajes += porcentajes[i];

    } 

    //* Impresion de operaciones para el promedio */
    System.out.println("Tu promedio es " + (sumatoriaNotas * (sumatoriaPorcentajes / 100)) / cantidadNotas);

    scanner.close();

  }
}
