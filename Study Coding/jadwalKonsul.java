import java.util.Scanner;

public class jadwalKonsul {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // variabel
     String namaMahasiswa, nim;
     String ruangKelasKonsultasi = "Ruang b401";
     String haridanTanggal = "Senin, 04 Mei 2026";
     String pukul = "09.45";
     int batas = 6;

     System.out.println("\n     JADWAL KONSULTASI DOSEN          ");
     System.out.println("Silakan mahasiswa yang datang untuk mengisi antrian konsultasi.");
     System.out.println("Antrian dilayani berdasarkan urutan kedatangan.");

for (int i = 1; i <= batas; i++) {
    System.out.println("\nAntrian kedatangan ke-" + i);
    System.out.println("Nomor urut mahasiswa :" + i);
    
    System.out.print("Masukkan Nama Anda : ");
    namaMahasiswa = scanner.nextLine();

    System.out.print("Masukkan NIM Anda : ");
    nim = scanner.nextLine();

    System.out.println("Ruang     : " + ruangKelasKonsultasi);
    System.out.println("Jadwal    : " + haridanTanggal);
    System.out.println("Pukul     : " + pukul);
    System.out.println("---------------------------------------------------------------------");
    
}

    System.out.println("\nMaaf!");
    System.out.println("Kuota antrian prioritas telah penuh. Untuk mahasiswa selanjutnya silakan mengisi antrian berikutnya.");
    
    scanner.close();
    }
}

