public class Methods_calls {

    public static void main(String[] args) {

        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        boolean x=true;
        sayHello(x);
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesCat));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesCat));
        sayEnjoyMeal(x);

        System.out.println("");

        x=false;
        sayHello(x);
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesHamster));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesHamster));
        sayEnjoyMeal(x);
    }
    public static void sayHello(boolean x) {

        if (x == true) {
            System.out.println("Привет, Пиксель!");
        } else {
            System.out.println("Привет, Байт!");
        }
    }
    public static double findMaxExpense(double [] feedExpenses) {
        double maxExpense=0;
        double maxFeedExpense = 0;
        for (
                int i = 0;
                i < feedExpenses.length; i++) {
            if (feedExpenses[i] > maxFeedExpense) {
                maxFeedExpense = feedExpenses[i];
            }
            maxExpense= maxFeedExpense;
        }

        return maxExpense; }

    public static double findExpensesSum (double[] feedExpenses) {
        double sumFeed=0;
        for (
                int i = 0;
                i < feedExpenses.length; i++) {
            sumFeed = sumFeed + feedExpenses[i];}
        sumFeed = sumFeed;
        return sumFeed;}
    public static void sayEnjoyMeal(boolean x){
        if (x == true){
            System.out.println("Приятного аппетита, Пиксель!");}
        else {
            System.out.println("Приятного аппетита, Байт!");}
    }
}
