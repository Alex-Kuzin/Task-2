public class bmiService {
    public int calculate(int weight, double height) {
        double calcBodyMassIndex = weight / (height * height);
        int resultBodyMassIndex = (int) calcBodyMassIndex;
        return resultBodyMassIndex;
    }


}


