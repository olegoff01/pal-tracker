package io.pivotal.pal.tracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class InMemoryTimeEntryRepository implements TimeEntryRepository{
    HashMap<Long, TimeEntry> timeEntries = new HashMap<>();
    public TimeEntry create (TimeEntry timeEntry) {
        long key = getNext();
        timeEntry.setId(key);
        timeEntries.put(key,timeEntry);
        return timeEntries.get(timeEntry.getId());
    }
    public TimeEntry find (long id) {
        return timeEntries.get (id);
    }
    public List<TimeEntry> list() {
        Collection out = timeEntries.values();
        List list = new ArrayList(out);
        return list;
    }
    public TimeEntry update (long id,TimeEntry source) {
        TimeEntry target = timeEntries.get (id);
        target.setDate(source.getDate());
        target.setHours(source.getHours());
        target.setProjectId(source.getProjectId());
        target.setUserId(source.getUserId());
        return target;
    }
    public TimeEntry delete (long id) {
        return timeEntries.remove (id);
    }
private long getNext() {
    return (timeEntries.size() + 1);

}
}
