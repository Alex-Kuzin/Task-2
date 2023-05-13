import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        bmiService service = new bmiService();
        int bodyMassIndex = service.calculate(98, 1.87);
        System.out.println("Индекс массы тела:" + bodyMassIndex);
    }
}