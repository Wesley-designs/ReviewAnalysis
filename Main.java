public class Main {
    public static void main(String[] args) {
        ArrayList<Review> ab = new ArrayList<Review>();
        Review a = new Review(4, "Good! Thx");
        ab.add(a);
        Review b = new Review(3, "OK site");
        ab.add(b);
        Review c = new Review(5, "Great!");
        ab.add(c);
        Review d = new Review(2, "Poor! Bad.");
        ab.add(d);
        ReviewAnalysis review = new ReviewAnalysis(ab);
        System.out.println(ab.collectComments());
        
    }
}