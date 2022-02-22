package sesion26;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNombre("pepe");

        DatabaseMySQL db = new DatabaseMySQL();
        GuardarEnBaseDeDatos(db,usuario);
        // GuardarEnBaseDeDatos

    }

    public static void GuardarEnBaseDeDatos(DatabaseStore dbs, Usuario usuario){
        dbs.guardar(usuario);
    }
}
