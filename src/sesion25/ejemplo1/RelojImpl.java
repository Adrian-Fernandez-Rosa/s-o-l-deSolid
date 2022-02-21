package sesion25.ejemplo1;

public class RelojImpl implements Reloj, RelojInteligente {
    @Override
    public String horaActual() {
        return "10";
    }

    @Override
    public String minutoActual() {
        return "08";
    }

    @Override
    public String segundoActual() {
        return "45";
    }

    @Override
    public void enviarMensaje() {

    }

    @Override
    public void obtenerCorreos() {

    }
}
