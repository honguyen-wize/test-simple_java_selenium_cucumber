package ws_model;

import java.util.List;

public class DaraDataWs {
    private String id;

    private String title;

    private String create_date;

    private List<DaraShelfItemWs> shelf_items;

    private String publish_date;

    private String update_date;

    private String status;

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

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public  List<DaraShelfItemWs> getShelf_items() {
        return shelf_items;
    }

    public void setShelf_items( List<DaraShelfItemWs> shelf_items) {
        this.shelf_items = shelf_items;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ClassPojo [id = " + id + ", title = " + title + ", create_date = " + create_date + ", shelf_items = " + shelf_items + ", publish_date = " + publish_date + ", update_date = " + update_date + ", status = " + status + "]";
    }

}
