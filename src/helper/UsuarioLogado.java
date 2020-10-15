/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author wirll
 */
public class UsuarioLogado {
     private static UsuarioLogado single_instance = null;

    private static String nome;
    private static String email;

    public UsuarioLogado(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    private UsuarioLogado() {
    }

    public static UsuarioLogado getInstance() {
        if (single_instance == null) {
            single_instance = new UsuarioLogado();
        }

        return single_instance;
    }
}
