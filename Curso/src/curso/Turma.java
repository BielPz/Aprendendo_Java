/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author User
 */
public class Turma {
    private String nome;
    private int qnt_aulas;
    private Aluno lista[];
    private int count;

    public Turma(String nome, int qnt_aulas) {
        this.nome = nome;
        this.qnt_aulas = qnt_aulas;
        lista = new Aluno[20];
        count = 0;
    }
    
    int buscarAluno(int codigo)
    {
        for(int i = 0; i <= count; i++)
        {
            if(codigo == lista[i].getCodigo()) return i;
        }
        return -1;
    }
    
    void matricularAluno(Aluno al) throws LimiteAtingidoExc, CodigoInvalidoExc
    {
        if(count >= lista.length) throw new LimiteAtingidoExc();
        if(buscarAluno(al.getCodigo()) != -1) throw new CodigoInvalidoExc(al.getCodigo(), true);
        
        lista[count] = al;
        count++;
    }
    
    void registrarFalta(int codigo) throws CodigoInvalidoExc
    {
        int i = buscarAluno(codigo);
        
        if(i == -1) throw new CodigoInvalidoExc();
        lista[i].MarcaFalta();
    }
    
    void atribuirMedia(int codigo, double media) throws CodigoInvalidoExc
    {
        int i = buscarAluno(codigo);
        
        if(i == -1) throw new CodigoInvalidoExc();
        if(media >= 0 && media <= 10) lista[i].RegistrarMedia(media);
    }
    
    void listarTodos()
    {
        double frequencia;
        
        System.out.println("----------------- Turma de " + nome + " -----------------");
        for(int i = 0; i <= count; i++)
        {
            frequencia = (double)(1 - (lista[i].getFaltas()/qnt_aulas))*100;
            lista[i].print();
            System.out.println("Frequencia: " + frequencia);
            System.out.println("-----------------------------------------");
        }
    }
    
    void listarAprovados()
    {
        double frequencia, media;
        
        System.out.println("----------------- Turma de " + nome + " -----------------");
        for(int i = 0; i <= count; i++)
        {
            frequencia = (double)(1 - (lista[i].getFaltas()/qnt_aulas))*100;
            media = lista[i].getMedia();
            
            if(media >= 6 && frequencia >= 75)
            {
                lista[i].print();
                System.out.println("Frequencia: " + frequencia);
                System.out.println("-----------------------------------------");
            }
        }
    }
}
