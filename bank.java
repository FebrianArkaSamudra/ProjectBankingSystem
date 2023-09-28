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
                for (int x = 0; x < user.length; x++){
                if (inputUser.equals(user[x]) && inputPass == pass[x]) {
                    System.out.println("LOGIN BERHASIL");
                    login = false;
                    menu = true;
                    id = x;
                    break;
                } }  while (!menu){
                    System.out.println("LOGIN GAGAL TOT");
                    break;
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

            switch (pilihan) {
                case 1:
                    System.out.println("1. Rekening\n2. Saldo");
                    int sub = scan.nextInt();
                    scan.nextLine();
                    switch (sub) {
                        case 1:
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("Saldo anda : Rp" + saldo[id]);
                            break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Masukkan Rekening...");
                    int rek = scan.nextInt();
                    System.out.println("Masukkan nominal...");
                    int tf = scan.nextInt();
                    System.out.println("Uang sudah berhasil terkirim ke " + rek + " Sejumlah Rp." + tf);
                    System.out.println("gaji adalah" + tf);

                    System.out.println("Kembali ke manu(1/2)?");
                    int exit = scan.nextInt();
                    switch (exit) {
                        case 1:
                            System.out.println("Kembali Ke Menu...");
                            break;
                        case 2:
                            System.out.println("Terimasiiiiiii...");
                            System.exit(0);
                    }
                    break;
                case 3:
                    System.out.println("Masukkan nominal...");
                    int wd = scan.nextInt();
                    System.out.println("Terimkasih anda menarik sebesar Rp." + wd);
                    break;
                case 4:
                    System.out.println("Terimkasih telah menggunakan BANK SAD");
                    menu = false;
                    break;
                default:
                    System.out.println("Masukkan Pilihan Yang Bener!!!");
                    break;
            }

        }

    }
}
}
