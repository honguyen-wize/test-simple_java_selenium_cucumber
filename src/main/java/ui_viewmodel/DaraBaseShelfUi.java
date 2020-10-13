package ui_viewmodel;

import ws_model.DaraBaseShelfWs;
import ws_model.DaraShelfItemWs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DaraBaseShelfUi {

    private DaraDataUi data;

    public DaraDataUi getData ()
    {
        return data;
    }

    public void setData (DaraDataUi data)
    {
        this.data = data;
    }
    public DaraBaseShelfUi(){}

    public DaraBaseShelfUi(DaraBaseShelfWs daraWs){

        DaraDataUi dataUi = new DaraDataUi();

        dataUi.setId(daraWs.getData().getId());
        dataUi.setTitle(daraWs.getData().getTitle());

        List<DaraShelfItemUi> listShelf_itemsUi = new ArrayList<DaraShelfItemUi>();
        for (DaraShelfItemWs shelfItemWs : daraWs.getData().getShelf_items()){
            DaraShelfItemUi sui = new DaraShelfItemUi();
            sui.setId(shelfItemWs.getId());
            sui.setTitle(shelfItemWs.getTitle());
            sui.setDetail(shelfItemWs.getDetail());
            listShelf_itemsUi.add(sui);
        }

        dataUi.setShelf_items(listShelf_itemsUi);

        this.data = dataUi;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof DaraBaseShelfUi)) {
            return false;
        }
        else {
            DaraBaseShelfUi dara = (DaraBaseShelfUi) o;

            for(int i=0; i < dara.data.getShelf_items().size(); i++){
                DaraShelfItemUi expectSelfItem = dara.data.getShelf_items().get(i);
                DaraShelfItemUi actualSelfItem = this.data.getShelf_items().get(i);

                if((Objects.equals(expectSelfItem.getId(),actualSelfItem.getId()) &&
                        Objects.equals(expectSelfItem.getTitle(),actualSelfItem.getTitle())) != true){
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+"]";
    }
}





