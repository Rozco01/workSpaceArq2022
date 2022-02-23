/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_poo;

/**
 *
 * @author Jefferson
 */
public class Movimiento {
    private String TipoMovimiento;
	private String DesMovimiento;
	private long Valor;
	
	public Movimiento() {}

	public String getTipoMovimiento() {
		return TipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		TipoMovimiento = tipoMovimiento;
	}

	public String getDesMovimiento() {
		return DesMovimiento;
	}

	public void setDesMovimiento(String desMovimiento) {
		DesMovimiento = desMovimiento;
	}

	public long getValor() {
		return Valor;
	}

	public void setValor(long valor) {
		Valor = valor;
	}
}
