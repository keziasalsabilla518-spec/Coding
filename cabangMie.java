import java.util.Scanner;
public class cabangMie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    //Input pesanan : nama pemesan, no meja, total,jenis pesanan(dine in/take away), jumlah pesan
    String namaPemesan = "";
    String noMeja = "", jenisPesanan = "";
    int jumlahPesan = 0, total = 0, harga = 0;


    System.out.print ("Nama Pemesan : ");
    namaPemesan = scanner.nextLine();
    System.out.println("-----Menu Mie Wacoan-----");
    System.out.println("1. Menu Mie Gacoan");
    System.out.println("2. Menu Mie Hompipa");
    System.out.println("3. Menu Mie Suit");
    System.out.println("4. Menu Dimsum");
    System.out.println("5. Menu Minuman");
    System.out.print("Pilih menu : ");
    int pilihMenu = scanner.nextInt();
    scanner.nextLine();

    //cek kondisi dg int
    if( pilihMenu == 1 || pilihMenu == 2) {
    System.out.println("Pilih level : ");
    String level = scanner.nextLine();
    harga =13000;
    System.out.print("Jumlah Pesan :");
    jumlahPesan = scanner.nextInt();
    scanner.nextLine();


    } else {
    System.out.print("Nama Pesanan : ");
    String pesanan = scanner.nextLine();

    }
    

    //
    System.out.println("Print Jenis Pesanan : \n 1. Dine In \n 2. Take Away \n Jenis Pesanan : ");
    jenisPesanan = scanner.next();
    // check String -> equals / equalsIgoneroCase
    // equals :case sesnsitive (memperhatikan huruf besar kecil)
    // equalsIgnoreCase : case non sensitive (tidak memerhatikan besar kecil huruf)

    if (jenisPesanan.equalsIgnoreCase("dine in" )) {
    System.out.print("No Meja : ");
    noMeja = scanner.nextLine ();
    total = harga * jumlahPesan;
    System.out.println("----- Terimakasih-----");

    //pesanan
    } else {
    System.out.println("----- Take Away-----");
    total = (harga * jumlahPesan) + 2000;
    System.out.println("Total : " + total);

    }



    //Output

    
    
    scanner.close();
    
    }
}
