import java.util.Scanner;
public class HitungIP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    //variabel
    int jumlahMK, sks;
    int nilaiAngka;
    String nilaiHuruf, keterangan;
    double bobot;
    int totalSKS = 0;
    double totalNilai = 0;
    String namaMahasiswa;
    String nimMahasiswa;
    String universitasDinamika, terimakasih;

    //input
    System.out.print ("----- Universitas Dinamika-----");
    
    System.out.print("\nNama Mahasiswa: ");
    namaMahasiswa = input.nextLine();
    
    System.out.print("NIM Mahasiswa: ");
    nimMahasiswa = input.nextLine();

    System.out.print("Masukkan jumlah mata kuliah: ");
    jumlahMK = input.nextInt();

    for (int i = 1; i <= jumlahMK; i++) {
    System.out.println("\nMata kuliah ke-" + i);

    System.out.print("SKS: ");
    sks = input.nextInt();

    System.out.print("Nilai angka (0-100): ");
    nilaiAngka = input.nextInt();

    // konversi nilai
    if (nilaiAngka >= 80) {
        nilaiHuruf = "A";
        bobot = 4.0;
        keterangan = "ISTIMEWA";
    } else if (nilaiAngka >= 75) {
                nilaiHuruf = "B+";
    bobot = 3.5;
    keterangan = "MEMUASKAN";
    } else if (nilaiAngka >= 65) {
                nilaiHuruf = "B";
                bobot = 3.0;
                keterangan = "BAIK";
    } else if (nilaiAngka >= 60) {
                nilaiHuruf = "C+";
                bobot = 2.5;
                keterangan = "SEDANG";
    }  else if (nilaiAngka >= 55) {
                nilaiHuruf = "C";
                bobot = 2.0;
                keterangan = "CUKUP";
    } else if (nilaiAngka >= 40) {
                nilaiHuruf = "D";
                bobot = 1.0;
                keterangan = "KURANG";
    } else {
            nilaiHuruf = "E";
            bobot = 0;
            keterangan = "GAGAL";
            }

            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Bobot: " + bobot);
            System.out.println("Keterangan: " + keterangan);

            totalSKS += sks;
            totalNilai += sks * bobot;
        }

        double IP = totalNilai / totalSKS;
        System.out.printf("\nIP Semester: %.2f \n", IP);

        // SKS maksimal
    if (IP >= 3.50)
        System.out.println("SKS Maksimal: 24");
    else if (IP >= 3.00)
        System.out.println("SKS Maksimal: 22");
    else if (IP >= 2.00)
        System.out.println("SKS Maksimal: 20");
    else
        System.out.println("SKS Maksimal: 18");

    System.out.print ("----- Terimakasih-----");

        input.close();
    }
}