/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author User
 */
public class CarroConsignado extends Carro
{
private String nomePropri;
private double valorDesej;
    
    public CarroConsignado(int codigo, String placa, int ano_fabri, String modelo, String nomePropri, double valorDesej)
    {
    super(codigo, placa, ano_fabri, modelo);
    this.nomePropri = nomePropri;
    this.valorDesej = valorDesej;
    }
    
    public void setNome_propri(String nome_propri)
    {
    this.nomePropri = nome_propri;
    }
    
    public void setValor_desej(double valor_desej)
    {
    this.valorDesej = valor_desej;
    }
    
    public String getNome_propri()
    {
    return nomePropri;
    }
    
    public double getValor_desej()
    {
    return valorDesej;
    }
    
    @Override
    public boolean oferta(double valor)
    {
    return (valor >= (valorDesej * 1.05));
    }
    
    @Override
    public void imprimeDados()
    {
    super.imprimeDados();
    System.out.println("Proprietario: " + nomePropri +
    "\nValor Desejado: " + valorDesej);
    }
    }