package io.pivotal.pal.tracker;
import org.springframework.http.ResponseEntity;
import java.util.List;
public class TimeEntryController {
    private TimeEntryRepository timeEntryRepository;
    public TimeEntryController(TimeEntryRepository timeEntryRepository){
        this.timeEntryRepository = timeEntryRepository;
    }
    public ResponseEntity create(TimeEntry timeEntry) {
        this.timeEntryRepository.create(timeEntry);
        return null;
    }
    //
    public ResponseEntity read(long id) {
        TimeEntry out = timeEntryRepository.find(id);
        return null;
    }
    public ResponseEntity list() {
        List<TimeEntry> out  = timeEntryRepository.list();
        return null;
    }
    public ResponseEntity delete(long id) {
        TimeEntry out = timeEntryRepository.delete(id);
        return null;
    }
    public ResponseEntity update(long id,TimeEntry source) {
        TimeEntry out = timeEntryRepository.update(id, source);
        return null;
    }
}
