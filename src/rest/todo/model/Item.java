package rest.todo.model;

import java.util.Objects;

public class Item {
    private static int idCount = 1;
    private String id;
    private String marque;
    private double prix;
    private String libelle;
    private String photo;
    private String description;

    public Item() {
        this.id = Integer.toString(idCount++);
    }

    public Item(String libelle){
        this();
        this.libelle = libelle;
    }

    public Item(String libelle, String marque, double prix) {
        this();
        this.marque = marque;
        this.prix = prix;
        this.libelle = libelle;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }



    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("marque='").append(marque).append('\'');
        sb.append(", prix=").append(prix);
        sb.append(", libelle='").append(libelle).append('\'');
        sb.append(", photo='").append(photo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
