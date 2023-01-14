package human.resource.mgmt.external;

import org.springframework.stereotype.Service;

@Service
public class CalendarServiceImpl implements CalendarService {

    public Calendar searchCalendar(SearchCalendarQuery query) {
        Calendar calendar = new Calendar();
        return calendar;
    }
}
