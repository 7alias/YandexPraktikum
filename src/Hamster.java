public class Hamster {
    // Объявили поля, но не присвоили им значения
    String name;  // Имя
    int age;      // Возраст
    int weight;   // Вес в граммах
    String color; // Цвет

    // Конструктор принимает 4 параметра
    Hamster(String hamsterName, int hamsterAge, int hamsterWeight, String hamsterColor) {
        name = hamsterName;
        age = hamsterAge;
        weight = hamsterWeight;
        color = hamsterColor;
    }
}


/**


public class Hamster {

    // Поля
    String name = "Байт"; // Имя
    int age = 2; // Возраст
    String color = "Рыжий"; // Цвет
    int weight = 350; // Вес

    // Методы
    // Есть
    void eat(int foodWeight) {
        weight = weight + foodWeight;
    }

    // Бегать в колесе
    void runInWheel() {
        System.out.println("Бегу-бегу-бегу!");
        weight = weight - 5;
    }

    // Прятать семечки
    void hideSeeds(int seedWeight) {
        weight = weight + seedWeight;
        System.out.println("Зимой не заголодаю.");
    }
}
 */