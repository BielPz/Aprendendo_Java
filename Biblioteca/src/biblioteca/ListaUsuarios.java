/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author User
 */
public class ListaUsuarios {
    private Usuario lista[];
    private int count;

    public ListaUsuarios(int lim) {
        lista = new Usuario[lim];
    }
    
    public int buscar(int cod)
    {
        for(int i = 0; i < count; i++)
        {
            if(cod == lista[i].getCodigo()) return i;
        }
        return -1;
    }
    
    public void cadastrar(Usuario us) throws ExcListaLotada, ExcCodigoExistente
    {
        if(count >= lista.length) throw new ExcListaLotada();
        
        int index = buscar(us.getCodigo());
        if(index != -1) throw new ExcCodigoExistente();
        
        lista[count] = us;
        count++;
    }
    
    public void retirar(int cod) throws ExcImpedido, ExcCodigoInvalido
    {
        int index = buscar(cod);
        if(index == -1) throw new ExcCodigoInvalido();
        if(lista[index].Bloquear()) throw new ExcImpedido();
    }
    
    public void devolver(int cod, boolean emAtraso) throws ExcCodigoInvalido
    {
       int index = buscar(cod);
        if(index == -1) throw new ExcCodigoInvalido();
        
        if(emAtraso) lista[index].DevolverAtrasado();
    }
    
    public void liberar(int cod)
    {
        int index = buscar(cod);
        if(index == -1) throw new ExcCodigoInvalido();
        
        lista[index].LiberarAtrasos();
    }
    
    public void listarAlunos()
    {
        for(int i = 0; i < count; i++)
        {
            if(lista[i] instanceof Aluno) lista[i].print();
        }
    }
    
    public void listarUsuarios()
    {
        int qnt_Atrasos = 0;
        for(int i = 0; i < count; i++)
        {
            lista[i].print();
            System.out.println("-----------------------------");
            if(lista[i].Bloquear()) qnt_Atrasos++;
        }
        System.out.println("Quantidade de Usuarios impedidos: " + qnt_Atrasos);
    }
}
