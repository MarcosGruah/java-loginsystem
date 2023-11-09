package mapa;

import mapa.view.LoginView;

/**
 *
 * @author Marcos Almeida - https://github.com/MarcosGruah
 */

public class Main {

    public static void main(String[] args) {

        LoginView loginView = new LoginView();
        loginView.setVisible(true);
        loginView.requestFocus();

    }

}
