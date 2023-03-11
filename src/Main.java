import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // create variables
        double pi = 3.14,sector,area,radius;

        // create scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Açıyı belirtin: ");
        sector = input.nextDouble();
        System.out.print("Yarıçapı belirtin: ");
        radius = input.nextDouble();

        // output
        area = (pi*radius*radius*sector) / 360;
        System.out.println(area);
    }
}