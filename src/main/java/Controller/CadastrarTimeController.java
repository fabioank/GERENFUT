package Controller;

import Model.DAO.TimeDAO;
import Model.Time;
import View.CadastrarTime;
import javax.swing.JOptionPane;

public class CadastrarTimeController {

    private final CadastrarTime view;

    public CadastrarTimeController(CadastrarTime view) {
        this.view = view;

    }

    public void cadastrarTime() {

        try {
            if (view.getTxtNomeTime().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor, digite um nome para o time.");
                return;
            }
            String nomeTime = view.getTxtNomeTime().getText();

            Time time = new Time(nomeTime, 0);

            TimeDAO.cadastrarTime(time);

            JOptionPane.showMessageDialog(null, "Time criado com sucesso!");
            return;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o time");
            return;
        }
    }
}
