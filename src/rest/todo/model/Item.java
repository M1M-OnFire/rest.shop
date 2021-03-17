package rest.todo.model;

public class Item {
    private static int idCount = 0;
    private String id;
    private String marque;
    private double prix;
    private String libelle;
    private String photo;

    public Item(String libelle, String marque, double prix) {
        this.marque = marque;
        this.prix = prix;
        this.libelle = libelle;
        this.id = Integer.toString(idCount++);
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
}
