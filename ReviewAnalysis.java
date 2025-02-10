import java.util.ArrayList;

public class ReviewAnalysis
{
/** All user reviews to be included in this analysis */
private Review[] allReviews;
/** Initializes allReviews to contain all the Review objects to be analyzed */
public ReviewAnalysis()
{ /* implementation not shown */ }
/** Returns a double representing the average rating of all the Review objects to be
* analyzed, as described in part (a)
* Precondition: allReviews contains at least one Review.
* No element of allReviews is null.
*/
public double getAverageRating()
{
    double avgrating = 0;
    for (Review a : allReviews) {
        avgrating += a.getRating();
    }
    avgrating = avgrating/allReviews.length;
    return avgrating;
}
/** Returns an ArrayList of String objects containing formatted versions of
* selected user comments, as described in part (b)
* Precondition: allReviews contains at least one Review.
* No element of allReviews is null.
* Postcondition: allReviews is unchanged.
*/
public ArrayList<String> collectComments()
{
    int count = 0;
    ArrayList comments = new ArrayList<String>();
    for (Review a : allReviews) {
        if (a.getComment().indexOf("!") != -1) {
            comments.add(count + "-" + a.getComment());
        }
        count++;
    }
    return comments;
}
}