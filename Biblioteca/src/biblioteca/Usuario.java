/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author User
 */
public abstract class Usuario {
    private int codigo;
    private String nome;
    private String email;
    private int atrasos;

    public Usuario(int codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        atrasos = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAtrasos() {
        return atrasos;
    }
    
    public void DevolverAtrasado()
    {
        atrasos++;
    }
    
    public abstract boolean Bloquear();
    
    public void LiberarAtrasos()
    {
        atrasos = 0;
    }
    
    public void print()
    {
        System.out.println("Codigo: " + codigo + "\n" +
                "Nome: " + nome + "\n" +
                "E-mail: " + email + "\n" + 
                "Atrasos na devolucao: " + atrasos
        );
    }
}
