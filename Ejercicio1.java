import java.until.Scanner;           // 1: importa la librería necesaria para tu programa 

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                            // 2: Completa para que el programa lea del teclado

        System.out.print("Nombre del alumno: ");
        String nombre = sc.nextLine();                    // 3: Define la variable y su método

        System.out.print("Minutos de estudio: ");
        int minutos = sc.nextInt();                  // 4: Define la variable y su método

        int horas = minutos / 60;                  // 5: operador para las horas completas
        int sobrantes = minutos % 60;              // 6: operador para los minutos que sobran
        double horasExactas = minutos / 60;         // 7: el 60 escrito para que dé decimales

        System.out.println("Tiempo de estudio de " + nombre);
        System.out.println(horas + " horas y " + sobrantes + " minutos");   // 8: las variables que van aquí
        System.out.println("En horas: " + horasExactas);

        sc.close();
    }

}