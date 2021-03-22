import java.util.Scanner;

public class NPSScore {
    public static void main(String[] args) {
        System.out.println("twoja ocena naszych szczotek do kibla 1-10:");
        int ocena = new Scanner(System.in).nextInt();
        System.out.println("twoja ocena to:" + ocena);

        if ((ocena > 0) && (ocena < 6)) {
            System.out.println("jesteś detractorem");
        } else if ((ocena >= 7) && (ocena <= 8)) {
            System.out.println("jestes neutralny");
        } else if ((ocena >= 9) && (ocena <= 10)) {
            System.out.println("promuszjesz nasze szczotki");
        }
    }
}



