package sesion26;

public class DatabaseSQLite implements DatabaseStore{

    @Override
    public void guardar(Usuario usuario) {
        System.out.println("Soy guardar en DatabaseSQLite");
    }
}
