package rest.todo.dto;

import rest.todo.model.Categorie;

public class CategorieDTO {
    private String id;
    private String name;

    public CategorieDTO() { }

    public CategorieDTO(String id, String name) {
        this.id = id;
        this.name = name;
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

    public static CategorieDTO from(Categorie categorie){
        return new CategorieDTO(categorie.getId(), categorie.getName());
    }
}
