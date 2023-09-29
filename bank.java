import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean menu = false;
        boolean login = true;
        String[] user = { "Baq", "Arka", "Xavier", "Majid" };
        int[] pass = { 120604, 240205, 000000, 000000 };
        int[] saldo = {10000000, 100000, 100000, 2000};
        int id = -1;
        while (login) {
            while (!menu){
                System.out.print("Masukkan ID : ");
                String inputUser = scan.next();
                System.out.print("\nMasukkan PIN : ");
                int inputPass = scan.nextInt();
                scan.nextLine();
                
                }
            
        }
    

        while (menu) {
            System.out.println("====================================");
            System.out.println("-----Selamat Datang Di Bank Sad-----");
            System.out.println("====================================");
            System.out.println("1. Account");
            System.out.println("2. Transfer");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit\n");
            int pilihan = scan.nextInt();

        }

    }
}

