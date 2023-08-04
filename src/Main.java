public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 98;
        double h = 1.87;
        double bmi = service.calculate(m, h);
        System.out.println(bmi);
    }
}