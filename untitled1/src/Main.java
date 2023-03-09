public class Main {
    public static void main(String[] args) {

        int a = 2, b = 8, c = 6;
        System.out.println("finding the largest number\n");
        if (a > b && a > c) {
            System.out.println(a + "the largest");
        } else if (a < b && b > c) {
            System.out.println(b + "the largest");
        } else  {
            System.out.println(c + "the largest");
        }
    }
}