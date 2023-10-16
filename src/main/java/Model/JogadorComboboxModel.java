package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class JogadorComboboxModel extends AbstractListModel implements ComboBoxModel{
    
    List<Jogador> listaJogador;
    private Jogador jogadorSelecionado;

    public JogadorComboboxModel() {
        this.listaJogador = new ArrayList<>();
    }
 
    @Override
    public int getSize() {
        return this.listaJogador.size();
    }

    @Override
    public Object getElementAt(int index) {
        return this.listaJogador.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        if(anItem instanceof Jogador){
            this.jogadorSelecionado = (Jogador) anItem;
        fireContentsChanged(this.listaJogador, 0, this.listaJogador.size());
        }
    }

    @Override
    public Object getSelectedItem() {
        return this.jogadorSelecionado;
    }
    
    public void addJogador(Jogador jogador){
        this.listaJogador.add(jogador);
    }
    public void reset(){
        this.listaJogador.clear();
    }

    public List<Jogador> getListaJogador() {
        return listaJogador;
    }

    public void setListaJogador(List<Jogador> listaJogador) {
        this.listaJogador = listaJogador;
    }

    public Jogador getJogadorSelecionado() {
        return jogadorSelecionado;
    }

    public void setJogadorSelecionado(Jogador jogadorSelecionado) {
        this.jogadorSelecionado = jogadorSelecionado;
    }
    
}
