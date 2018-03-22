import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String array = input.nextLine();
        System.out.print("\n Enter character to count: ");
        char x = input.next().charAt(0);
        int size = array.length();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array.charAt(i) == x ) count++;
        }
System.out.print("There is/are " + count + " character " + x + " in the string");
    }
}
