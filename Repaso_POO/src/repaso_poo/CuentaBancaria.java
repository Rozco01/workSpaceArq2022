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
public class CuentaBancaria {
	private long NumeroCuenta;
	private Persona Persona;
	private Banco Banco;
	private String TipoCuenta;
	private Movimientos Movimientos;
	
	public CuentaBancaria() {}
	
	public void AbrirCuenta(Persona Persona, String TipoCuenta, long NumeroCuenta, Banco Banco) {
		this.setPersona(Persona);
		this.setTipoCuenta(TipoCuenta);
		this.setNumeroCuenta(NumeroCuenta);
		this.setBanco(Banco);
	}

	public long getNumeroCuenta() {
		return NumeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		NumeroCuenta = numeroCuenta;
	}

	public Persona getPersona() {
		return Persona;
	}

	public void setPersona(Persona persona) {
		Persona = persona;
	}

	public Banco getBanco() {
		return Banco;
	}

	public void setBanco(Banco banco) {
		Banco = banco;
	}

	public String getTipoCuenta() {
		return TipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		TipoCuenta = tipoCuenta;
	}

	public Movimientos getMovimientos() {
		return Movimientos;
	}

	public void setMovimientos(Movimientos movimientos) {
		Movimientos = movimientos;
	}
}
