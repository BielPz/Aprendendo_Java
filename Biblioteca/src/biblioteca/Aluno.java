/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author User
 */
public class Aluno extends Usuario{
    private String RA;

    public Aluno(int codigo, String nome, String email, String RA) {
        super(codigo, nome, email);
        this.RA = RA;
    }
    
    @Override
    public boolean Bloquear()
    {
        return getAtrasos() >= 5;
    }
    
    @Override
    public void print()
    {
        super.print();
        System.out.println("RA: " + RA);
    }
}
