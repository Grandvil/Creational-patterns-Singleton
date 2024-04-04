import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();

        logger.log("Создаём и наполняем список");

        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(maxValue));
        }
        System.out.println("Вот случайный список: " + randomList);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int treshold = scanner.nextInt();

        Filter filter = new Filter(treshold);
        List<Integer> resultList = filter.filterOut(randomList);
        System.out.println("Отфильтрованный список: " + resultList);

        logger.log("Завершаем программу");
    }
}