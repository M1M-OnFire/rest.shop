package rest.todo.dao;

import rest.todo.model.Categorie;
import rest.todo.model.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategorieDao {

    private static CategorieDao instance = null;

    private Map<String, Categorie> contentProvider = new HashMap<>();

    private CategorieDao() {

        ItemDao itemDao = ItemDao.getInstance();

        Map<String, Item> items = itemDao.getModel();

        contentProvider.put("1",new Categorie("Ordinateur"));
        contentProvider.put("2",new Categorie("Téléphonies"));
        contentProvider.put("3",new Categorie("Stockage"));

        //Ordinateur
        contentProvider.get("1").addSousCategories(new Categorie("PC Portable"));
        contentProvider.get("1").addSousCategories(new Categorie("PC de Bureau"));
        contentProvider.get("1").addSousCategories(new Categorie("Accessoires"));

            //PC Portable
        contentProvider.get("1").getSousCategorie().get(0).getItems().add(items.get("1"));
        contentProvider.get("1").getSousCategorie().get(0).getItems().add(items.get("2"));

            //PC de bureau
        contentProvider.get("1").getSousCategorie().get(1).getItems().add(items.get("3"));
        contentProvider.get("1").getSousCategorie().get(1).getItems().add(items.get("4"));
            //Accessoire
        contentProvider.get("1").getSousCategorie().get(2).getItems().add(items.get("5"));

        //Telephonie
        contentProvider.get("2").addSousCategories(new Categorie("Smartphone"));
        contentProvider.get("2").addSousCategories(new Categorie("Téléphone fixe"));
        contentProvider.get("2").addSousCategories(new Categorie("Accessoires"));

            //Smartphone
        contentProvider.get("2").getSousCategorie().get(0).getItems().add(items.get("6"));
        contentProvider.get("2").getSousCategorie().get(0).getItems().add(items.get("7"));
            //Tel fixe
        contentProvider.get("2").getSousCategorie().get(1).getItems().add(items.get("8"));
            //Accessoire
        contentProvider.get("2").getSousCategorie().get(2).getItems().add(items.get("9"));


        contentProvider.get("3").addSousCategories(new Categorie("Disque dur"));
        contentProvider.get("3").addSousCategories(new Categorie("Clé usb"));
        contentProvider.get("3").addSousCategories(new Categorie("Accessoires"));

        //Smartphone
        contentProvider.get("3").getSousCategorie().get(0).getItems().add(items.get("10"));
        contentProvider.get("3").getSousCategorie().get(0).getItems().add(items.get("11"));
        //Tel fixe
        contentProvider.get("3").getSousCategorie().get(1).getItems().add(items.get("12"));
        contentProvider.get("3").getSousCategorie().get(1).getItems().add(items.get("13"));
        //Accessoire
        contentProvider.get("3").getSousCategorie().get(2).getItems().add(items.get("14"));

    }

    public static CategorieDao getInstance() {
        if(instance == null){
            return new CategorieDao();
        }
        else {
            return instance;
        }
    }

    public Map<String, Categorie> getModel(){
        return contentProvider;
    }

}
