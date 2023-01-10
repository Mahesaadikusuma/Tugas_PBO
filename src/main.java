import java.util.Scanner;

public class main {
     public static void main(String[] args) {

          int pilihan;
          Scanner InputUser = new Scanner(System.in);

          do {
               System.out.println("SELAMAT DATANG DI PROGRAM SHOWROOM MOBIL");
               System.out.println("\nMENU\n");
               System.out.println("1. Jual Mobil");
               System.out.println("0. Keluar");

               System.out.print("Masukan Pilihan Anda: ");
               pilihan = InputUser.nextInt();

               switch (pilihan) {

                    case 1:
                         JualBeli();
                         break;

                    default:
                         break;
               }
          } while (pilihan != 0);

     }

     private static void JualBeli() {
          Scanner InputUser = new Scanner(System.in);
          int pilihan, harga, penawaran;
          String nama, jawaban;

          boolean tawar;
          do {
               System.out.println("\n===== JUAL BELI =====\n");
               System.out.println("MENU");
               System.out.println("1. Jual Mobil");
               System.out.print("Masukan Pilihan Anda: ");
               pilihan = InputUser.nextInt();

               switch (pilihan) {
                    case 1:
                         System.out.print("masukan nama mobil yang ingin dijual: ");
                         nama = InputUser.next();
                         System.out.println("nama mobil anda: " + nama);

                         System.out.print("harga mobil yang ingin dijual: ");
                         harga = InputUser.nextInt();
                         System.out.print("Harga mobil: Rp " + harga);

                         System.out.println(" Harga mobil yang anda jual terlalu mahal");
                         System.out.println("mau harga berapa ingin anda tawarkan");

                         System.out.println("Harga yang saya Tawarkan ");
                         penawaran = InputUser.nextInt();

                         tawar = penawaran <= harga;
                         jawaban = tawar ? "ya boleh" : "tidak boleh";

                         System.out.println(jawaban);

                         break;

                    default:
                         break;
               }

          } while (pilihan != 0);

     }
}