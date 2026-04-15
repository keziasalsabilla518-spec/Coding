import java.util.Scanner;

public class HitungSSKM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalPoin = 0; // Tempat menampung hasil penjumlahan [cite: 51]
        int maksimalInput = 5; // Batas kegiatan yang diinput
        
        System.out.println("=== Program Input SSKM ===");
        
        // Robot 'for' mulai bekerja dari 1 sampai 5 [cite: 38]
        for (int i = 1; i <= maksimalInput; i++) {
            System.out.print("Masukkan nama kegiatan ke-" + i + ": ");
            String namaKegiatan = input.nextLine();
            
            System.out.print("Masukkan poin SSKM untuk " + namaKegiatan + ": ");
            int poin = Integer.parseInt(input.nextLine());
            
            // Menambahkan poin yang baru diinput ke totalPoin [cite: 54]
            totalPoin += poin; 
        }
        
        System.out.println("---------------------------");
        System.out.println("Total poin SSKM kamu adalah: " + totalPoin);
        
        input.close();
    }
}