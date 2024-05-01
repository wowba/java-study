package java_basic.class_and_obj;

public class ClassAndObjEx1 {
    public static void main(String[] args) {

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "반지의제왕";
        movieReview1.review = "짱짱";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "호빗";
        movieReview2.review = "짱";

        MovieReview[] reviews = {movieReview1, movieReview2};
        for (MovieReview review : reviews) {
            System.out.println(review.title + " " + review.review);
        }
    }

    static class MovieReview {
        String title;
        String review;
    }
}
