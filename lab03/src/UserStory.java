import java.util.ArrayList;
import java.util.List;

public class UserStory extends Ticket {
    private List<UserStory> dependencies;

    public UserStory(int id, String name, int estimate) {
        super(id, name, estimate);
        this.dependencies = new ArrayList<>();
    }

    public UserStory(int id, String name, int estimate, List<UserStory> dependencies) {
        super(id, name, estimate);
        this.dependencies = new ArrayList<>(dependencies);
    }

    @Override
    public void complete() {
        for (UserStory dep : dependencies) {
            if (!dep.isCompleted()) {
                return; // не можна завершити, якщо залежності не завершені
            }
        }
        super.complete();
    }

    public List<UserStory> getDependencies() {
        return new ArrayList<>(dependencies);
    }

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}