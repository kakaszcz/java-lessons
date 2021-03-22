import java.util.Scanner;

public class LoopExercise {
    public static void main(String[] args) {
        int wiek = 0;
        while (wiek != 15) {
            System.out.println("Podaj swoj wiek: ");
            wiek = new Scanner(System.in).nextInt();
        }
    }
}
