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
    public static int id;

    public UsuarioLogado(int id,String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        UsuarioLogado.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        UsuarioLogado.email = email;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        UsuarioLogado.id = id;
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
