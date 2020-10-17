
package model;

import java.util.logging.Logger;

/**
 *
 * @author shen
 */
public class Denuncia {
    private int id;
    private String nome;
    private String nome_vitima;
    private String nome_autor;
    private int tipo;
    private String data_ocorrido;
    private String descricao;
    private boolean status_denun;
    private int id_usuario;

    public Denuncia(int id, String nome, String nome_vitima, String nome_autor, int tipo,
                    String data_ocorrido, String descricao, boolean status_denun, int id_usuario ) {
        this.id = id;
        this.nome = nome;
        this.nome_vitima = nome_vitima;
        this.nome_autor = nome_autor;
        this.tipo = tipo;
        this.data_ocorrido = data_ocorrido;
        this.descricao = descricao;
        this.status_denun = status_denun;
        this.id_usuario = id_usuario;
    }
    
    public boolean getStatus_denun() {
        return status_denun;
    }

    public void setStatus_denun(boolean status_denun) {
        this.status_denun = status_denun;
    }
    

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Denuncia(String nome, String nome_vitima, String nome_autor, int tipo,
            String data_ocorrido, String descricao, boolean status_denun, int id_usuario ) {
        this.nome = nome;
        this.nome_vitima = nome_vitima;
        this.nome_autor = nome_autor;
        this.tipo = tipo;
        this.data_ocorrido = data_ocorrido;
        this.descricao = descricao;
        this.status_denun = status_denun;
        this.id_usuario = id_usuario;
    }

    private static final Logger LOG = Logger.getLogger(Denuncia.class.getName());

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_vitima() {
        return nome_vitima;
    }

    public void setNome_vitima(String nome_vitima) {
        this.nome_vitima = nome_vitima;
    }

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getData_ocorrido() {
        return data_ocorrido;
    }

    public void setData_ocorrido(String data_ocorrido) {
        this.data_ocorrido = data_ocorrido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
       
}
