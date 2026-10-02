import java.util.Scanner;       // 1: Importa la libreria necesaria

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double BONO = 0.10;                      // 2: declara una constante con su tipo de dato

        System.out.print("Número de celular: ");
        String celular = sc.nextLine();                 // 3: responde para saber el tipo de dato (¿se hacen cuentas con él?) y su metodo

        System.out.print("Saldo actual: ");
        double saldo = sc.nextDouble();                 // 4: Define la variable y su método

        System.out.print("Recarga: ");
        double recarga = sc.nextDouble();                 // 5: Define la variable y su método

        double bono = recarga * BONO;              // 6: operador aritmético
        double total = recarga + bono;             // 7: operador aritmético
        double saldoFinal = saldo + total;             // 8: la variable que se suma al saldo

        boolean llegaA200 = saldoFinal >= 200;      // 9: operador relacional (mayor o igual)
        boolean promocion = recarga >= 100 && saldo < 50;   // 10: tipo de dato lógico para true o false y operador lógico donde ambos deben ser verdaderos para cumplirse

        System.out.println("----- Recarga al " + celular + " -----");
        System.out.println("Recarga: " + recarga);
        System.out.println("Bono: " + bono);
        System.out.println("Total recibido: " + total);
        System.out.println("Saldo final: " + saldoFinal);
        System.out.println("¿Llega a 200?: " + llegaA200);
        System.out.println("¿Aplica promoción?: " + promocion);   // 11: la variable que va aquí

        sc.close();
    }
}