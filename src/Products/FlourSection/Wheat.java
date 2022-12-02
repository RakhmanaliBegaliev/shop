package Products.FlourSection;
import java.time.LocalDate;

public class Wheat extends FlourSection {
    public Wheat(int id, String name, String manufacturer, LocalDate date) {
        super(id, name, manufacturer, date);
    }
    @Override
    public String toString() {
        return "Wheat{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", date=" + getDate() +
                '}';
    }
}
