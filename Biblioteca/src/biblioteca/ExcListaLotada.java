/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author User
 */
public class ExcListaLotada extends RuntimeException{
    private String msg;

    public ExcListaLotada() {
        msg = "A capacidade maxima foi atingida!";
    }
}
