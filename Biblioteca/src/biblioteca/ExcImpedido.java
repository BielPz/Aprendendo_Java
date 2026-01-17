/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author User
 */
public class ExcImpedido extends Exception{
    private String msg;

    public ExcImpedido() {
        msg = "O usuario esta impedido de retirar livros!";
    }
    
}
