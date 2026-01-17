/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem1;

/**
 *
 * @author User
 */
public class Vendedor extends Funcionario{
    private double totalVendas;

    public Vendedor(String nome, String rg, double salBase) 
    {
        super(nome, rg, salBase);
        totalVendas= 0;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    public void registrarVenda(double valor)
    {
        totalVendas+= valor;
    }
    
    public double comissao()
    {
        return totalVendas * 0.03;
    }
    
    @Override
    public double salarioLiquido()
    {
        return salBase + comissao();
    }
    
    @Override
    public void novoMes()
    {
        totalVendas= 0;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Total de vendas: " + totalVendas + "\n" +
                "Comissão: " + comissao());
    }
}
