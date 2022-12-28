package human.resource.mgmt.external;

import org.springframework.stereotype.Service;

@Service
public class SearchCalendarServiceImpl implements SearchCalendarService {

    /**
     * Fallback
     */
    public SearchCalendar getSearchCalendar(Long id) {
        SearchCalendar searchCalendar = new SearchCalendar();
        return searchCalendar;
    }
}
