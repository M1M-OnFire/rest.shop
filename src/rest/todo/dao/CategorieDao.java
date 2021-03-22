package rest.todo.dao;

import rest.todo.model.Categorie;
import rest.todo.model.Item;

import java.util.*;

public class CategorieDao {

    private static CategorieDao instance = null;

    private Set<Categorie> data;

    private CategorieDao() {

        data = new HashSet<>();

        Categorie pcPortable = new Categorie("PC Portable");
        Categorie pcBureau = new Categorie("PC Bureau");
        Categorie pcAccessoire = new Categorie("Accessoires PC");

        Categorie smartphone = new Categorie("Smartphone");
        Categorie telFixe = new Categorie("Telephone fixe");
        Categorie telAccessoire = new Categorie("Accessoires telephone");

        Categorie disqueDur = new Categorie("Disque dur");
        Categorie cleUSB = new Categorie("Clé usb");
        Categorie accessoireStockage = new Categorie("Accessoires stockage");


        //Ordinateur
        pcPortable.addItem(ItemDao.getInstance().get("1"));
        pcPortable.addItem(ItemDao.getInstance().get("2"));
        pcPortable.addItem(ItemDao.getInstance().get("3"));
        pcPortable.addItem(ItemDao.getInstance().get("4"));
        pcAccessoire.addItem(ItemDao.getInstance().get("5"));
        pcBureau.addItem(ItemDao.getInstance().get("8"));

        //Téléphonie
        smartphone.addItem(ItemDao.getInstance().get("6"));
        smartphone.addItem(ItemDao.getInstance().get("7"));
        telAccessoire.addItem(ItemDao.getInstance().get("9"));
        telFixe.addItem(ItemDao.getInstance().get("14"));

        //Stockage
        disqueDur.addItem(ItemDao.getInstance().get("10"));
        disqueDur.addItem(ItemDao.getInstance().get("11"));
        cleUSB.addItem(ItemDao.getInstance().get("12"));
        accessoireStockage.addItem(ItemDao.getInstance().get("13"));

        data.add(pcPortable);
        data.add(pcBureau);
        data.add(pcAccessoire);
        data.add(smartphone);
        data.add(telFixe);
        data.add(telAccessoire);
        data.add(disqueDur);
        data.add(cleUSB);
        data.add(accessoireStockage);

    }

    public static CategorieDao getInstance() {
        if(instance == null){
            instance = new CategorieDao();
        }
        return instance;
    }

    public Set<Categorie> getAll(){
        return data;
    }

    public Categorie get(String id){
        return data.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .get();
    }

    public Set<Item> getItems(String id){
        return get(id).getItems();
    }

    public void deleteItem(Item item){
        getAll().forEach(categorie -> categorie.removeItem(item));
    }

    public void updateItem(Item item){
        data.forEach(categorie -> categorie.updateItem(item));
    }


}
