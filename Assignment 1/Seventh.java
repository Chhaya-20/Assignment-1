import java.util.*;

public class Seventh {

    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            char Char = (char) ('A' + i);

            for (int j = 0; j <= i; j++) {
                System.out.print(Char++);
            }

            System.out.println();
        }
    }
}
