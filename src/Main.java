import Products.FlourSection.Bread;
import Products.FlourSection.FlourSection;
import Products.FlourSection.Pasta;
import Products.FlourSection.Wheat;
import Products.MeatSection.Meat;
import Products.MeatSection.MeatSection;
import Products.MeatSection.Sausage;
import Products.MilkySection.Kefir;
import Products.MilkySection.Milk;
import Products.MilkySection.MilkySection;
import Products.MilkySection.Yogurt;
import Products.Products;
import service.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MilkySection> milkySectionList = new ArrayList<>();
        milkySectionList.add(new Milk(1,"Milk","MILKA", LocalDate.of(2023,01,10)));
        milkySectionList.add(new Yogurt(2,"Yogurt","MILKA",LocalDate.of(2022,12,15)));
        milkySectionList.add(new Kefir(3,"Kefir","Prostokvashino",LocalDate.of(2022,11,15)));
        List<MeatSection>meatSectionList = new ArrayList<>();
        meatSectionList.add(new Meat(1,"Meat","TOIBOS", LocalDate.of(2022,10,24)));
        meatSectionList.add(new Sausage(2,"Sausage","TOIBOS", LocalDate.of(2022,12,9)));
        meatSectionList.add(new Meat(3,"Meat","TOIBoS", LocalDate.of(2023,01,15)));
        List<FlourSection>flourSectionList = new ArrayList<>();
        flourSectionList.add(new Bread(1,"Bread","NUR",LocalDate.of(2022,11,20)));
        flourSectionList.add(new Pasta(2,"Pasta","NURsA",LocalDate.of(2022,12,6)));
        flourSectionList.add(new Wheat(3,"Wheat","NUR",LocalDate.of(2022,11,25)));


        Service service = new Service();
        login(meatSectionList,milkySectionList,flourSectionList);
        System.out.println();
        System.out.println("Produkty posle priemki!");
        System.out.println();
        service.acceptanceOfProduct(flourSectionList);
        System.out.println("_________________________");
        service.acceptanceOfProduct(meatSectionList);
        System.out.println("_________________________");
        service.acceptanceOfProduct(milkySectionList);
        System.out.println();
        System.out.println("Produkty po skidke!");
        service.vitrinaskidok();
        System.out.println("_________________________");
        service.vitrinaskidok();
        System.out.println("_________________________");
        service.vitrinaskidok();
        System.out.println("_________________________");

    }
    public static void login(List<MeatSection>meatSectionList,List<MilkySection> milkySectionList, List<FlourSection>flourSectionList){
        User Manager = new User("qwerty","12345");
        List<Products> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Login: ");
        String login = sc.nextLine().toLowerCase();
        System.out.println("Password: ");
        String password = sc.nextLine();
        for (MeatSection meatSection: meatSectionList){
                products.add(meatSection);
        }
        for (MilkySection milkySection: milkySectionList) {
                products.add(milkySection);
        }
        for(FlourSection flourSection: flourSectionList){
                products.add(flourSection);
        }
        if(login.equals(Manager.getLogin()) && password.equals(Manager.getPassword())){
            System.out.println("Vse produkty");
            products.forEach(System.out::println);

        }else {
            System.out.println("Nepravilno vvedeny dannye");
        }
    }
}