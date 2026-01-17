/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso;

/**
 *
 * @author User
 */
public class CodigoInvalidoExc extends RuntimeException{
    private String msg;
    
    public CodigoInvalidoExc()
    {
        msg = "Codigo do aluno invalido";
    } 
    
    public CodigoInvalidoExc(int cod, boolean isRepeted)
    {
        msg = "O codigo " + cod + (isRepeted? " ja existe na turma!":" nao e valido!");
    }
}
