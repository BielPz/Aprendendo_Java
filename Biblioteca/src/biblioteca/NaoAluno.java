/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author User
 */
public class NaoAluno extends Usuario{
    private String RG;
    private String telefone;

    public NaoAluno(int codigo, String nome, String email, String RG, String telefone) {
        super(codigo, nome, email);
        this.RG = RG;
        this.telefone = telefone;
    }
    
    @Override
    public boolean Bloquear()
    {
        return getAtrasos() >= 3;
    }
    
    @Override
    public void print()
    {
        super.print();
        System.out.println("RG: " + RG + "\n" + 
                "Telefone: " + telefone);
    }
}
