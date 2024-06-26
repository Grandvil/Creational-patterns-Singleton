import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        logger.log("Запускаем фильтрацию");
        for (int number : source) {
            if (number < treshold) {
                result.add(number);
                logger.log("Элемент " + number + " проходит");
            } else {
                logger.log("Элемент " + number + " не проходит");
            }
        }

        logger.log("Прошло фильтр " + result.size() + " элемент(-а) из " + source.size());
        logger.log("Выводим результат на экран");
        return result;
    }
}