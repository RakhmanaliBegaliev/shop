package Products.MilkySection;
import java.time.LocalDate;

public class Yogurt extends MilkySection {
    public Yogurt(int id, String name, String manufacturer, LocalDate date) {
        super(id, name, manufacturer, date);
    }
    @Override
    public String toString() {
        return "Yugurt{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", date=" + getDate() +
                '}';
    }
}
