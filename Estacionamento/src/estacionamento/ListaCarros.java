/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author User
 */
public class ListaCarros {
    private Carro lista[];
    private int count;

    public ListaCarros(int qnt) {
        lista = new Carro[qnt];
        count = 0;
    }
    
    private Carro getCarro(int cod)
    {
        for(int i = 0; i < count; i++)
        {
            if(lista[i].getCodigo() == cod) return lista[i];
        }
        return null;
    }
    
    public boolean add(Carro car)
    {
        if(count >= lista.length) return false;
        if(getCarro(car.getCodigo()) != null) return false;
        for(int i = 0; i < count; i++)
        {
            lista[i] = car;
            count++;
        }
        return true;
    }
    
    public boolean disponível(int cod)
    {
        Carro car = getCarro(cod);
        return car == null;
    }
    
    public void imprimeDados(int cod)
    {
        Carro car = getCarro(cod);
        if(car != null) car.imprimeDados();
        else System.out.println("Carro com código " + cod + " não encontrado.");
    }

    public boolean oferta(int cod, double valor)
    {
        Carro car = getCarro(cod);
        if(car != null) return false;
        if(car instanceof CarroProprio) return ((CarroProprio)car).oferta(valor);
        else return ((CarroConsignado)car).oferta(valor);  
    }

    public boolean venderCarro(int cod, String vendedor, double valorVenda)
    {
        Carro car = getCarro(cod);
        if (car != null) return false;
        if(car instanceof CarroProprio) return ((CarroProprio)car).venderCarro(vendedor, valorVenda);
        else return ((CarroConsignado)car).oferta(valorVenda);
    }

    public void listagem (String title, boolean all, boolean disp)
    {
        System.out.println("===== " + title + " =====");
        for (int i = 0; i < count; i++) {
            Carro car = lista[i];
            if (all) {
                car.imprimeDados();
                System.out.println("----------------");
            } else {
                if (car.disponivel() == disp) {
                    car.imprimeDados();
                    System.out.println("----------------");
                }
            }
        }
    }
}
