
    //blok class
public class cobacoba {
    //blok main 
  public static void main(String[] args) {
    //tempat koding
  
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

  //deklarasi variabel + inisiasi value
    String namaBarang = "Sukro";
    int jumlahBeli = 2;
    int harga = 3000;
    int total = harga * jumlahBeli;

    //print/cetak >> shortcut : sout + tab
    //print variabel tanpa teks tambahan
    System.out.println("Nama barang : " + namaBarang + "Jumlah Beli : " + jumlahBeli);

    //print dengan krakter escape \n >> new line
    System.out.println(namaBarang + "\n" + total); 
    }
}
