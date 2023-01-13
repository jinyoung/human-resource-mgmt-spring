package human.resource.mgmt.external;

@FeignClient(name = "schedule", url = "${api.url.schedule}")
public interface CalendarService {
    @GetMapping(path = "/calendars/find-by-userid")
    public Calendar findByUserid(FindByUserIdQuery query);
}
