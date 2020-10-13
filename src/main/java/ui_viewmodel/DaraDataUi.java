package ui_viewmodel;

import java.util.List;

public class DaraDataUi {
    private String id;

    private String title;

    private List<DaraShelfItemUi> shelf_items;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<DaraShelfItemUi> getShelf_items() {
        return shelf_items;
    }

    public void setShelf_items(List<DaraShelfItemUi> shelf_items) {
        this.shelf_items = shelf_items;
    }

    @Override
    public String toString() {
        return "ClassPojo [id = " + id + ", title = " + title + ", shelf_items = " + shelf_items + "]";
    }

}

