
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uangNominal_Arimatika {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Masukkan nominal= ");
    int nominal = Integer.parseInt(br.readLine());
    
    int duaPuluhRibu = nominal / 20000;
    nominal = nominal % 200000;

    int sepuluhRibu = nominal / 10000;
        nominal = nominal % 10000;

    int seribu = nominal / 1000;
        nominal = nominal % 1000;

        int limaRatus = nominal / 500;
        nominal = nominal % 500;

        int duaRatus = nominal / 200;
        nominal = nominal % 200;

        int seratus = nominal / 100;

    System.out.println("\n Dua Puluh Ribu = " + duaPuluhRibu);
        System.out.println("Sepuluh Ribuan = " + sepuluhRibu);
        System.out.println("Seribuan = " + seribu);
        System.out.println("Lima Ratusan = " + limaRatus);
        System.out.println("Dua Ratusan = " + duaRatus);
        System.out.println("Seratusan = " + seratus);

    }
}


