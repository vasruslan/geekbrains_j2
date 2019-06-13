package Lesson_1.Marafon;

public class Main {
    public static void main(String[] args) {

        Team team = new Team ("Команда альфа", new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")); // Создаем команду
        Course c = new Course (new Cross(80), new Wall(2), new Wall(1), new Cross(520)); // Создаем полосу препятствий
        team.showTeam();
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты

    }
}