/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem1;

/**
 *
 * @author User
 */
public abstract class Funcionario {
    private String nome, rg;
    protected double salBase;
    
    public Funcionario(String nome, String rg, double salBase)
    {
        this.nome= nome;
        this.rg= rg;
        this.salBase= salBase;
    }
    
    public abstract double salarioLiquido();
    public abstract void novoMes();
    
    public void hollerith()
    {
        System.out.format("\nNome: %s\nRG: %s\nSalário Base: %.2f\nSalário líquido: %.2f\n", nome, rg, salBase, salarioLiquido());
    }
    
}
