/* 
* source file: Hello.java
*/

public class Hello {

    public static int sum(int n, int m) {
        return n + m;
    }

    // run main() method to test the sum() method
    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(i, 10); // run method
        a = '?';

        System.out.println(a); // print out string "?"
        System.out.println("Hello"); // print out string "Hello"
        System.out.println(s); // Interger value of s is printed out, 30

    }

}