package hello.designpatterns.mediator.after;

import java.time.LocalDateTime;

public class FrontDesk {

    private CleaningService cleaningService = new CleaningService();

    private Restaurant restaurant = new Restaurant();

    public void getTowels(Guest guest, int numberOfTowels) {
        cleaningService.getTowels(guest.getId(), numberOfTowels);
    }

    public String getRoomNumberFor(Integer guestId) {
        return "1234";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest.getId(), dateTime);
    }
}
