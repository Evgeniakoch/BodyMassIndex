public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 70;
        float height = 1.60F;
        float bmi;
        bmi = service.calculate(height, weight);
        System.out.println(bmi);



    }
}