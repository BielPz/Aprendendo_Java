/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author User
 */
public class LimiteAtingidoExc extends RuntimeException{
    private String msg;
    
    public LimiteAtingidoExc()
    {
        msg = "Limite da turma atingida!";
    } 
    
    public LimiteAtingidoExc(String nomeTurma)
    {
        msg = "O limite da turma " + nomeTurma + "atingiu a capacidade maxima";
    }
}
