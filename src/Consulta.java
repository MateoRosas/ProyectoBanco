public class Consulta {
    public String clave;

    public Consulta(){
        this.clave = "";
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean realizaConsulta(Cuenta cuenta){
        return false;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "clave='" + clave + '\'' +
                '}';
    }
}
