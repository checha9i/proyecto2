/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto2;

/**
 *
 * @author Usuario
 */
import java.io.FileWriter;
import java.io.PrintWriter;

public class Graficar {

    public Graficar(Arbol b) {
        String codigo = "digraph grafica{\n"
                + "rankdir=TB;\n"
                + "node\n"
                + "[shape = circle, style=filled, fillcolor=Yellow];";

        codigo += CrearNodoPadre(b.p);
        codigo += "}";

        Arbol.LineasGrafico.add(codigo);
        System.out.println(codigo);

        FileWriter fichero = null;
        PrintWriter pw = null;
        try {

            fichero = new FileWriter("C:\\Users\\javier\\Documents\\NetBeansProjects\\proyecto2\\src\\proyecto2\\ArbolB.txt");

            pw = new PrintWriter(fichero);
            pw.print(codigo);
        } catch (Exception e) {

        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e) {
            }
        }
        try {

            String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

            String fileInputPath = "C:\\Users\\javier\\Documents\\NetBeansProjects\\proyecto2\\src\\proyecto2\\ArbolB.txt";

            //String fileOutputPath = "C:\\Users\\Usuario\\Desktop\\ArbolB.jpg";
            String fileOutputPath = "C:\\Users\\javier\\Documents\\NetBeansProjects\\proyecto2\\src\\proyecto2\\ArbolB.jpg";
            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();

            rt.exec(cmd);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
        }
    }

    public String CrearNodoPadre(Bnodo p) {
        String ccc = "nodo0 [ label =\"";
        int cue = 1;
        for (Nodo i : p.Claves) {
            if (i != null) {
                if (cue == p.Cuentas) {
                    ccc += i.id;
                } else {
                    ccc += i.id + "|";
                }
            }
        }
        ccc += "\"];\n";
        int n = 0;
        for (Bnodo i : p.Ramas) {
            if (i != null) {
                if (i.Claves[0] != null) {
                    ccc += CrearNodo("0", n + "", i);
                }
            }
            n++;
        }
        return ccc;
    }

    public String CrearNodo(String padre, String actual, Bnodo p) {
        String ccc = "nodo" + padre + actual + " [ label =\"";
        int cue = 1;
        for (Nodo i : p.Claves) {
            if (i != null) {
                if (cue == p.Cuentas) {
                    ccc += i.id;
                } else {
                    ccc += i.id + "|";
                }
            }
            cue++;
        }
        ccc += "\"];\n";
        ccc += "nodo" + padre + "->" + "nodo" + padre + actual + ";\n";
        int n = 0;
        for (Bnodo i : p.Ramas) {
            if (i != null) {
                if (i.Claves[0] != null) {
                    ccc += CrearNodo(padre + actual, n + "", i);
                }
            }
            n++;
        }
        return ccc;
    }
}
