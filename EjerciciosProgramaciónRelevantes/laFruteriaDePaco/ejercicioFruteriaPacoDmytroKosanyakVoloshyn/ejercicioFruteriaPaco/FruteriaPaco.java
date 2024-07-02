package ejercicioFruteriaPaco;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
class FruteriaPaco implements Serializable {
	
    private ArrayList<Productos> stock;
    private ArrayList<String> usuarios;
    private int ganancia;
    private String tipoUser;

    public FruteriaPaco() {
        stock = new ArrayList<Productos>();
        usuarios = new ArrayList<String>();
        ganancia = 0;
        tipoUser = "invitado";
        if(usuarios.size()==0) {
        usuarios.add("admin");
        usuarios.add("admin");}
    }

    public void mostrarProductos() {
        System.out.println("Lista de productos:");
        for (int i=0;i<stock.size();i++) {
            System.out.println("Código: " + stock.get(i).getCodigoProducto());
            System.out.println("Nombre: " + stock.get(i).getNombre());
            System.out.println("Precio: " + stock.get(i).getPrecio());
            System.out.println("Cantidad: " + stock.get(i).getCantidad());
            System.out.println("--------------");
        }
    }
    public void mostrarProductoPorCodigo(int codigo) {
        boolean encontrado = false;
        for (int i=0;i<stock.size();i++) {
            if (stock.get(i).getCodigoProducto() == codigo) {
                System.out.println("Código: " + stock.get(i).getCodigoProducto());
                System.out.println("Nombre: " + stock.get(i).getNombre());
                System.out.println("Precio: " + stock.get(i).getPrecio());
                System.out.println("Cantidad: " + stock.get(i).getCantidad());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el producto con el código " + codigo);
        }
    }
    public void agregarProducto() {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese los detalles del nuevo producto:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Precio: ");
        int precio = sc.nextInt();
        sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Código: ");
        int codigo = sc.nextInt();
        sc.nextLine();
        Productos nuevoProducto = new Productos(nombre, precio, cantidad, codigo);
        stock.add(nuevoProducto);
        System.out.println("El producto se ha agregado correctamente.");
    }
    public void mostrarGanancia() {
        System.out.println("La ganancia total es: " + ganancia);
    }
    public void venderProducto(int codigo) {
        boolean encontrado = false;
        for (int i=0;i<stock.size();i++) {
            if (stock.get(i).getCodigoProducto() == codigo) {
                if (stock.get(i).getCantidad() > 0) {
                	stock.get(i).setCantidad(stock.get(i).getCantidad() - 1);
                    ganancia =ganancia+ stock.get(i).getPrecio();
                    System.out.println("Se ha vendido el producto: " + stock.get(i).getNombre());
                } else {
                    System.out.println("No hay suficiente stock del producto: " + stock.get(i).getNombre());
                }
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el producto con el código " + codigo);
        }
    }
    public void alta(String nombre, String contraseña) {
    	usuarios.add(nombre);
    	usuarios.add(contraseña);
    }
    public void login() {
    	Scanner sc=new Scanner(System.in);
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = sc.nextLine();
        int j=0;
       for(int i=0;i<usuarios.size();i++) {
    	   j++;
    	   if(usuario.equals(usuarios.get(0))&& contrasena.equals(usuarios.get(1))) {
    			   tipoUser="admin";
    			   break;
    	   }
    	   if(usuario.equals(usuarios.get(i))&&contrasena.equals(usuarios.get(i+1))) {
    			   tipoUser="cliente";
    			   break;
    	   }
    			   
       }
       if(j==usuarios.size()) {
    	   System.out.print("Usuario no encontrado volvemos al usuario: "+tipoUser);
       }
       
    }
    public void mostrarMenu() {
        switch (tipoUser) {
            case "admin":
                System.out.println("FRUTERIA DE PACO");
                System.out.println("****************");
                System.out.println("Usted es administrador ¿Qué desea hacer?");
                System.out.println("Mostrar Productos: m/M");
                System.out.println("Buscar Producto: b/B");
                System.out.println("Darse de alta un usuario: n/N");
                System.out.println("Añadir Producto: a/A");
                System.out.println("Mostrar Ganancia: g/G");
                System.out.println("LogIn: l/L");
                System.out.println("Salir de la agenda: s/S");
                break;
            case "cliente":
                System.out.println("FRUTERIA DE PACO");
                System.out.println("****************");
                System.out.println("Usted es cliente ¿Qué desea hacer?");
                System.out.println("Mostrar Productos: m/M");
                System.out.println("Buscar Producto: b/B");
                System.out.println("Comprar un producto: c/C");
                System.out.println("LogIn: l/L");
                System.out.println("Salir de la agenda: s/S");
                break;
            case "invitado":
                System.out.println("FRUTERIA DE PACO");
                System.out.println("****************");
                System.out.println("Usted es invitado ¿Qué desea hacer?");
                System.out.println("Mostrar Productos: m/M");
                System.out.println("Buscar Producto: b/B");
                System.out.println("Darse de alta: n/N");
                System.out.println("LogIn: l/L");
                System.out.println("Salir de la agenda: s/S");
                break;
            default:
                System.out.println("Tipo de usuario no válido");
        }
    }

    public void guardarDatos() {
        try {
            ObjectOutputStream oosStock = new ObjectOutputStream(new FileOutputStream("stock.dat"));
            oosStock.writeObject(stock);
            oosStock.close();

            ObjectOutputStream oosGanancia = new ObjectOutputStream(new FileOutputStream("ganancia.dat"));
            oosGanancia.writeObject(ganancia);
            oosGanancia.close();
            
            ObjectOutputStream oosUsuarios = new ObjectOutputStream(new FileOutputStream("usuarios.dat"));
            oosUsuarios.writeObject(usuarios);
            oosUsuarios.close();

            System.out.println("Datos guardados exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }
    public void cargarDatos() {
        try {
            ObjectInputStream obsStock = new ObjectInputStream(new FileInputStream("stock.dat"));
            stock = (ArrayList<Productos>) obsStock.readObject();
            obsStock.close();

            ObjectInputStream obsGanancia = new ObjectInputStream(new FileInputStream("ganancia.dat"));
            ganancia = (int) obsGanancia.readObject();
            obsGanancia.close();
            
            ObjectInputStream obsUsuarios = new ObjectInputStream(new FileInputStream("usuarios.dat"));
            usuarios =(ArrayList<String>) obsUsuarios.readObject();
            obsUsuarios.close();
            
            System.out.println("Datos cargados exitosamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        FruteriaPaco fruteria = new FruteriaPaco();
        fruteria.cargarDatos();

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            fruteria.mostrarMenu();
            String opcion = sc.nextLine().toLowerCase();

            switch (opcion) {
                case "m":
                    fruteria.mostrarProductos();
                    break;
                case "b":
                    System.out.print("Ingrese el código del producto: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    fruteria.mostrarProductoPorCodigo(codigo);
                    break;
                case "n":
                	if(fruteria.getTipoUser().equals("admin")||fruteria.getTipoUser().equals("invitado")) {
                    System.out.print("Inserte un nombre de usuario: ");
                    String nombre=sc.nextLine();
                    System.out.print("Inserte una contraseña: ");
                    String contraseña=sc.nextLine();
                    fruteria.alta(nombre, contraseña);
                    System.out.print("Se ha registrado correctamente ");
                	}
                	else System.out.print("Su usuario es incorrecto para ésta opción");
                    break;    
                case "a":
                	if(fruteria.getTipoUser().equals("admin"))
                    fruteria.agregarProducto();
                	else System.out.print("Su usuario es incorrecto para ésta opción");
                    break;
                case "g":
                	if(fruteria.getTipoUser().equals("admin"))
                    fruteria.mostrarGanancia();
                	else System.out.print("Su usuario es incorrecto para ésta opción");
                    break;
                case "c":
                	if(fruteria.getTipoUser().equals("cliente")) {
                    System.out.print("Ingrese el código del producto a comprar: ");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    fruteria.venderProducto(codigo);}
                	else System.out.print("Su usuario es incorrecto para ésta opción");
                    break;
                case "l":
                    fruteria.login();
                    break;
                case "s":
                    salir = true;
                    fruteria.guardarDatos();
                    System.out.println("¡Hasta luego!¡Oferta especial! Paco te dará un plátano, ¡El bueno de Paco!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

            System.out.println();
        }
    }
	public String getTipoUser() {
		return tipoUser;
	}
}