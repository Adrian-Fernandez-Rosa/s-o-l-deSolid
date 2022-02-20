package sesion22;


   class Usuario{
    public void crearUsuario(String username){}
    public void notificarUsuario(String username){
        Emailer emailer = new Emailer();
        emailer.enviarEmail(this);//aplicamos perfectamente el principio de responsabilidad única
    }
}

class Emailer{
       public void enviarEmail(Usuario usuario) {}
}