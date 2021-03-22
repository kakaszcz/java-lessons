import java.util.Scanner;

public class LoopExercise001 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe gwiazdek: ");
        int liczbaGwiazdek = new Scanner(System.in).nextInt();

        for (int i = 0; i <liczbaGwiazdek; i++){
            System.out.println("*");
        }

        for (int i = 0; i <= 10; i += 2){
            System.out.println(i);
        }
    }

}
