/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author User
 */
public class CarroProprio extends Carro
{
private double valorCompra;
private String dataCompra;
    
    public CarroProprio(int codigo, String placa, int ano_fabri, String modelo, double valorCompra, String dataCompra)
    {
    super(codigo, placa, ano_fabri, modelo);
    this.valorCompra = valorCompra;
    this.dataCompra = dataCompra;
    }
    
    public void setValor_compra(double valor_compra)
    {
    this.valorCompra = valor_compra;
    }
    
    public void setData_compra(String data_compra)
    {
    this.dataCompra = data_compra;
    }
    
    public double getValor_compra()
    {
    return valorCompra;
    }
    
    public String getData_compra()
    {
    return dataCompra;
    }
    
    @Override
    public boolean oferta(double valor)
    {
    return valor >= (valorCompra * 1.1);
    }
    
    @Override
    public void imprimeDados()
    {
    super.imprimeDados();
    System.out.println("Valor de Compra: " + valorCompra +
    "\nData de Compra: " + dataCompra);
    }
    }