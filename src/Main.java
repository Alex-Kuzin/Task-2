import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(98, 1.87);
        System.out.println("Индекс массы тела:" + bmi);
    }
}