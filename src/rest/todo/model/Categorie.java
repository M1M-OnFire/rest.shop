package rest.todo.model;

import java.util.List;

public class Categorie {
    private Categorie sousCategorie;
    private String name;
    private List<Item> items;

    public Categorie getSousCategorie() {
        return sousCategorie;
    }

    public void setSousCategorie(Categorie sousCategorie) {
        this.sousCategorie = sousCategorie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
