package pecs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Car <T> {

    List<T> vehicles;


    public void replaceWith(List<? extends T> list) { // заменяет несколько транспортных средст в гараже
        // List - подставщик. Получаем из него элементы, котрые будут добавлены в гараж



        final int listSize = list.size();
        final int size = vehicles.size();
        vehicles.subList(0, Math.min(listSize, size)).clear();
        vehicles.addAll(0, list);

    }

    public List<T> filter(Predicate<? super T> predicate) { // возвращает список транспортных средств по критерию
        // Predicate - потребитель. Ему передаём элементы, чтобы убедиться, что транспортное средство
        // удовлетворяет критерию.


        List<T> result = new ArrayList<>();
        for (T vehicle : vehicles) {
            if (predicate.test(vehicle)) {
                result.add(vehicle);
            }
        }
        return result;
    }

}
