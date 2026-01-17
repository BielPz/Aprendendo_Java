/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem1;

/**
 *
 * @author User
 */
public class Producao extends Funcionario{
    private int hrDia, hrNoite;

    public Producao(String nome, String rg, double salBase) 
    {
        super(nome, rg, salBase);
        hrDia= 0;
        hrNoite= 0;
    }

    public int getHrDia() {
        return hrDia;
    }

    public void setHrDia(int hrDia) {
        this.hrDia = hrDia;
    }

    public int getHrNoite() {
        return hrNoite;
    }

    public void setHrNoite(int hrNoite) {
        this.hrNoite = hrNoite;
    }
    
    
    private double valorDiurno()
    {
        return salBase * hrDia;
    }
    
    private double valorNoturno()
    {
        return hrNoite * salBase * 1.3;
    }
    
    @Override
    public double salarioLiquido()
    {
        return valorDiurno() + valorNoturno();
    }
    
    @Override
    public void novoMes()
    {
        hrDia= 0;
        hrNoite= 0;
    }
    
    public void registrarHorasDiurnas(int horas)
    {
        hrDia += horas;
    }
    
    public void registrarHorasNoturnas(int horas)
    {
        hrNoite += horas;
    }
    
    @Override
    public void hollerith()
    {
        super.hollerith();
        System.out.println("Horas diurnas: " + hrDia + "\n" +
                "Horas noturnas: " + hrNoite + "\n" +
                "Valor diurno: " + valorDiurno() + "\n" +
                "Valor noturno: " + valorNoturno());
    }
}
