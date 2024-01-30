import java.util.*;

class First {
    public static void main(String[] args) {

        HashSet<Character> h = new HashSet<Character>();

        h.add('p');

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!h.contains(ch)) {
                // System.out.println(ch);
                ans = ans + ch;
                h.add(ch);
            } else {
                h.add(ch);
            }

        }
        sc.close();
        System.out.print(ans);

    }

}