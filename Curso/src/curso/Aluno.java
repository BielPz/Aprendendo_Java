/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author User
 */
public class Aluno {
    private int codigo;
    private String nome;
    private double media;
    private int faltas;

    public Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        media = 0;
        faltas = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public int getFaltas() {
        return faltas;
    }
    
    void MarcaFalta()
    {
        faltas++;
    }
    
    void RegistrarMedia(double media)
    {
        this.media = media;
    }
    
    public void print()
    {
        System.out.println("Codigo: " + codigo + "\n" +
                "Nome: " + nome + "\n" + 
                "Media: " + media + "\n" +
                "Faltas: " + faltas);
    }
}
