package day9;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Date {

    private  String caption;
    private LocalDateTime postedDateTime;
    private  long duration;
    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public LocalDateTime getPostedDateTime() {
        return postedDateTime;
    }

    public void setPostedDateTime(LocalDateTime postedDateTime) {
        this.postedDateTime = postedDateTime;
    }




}
