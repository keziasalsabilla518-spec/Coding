import java.util.Scanner;

public class Belanja {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variabel
        int jumlah;
        int total = 0;
        int diskon;
        int grandTotal;

    
        System.out.println("================================================");
        System.out.println("       SELAMAT DATANG DI TOKO ABADI JAYA        ");
        System.out.println("================================================");
        System.out.println(" Program Perhitungan Total Belanja Sederhana ");
        System.out.println("================================================");

        // Input jumlah barang
        System.out.print("Masukkan jumlah barang : ");
        jumlah = input.nextInt();
        input.nextLine();

        // Validasi jumlah barang
        if (jumlah < 5) {

            System.out.println("\nMinimal pembelian adalah 5 barang!");
            System.out.println("Silakan lakukan input ulang.");
            return;

        }

        // Array
        String[] namaBarang = new String[jumlah];
        int[] hargaBarang = new int[jumlah];

        // Input barang
        for (int i = 0; i < jumlah; i++) {

            System.out.println("\n--------------------------------");
            System.out.println("Barang ke-" + (i + 1));

            System.out.print("Masukkan nama barang  : ");
            namaBarang[i] = input.nextLine();

            System.out.print("Masukkan harga barang : Rp.");
            hargaBarang[i] = input.nextInt();
            input.nextLine();

            // Menghitung total
            total += hargaBarang[i];

        }

        // Percabangan diskon
        if (total >= 100000) {

            diskon = total * 10 / 100;

        } 
        else if (total >= 50000) {

            diskon = total * 5 / 100;

        } 
        else {

            diskon = 0;

        }

        // Menghitung grand total
        grandTotal = total - diskon;

        // Output struk
        System.out.println("\n\n================================================");
        System.out.println("                 STRUK BELANJA");
        System.out.println("================================================");

        for (int i = 0; i < jumlah; i++) {

            System.out.println(
                (i + 1) + ". " +
                namaBarang[i] +
                " = Rp." +
                hargaBarang[i]
            );

        }

        System.out.println("================================================");
        System.out.println("Total Belanja              : Rp." + total);
        System.out.println("Potongan Diskon            : Rp." + diskon);
        System.out.println("Total Yang Harus Dibayar   : Rp." + grandTotal);
        System.out.println("================================================");
        System.out.println(" Terima kasih telah berbelanja diTOKO ABDI JAYA ");
        System.out.println("================================================");

    }
}