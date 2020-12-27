package Section12.CollectionSection12;

import java.util.ArrayList;
import java.util.List;

public class TheatreMain {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Tacoma dom",8,12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
    }
}
