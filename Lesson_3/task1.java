// 1. Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class task1 {
    public static void main (String[] args) {
        String[] names = {"Александр", "Дмитрий", "Денис", "Евгений", "Александр", "Сергей", "Сергей",
                "Игорь", "Жанна", "Александр", "Анна", "Алексей", "Юрий", "Максим", "Кирилл", "Анна"};
        Set<String> set = new HashSet<>();


        for (int count = 0; count < names.length; count++) {
            set.add(names[count]);
        }

        System.out.println("Уникальные значения: " + set + " - " + set.size() + " уникальных значений");

        Iterator<String> iter = set.iterator();

        int temp;

        while (iter.hasNext()) {
            temp = 0;
            String str = iter.next();
            for (int count = 0; count < names.length; count++) {
                if (str.equals(names[count])) temp++;
            }
            System.out.println(str + " - " + temp);
        }
    }
}
