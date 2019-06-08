//Добавить класс Course (полоса препятствий), в котором будут находиться массив препятствий и метод,
// который будет просить команду пройти всю полосу

package Lesson_1.Marafon;

public class Course {
    private Obstacle[] arrObstacles;

    public Course(Obstacle... arrObstacles) {
        this.arrObstacles = arrObstacles;
    }


    public void doIt (Team team) {
        System.out.println(team.getTeamName() + " проходит полосу препятствий");
        for (Competitor t : team.getCompetitors()) {
            for (Obstacle o : arrObstacles) {
                o.doIt(t);
                if (!t.isOnDistance()) break;
            }
        }
    }
}
