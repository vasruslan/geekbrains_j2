//Добавить класс Team, который будет содержать название команды, массив из четырех участников (в конструкторе можно сразу указыватьвсех участников ),
// метод для вывода информации о членах команды, прошедших дистанцию, метод вывода информации обо всех членах команды.

package Lesson_1.Marafon;

public class Team {
    private String teamName;
    private Competitor[] competitors;

    public Team(String teamName, Competitor... competitors) {
        this.teamName = teamName;
        this.competitors = competitors;
    }

    public void showTeam() {
        System.out.println("Имя команды: " + teamName);
        System.out.println("Участники: ");
        for (Competitor c : competitors) {
            c.info();
        }
    }

    public void showResults() {
        System.out.println("Результаты: ");
        for (Competitor c : competitors) {
            if (c.isOnDistance()) c.info();
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }
}
