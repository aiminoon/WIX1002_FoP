package PS3;

public record Team (String name, int scores) implements Comparable<Team> {
    @Override
    public int compareTo (Team another) {
        return (-1 * Integer.compare(this.scores(), another.scores()));
    }
}
