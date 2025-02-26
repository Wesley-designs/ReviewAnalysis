import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Review a = new Review(4, "Good! Thx");
        Review b = new Review(3, "OK site");
        Review c = new Review(5, "Great!");
        Review d = new Review(2, "Poor! Bad.");
        Review e = new Review(3, "");

        Review[] ab = {a, b, c, d, e};
        ReviewAnalysis review = new ReviewAnalysis(ab);
        System.out.println(review.getAverageRating());
        System.out.println(review.collectComments());
        
    }
}