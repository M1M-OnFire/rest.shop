package rest.todo.dto;

import rest.todo.model.Item;

public class ItemCategorieDTO {

    private String categorieId;
    private Item item;

    public ItemCategorieDTO() {
    }

    public ItemCategorieDTO(String categorieId, Item item) {
        this.categorieId = categorieId;
        this.item = item;
    }

    public String getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(String categorieId) {
        this.categorieId = categorieId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
