package WIX1002_2024_1;

public class SeatingUtil {
    public static String arrangeSeating(Pair[] pairs) {
        return String.format("Seat A: %s\nSeat B: %s\nSeat C: %s\nSeat D: %s",
                pairs[0].player1, pairs[1].player1, pairs[0].player2, pairs[1].player2);
    }
}
