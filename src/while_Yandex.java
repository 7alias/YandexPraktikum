public class while_Yandex {

    public static void main(String[] args) {

        int woodQuantity = 50; // Количество досок
        int woodCurrent = 0;
        while (woodQuantity >= 1) { // Условие работы цикла - пока осталась хотя бы одна доска
            woodQuantity = woodQuantity - 1; // 10 досок в день
            woodCurrent= woodCurrent +1;
            System.out.println("Прикрутили доску " +woodCurrent);
            for (int i =1; i<=4;i++){
                System.out.println("Прикручиваем шуруп "+i);
            }
        }

        System.out.println("Доски закончились, Пора идти в магазин!");
    }
}
