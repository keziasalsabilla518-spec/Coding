import java.util.Scanner;

public class Kelipatan {
    public static void main(String[] args) {
       
        int batas, kelipatan;

        Scanner input = new Scanner(System.in);

        // Input Batas
        System.out.print("Batas = ");
        batas = input.nextInt();

        // Input Kelipatan
        System.out.print("Kelipatan = ");
        kelipatan = input.nextInt();

        // Perulangan untuk menampilkan angka
        // Dimulai dari 1, selama kurang dari batas, bertambah sebanyak kelipatan
        for (int i = 1; i < batas; i = i + kelipatan) {
            System.out.print(i + " ");
        }

        // Baris baru di akhir output
        System.out.println("");
        
        // Menutup scanner (good practice)
        input.close();
    }
}
       
