package hello.designpatterns.mediator.after;

import java.time.LocalDateTime;

public class Guest {

    private Integer id;

    private FrontDesk frontDesk = new FrontDesk();

    public Guest(Integer id) {
        this.id = id;
    }

    public void getTowels(int numberOfTowels){
        this.frontDesk.getTowels(this, numberOfTowels);
    }

    private void dinner(LocalDateTime dateTime){
        this.frontDesk.dinner(this, dateTime);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
