import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        // How to take Input?

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");

        int age = sc.nextInt();
        float gpa = sc.nextFloat();
        String name = sc.nextLine(); // one sentence
        String subj = sc.next(); // one word only
        System.out.println(age);
    }
}
