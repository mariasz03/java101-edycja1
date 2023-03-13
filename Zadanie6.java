import java.util.Scanner;
public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean zero = true;
        int suma = 0;
        while(zero){
            System.out.print("Podaj liczbe: "); 
            int liczba = scanner.nextInt();
            if(liczba == 0) break;
            suma += liczba;
        };
        System.out.println(suma); 
    };
}