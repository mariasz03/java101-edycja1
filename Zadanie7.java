import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = 0;
        int liczba;
        do {
            System.out.print("Podaj liczbe: "); 
            liczba = scanner.nextInt();
            sum += liczba;
            n++;
        } while (liczba<100);
        System.out.println(sum/n); 
    };
}