package POO;

/**
 * Interfaz metodos empleado
 * @author MIGUEL ANGEL
 *
 */
public interface CRUD_Empleado {

	/**
	 * Lista metodos
	 * 
	 * @param id
	 * @param nombre
	 * @return
	 */
	public String insertarEmpleado(int id, String nombre);

	public String actualizarEmpleado(String nombre);

	public String borrarEmpleado(int id);

	public String consultarEmpleado(int id, String nombre);
}
