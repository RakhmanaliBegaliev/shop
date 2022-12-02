package service;
import Products.Products;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Service {

    List<Products> vitrina = new ArrayList<>();

    public <T> void  acceptanceOfProduct(List<? extends Products> productsList){
        for (int i = 0; i < productsList.size(); i++) {
            if(productsList.get(i).getManufacturer().equals("NUR") || productsList.get(i).getManufacturer().equals("MILKI") ||
                    productsList.get(i).getManufacturer().equals("TOIBOS")
                    && productsList.get(i).getDate().isAfter(LocalDate.now())){
                vitrina.add(productsList.get(i));
            }
            else{
                System.out.println("Prosrochennyi ili ne tot proizvoditel produkta: " + productsList.get(i));
            }
        }
        System.out.println("Mojno stavit na vitrinu" + vitrina);
    }
    public void vitrinaskidok(){
        List<Products> vitrinaskidok = new ArrayList<>();
        for (int i = 0; i < vitrina.size(); i++) {
            if(vitrina.get(i).getDate().plusDays(7).isAfter(LocalDate.now())){
                vitrinaskidok.add(vitrina.get(i));
                vitrina.remove(vitrina.get(i));
            }else if (vitrina.get(i).getDate().isAfter(LocalDate.now())){
                vitrina.remove(vitrina.get(i));
            }
        }
        System.out.println("7 dney ostalos do okonchanii sroka: " + vitrinaskidok);
        }

}
