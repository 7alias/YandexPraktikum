/***
 * import java.util.Random;
public class expenses_Prak {
        public static void main(String[] args) {
            // Объявите пустой массив трат за неделю (7 дней)
            int[] expenses = new int[7];
            int sum=0;
            Random random = new Random(); // Генерирует случайное число
            // Допишите условие цикла for, чтобы заполнить массив случайными тратами
            System.out.println("Траты за неделю:");
            for (int i=0; i < expenses.length; i++) {
                expenses[i] = random.nextInt(1000);
            // Выведите с помощью цикла все траты за неделю в виде: "День ... . Потрачено рублей: ..."
                int day=i+1;
                System.out.println("День "+ day +". Потрачено рублей:"+ expenses[i]);
            // Посчитайте и выведите сумму трат за неделю — используйте цикл и здесь
                sum = sum + expenses[i];}
            System.out.println("Траты в рублях за неделю: " + sum);
        }
    }
 */

class expenses_Prak {
    public static void main(String[] args) {

        double [] expenses = new double[7]; // Объявили массив трат за неделю (7 дней)

        double expense = 50; // В первый день потрачено 50 рублей

        // Заполнили массив, используя цикл for
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = expense;
            expense = expenses[i] + 100;
        }
        System.out.println("Ошибок нет. Все расходы успешно занесены в приложение!");
    }
}
