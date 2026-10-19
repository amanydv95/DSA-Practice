import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    
    // A queue to store the timestamps of the pings like a line of people
    Queue<Integer> q;

    public RecentCounter() {
        // When we start, we create an empty line (Queue)
        q = new LinkedList<>();
    }
    
    public int ping(int t) {
        // Step 1: Add the new person (time t) to the back of the line
        q.add(t);
        
        // Step 2: Kick out anyone from the front of the line 
        // whose time is too old (older than t - 3000)
        while (q.peek() < t - 3000) {
            q.poll(); // Removes the person from the front
        }
        
        // Step 3: Count how many people are still standing in line!
        return q.size();
    }
}