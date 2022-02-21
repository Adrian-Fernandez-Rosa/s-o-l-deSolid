package sesion25.ejemplo1;

public class RelojInteligenteImpl implements Reloj{


    @Override
    public String horaActual() {
        return "10";
    }

    @Override
    public String minutoActual() {
        return "88";
    }

    @Override
    public String segundoActual() {
        return "45";
    }

    //en los metodos siguientes estamos rompiendo el principio de responsabilidad única (S de solid).

    public void enviarMensaje() {

    }

    public void obtenerCorreos() {

    }

}
