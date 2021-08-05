import java.util.Locale;
import java.util.Scanner;

public class Loops {
    public static void dividing(){
        //loops
        String answer="";
        Scanner scanner= new Scanner(System.in);
        System.out.println("You need to enter 3 figures");
        for (int i=0; i<3; i++) {
            System.out.print("Number:  ");
            int number = scanner.nextInt();
            answer = Integer.toString(number);
            // число делится без остатка
            if (number % 3 == 0) answer = "Fizz";
            if (number % 5 == 0) answer = "Buzz";
            if (number % 3 == 0 && number % 5 == 0) answer = "BuzzFizz";
            System.out.println(answer);
        }

    }
    public static String inputCheck(){
        // WHILE loop
        Scanner scanner= new Scanner(System.in);
        String input="";
        while (true) { // можно использовать true вместо условия если внутри есть break
            System.out.print("Make input pass/quit : ");
            input = scanner.nextLine().toLowerCase(Locale.ROOT);
            if (input.equals("pass")) continue;
            if (input.equals("quit")) break;

        }
        return input;
    }

    public static String inputCheckDoWhile(){
        //DO WHILE loop will execute at least once
        Scanner scanner= new Scanner(System.in);
        String input="";
        do {
            System.out.println("Make input2: ");
            input = scanner.nextLine().toLowerCase(Locale.ROOT);
        } while (!input.equals("quit"));
        return input;
    }

    public static void fruitsOutput(){
        // FOR EACH не может выводить в обратном порядке, нет доступа к индексам элементов
        String[] fruits={"Apple","Orange","Mango"};
        System.out.print("Fruits: ");
        for (String fruit : fruits )
            System.out.print(" "+fruit);
    }
}
