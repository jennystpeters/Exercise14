import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        char keepGoing = 'y';
        int squaredNum = 0;

        Scanner entry = new Scanner(System.in);

        while(keepGoing == 'y') {
            System.out.print("Please enter number: ");
            int userNum = entry.nextInt();

            for (int i = 1; i <= userNum ; i++) {
                squaredNum = (int)Math.pow(i, 2);
                System.out.print(squaredNum + " ");
            }

            System.out.println();
            System.out.println("Would you like to continue? (y/n)");
            keepGoing = entry.next().charAt(0);
        }
        System.out.println("Bye");
    }
}
