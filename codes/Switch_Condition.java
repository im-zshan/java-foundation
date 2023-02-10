// Enhanced Switch Condition in java.

public class Switch_Condition {
    public static void main(String[ ] args) {
        int day = 1;

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
        }
    }
}

/* Instead of many if else statements, which become hard to read, we can use a switch statement.
A switch statement tests a variable for equality against a list of values.

Here is the Generic Switch Condition in java.

public class Switch_Condition {
    public static void main(String[ ] args) {
        int day = 2;

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
        }
    }

It is important to have a break statement for each case.
If no break appears, the program will continue to execute the next case in the switch, even if the value does not match the variable that is switched on.

# The Default Case:
A switch statement can have an optional default case. The default case can be used for performing a task when none of the cases is matched.

For eg:
class Demo {
    public static void main(String[ ] args) {
        int day = 5;

        switch(day) {
        case 1:
            System.out.println("Monday");
        case 2:
            System.out.println("Tuesday");
        case 3:
            System.out.println("Wednesday");
        default:
            System.out.println("Another day");
        }
    }
}

Note: No break is needed in the default case, as it is always the last statement in the switch.

} */

