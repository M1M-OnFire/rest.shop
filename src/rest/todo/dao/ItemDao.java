package rest.todo.dao;

import rest.todo.dto.CategorieInItemDTO;
import rest.todo.dto.ItemCategorieDTO;
import rest.todo.model.Item;

import java.util.*;

public class ItemDao {
    private static ItemDao instance = null;


    private final Set<Item> data;

    private ItemDao() {


        data = new HashSet<>();

        data.add(new Item("Macbook", "Apple", 1000));
        data.add(new Item("Zenbook", "Asus", 1050));

        data.add(new Item("Mac", "Apple", 1500));
        data.add(new Item("Un pc fixe", "Dell", 700));

        data.add(new Item("Clavier", "Logitech", 20));

        //Téléphonie
        data.add(new Item("iPhone", "Apple", 750.0));
        data.add(new Item("Galaxy S20", "Samsung", 800.0));

        data.add(new Item("HP Fixe", "HP", 70.0));

        data.add(new Item("Chargeur telephone", "Powerbank", 20.0));

        //Stockage
        data.add(new Item("Disque dur 1TO", "Seagate", 50.0));
        data.add(new Item("Disque dur 3TO", "Seagate", 100.0));

        data.add(new Item("Sandisk 64go", "Sandisk", 15.0));
        data.add(new Item("Super clé 128go", "Super", 20.0));

        data.add(new Item("accessoires stockage", "Super", 20.0));

    }

    public static ItemDao getInstance() {
        if(instance == null){
            instance = new ItemDao();
        }
        return instance;
    }

    public Set<Item> getAll(){
        return data;
    }

    public Set<CategorieInItemDTO> getAllItemCategorie(){
        Set<CategorieInItemDTO> itemCategorieSet = new HashSet<>();
        data.forEach(item -> {
            CategorieDao.getInstance()
                    .getAll()
                    .forEach(categorie -> {
                        if(categorie.getItems().contains(item)){
                            itemCategorieSet.add(new CategorieInItemDTO(categorie, item));
                        }
                    });
        });
        return itemCategorieSet;
    }

    public void update(Item item){
        getAll().remove(item);
        getAll().add(item);
    }

    public void delete(Item item){
        getAll().remove(item);
    }

    public Item get(String id){
        return data.stream().filter(item -> item.getId().equals(id)).findFirst().get();
    };

    public void add(Item item){
        data.add(item);
    }
}
