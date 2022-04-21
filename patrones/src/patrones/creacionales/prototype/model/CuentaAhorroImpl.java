
package patrones.creacionales.prototype.model;

import patrones.creacionales.prototype.ICuenta;

/**
 *
 * @author Jefferson
 */
public class CuentaAhorroImpl implements ICuenta{
    private String tipo;
    private double monto;
    private String banco;
    private String dirbanco;
    
    public CuentaAhorroImpl(){
        tipo = "Ahorro";
    }
    
    
    @Override
    public ICuenta clonarCuenta() {
        CuentaAhorroImpl cuenta = null;
        
        try{
            cuenta = (CuentaAhorroImpl) clone();
        }catch(CloneNotSupportedException cex){
            cex.getStackTrace();
        }
        return cuenta;
    }
    
    
    @Override
    public String toString(){
        return "CuentaAhorroImpl [tipo=" +tipo+ ", monto=" +monto+ "]";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getDirbanco() {
        return dirbanco;
    }

    public void setDirbanco(String dirbanco) {
        this.dirbanco = dirbanco;
    }
    
   
}
