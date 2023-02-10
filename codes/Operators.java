/* Logical operators allow to combine multiple conditions.

    - The AND operator && combines two conditions and checks if both of them are true.
    - The OR operator || check if any of the conditions if true.
    - The NOT operator ! reverses the condition.

Next lesson will be fun! We will cover loops, which allow to repeat a block of code multiple times.
*/

import  java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 0 && age <= 11) {
            System.out.println("Child");

        } else if (age >= 12 && age <= 17){
            System.out.println("Teen");

        }   else if (age >= 18 && age <= 64){
            System.out.println("Adult");
        }

    }
}