import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, angle;

        Scanner input = new Scanner(System.in);

        System.out.println("Daire diliminin yarıçapını giriniz : ");
        r = input.nextInt();

        System.out.println("Daire diliminin açısını giriniz : ");
        angle = input.nextDouble();

        double area = pi * r * r * (angle / 360);

        System.out.println("Daire diliminin alanı : "+ area);

    }
}