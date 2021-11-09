import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;
        double u;
        System.out.print("Üçgenin Kenar Uzunluğu a :");
        a=input.nextInt();

        System.out.print("Üçgenin Kenar Uzunluğu b :");
        b=input.nextInt();

        System.out.print("Üçgenin Kenar Uzunluğu c :");
        c=input.nextInt();

        u=(a+b+c)/2;
        System.out.print("Alanı : "+u*(u-a)* (u-b) * (u-c));
    }
}
