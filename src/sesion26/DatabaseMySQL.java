package sesion26;

public class DatabaseMySQL implements DatabaseStore{


    @Override
    public void guardar(Usuario usuario) {
        System.out.println("Soy guardar en Database");
    }
}
