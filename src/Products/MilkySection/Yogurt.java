package Products.MilkySection;

import Products.MilkySection.MilkySection;

import java.time.LocalDate;

public class Yogurt extends MilkySection {
    public Yogurt(int id, String name, String manufacturer, LocalDate date) {
        super(id, name, manufacturer, date);
    }
}
