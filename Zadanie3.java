import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj trzy boki trójkąta");    
            int a =  scanner.nextInt();   
            int b =  scanner.nextInt();  
            int c =  scanner.nextInt();
        if(a+b>c && a+c>b && b+c > a){
            if(a==b || b==c || a==c){
                if(a==b && b==c) System.out.println("Trójkąt jest równoboczny.");
                else  System.out.println("Trójkąt jest równoramienny.");
            } else System.out.println("Trójkąt jest różnoboczny.");
        }
        System.out.println("Z tych boków nie da się zbudować trójkątu.");
      }
}
