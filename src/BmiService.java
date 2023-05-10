public class BmiService {
    public int calculate(int b, double a) {
        double calculationBMI = b / (a * a);
        int indexResult = (int) calculationBMI;
        return indexResult;
    }


}


