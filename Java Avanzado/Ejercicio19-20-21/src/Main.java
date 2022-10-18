public class Main {
    /**
     * Se modificó el pasaje de argumentos de main, pasando solamente un fichero, el cual se
     * usará en la clase Usuarios.
      */
    public static void main(String args) {

        Usuarios usuarios = new Usuarios(args);
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario("openbootcamp") ;
        usuario.setNombre("Open");
        usuario.setApellidos("Bootcamp");
        usuario.setEmail("ejemplos@open-bootcamp.com");
        usuario.setNivelAcceso(10);


        usuarios.crearUsuario(usuario);

        Usuario usuario2 = new Usuario();
        usuario.setNombreUsuario("openbootcamp2") ;
        usuario.setNombre("Open");
        usuario.setApellidos("Bootcamp");
        usuario.setEmail("ejemplos@open-bootcamp.com");
        usuario.setNivelAcceso(10);
        usuarios.crearUsuario(usuario2);

        Usuario openbootcamp = usuarios.obtenerUsuario("openbootcamp2");
        System.out.println(openbootcamp.getEmail());

        usuarios.borrarUsuario("openbootcamp2");
        for (Usuario a : usuarios.listarUsuarios()) {
            System.out.println(a.getNombreUsuario());
        }
    }
}