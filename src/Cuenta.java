public class Cuenta {
    public String IDCuenta;
    public String entidad;
    public String codigoOficina;
    public String numeroDeCuenta;
    public String cuentaBancaria;
    public String fechaExpedicion;
    public String firmaSolicitante;
    public String claveCliente;
    public Producto producto;
    public Consignar consigna;
    public Retiro retiro;
    public Transferencia transferencia;
    public Consulta consulta;
    public double dineroCuenta;

    public String getIDCuenta() {
        return IDCuenta;
    }

    public void setIDCuenta(String IDCuenta) {
        this.IDCuenta = IDCuenta;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getCodigoOficina() {
        return codigoOficina;
    }

    public void setCodigoOficina(String codigoOficina) {
        this.codigoOficina = codigoOficina;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(String fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public String getFirmaSolicitante() {
        return firmaSolicitante;
    }

    public void setFirmaSolicitante(String firmaSolicitante) {
        this.firmaSolicitante = firmaSolicitante;
    }

    public String getClaveCliente() {
        return claveCliente;
    }

    public void setClaveCliente(String claveCliente) {
        this.claveCliente = claveCliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Consignar getConsigna() {
        return consigna;
    }

    public void setConsigna(Consignar consigna) {
        this.consigna = consigna;
    }

    public Retiro getRetiro() {
        return retiro;
    }

    public void setRetiro(Retiro retiro) {
        this.retiro = retiro;
    }

    public Transferencia getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Transferencia transferencia) {
        this.transferencia = transferencia;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public void calcularFechaVencimiento(){

    }

    public double descuentos(Producto producto, Cuenta cuenta){
        if(this.consulta.realizaConsulta(cuenta)==true){
           return this.producto.interes=0;
        }
        return 0;
    }

    public double calcularInteresesTotales(Producto producto, Cuenta cuenta){
        if (this.retiro.realizaRetiro(cuenta) == true){
            return this.retiro.montoRetirar*producto.interes;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Cuenta{" +
                "IDCuenta='" + IDCuenta + '\'' +
                ", entidad='" + entidad + '\'' +
                ", codigoOficina='" + codigoOficina + '\'' +
                ", numeroDeCuenta='" + numeroDeCuenta + '\'' +
                ", cuentaBancaria='" + cuentaBancaria + '\'' +
                ", fechaExpedicion='" + fechaExpedicion + '\'' +
                ", firmaSolicitante='" + firmaSolicitante + '\'' +
                ", claveCliente='" + claveCliente + '\'' +
                ", producto=" + producto +
                ", consigna=" + consigna +
                ", retiro=" + retiro +
                ", transferencia=" + transferencia +
                ", consulta=" + consulta +
                '}';
    }
}
