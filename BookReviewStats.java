import java.util.ArrayList;
import java.util.List;

class BookReview {
    String title;
    int rating;

    public BookReview(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }
}

public class BookReviewStats {
    public static void main(String[] args) {
        List<BookReview> reviews = new ArrayList<>();
        reviews.add(new BookReview("Book A", 4));
        reviews.add(new BookReview("Book B", 7));
        reviews.add(new BookReview("Book C", 5));
        reviews.add(new BookReview("Book D", 9));
        reviews.add(new BookReview("Book E", 3));
        reviews.add(new BookReview("Book F", 10));

        int range1to5 = 0;
        int range6to10 = 0;
        int positive = 0;
        int neutral = 0;
        int negative = 0;

        for (BookReview review : reviews) {
            // Count the number of reviews in each rating range
            if (review.rating >= 1 && review.rating <= 5) {
                range1to5++;
            } else if (review.rating >= 6 && review.rating <= 10) {
                range6to10++;
            }

            // Categorize reviews as positive, neutral, or negative
            if (review.rating >= 8) {
                positive++;
            } else if (review.rating >= 4) {
                neutral++;
            } else {
                negative++;
            }
        }

        System.out.println("Number of books rated 1-5 stars: " + range1to5);
        System.out.println("Number of books rated 6-10 stars: " + range6to10);
        System.out.println("Count of books with positive reviews: " + positive);
        System.out.println("Count of books with neutral reviews: " + neutral);
        System.out.println("Count of books with negative reviews: " + negative);
    }
}