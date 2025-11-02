import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        String state = "q0";

        for (char c : input.toCharArray()) {
            if (state.equals("q0")) {
                if (c == '0') state = "q1";
                else if (c == '1') state = "q0";
                else {
                    System.out.println("Invalid input! Only 0 and 1 are allowed.");
                    return;
                }
            } else if (state.equals("q1")) {
                if (c == '0') state = "q1";
                else if (c == '1') state = "q2";
            } else if (state.equals("q2")) {
                if (c == '0') state = "q1";
                else if (c == '1') state = "q0";
            }
        }

        if (state.equals("q2"))
            System.out.println("Output: Accepted");
        else
            System.out.println("Output: Rejected");
    }
}