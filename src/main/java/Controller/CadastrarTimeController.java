package Controller;

import Model.DAO.TimeDAO;
import Model.Time;
import View.CadastrarTime;

public class CadastrarTimeController {
    
    private final CadastrarTime view;
    
    public CadastrarTimeController(CadastrarTime view){
        this.view = view;
       
    }
    
    public void cadastrarTime(){
        
        String nomeTime = view.getTxtNomeTime().getText();
        
        //Time time = new Time(nomeTime, 0);
        
        //TimeDAO.cadastrarTime(time);
    }
    
}
