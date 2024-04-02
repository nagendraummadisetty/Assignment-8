import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTestScores {

    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(92);
        scores.add(88);
        scores.add(76);
        scores.add(95);
        scores.add(70);
        scores.add(80);
        scores.add(78);
        scores.add(90);

        double average = calculateAverage(scores);
        List<Integer> aboveAverage = new ArrayList<>();
        List<Integer> atAverage = new ArrayList<>();
        List<Integer> belowAverage = new ArrayList<>();

        for (int score : scores) {
            if (score > average) {
                aboveAverage.add(score);
            } else if (score < average) {
                belowAverage.add(score);
            } else {
                atAverage.add(score);
            }
        }

        System.out.println("Average score: " + average);
        System.out.println("Number of students above average: " + aboveAverage.size());
        System.out.println("Number of students at average: " + atAverage.size());
        System.out.println("Number of students below average: " + belowAverage.size());

        System.out.println("Median score for above average group: " + calculateMedian(aboveAverage));
        System.out.println("Median score for at average group: " + calculateMedian(atAverage));
        System.out.println("Median score for below average group: " + calculateMedian(belowAverage));
    }

    private static double calculateAverage(List<Integer> scores) {
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }

    private static double calculateMedian(List<Integer> scores) {
        if (scores.isEmpty()) {
            return 0;
        }
        Collections.sort(scores);
        int middle = scores.size() / 2;
        if (scores.size() % 2 == 1) {
            return scores.get(middle);
        } else {
            return (scores.get(middle - 1) + scores.get(middle)) / 2.0;
        }
    }
}