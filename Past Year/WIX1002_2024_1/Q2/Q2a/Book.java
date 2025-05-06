package WIX1002_2024_1;

public record Book (String title, String author, Integer yearPublished) {
    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, Year Published: %d",
            title, author, yearPublished);
    }
}
