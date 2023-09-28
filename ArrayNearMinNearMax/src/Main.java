import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan Sayı Alma
        System.out.print("Bir sayı girin : ");
        int inputNumber = scanner.nextInt();

        // Dizimiz
        int[] numbers = { 10, 5, 17, 3, 20, 8 };

        // Diziyi sıralama
        Arrays.sort(numbers);

        // Girilen sayıdan küçük en yakın sayıyı ve büyük en yakın sayıyı bulun
        int smaller = -1;
        int larger = -1;

        for (int number : numbers) {
            if (number < inputNumber) {
                smaller = number;
            } else if (number > inputNumber) {
                larger = number;
                break; // Daha büyük sayıyı bulduktan sonra döngüyü sonlandırma.
            }
        }

        // Sonuçları ekrana yazdırın
        if (smaller != -1) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + smaller);
        } else {
            System.out.println("Girilen sayıdan küçük herhangi bir sayı bulunamadı.");
        }

        if (larger != -1) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + larger);
        } else {
            System.out.println("Girilen sayıdan büyük herhangi bir sayı bulunamadı.");
        }

        scanner.close();
    }
}
