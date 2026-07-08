public class Hello {
    public static int sum (int i, int j) {
        return i + j;
    }

    public static void main(String[] args) {

        int i;
        int j;
        char a;
        String b;
        final int TEN = 10;

        i = 1;
        j = sum(i, TEN);
        a = '?';
        b = "Hello";

        java.lang.System.out.println(a); // prints '?'
        System.out.println(b); // prints 'Hello'
        System.out.println(TEN); // prints '10'
        System.out.println(j); // prints '11'
    }
}

