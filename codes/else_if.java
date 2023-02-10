import java.util.Scanner;

public class else_if {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age <= 0) {
            System.out.println("Error");
        } else if(age <= 16) {
            System.out.println("Too Young");
        } else if(age < 100) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Really?");
        }
    }
}

/* Key Takeaways;

You can check for a condition using the if statement. In case the condition is false, the code in an else statement can be executed.
Here is a generic structure of if-else statements:

if(condition) {
  //some code
} else if(condition) {
//some other code
} else {
  //some other code
} */