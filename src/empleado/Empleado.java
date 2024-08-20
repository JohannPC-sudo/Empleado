/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @Johann Lopez
 */
public class Empleado {
    
    private double sueldoActual;

    public Empleado(double sueldoActual) {
        this.sueldoActual = sueldoActual;
    }

    public double calcularAumento() {
        if (sueldoActual <= 800000) {
            return sueldoActual * 0.10;
        } else if (sueldoActual <= 1200000) {
            return sueldoActual * 0.08;
        } else {
            return sueldoActual * 0.05;
        }
    }

    public void imprimirNuevoSalario() {
        double aumento = calcularAumento();
        double nuevoSalario = sueldoActual + aumento;
        System.out.println("El aumento es: $" + aumento);
        System.out.println("El nuevo salario es: $" + nuevoSalario);
    }    
}
