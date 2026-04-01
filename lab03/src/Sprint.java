import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private int capacity;
    private int maxTickets;
    private List<Ticket> tickets;

    public Sprint(int capacity, int maxTickets) {
        this.capacity = capacity;
        this.maxTickets = maxTickets;
        this.tickets = new ArrayList<>();
    }

    public boolean addUserStory(UserStory us) {
        if (us == null || us.isCompleted()) return false;
        if (tickets.size() >= maxTickets) return false;
        if (getTotalEstimate() + us.getEstimate() > capacity) return false;
        tickets.add(us);
        return true;
    }

    public boolean addBug(Bug bug) {
        if (bug == null || bug.isCompleted()) return false;
        if (tickets.size() >= maxTickets) return false;
        if (getTotalEstimate() + bug.getEstimate() > capacity) return false;
        tickets.add(bug);
        return true;
    }

    public List<Ticket> getTickets() {
        return new ArrayList<>(tickets);
    }

    public int getTotalEstimate() {
        int total = 0;
        for (Ticket t : tickets) {
            total += t.getEstimate();
        }
        return total;
    }
}