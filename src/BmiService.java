public class BmiService {
    public int calculate(int b, double a) {
        double result = b / (a * a);
        int index = (int) result;
        return index;
    }


}


