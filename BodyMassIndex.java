public class BodyMassIndex {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 50, height = 1.65;
        double bmi = service.calculate(height, weight);
        System.out.println("Индекс тела: " + bmi);
    }
}
