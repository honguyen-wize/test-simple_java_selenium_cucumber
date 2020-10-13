package ui_viewmodel;

public class DaraShelfItemUi {

    private String id;

    private String detail;

    private String title;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDetail ()
    {
        return detail;
    }

    public void setDetail (String detail)
    {
        this.detail = detail;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", detail = "+detail+", title = "+title+"]";
    }
}