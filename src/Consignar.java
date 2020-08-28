public class Consignar {
    public String numeroCuentaConsignar;
    public int montoConsignar;
    public String clave;

    public Consignar(String numeroCuentaConsignar, int montoConsignar) {
        this.numeroCuentaConsignar = numeroCuentaConsignar;
        this.montoConsignar = montoConsignar;
    }


    public String getNumeroCuentaConsignar() {
        return numeroCuentaConsignar;
    }

    public void setNumeroCuentaConsignar(String numeroCuentaConsignar) {
        this.numeroCuentaConsignar = numeroCuentaConsignar;
    }

    public int getMontoConsignar() {
        return montoConsignar;
    }

    public void setMontoConsignar(int montoConsignar) {
        this.montoConsignar = montoConsignar;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean realizaConsignacion(Cuenta cuenta){
        return false;
    }

}
