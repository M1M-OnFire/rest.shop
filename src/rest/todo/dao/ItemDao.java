package rest.todo.dao;

import rest.todo.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemDao {
    private static ItemDao instance = null;

    private List<Item> contentProvider = new ArrayList<>();

    private ItemDao() {

        //Ordinateur
        contentProvider.add(new Item("Macbook", "Apple", 1000));
        contentProvider.add(new Item("Zenbook", "Asus", 1050));

        contentProvider.add(new Item("Mac", "Apple", 1500));
        contentProvider.add(new Item("Un pc fixe", "Dell", 700));

        contentProvider.add(new Item("Clavier", "Logitech", 20));

        //Téléphonie
        contentProvider.add(new Item("iPhone", "Apple", 750.0));
        contentProvider.add(new Item("Galaxy S20", "Samsung", 800.0));

        contentProvider.add(new Item("HP Fixe", "HP", 70.0));

        contentProvider.add(new Item("Chargeur telephone", "Powerbank", 20.0));

        //Stockage
        contentProvider.add(new Item("Disque dur 1TO", "Seagate", 50.0));
        contentProvider.add(new Item("Disque dur 3TO", "Seagate", 100.0));

        contentProvider.add(new Item("Sandisk 64go", "Sandisk", 15.0));
        contentProvider.add(new Item("Super clé 128go", "Super", 20.0));

        contentProvider.add(new Item("accessoires stockage", "Super", 20.0));

    }

    public static ItemDao getInstance() {
        if(instance == null){
            return new ItemDao();
        }
        else {
            return instance;
        }
    }

    public List<Item> getModel(){
        return contentProvider;
    }
}
