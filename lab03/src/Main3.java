import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        UserStory us1 = new UserStory(1, "Реєстрація користувача", 5);
        UserStory us2 = new UserStory(2, "Підтвердження email", 3, Arrays.asList(us1));
        UserStory us3 = new UserStory(3, "Форма логіну", 2);

        Sprint sprint = new Sprint(10, 5);

        System.out.println("Додаємо UserStory 1: " + sprint.addUserStory(us1)); // true
        System.out.println("Додаємо UserStory 2: " + sprint.addUserStory(us2)); // true
        System.out.println("Додаємо UserStory 3: " + sprint.addUserStory(us3)); // false, перевищує capacity

        us1.complete(); // Завершуємо першу історію
        Bug bug1 = Bug.createBug(1, "Помилка при реєстрації", 2, us1);
        System.out.println("Створюємо баг: " + (bug1 != null)); // true
        System.out.println("Додаємо баг до спринту: " + sprint.addBug(bug1)); // true

        System.out.println("Список тикетів у спринті:");
        for (Ticket t : sprint.getTickets()) {
            System.out.println(t);
        }
        System.out.println("Загальна оцінка часу спринту: " + sprint.getTotalEstimate());
    }
}