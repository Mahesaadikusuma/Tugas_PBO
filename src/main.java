import java.util.Scanner;

public class main {
     public static void main(String[] args) {

          int pilihan;
          Scanner InputUser = new Scanner(System.in);

          do {
               System.out.println("SELAMAT DATANG DI PROGRAM SHOWROOM MOBIL");
               System.out.println("\nMENU\n");
               System.out.println("1. Category Mobil");
               System.out.println("2. Jual Beli mobil");
               System.out.println("0. Keluar");

               System.out.print("Masukan Pilihan Anda: ");
               pilihan = InputUser.nextInt();

               switch (pilihan) {
                    case 1:
                         Category();
                         break;
                    case 2:
                         JualBeli();
                         break;
                    default:
                         break;
               }
          } while (pilihan != 0);

     }

     private static void Category() {
          int pilihan;
          Scanner InputUser = new Scanner(System.in);

          do {
               System.out.println("\nMENU Category\n");
               System.out.println("1. Mobil Tesla");
               System.out.println("2. Mobil lambo");
               System.out.println("0. Back To Menu");
               System.out.print("Masukan Pilihan Anda: ");
               pilihan = InputUser.nextInt();

               switch (pilihan) {
                    case 1:
                         System.out.println("mobil yang anda pilih adalah: " + pilihan + " Mobil Tesla ");
                         break;

                    case 2:
                         System.out.println("mobil yang anda pilih adalah: " + pilihan + " Mobil lambo ");
                         break;
                    default:
                         break;
               }
          } while (pilihan != 0);
     }

     private static void JualBeli() {
          int pilihan;
          String mobil;
          Scanner InputUser = new Scanner(System.in);

          do {
               System.out.println("\nMENU Category\n");
               System.out.println("1. Jual Mobil");
               System.out.println("2. Beli Mobil");
               System.out.println("0. Back To Menu");
               System.out.print("Masukan Pilihan Anda: ");
               pilihan = InputUser.nextInt();

               switch (pilihan) {
                    case 1:
                         System.out.print("mobil apa yang anda ingin jual: ");
                         mobil = InputUser.next();
                         System.out.println(mobil);
                         break;

                    case 2:
                         System.out.println("mobil yang anda pilih adalah: " + pilihan + " Mobil lambo ");
                         break;
                    default:
                         break;
               }
          } while (pilihan != 0);

     }
}