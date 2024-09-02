
package app;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        
//        //1 Argos
//        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de trabajadores: "));
//        double suma = 0;
//        for (int i = 0; i < n; i++) {
//            double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del Empleado: "));
//            suma += sueldo;
//        }
//        double promedio = suma/n;
//        JOptionPane.showMessageDialog(null, "El promedio de los Sueldos es: " + promedio);
        
        
//        //2
//        int productos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de productos de la empresa"));
//        String[] nombre = new String[productos];
//        String[] cantidad = new String[productos];
//        for (int i = 0; i < productos; i++) {
//            nombre[i] = String.valueOf(JOptionPane.showInputDialog("Ingrese nombre del Producto"));
//            cantidad[i] = String.valueOf(JOptionPane.showInputDialog("Ingrese su cantidad"));    
//        }
//        for (int i = 0; i < nombre.length; i++) {
//            System.out.println("Producto: " + nombre[i] + ", Cantidad: " + cantidad[i]);
//        }
        
//        //3 Panaderia
//        int lunes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese venta del Lunes: "));
//        int martes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese venta del Martes: "));
//        int miercoles = Integer.parseInt(JOptionPane.showInputDialog("Ingrese venta del Miercoles: "));
//        int jueves = Integer.parseInt(JOptionPane.showInputDialog("Ingrese venta del Jueves: "));
//        int viernes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese venta del Viernes: "));
//        int sabado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese venta del Sabado: "));
//        int domingo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese venta del Domingo: "));
//        
//        int ventas = lunes + martes + miercoles + jueves + viernes + sabado + domingo;
//        JOptionPane.showMessageDialog(null, "Sus ventas de esta semana fueron: " + ventas);       


//        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
//        double suma = 0;
//        for (int i = 0; i < dias.length; i++) {
//            int ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la venta del dia " + i + " :"));
//            suma += ventas;
//        }
//        
//        JOptionPane.showMessageDialog(null, "La venta de esta semana fue: " + suma);


//        //4 Hotel camprestre
//        int clientes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de clientes"));
//        double suma = 0;
//        for (int i = 0; i < clientes; i++) {
//            double cali = Double.parseDouble(JOptionPane.showInputDialog("Difite la calificacion"));
//            suma += cali;
//        }
//        double promedio = suma/clientes;
//        JOptionPane.showMessageDialog(null, "El promedio de calificacion del hotel es: " + promedio);

//        //5 Transporte Boyaca
//        int emple = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Empleados"));
//           String[] nombre = new String[emple];
//           String[] dias = new String[emple];   
//           for (int i = 0; i < emple; i++) {
//            nombre[i] = String.valueOf(JOptionPane.showInputDialog("Ingrese su nombre"));
//            dias[i] = String.valueOf(JOptionPane.showInputDialog("Numero de dias asistido"));              
//        }
//           for (int i = 0; i < nombre.length; i++) {
//               System.out.println("Nombre: "+ nombre[i]+ ", Dias: " + dias[i]);
//        }

        //6 Lacteos
          int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de Empleados"));
           String[] nombre = new String[empleados];
           String[] salario = new String[empleados];
           String[] rendimiento = {"Alto", "Medio", "Bajo"};
           String seleccion = (String) JOptionPane.showInputDialog(null, 
                   "Seleccione el rendimiento",
                   "rendimiento",
                   JOptionPane.QUESTION_MESSAGE,
                   null,
                   rendimiento,
                   rendimiento[0]                                
           );
           String[] bonificacion = new String[empleados];
           for (int i = 0; i < empleados; i++) {
               nombre[i] = String.valueOf(JOptionPane.showInputDialog("Ingrese su nombre"));
               salario[i] = String.valueOf(JOptionPane.showInputDialog("Ingrese salario"));
               rendimiento[i] = String.valueOf(JOptionPane.showInputDialog("Ingrese el rendimiento"));
               
           }
            
    }    
}
