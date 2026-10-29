import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai n = ");
        int n = sc.nextInt();

        int totalAngka = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = j * i;
                System.out.print(hasil + "\t");
                totalAngka = totalAngka + hasil;
            }
            System.out.println();
        }
        sc.close();
        System.out.print("jumlah seluruh angka: " + totalAngka);
    }
}
