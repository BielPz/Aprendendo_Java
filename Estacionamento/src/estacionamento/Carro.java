/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author User
 */
public abstract class Carro
{
private int codigo;
private String placa;
private int anoFabri;
private String modelo;
private boolean status;
private String vendedor;
    
    public Carro (int codigo, String placa, int anoFabri, String modelo)
    {
    this.codigo = codigo;
    this.placa = placa;
    this.anoFabri = anoFabri;
    this.modelo = modelo;
    status = true;
    vendedor = "";
    }
    
    // setters
    public void setCodigo(int codigo)
    {
    this.codigo = codigo;
    }
    
    public void setPlaca(String placa)
    {
    this.placa = placa;
    }
    
    public void setAno_fabri(int ano_fabri)
    {
    this.anoFabri = ano_fabri;
    }
    
    public void setModelo(String modelo)
    {
    this.modelo = modelo;
    }
    
    public void setStatus(boolean status)
    {
    this.status = status;
    }
    
    public void setVendedor(String vendedor)
    {
    this.vendedor = vendedor;
    }
    
    // getters
    public int getCodigo()
    {
    return codigo;
    }
    
    public String getPlaca()
    {
    return placa;
    }
    
    public int getAno_fabri()
    {
    return anoFabri;
    }
    
    public String getModelo()
    {
    
    return modelo;
    }
    
    public boolean isStatus()
    {
    return status;
    }
    
    public String getVendedor()
    {
    return vendedor;
    }
    
    public boolean disponivel()
    {
    return status;
    }
    
    public abstract boolean oferta(double valor);
    
    public boolean venderCarro(String vendedor, double valorVenda)
    {
    if(status)
    {
    if(oferta(valorVenda))
    {
    status = false;
    this.vendedor = vendedor;
    return true;
    }
    }
    
    return false;
    }
    
    public void imprimeDados()
    {
    System.out.println("\nCodigo: "          + codigo +
    "\nPlaca: "              + placa +
    "\nAno Fabricacao: "     + anoFabri +
    "\nModelo: "             + modelo  +
    "\nDisponivel: "         + status +
    "\nVendedor: "           + vendedor);
    }
    }
