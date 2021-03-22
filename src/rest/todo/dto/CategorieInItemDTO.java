package rest.todo.dto;

import rest.todo.model.Categorie;
import rest.todo.model.Item;

public class CategorieInItemDTO {
    private String id;
    private String marque;
    private double prix;
    private String libelle;
    private String photo;
    private String description;
    private String categorieId;
    private String categorieName;

    public CategorieInItemDTO() { }

    public CategorieInItemDTO(Categorie categorie, Item item) {
        this.id = item.getId();
        this.marque = item.getMarque();
        this.prix = item.getPrix();
        this.libelle = item.getLibelle();
        this.photo = item.getPhoto();
        this.description = item.getDescription();
        this.categorieId = categorie.getId();
        this.categorieName = categorie.getName();
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

    public String getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(String categorieId) {
        this.categorieId = categorieId;
    }

    public String getCategorieName() {
        return categorieName;
    }

    public void setCategorieName(String categorieName) {
        this.categorieName = categorieName;
    }
}
