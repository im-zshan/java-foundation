/* Problem on Sum:
Your math teacher asked you to calculate the sum of the numbers 1 to N, where N is a given number.

Task: Take an integer N from input and output the sum of the numbers 1 to N, inclusive.

Sample Input:
10

Sample Output:
55

Hint: The sum of the numbers 1 to 10 is 55.
*/

import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            sum += num--;
        }
        
    System.out.println(sum);
    }

}

