package ws_model;

public class DaraBaseShelfWs {
    private String code;

    private DaraDataWs data;

    private String lang;

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public DaraDataWs getData ()
    {
        return data;
    }

    public void setData (DaraDataWs data)
    {
        this.data = data;
    }

    public String getLang ()
    {
        return lang;
    }

    public void setLang (String lang)
    {
        this.lang = lang;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [code = "+code+", data = "+data+", lang = "+lang+"]";
    }
}






