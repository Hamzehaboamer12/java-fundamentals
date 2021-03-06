package inheritance;

public class Review {
    String body = null;
    String author = null;
    int stars = 0;


    public Review(String body , String author , int stars) {
        this.body = body;
        this.author = author ;
        this.stars = stars ;
    }
    public Review() {

    }

    @Override
    public String toString() {
        return "Review" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars;
    }



    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getStars() {
        return stars;
    }
}
