package seguimiento2.ejercicio1;

public class Usuario {
    String usuarioBase;
    String usuarioIngreso;
    String claveBase;
    String claveIngreso;
    boolean estadoSistema;

    public Usuario(String usuarioBase, String usuarioIngreso, String claveBase, String claveIngreso, boolean estadoSistema) {
        this.usuarioBase = usuarioBase;
        this.usuarioIngreso = usuarioIngreso;
        this.claveBase = claveBase;
        this.claveIngreso = claveIngreso;
        this.estadoSistema = estadoSistema;
    }

    public String validarEstado(){
        return ("Es estado es:" + this.estadoSistema);
    }

    public void permitirAcceso(){
        //Logica relacionada con permitir el acceso al sistema
    }

    public String getUsuarioBase() {
        return usuarioBase;
    }

    public void setUsuarioBase(String usuarioBase) {
        this.usuarioBase = usuarioBase;
    }

    public String getUsuarioIngreso() {
        return usuarioIngreso;
    }

    public void setUsuarioIngreso(String usuarioIngreso) {
        this.usuarioIngreso = usuarioIngreso;
    }

    public String getClaveBase() {
        return claveBase;
    }

    public void setClaveBase(String claveBase) {
        this.claveBase = claveBase;
    }

    public String getClaveIngreso() {
        return claveIngreso;
    }

    public void setClaveIngreso(String claveIngreso) {
        this.claveIngreso = claveIngreso;
    }

    public boolean isEstadoSistema() {
        return estadoSistema;
    }

    public void setEstadoSistema(boolean estadoSistema) {
        this.estadoSistema = estadoSistema;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuarioBase='" + usuarioBase + '\'' +
                ", usuarioIngreso='" + usuarioIngreso + '\'' +
                ", claveBase='" + claveBase + '\'' +
                ", claveIngreso='" + claveIngreso + '\'' +
                ", estadoSistema=" + estadoSistema +
                '}';
    }
}
