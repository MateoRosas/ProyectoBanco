public class Cliente {
    public String nombre;
    public String id;
    public String apellido;
    public String fechaNacimiento;
    public String ciudad;
    public String estratoSocial;
    public String tipoDePersona;




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstratoSocial() {
        return estratoSocial;
    }

    public void setEstratoSocial(String estratoSocial) {
        this.estratoSocial = estratoSocial;
    }

    public String getTipoDePersona() {
        return tipoDePersona;
    }

    public void setTipoDePersona(String tipoDePersona) {
        this.tipoDePersona = tipoDePersona;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", estratoSocial='" + estratoSocial + '\'' +
                ", tipoDePersona='" + tipoDePersona + '\'' +
                '}';
    }
}
