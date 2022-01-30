public class CaclTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double a = 10;
        double b = 3;
        double c = 1;
        double d = 4;

        System.out.println(calc.add(a,b));
        System.out.println(calc.add(a,b,c));
        System.out.println(calc.add(a,b,c,d));
        System.out.println(calc.subtract(a,b));
        System.out.println(calc.subtract(a,b,c));
        System.out.println(calc.subtract(a,b,c,d));
    }
}
