import java.util.TreeMap;

public class MyCalendarThree {

    private TreeMap<Integer, Integer> bookings;
    private int maxK;
    public MyCalendarThree(){
        bookings = new TreeMap<>();
        maxK = 0;
    }

    public int book(int startTime, int endTime){
        bookings.put(startTime, bookings.getOrDefault(startTime, 0) +1);
        bookings.put(endTime, bookings.getOrDefault(endTime, 0) -1);

        int currentK = 0;
        int ongoingEvents = 0;

        for (int count : bookings.values()) {
            ongoingEvents += count;
            currentK = Math.max(currentK, ongoingEvents);

        }

        maxK = Math.max(maxK, currentK);

        return maxK;
    }
}
