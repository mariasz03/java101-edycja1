import java.util.Scanner;
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer miesiąca:"); 
            int miesiac = scanner.nextInt();
            String kwartal = switch (miesiac) {
                case 1, 2, 3 -> "Pierwszy kwartał";
                case 4, 5, 6 -> "Drugi kwartał";
                case 7, 8, 9 -> "Trzeci kwartał";
                case 10, 11, 12 -> "Czwarty kwartał";
                default -> "Nie ma takiego miesiąca";
            };
        System.out.println(kwartal); 

        System.out.println("Podaj numer dnia tygodnia:"); 
            int numer = scanner.nextInt();
            String dzien = switch (numer) {
                case 1 -> "Poniedziałek";
                case 2 -> "Wtorek";
                case 3 -> "Środa";
                case 4 -> "Czwartek";
                case 5 -> "Piątek";
                case 6 -> "Sobota";
                case 7 -> "Niedziela";
                default -> "Nie ma takiego dnia";
            };
        System.out.println(dzien); 
    }
 }