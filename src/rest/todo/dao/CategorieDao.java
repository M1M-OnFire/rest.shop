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
        Categorie telAccessoire = new Categorie("Accessoires telehpone");

        Categorie disqueDur = new Categorie("Disque dur");
        Categorie cleUSB = new Categorie("Disque dur");
        Categorie accessoireStockage = new Categorie("Accessoires stockage");



        pcPortable.addItem(ItemDao.getInstance().get("1"));
        pcPortable.addItem(ItemDao.getInstance().get("2"));
        pcBureau.addItem(ItemDao.getInstance().get("3"));
        pcAccessoire.addItem(ItemDao.getInstance().get("4"));

//        pcPortable.addItem(new Item("un item pc portable"));
//        pcPortable.addItem(new Item("un autre item de  pc portable"));
//        pcBureau.addItem(new Item("un item pc bureau"));
//        pcAccessoire.addItem(new Item("un item pc accessoire"));

//        smartphone.addItem(new Item("un item pc smartphone"));
//        telFixe.addItem(new Item("un item tel fixe"));
//        telAccessoire.addItem(new Item("un item tel accessoire"));
//
//        disqueDur.addItem(new Item("un item disque dur"));
//        cleUSB.addItem(new Item("un item cle usb"));
//        accessoireStockage.addItem(new Item("un item accessoire stockage"));



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
