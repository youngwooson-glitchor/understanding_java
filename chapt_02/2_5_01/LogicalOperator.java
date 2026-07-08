public class LogicalOperator {

    public static void main(String[] args) {
        // compare operator
        System.out.println('a' > 'b');
        System.out.println(3 >= 2);
        System.out.println(-1 < 0);
        System.out.println(3.45 <= 2);
        System.out.println(3 == 2);
        System.out.println(3 != 2);
        System.out.println(!(3 != 2));

        // compare operator and logical operator
        System.out.println((3 > 2 && (3 > 4)));
        System.out.println((3 != 2) || (-1 > 0));
        System.out.println((3 != 2) ^ (-1 > 0));

    }
}