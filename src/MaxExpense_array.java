public class MaxExpense_array {

        public static void main(String[] args) {
            double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
            double maxExpense = findMaxExpense(expenses); // Вызовите метод и присвойте maxExpense значение его результата
            System.out.println("Самая большая трата недели " + maxExpense);
        }

        static double findMaxExpense(double[] expenses) { // Объявите метод findMaxExpense
            double x = 0;
            for (int i = 0; i < expenses.length; i++) { // Реализуйте метод. Чтобы найти самую большую трату, воспользуйтесь циклом
                while (x < expenses[i]) {
                    x=expenses[i];
                    // Самую большую трату запишите в переменную maxExpense}
                }
            }return x;
        }
    }
