package rest.todo.dao;

import rest.todo.model.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemDao {
    private static ItemDao instance = null;

//    private List<Item> contentProvider = new ArrayList<>();
    private Map<String, Item> contentProvider = new HashMap<>();

    private ItemDao() {

        //Ordinateur
        contentProvider.put("1", new Item("Macbook", "Apple", 1000));
        contentProvider.put("2", new Item("Zenbook", "Asus", 1050));

        contentProvider.put("3", new Item("Mac", "Apple", 1500));
        contentProvider.put("4", new Item("Un pc fixe", "Dell", 700));

        contentProvider.put("5", new Item("Clavier", "Logitech", 20));

        //Téléphonie
        contentProvider.put("6", new Item("iPhone", "Apple", 750.0));
        contentProvider.put("7", new Item("Galaxy S20", "Samsung", 800.0));

        contentProvider.put("8", new Item("HP Fixe", "HP", 70.0));

        contentProvider.put("9", new Item("Chargeur telephone", "Powerbank", 20.0));

        //Stockage
        contentProvider.put("10", new Item("Disque dur 1TO", "Seagate", 50.0));
        contentProvider.put("11", new Item("Disque dur 3TO", "Seagate", 100.0));

        contentProvider.put("12", new Item("Sandisk 64go", "Sandisk", 15.0));
        contentProvider.put("13", new Item("Super clé 128go", "Super", 20.0));

        contentProvider.put("14", new Item("accessoires stockage", "Super", 20.0));

    }

    public static ItemDao getInstance() {
        if(instance == null){
            instance = new ItemDao();
        }
        return instance;
    }

    public Map<String, Item> getModel(){
        return contentProvider;
    }
}
