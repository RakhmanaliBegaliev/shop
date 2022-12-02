package Products.MilkySection;
import java.time.LocalDate;

public class Kefir extends MilkySection {
    public Kefir(int id, String name, String manufacturer, LocalDate date) {
        super(id, name, manufacturer, date);
    }
    @Override
    public String toString() {
        return "Kefir{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", date=" + getDate() +
                '}';
    }
}
