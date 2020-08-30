public class Retiro {
    public int montoRetirar;
    public String clave;

    public Retiro(int montoRetirar) {
        this.montoRetirar = montoRetirar;
    }

    public int getMontoRetirar() {
        return montoRetirar;
    }

    public void setMontoRetirar(int montoRetirar) {
        this.montoRetirar = montoRetirar;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean realizaRetiro(Cuenta cuenta){
    if(cuenta.claveCliente == this.clave){
        cuenta.dineroCuenta =- this.montoRetirar;
        return true;
    }
        return false;
    }

    @Override
    public String toString() {
        return "Retiro{" +
                "montoRetirar=" + montoRetirar +
                ", clave='" + clave + '\'' +
                '}';
    }
}
