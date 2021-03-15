import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("podaj swoj wiek: ");
        int wiek = new Scanner(System.in).nextInt();
        System.out.println("twoj wiek to: " + wiek);
        if ((wiek >= 0) && (wiek <= 30)) {
            System.out.println("jesteś mlody" + "");
        } else if (wiek > 31) {
            System.out.println("jestes sredni lub stary");
        } else {
            System.out.println("zle");
        }


    }
}
