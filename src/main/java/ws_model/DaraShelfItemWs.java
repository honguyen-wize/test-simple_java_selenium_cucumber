package ws_model;

public class DaraShelfItemWs {

    private String id;

    private String detail;

    private String title;

    private String publish_date;

    private String count_views;

    private String status;

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

    public String getPublish_date ()
    {
        return publish_date;
    }

    public void setPublish_date (String publish_date)
    {
        this.publish_date = publish_date;
    }

    public String getCount_views ()
    {
        return count_views;
    }

    public void setCount_views (String count_views)
    {
        this.count_views = count_views;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", detail = "+detail+", title = "+title+", publish_date = "+publish_date+", count_views = "+count_views+", status = "+status+"]";
    }
}