import java.util.*;

public class RestaurantRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ratings = new ArrayList<>();
        
        System.out.print("Enter the number of restaurants: ");
        int numRestaurants = scanner.nextInt();
        
        System.out.println("Enter the ratings for each restaurant:");
        for (int i = 0; i < numRestaurants; i++) {
            int rating = scanner.nextInt();
            ratings.add(rating);
        }
        
        Map<String, Integer> ratingCounts = new HashMap<>();
        Map<String, Double> ratingAverages = new HashMap<>();
        
        for (int rating : ratings) {
            String range = getRange(rating);
            ratingCounts.put(range, ratingCounts.getOrDefault(range, 0) + 1);
            ratingAverages.put(range, ratingAverages.getOrDefault(range, 0.0) + rating);
        }
        
        for (Map.Entry<String, Integer> entry : ratingCounts.entrySet()) {
            String range = entry.getKey();
            int count = entry.getValue();
            double average = ratingAverages.get(range) / count;
            System.out.println("Number of restaurants with ratings in range " + range + ": " + count);
            System.out.println("Average rating for range " + range + ": " + average);
        }
    }
    
    public static String getRange(int rating) {
        if (rating >= 1 && rating <= 5) {
            return "1-5";
        } else if (rating >= 6 && rating <= 10) {
            return "6-10";
        } else {
            return "Invalid";
        }
    }
}