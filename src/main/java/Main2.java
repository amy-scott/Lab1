import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the number of cookies consumed: ");
        int CookiesEaten = keyboard.nextInt();
        int Total = 40;
        int Servings = 10;
        float CookiesPerServing = (Total/Servings);
        int CaloriesPerServing = 300;
        float ServingsEaten = (CookiesEaten/CookiesPerServing);
        float CaloriesEaten = (ServingsEaten*CaloriesPerServing);
        System.out.println("You consumed " + CaloriesEaten + " calories.");
        
    }
}
