package View;

import View.Login;
import db.Conexao;

public class Programa {
    public static void main(String[] args) {
        
        Conexao.createDataBase();
        new Login().setVisible(true);
    }
}
