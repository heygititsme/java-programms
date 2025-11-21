import java.util.Scanner;

public class nonrepeatstr {
	public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            char result = ' ';
            boolean found = false;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }

                if (count == 1) {
                    result = ch;
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("First non-repeating character: " + result);
            } else {
                System.out.println("No non-repeating character found.");
            }
        }
    }

}
