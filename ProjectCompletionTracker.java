import java.util.ArrayList;
import java.util.List;

class StudentProject {
    String name;
    int daysToComplete;

    public StudentProject(String name, int daysToComplete) {
        this.name = name;
        this.daysToComplete = daysToComplete;
    }
}

public class ProjectCompletionTracker {
    public static void main(String[] args) {
        List<StudentProject> projects = new ArrayList<>();
        projects.add(new StudentProject("Project A", 5));
        projects.add(new StudentProject("Project B", 3));
        projects.add(new StudentProject("Project C", 7));

        int onTime = 0;
        int late = 0;
        int early = 0;
        int totalDays = 0;

        for (StudentProject project : projects) {
            totalDays += project.daysToComplete;
            if (project.daysToComplete == 5) {
                onTime++;
            } else if (project.daysToComplete < 5) {
                early++;
            } else {
                late++;
            }
        }

        System.out.println("Number of projects completed on time: " + onTime);
        System.out.println("Number of projects completed early: " + early);
        System.out.println("Number of projects completed late: " + late);
        System.out.println("Average time taken to complete projects: " + (double) totalDays / projects.size() + " days");
    }
}