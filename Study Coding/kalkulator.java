import java.util.Scanner;

public class kalkulator {

static double tambah(double angka1, double angka2) {
    double hasil = angka1 + angka2;
    return hasil;
}

static double kurang(double angka1, double angka2) {
    double hasil = angka1 - angka2;
    return hasil;
}

static double kali(double angka1, double angka2) {
    double hasil = angka1 * angka2;
    return hasil;
}

static double bagi(double angka1, double angka2) {
    double hasil = angka1 / angka2;
    return hasil;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    double angka1;
    double angka2;
    double hasil;

    char operator;

    System.out.print("Angka 1 : ");
    angka1 = input.nextDouble();

    System.out.print("Angka 2 : ");
    angka2 = input.nextDouble();
    
    System.out.println("\nPilih Operator");
    System.out.println("+ = Penjumlahan");
    System.out.println("- = Pengurangan");
    System.out.println("* = Perkalian");
    System.out.println("/ = Pembagian");
     
    System.out.print("\nOperator : ");
    operator = input.next().charAt(0);

if (operator == '+') {
    hasil = tambah(angka1, angka2);
    System.out.println("\nHasil + : " + hasil);
} else if (operator == '-') {
    hasil = kurang(angka1, angka2);
    System.out.println("\nHasil - : " + hasil);

} else if (operator == '*') {
    hasil = kali(angka1, angka2);
    System.out.println("\nHasil * : " + hasil);

} else if (operator == '/') {
    hasil = bagi(angka1, angka2);
    System.out.println("\nHasil / : " + hasil);
} else {

    System.out.println("\nOperator tidak valid!");

    }

    }
}