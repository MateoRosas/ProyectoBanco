public class Transferencia {
    public int montoTransferir;
    public String clave;
    public String numeroCuentaTransferir;

    public Transferencia(int montoTransferir, String numeroCuentaTransferir) {
        this.montoTransferir = montoTransferir;
        this.numeroCuentaTransferir = numeroCuentaTransferir;
    }

    public int getMontoTransferir() {
        return montoTransferir;
    }

    public void setMontoTransferir(int montoTransferir) {
        this.montoTransferir = montoTransferir;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNumeroCuentaTransferir() {
        return numeroCuentaTransferir;
    }

    public void setNumeroCuentaTransferir(String numeroCuentaTransferir) {
        this.numeroCuentaTransferir = numeroCuentaTransferir;
    }

    public boolean realizaTransferencia(Cuenta cuenta){

        return false;
    }

    @Override
    public String toString() {
        return "Transferencia{" +
                "montoTransferir=" + montoTransferir +
                ", clave='" + clave + '\'' +
                ", numeroCuentaTransferir='" + numeroCuentaTransferir + '\'' +
                '}';
    }
}
