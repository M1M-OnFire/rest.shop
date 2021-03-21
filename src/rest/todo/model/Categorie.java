package rest.todo.model;

import java.util.*;

public class Categorie {

    private static int idCount = 1;

    private String id;
    private String name;
    private Set<Item> items;


    public Categorie() {
        id = Integer.toString(idCount++);
    }


    public Categorie(String name) {
        this();
        this.name = name;
        items = new HashSet<>();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public void updateItem(Item item){
        if(items.contains(item)){
            items.remove(item);
            items.add(item);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Categorie{");
        sb.append(", name='").append(name).append('\'');
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categorie categorie = (Categorie) o;
        return Objects.equals(id, categorie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
