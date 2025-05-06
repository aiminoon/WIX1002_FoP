package WIX1002_2024_1;

public record Player(String name, String gender, String age, Address address) {
    @Override
    public String toString() {
        return String.format("%s, %s years old", name, age);
    }
}
