import java.util.Scanner;
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int n = scanner.nextInt();
        System.out.println("Od 1 do n: ");
            for(int i = 1; i<=n; i++){
                System.out.print(i + " ");
            };
            System.out.print("\n");
        System.out.println("Od n do 1");
            for(int i = n; i>=1; i--){
                System.out.print(i + " ");
            };
            System.out.print("\n");
        System.out.println("Od 1 do n (Podzielne przez 3 lub 5)");
            for(int i = 1; i<=n; i++){
                if(i%3==0 || i%5==0) System.out.print(i + " ");   
            };
            System.out.print("\n");
        System.out.println("Od 1 do n (Podzielne przez 3 i 5)");
            for(int i = 1; i<=n; i++){
                if(i%3==0 && i%5==0) System.out.print(i + " ");  
            };
};
}