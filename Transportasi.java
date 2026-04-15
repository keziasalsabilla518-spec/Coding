import java.util.Scanner;

public class Transportasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    // Kapasitas 
    int kapasitasBus = 50;
    int kapasitasMinibus = 15;
    int kapasitasMobil = 7;

    System.out.print("Masukkan Jumlah Penumpang = ");
    int jumlahPenumpang = input.nextInt();

    int jumlahBus = jumlahPenumpang / kapasitasBus;
    int sisa = jumlahPenumpang % kapasitasBus;

    int jumlahMinibus = sisa / kapasitasMinibus;
    sisa = sisa % kapasitasMinibus;

    int jumlahMobil = sisa / kapasitasMobil;
    sisa = sisa % kapasitasMobil;
    
    if (sisa !=0) {
    jumlahMobil = jumlahMobil+ 1;
    }

    System.out.println("\n Membutuhkan Bus " + jumlahBus + ", Minibus " + jumlahMinibus + ", Mobil " + jumlahMobil);

    input.close();
    }
}
    

