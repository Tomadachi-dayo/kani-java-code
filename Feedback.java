public class Feedback {
    private int rating; 
    private String comment; 

    public Feedback() {}

    public Feedback(int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        if (comment != null && comment.length() > 200) {
            throw new IllegalArgumentException("Comment must not exceed 200 characters");
        }
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}
