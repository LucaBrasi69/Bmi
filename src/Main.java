public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.78;
        int weight = 77;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
