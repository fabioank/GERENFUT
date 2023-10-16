package programa;

import View.LoginView;
import db.Conexao;

public class Aplicacao {

    public static void main(String[] args) {
        
        Conexao.createDataBase();
        
        LoginView login = new LoginView();
        login.setVisible(true);
    }
}