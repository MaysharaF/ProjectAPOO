
package model;

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

    public Denuncia(int id, String nome, String nome_vitima, String nome_autor, int tipo, String data_ocorrido, String descricao) {
        this.id = id;
        this.nome = nome;
        this.nome_vitima = nome_vitima;
        this.nome_autor = nome_autor;
        this.tipo = tipo;
        this.data_ocorrido = data_ocorrido;
        this.descricao = descricao;
    }

    public Denuncia(String nome, String nome_vitima, String nome_autor, int tipo, String data_ocorrido, String descricao) {
        this.nome = nome;
        this.nome_vitima = nome_vitima;
        this.nome_autor = nome_autor;
        this.tipo = tipo;
        this.data_ocorrido = data_ocorrido;
        this.descricao = descricao;
    }

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
