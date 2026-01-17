/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem1;

/**
 *
 * @author User
 */
public class Administracao extends Funcionario{
    private int faltas;

    public Administracao(String nome, String rg, double salBase) 
    {
        super(nome, rg, salBase);
        faltas= 0;
    }
    
    private double desconto()
    {
        return (salBase/30)*faltas;
    }
    
    @Override
    public double salarioLiquido()
    {
        return salBase- desconto();
    }
    
    @Override
    public void novoMes()
    {
        faltas= 0;
    }
    
    public void registrarFalta()
    {
        faltas++;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.format("Faltas: %d\nDesconto por faltas: %.2f\n", faltas, desconto());
    }
}

