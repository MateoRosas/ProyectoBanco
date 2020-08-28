public class Producto {
    public boolean credito;
    public boolean debito;
    public double interes;
    public double monto;

    public Producto(boolean credito, boolean debito) {
        this.credito = credito;
        this.debito = debito;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public boolean isDebito() {
        return debito;
    }

    public void setDebito(boolean debito) {
        this.debito = debito;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "credito=" + credito +
                ", debito=" + debito +
                ", interes=" + interes +
                ", monto=" + monto +
                '}';
    }
}
