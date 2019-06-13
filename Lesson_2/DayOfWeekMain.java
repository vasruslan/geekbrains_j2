// Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
// С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заднному текущему дню.
//
// Возвращает кол-во оставшихся рабочих часов до конца
// недели по заданному текущему дню. Считается, что
// текущий день ещё не начался, и рабочие часы за него
// должны учитываться.

public class DayOfWeekMain {
    public static void main(String[] args) {
        Days.getWorkingHours(Days.DayOfWeek.MONDAY);
    }
}

class Days{
    public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void getWorkingHours (DayOfWeek workday) {
        int workHours = 8; // 8-ми часовой рабочий день
        if (workday.ordinal() > 4) System.out.println("Выходной день");
        else {
            int resultHours = workHours * (5 - workday.ordinal());
            System.out.println(resultHours);
        }
    }
}
