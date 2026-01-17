/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecelagem1;

/**
 *
 * @author User
 */
public class ListaFuncionarios {
    private Funcionario listaFunc[];
    private int count;

    public ListaFuncionarios(int qnt) {
        this.listaFunc = new Funcionario[qnt];
        count = 0;
    }
    
    public boolean addFunc(Funcionario f)
    {
        if(count >= listaFunc.length-1) return false;
        listaFunc[count] = f;
        count++;
        return true;
    }
    
    public void relatorioAdministracao()
    {
        double totalSalLiq = 0;
        for(int i = 0; i <= count; i++)
        {
            if(listaFunc[i] instanceof Administracao adm)
            {
                System.out.println("\n--------------------------------------------\n");
                adm.hollerith();
                totalSalLiq += adm.salarioLiquido();
            }
        }
        System.out.println("\n--------------------------------------------\n");
        System.out.println("Total do Salario Liquido: "+ totalSalLiq);
    }
    
    public void relatorioVendas()
    {
        double totalVendas = 0;
        for(int i = 0; i <= count; i++)
        {
            if(listaFunc[i] instanceof Vendedor v)
            {
                System.out.println("\n--------------------------------------------\n");
                v.hollerith();
                totalVendas += v.getTotalVendas();
            }
        }
        System.out.println("\n--------------------------------------------\n");
        System.out.println("Total das Vendas: "+ totalVendas);
    }
    
    public void relatorioProducao()
    {
        int totalHorasDiurnas = 0;
        int totalHorasNoturnas = 0;
        for(int i = 0; i <= count; i++)
        {
            if(listaFunc[i] instanceof Producao p)
            {
                System.out.println("\n--------------------------------------------\n");
                p.hollerith();
                totalHorasDiurnas += p.getHrDia();
                totalHorasNoturnas += p.getHrNoite();
            }
        }
        System.out.println("\n--------------------------------------------\n");
        System.out.println("Total de Horas Diurnas: "+ totalHorasDiurnas + "\n" +
                "Total de Horas Noturnas: " + totalHorasNoturnas);
    }
}
