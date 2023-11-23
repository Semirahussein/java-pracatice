import java.util.Scanner;

class reversingA_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String originalString, reversedString = " ";
        System.out.println("enter a string to be reverssed. ");
        originalString = scan.nextLine();

        char ch;
        System.out.println("the original string is: " + originalString);
        for (int i = 0; i < originalString.length(); i++) {
            ch = originalString.charAt(i);
            reversedString = ch + reversedString;
        }

        System.out.println("the reversed word is: " + reversedString);
    }
}