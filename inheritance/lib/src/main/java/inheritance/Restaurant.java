package inheritance;

import java.util.ArrayList;

public class Restaurant extends Review  {

     String name;
     String price;
     ArrayList<String> reviews = new ArrayList<>();
     ArrayList<Integer> starsArray = new ArrayList<>();
     int totalStars;

    // constructor
    public Restaurant(String name , String price) {
        super();
        this.name = name;
        this.price = price;

    }


    private void calculateTotalStars() {
        int totalSum = 0;
        for (Integer item : starsArray) {
            totalSum = totalSum + item;
        }
        this.totalStars = totalSum / starsArray.size();
    }

    public String addReview(Review review) {
        if (review.getStars() < 0 || review.getStars() > 5) {
            return "Please rating must be between 0 and 5 stars";
        } else {
            String userReview = "Reviewer : " + review.getAuthor() + "\n" + "Review : " + review.getBody() + "\n" + "Rating :  " + review.getStars() + " stars" + "\n";

            setReviews(userReview);
            setStarsArray(review.getStars());

            this.calculateTotalStars();
            return null;
        }

    }



    public String getName() {
        return name;
    }

    public int getTotalStars() {
        return totalStars;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }


    public void setReviews(String review) {
        this.reviews.add(review);
    }

    public void setStarsArray(int stars) {
        this.starsArray.add(stars);
    }

    @Override
    public String toString() {

        return "\nRestaurant : " + name + '\n' +
                "Price  : " + price + '\n' +
                "Stars : " + totalStars + '\n' + "\n" +
                "Reviews : \n" + reviews;
    }



}
