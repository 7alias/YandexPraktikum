import java.util.Scanner;
public class newfor {
    public static void main(String[] args) {
        int postCount=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input road length:");
        int roadLength=scanner.nextInt();
        System.out.println("Input road Growth:");
        int roadGrowth=scanner.nextInt();
        System.out.println("Input post range");
        int postRange=scanner.nextInt();
        System.out.println("Input years number:");
        int years=scanner.nextInt();
        for (int i = 0; i <= years; i++) {
            postCount=roadLength/postRange;
                    System.out.println("Год: "+i+ " Длина дороги " + roadLength + " Количество постов: " + postCount);
            roadLength=roadLength+roadGrowth;
        }}}