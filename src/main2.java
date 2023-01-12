import java.util.Scanner;
import java.io.IOException;

public class main2 {
     public static void main(String[] args) throws IOException {
          Scanner InputUser = new Scanner(System.in);
          String pilihan;
          boolean isLanjutkan = true;
          int Pilihan;

          do {
               clearScreen();
               System.out.println("======Menu Utama======");
               System.out.println("1.List Showroom");
               System.out.println("0.keluar");

               System.out.print("\n\nmasukan pilihan anda: ");
               Pilihan = InputUser.nextInt();

               switch (Pilihan) {
                    case 1:
                         listMobil();
                         break;

                    default:
                         break;
               }

               // isLanjutkan = getYesorNo("apakah anda ingin melanjutkan");
          } while (Pilihan != 0);
     }

     private static void listMobil() throws IOException {
          Scanner InputUser = new Scanner(System.in);
          String pilihan;
          int Harga, beli, Pilihan;

          boolean isLanjutkan = true;

          do {
               clearScreen();
               System.out.println("======Menu Utama======");
               System.out.println("1.Mobil Tesla");
               System.out.println("0.keluar");

               System.out.print("\n\nmasukan pilihan anda: ");
               Pilihan = InputUser.nextInt();

               switch (Pilihan) {
                    case 1:
                         System.out.println("=====Mobil Tesla=====");
                         System.out.println("Anda Memilih Mobil Tesla");
                         Harga = 150000;
                         System.out.println("Harga Mobil = Rp 150.000");
                         System.out.println("apakah ingin membelinya? (y/n)");

                         pilihan = InputUser.next();

                         if (pilihan.equalsIgnoreCase("y")) {
                              System.out.println("Berhasil Membeli Mobil Tesla");

                              System.out.println("Masukan Nominal Harga: ");

                              beli = InputUser.nextInt();
                              if (Harga == beli) {
                                   System.out.println("Harga yang Dibeli Berhasil");
                              } else if (beli <= Harga) {
                                   System.out.println("maaf harga yang dibayar kurang");
                              }

                              System.out.println("Selamat Anda Berhasil Membeli Mobil Tesla");
                         } else if (pilihan.equalsIgnoreCase("n")) {
                              System.out.println("Gagal Membeli Mobil Tesla");
                         } else {
                              System.out.println("Maaf Pilihan Anda Tidak tersedia");
                         }

                         System.out.println("Membeli Mobil Tes");
                         break;

                    default:
                         break;
               }
               isLanjutkan = getYesorNo("apakah anda ingin melanjutkan");

          } while (Pilihan != 0);
     }

     private static boolean getYesorNo(String message) {
          Scanner InputUser = new Scanner(System.in);

          System.out.print("\n" + message + " (y/n)? ");
          String pilihan = InputUser.next();

          while (!pilihan.equalsIgnoreCase("y") && !pilihan.equalsIgnoreCase("n")) {
               System.out.println("pilihan anda bukan y atau n");
               System.out.print("\n" + message + " (y/n)? ");
               pilihan = InputUser.next();
          }

          return pilihan.equalsIgnoreCase("y");
     }

     private static void clearScreen() {
          try {
               if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
               } else {
                    System.out.println("\033\143");
               }
          } catch (Exception e) {
               System.err.println("tidak bisa clear screen");
          }
     }
}