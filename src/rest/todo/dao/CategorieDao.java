package rest.todo.dao;

import rest.todo.model.Categorie;
import rest.todo.model.Item;

import java.util.ArrayList;
import java.util.List;

public class CategorieDao {

    private static CategorieDao instance = null;

    private List<Categorie> contentProvider = new ArrayList<>();

    private CategorieDao() {

        ItemDao itemDao = ItemDao.getInstance();

        List<Item> items = itemDao.getModel();

        contentProvider.add(new Categorie("Ordinateur"));
        contentProvider.add(new Categorie("Téléphonies"));
        contentProvider.add(new Categorie("Stockage"));

        //Ordinateur
        contentProvider.get(0).addSousCategories(new Categorie("PC Portable"));
        contentProvider.get(0).addSousCategories(new Categorie("PC de Bureau"));
        contentProvider.get(0).addSousCategories(new Categorie("Accessoires"));

            //PC Portable
        contentProvider.get(0).getSousCategorie().get(0).getItems().add(items.get(0));
        contentProvider.get(0).getSousCategorie().get(0).getItems().add(items.get(1));

            //PC de bureau
        contentProvider.get(0).getSousCategorie().get(1).getItems().add(items.get(2));
        contentProvider.get(0).getSousCategorie().get(1).getItems().add(items.get(3));
            //Accessoire
        contentProvider.get(0).getSousCategorie().get(2).getItems().add(items.get(4));

        //Telephonie
        contentProvider.get(1).addSousCategories(new Categorie("Smartphone"));
        contentProvider.get(1).addSousCategories(new Categorie("Téléphone fixe"));
        contentProvider.get(1).addSousCategories(new Categorie("Accessoires"));

            //Smartphone
        contentProvider.get(1).getSousCategorie().get(0).getItems().add(items.get(5));
        contentProvider.get(1).getSousCategorie().get(0).getItems().add(items.get(6));
            //Tel fixe
        contentProvider.get(1).getSousCategorie().get(1).getItems().add(items.get(7));
            //Accessoire
        contentProvider.get(1).getSousCategorie().get(2).getItems().add(items.get(8));


        contentProvider.get(2).addSousCategories(new Categorie("Disque dur"));
        contentProvider.get(2).addSousCategories(new Categorie("Clé usb"));
        contentProvider.get(2).addSousCategories(new Categorie("Accessoires"));

        //Smartphone
        contentProvider.get(2).getSousCategorie().get(0).getItems().add(items.get(8));
        contentProvider.get(2).getSousCategorie().get(0).getItems().add(items.get(10));
        //Tel fixe
        contentProvider.get(2).getSousCategorie().get(1).getItems().add(items.get(11));
        contentProvider.get(2).getSousCategorie().get(1).getItems().add(items.get(12));
        //Accessoire
        contentProvider.get(2).getSousCategorie().get(2).getItems().add(items.get(13));

    }

    public static CategorieDao getInstance() {
        if(instance == null){
            return new CategorieDao();
        }
        else {
            return instance;
        }
    }

    public List<Categorie> getModel(){
        return contentProvider;
    }

}
