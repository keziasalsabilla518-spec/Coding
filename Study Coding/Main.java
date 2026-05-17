 public class Main {

    // Fungsi untuk mengecek angka ganjil
    static boolean isGanjil(int angka) {

        // Jika sisa bagi angka dengan 2 adalah 1
        // maka angka tersebut ganjil
        if (angka % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Mencoba beberapa angka
        System.out.println(isGanjil(3));
        System.out.println(isGanjil(8));
        System.out.println(isGanjil(11));
        System.out.println(isGanjil(20));
    }
} 
    

