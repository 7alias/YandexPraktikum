import java.util.Scanner;

public class zadachamassiv {
    public static void main(String[] args) {
        System.out.println("Введите длину массива:");
        Scanner scanner = new Scanner((System.in));
        int y = scanner.nextInt();
        int[] array = new int[(y+1)];
        int x=0;
                System.out.println("Введите числа массива через пробел:");

            for (int i = 0; i < array.length-1; i++) {

                array[i] = scanner.nextInt();
                x=array[i];}
for (int j=0;j<(array.length-1);j++){
x=j+1;
    if (array[x]<array[j]){
        System.out.println("Сортировка не удалась в индексе "+(j+1)+" Число:"+array[j]);}
                else {System.out.println("Число в массиве №"+(j+1)+" : " + array[j]);}}
            }
    }


