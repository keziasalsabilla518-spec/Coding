//1. import class Scanner
import java.util.Scanner;
public class latihan_scanner {
    public static void main(String[] args) {
        //2. deklarasi scaner
        Scanner scanner = new Scanner(System.in);

        /*Praktik:
    Jacob ingin belanja beberapa kebutuhan bahan pokok di Alfamafrt.
    Sebagai kasir, ada beberapa data yang harus dimasukkan kedalam program.
    Data data tersebut adalah :
    Nama barang >> String
    Jumlah beli >> int
    Harga >> int
    Total >> int
    PPN >> int
    Tanggal >> String
    Kembalian >> int
  */

    // 3.deklarasi variabel
    String namaBarang = "";
    int jumlah = 0, harga = 0, total = 0;

    //4. Input
    System.out.print("Input nama : ");
    namaBarang = scanner.nextLine();
    //nexline() utk string

    System.out.print("Input jumlah beli : ");
    jumlah = scanner.nextInt();

    System.out.print("Input harga barang : ");
    harga = scanner.nextInt();

    // output
    total = harga * jumlah;  
    System.out.print("Total : "+total);
   

    //6.clese scanner
    scanner.close();


    }
}
