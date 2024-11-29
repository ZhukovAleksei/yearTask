import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = 0;

        while(true){
            System.out.println("Введите год: ");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней в этом году: ");
            int days = scanner.nextInt();

            if((year % 4 == 0 && days == 366) || (year % 4 != 0 && days == 365)){
                years += 1;
            }else if((year % 4 == 0 && days != 366) || (year % 4 != 0 && days != 365)){
                System.out.println("Неправильно! В этом году " + deyOfYear(year) + " дней!");
                break;
            }
        }
        System.out.println("Набрано очков: " + years);
    }
    public static int deyOfYear(int year){
        if (year % 4 == 0){
            return 366;
        }
        return 365;
    }
}