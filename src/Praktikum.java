/**


public class Praktikum {
    public static void main(String[] args) {
        Hamster bite = new Hamster();
        System.out.println("Вес хомяка до пробежки: " + bite.weight);
        bite.runInWheel();
        System.out.println("Вес хомяка после пробежки: " + bite.weight);
    }
}
*/
public class Praktikum {
    public static void main(String[] args) {
        Hamster bite = new Hamster("Byte", 2, 350, "Green");

        System.out.println("Раньше хомяка звали: " + bite.name); // Выведем на экран изначальное имя
        bite.name = "Хомка"; // Присвоим полю name новое значение
        System.out.println("Теперь хомяка зовут: " + bite.name); // А теперь посмотрим, что получилось
        System.out.println("Вес хомяка: " + bite.weight);
        System.out.println("Цвет хомяка: " + bite.color);
        System.out.println("Возраст хомяка: " + bite.age);
    }
}

