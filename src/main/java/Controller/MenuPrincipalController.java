package Controller;

import Model.DAO.JogadorDAO;
import Model.Jogador;
import View.MenuPrincipalView;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipalController {

    private final MenuPrincipalView view;

    public MenuPrincipalController(MenuPrincipalView view) {
        this.view = view;
    }

}
