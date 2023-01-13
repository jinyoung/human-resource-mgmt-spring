package human.resource.mgmt.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
    name = "schedule",
    url = "${api.url.schedule}",
    fallback = CalendarServiceImpl.class
)
public interface CalendarService {
    @GetMapping(path = "/calendars/search-calendar")
    public Calendar searchCalendar(SearchCalendarQuery query);
}
