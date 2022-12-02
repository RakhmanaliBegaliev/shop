package Products.MilkySection;
import java.time.LocalDate;

public class Milk extends MilkySection {
    public Milk(int id, String name, String manufacturer, LocalDate date) {
        super(id, name, manufacturer, date);
    }
    @Override
    public String toString() {
        return "Milk{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", date=" + getDate() +
                '}';
    }

}
