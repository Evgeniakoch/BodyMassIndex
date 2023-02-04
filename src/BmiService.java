public class BmiService  {

    public float calculate(float height, int weight) {
        float bmi = weight / (height * height);

        return bmi;
    }

}
