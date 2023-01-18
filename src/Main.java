public class Main {
    public static void main(String[] args) {

        int price = 20_000; // стоимость билета
        int amount = 20; // количество рублей для 1 бонусной мили
        int bonus = (price / amount); // расчет количества начисленных миль
        System.out.println("Количество начисленных миль: " + bonus);

    }
}