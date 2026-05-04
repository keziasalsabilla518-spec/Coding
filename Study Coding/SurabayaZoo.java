import java.util.Scanner;

public class SurabayaZoo {

    // variabel 
    static String[] kategori = new String[100];
    static int[] harga = new int[100];
    static int[] jumlah = new int[100];
    static int n = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            tampilMenu();
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang enter

            switch (pilihan) {
                case 1:
                    inputKategori(input);
                    break;

                case 2:
                    inputJumlah(input);
                    break;

                case 3:
                    hitungTotal();
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);

        input.close();
    }

    // ===== MENU =====
    public static void tampilMenu() {
        System.out.println("\n=== Pemesanan Tiket SurabayaZoo ===");
        System.out.println("1. Input Kategori dan Harga");
        System.out.println("2. Input Jumlah Beli");
        System.out.println("3. Lihat Total Bayar");
        System.out.println("4. Keluar");
    }

    // ===== INPUT KATEGORI =====
    public static void inputKategori(Scanner input) {
        System.out.print("Masukkan jumlah kategori: ");
        n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nKategori ke-" + (i + 1));

            System.out.print("Nama kategori: ");
            kategori[i] = input.nextLine();

            System.out.print("Harga: ");
            harga[i] = input.nextInt();
            input.nextLine();
        }

        System.out.println("Data kategori berhasil disimpan!");
    }

    // ===== INPUT JUMLAH =====
    public static void inputJumlah(Scanner input) {
        if (n == 0) {
            System.out.println("Data kategori belum diinput!");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Jumlah tiket " + kategori[i] + ": ");
            jumlah[i] = input.nextInt();
        }

        System.out.println("Jumlah tiket berhasil diinput!");
    }

    // ===== HITUNG TOTAL =====
    public static void hitungTotal() {
        if (n == 0) {
            System.out.println("Data belum lengkap!");
            return;
        }

        int total = 0;

        System.out.println("\n=== Detail Pembayaran ===");

        for (int i = 0; i < n; i++) {
            int subtotal = harga[i] * jumlah[i];

            System.out.println(
                kategori[i] + " = " +
                jumlah[i] + " x " +
                harga[i] + " = " +
                subtotal
            );

            total += subtotal;
        }

        System.out.println("----------------------");
        System.out.println("TOTAL BAYAR = " + total);
    }
}