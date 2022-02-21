package sesion25.ejemplo1;

public class Main {
    /**
     *  I: PRINCIPIO DE SEGREGACION DE INTERFACES: UNA CLASE no debe depender de una interfaz que no va a utilizar,
     * 	 ejemplo interfaz pajaro tiene metodos volar y comer , no se va a implementar en una clase que se llame perro.
     * @param args
     */
    public static void main(String[] args) {
        operarReloj(new RelojInteligenteImpl());
    }

    public static void operarReloj(Object o){

        if (o instanceof RelojImpl){
            //tareas a hacer con reloj

        }

    }

}
