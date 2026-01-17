/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author User
 */
public class ExcCodigoInvalido extends RuntimeException{
    private String msg;

    public ExcCodigoInvalido() {
        msg = "Codigo de Usuario nao encontrado!";
    }
}
