class Calc{
    private double res;
    static final double PI = 3.14159;

    public double area(double rad){
        res = PI * rad * rad;
        return res;

    }

    public static double circ(double rad){
        return 2 * PI * rad;
    }
}

public class ClacTest {
    public static void main(String[] args) {
        Calc c = new Calc();
        double a = c.area(10);
        double c = Calc.circ(10);


        System.out.println(a );
        System.out.println(c);
    }
}
