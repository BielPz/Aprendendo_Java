/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author User
 */
public class ExcCodigoExistente extends Exception{
    private String msg;

    public ExcCodigoExistente() {
        msg = "O codigo ja esta cadastrado!";
    }
}
