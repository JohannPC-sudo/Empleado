/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

/**
 *
 * @author Usuario
 */
public class DatosEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        // Crear un objeto Empleado con el sueldo actual
        Empleado empleado = new Empleado(850000);

        // Calcular y mostrar el nuevo salario
        empleado.imprimirNuevoSalario();
    }

  }
    

