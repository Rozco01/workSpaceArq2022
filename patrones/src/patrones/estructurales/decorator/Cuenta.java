/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.decorator;
/**
 *
 * @author Jefferson
 */
public class Cuenta {
    private int id;
    private String cliente;

    public Cuenta(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public Cuenta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
