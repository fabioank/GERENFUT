package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class TimeComboboxModel extends AbstractListModel implements ComboBoxModel{
    
    List<Time> listaTime;
    private Time timeSelecionado;

    public TimeComboboxModel() {
        this.listaTime = new ArrayList<>();
    }
 
    @Override
    public int getSize() {
        return this.listaTime.size();
    }

    @Override
    public Object getElementAt(int index) {
        return this.listaTime.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        if(anItem instanceof Time){
            this.timeSelecionado = (Time) anItem;
        fireContentsChanged(this.listaTime, 0, this.listaTime.size());
        }
    }
    @Override
    public Object getSelectedItem() {
        return this.timeSelecionado;
    }
    public void addTime(Time time){
        this.listaTime.add(time);
    }
    public void reset(){
        this.listaTime.clear();
    }

    public List<Time> getListaTime() {
        return listaTime;
    }
    public void setListaTime(List<Time> listaTime) {
        this.listaTime = listaTime;
    }
    public Time getTimeSelecionado() {
        return timeSelecionado;
    }
    public void setTimeSelecionado(Time timeSelecionado) {
        this.timeSelecionado = timeSelecionado;
    }
    
}
