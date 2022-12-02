package Products.FlourSection;
import java.time.LocalDate;

public class Bread extends FlourSection {
    public Bread(int id, String name, String manufacturer, LocalDate date) {
        super(id, name, manufacturer, date);
    }
    @Override
    public String toString() {
        return "Bread{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", date=" + getDate() +
                '}';
    }
}
