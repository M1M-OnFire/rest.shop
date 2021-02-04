package rest.todo.dao;

import rest.todo.model.Categorie;

import java.util.List;

public class App {
    public static void main(String[] args) {
        CategorieDao categorieDao = CategorieDao.getInstance();

        List<Categorie> categories = categorieDao.getModel();


        categories.forEach(c -> {
            System.out.println("Categories : " + c.getName());
            c.getSousCategorie().forEach(sc -> {
                System.out.println("\tSous catégories : " + sc.getName());
                sc.getItems().forEach(item ->{
                    System.out.println("\t\tItem : " + item.getLibelle());
                });
            });
            System.out.println("");
        });

    }
}
