package rest.todo.model;

import java.util.ArrayList;
import java.util.List;

public class Categorie {

    private static int idCount;

    private String id;
    private List<Categorie> sousCategorie;

    public Categorie() {
    }

    private String name;
    private List<Item> items;

    public Categorie(String name) {
        this.name = name;
        sousCategorie = new ArrayList<>();
        items = new ArrayList<>();
        id = Integer.toString(idCount++);
    }

    public List<Categorie> getSousCategorie() {
        return sousCategorie;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSousCategorie(List<Categorie> sousCategorie) {
        this.sousCategorie = sousCategorie;
    }

    public void addSousCategories(Categorie categorie){
        sousCategorie.add(categorie);
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Categorie{");
        sb.append("sousCategorie=").append(sousCategorie);
        sb.append(", name='").append(name).append('\'');
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
