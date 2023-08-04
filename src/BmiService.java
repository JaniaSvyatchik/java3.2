public class BmiService {
    public double calculate(double m, double h) {
        double b = m / (h * h);
        int bmi = (int) b;
        return bmi;
    }
}
