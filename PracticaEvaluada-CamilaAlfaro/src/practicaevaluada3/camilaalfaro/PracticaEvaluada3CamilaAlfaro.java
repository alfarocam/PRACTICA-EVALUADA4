/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada3.camilaalfaro;

import javax.swing.JOptionPane;

/**
 *
 * @author camil
 */
public class PracticaEvaluada3CamilaAlfaro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Practica Evaluada 3 - Camila Alfaro

        //declaración e inicializacion de una matriz 7x3
        int matriz[][] = new int[7][3];
        String Producto1 = JOptionPane.showInputDialog(null, "Ingrese el producto 1:");
        String Producto2 = JOptionPane.showInputDialog(null, "Ingrese el producto 2:");
        String Producto3 = JOptionPane.showInputDialog(null, "Ingrese el producto 3:");

        //llenado de la matriz
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad del producto vendidos: [" + i + "] [" + j + "]:"));
            }
        }

        //se imprime la matriz con los datos
        JOptionPane.showMessageDialog(null,
                "DIA         " + Producto1 + "          " + Producto2 + "              " + Producto3 + "\n"
                + "L " + "      [" + matriz[0][0] + "]      " + "      [" + matriz[0][1] + "]      " + "      [" + matriz[0][2] + "]      " + "\n"
                + "K " + "      [" + matriz[1][0] + "]      " + "      [" + matriz[1][1] + "]      " + "      [" + matriz[1][2] + "]      " + "\n"
                + "M " + "      [" + matriz[2][0] + "]      " + "      [" + matriz[2][1] + "]      " + "      [" + matriz[2][2] + "]      " + "\n"
                + "J " + "      [" + matriz[3][0] + "]      " + "      [" + matriz[3][1] + "]      " + "      [" + matriz[3][2] + "]      " + "\n"
                + "V " + "      [" + matriz[4][0] + "]      " + "      [" + matriz[4][1] + "]      " + "      [" + matriz[4][2] + "]      " + "\n"
                + "S " + "      [" + matriz[5][0] + "]      " + "      [" + matriz[5][1] + "]      " + "      [" + matriz[5][2] + "]      " + "\n"
                + "D " + "      [" + matriz[6][0] + "]      " + "      [" + matriz[6][1] + "]      " + "      [" + matriz[6][2] + "]      " + "\n");
 
        //SUMA del total de ventas por producto
        int VentaP1 = matriz[0][0] + matriz[1][0] + matriz[2][0] + matriz[3][0] + matriz[4][0] + matriz[5][0] + matriz[6][0];
        int VentaP2 = matriz[0][1] + matriz[1][1] + matriz[2][1] + matriz[3][1] + matriz[4][1] + matriz[5][1] + matriz[6][1];
        int VentaP3 = matriz[0][2] + matriz[1][2] + matriz[2][2] + matriz[3][2] + matriz[4][2] + matriz[5][2] + matriz[6][2];
        
        //MOSTRAR  total de ventas por producto
        JOptionPane.showMessageDialog(null,
                "***Total de ventas por producto***"
                + "Suma total de ventas del " + Producto1 +": "+VentaP1 + "\n"
                + "Suma total de ventas del " + Producto2 +": "+VentaP2 + "\n"
                + "Suma total de ventas del " + Producto3 +": "+VentaP3 + "\n");
        
        
//        //producto mas vendido - iba a hacer una matriz con los productos para calcular cual de los productos en la matriz tenia mas 
//        int arregloUni[] = new int[2];
//        PV1[0]= VentaP1;
//        PV2[1]= VentaP2;
//        PV3[2]= VentaP3;
        
        
        
//        
//        int mayor = matriz[0][0];
//        
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (matriz[i][j] > mayor) {
//                    mayor = matriz[i][j];
//                }
//            }
//        }

        
    }

}
