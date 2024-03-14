//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            double a,b;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kaç km gidildi : " );
        a = girdi.nextDouble();
        b = 10.0 + (a * 2.20);
        b = (b<20) ? 20 : b;
        System.out.print("Ücret : " + b);
    }
}