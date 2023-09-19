package programa;

import View.Login;
import db.Conexao;

public class Aplicacao {

    public static void main(String[] args) {
        
        Conexao.createDataBase();
        
        Login login = new Login();
        login.setVisible(true);
    }
}