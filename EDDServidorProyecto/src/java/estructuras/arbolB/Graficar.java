/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructuras.arbolB;

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
                + "[shape = record, style=filled, fillcolor=steelblue1];";

        codigo += CrearNodoPadre(b.p);
        codigo += "}";

        Arbol.LineasGrafico.add(codigo);
        System.out.println(codigo);

        FileWriter fichero = null;
        PrintWriter pw = null;
        try {

            fichero = new FileWriter("ArbolB.txt");

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

            String fileInputPath = "ArbolB.txt";

            //String fileOutputPath = "C:\\Users\\Usuario\\Desktop\\ArbolB.jpg";
            String fileOutputPath = "ArbolB.jpg";
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
        String ccc = "nodo0 [ label =\" ";
        int cue = 1;
String enlaces="";
        for (Nodo i : p.Claves) {
            if (i != null) {
                if (cue == p.Cuentas) {
                    ccc += "<f"+i.id+">"+i.id+"\\n"+i.Fecha+"\\n"+i.Total+"\\n"+i.user.getNickname();
                } else {
                    ccc +="<f"+i.id+">"+ i.id+"\\n"+i.Fecha+"\\n"+i.Total+"\\n"+i.user.getNickname() + "|";
                }
                enlaces += "nodo0:f"+i.id+"->node"+i.Detalle.getPrimero().getId()+";";
                enlaces += i.Detalle.getDot();
            }
        
        }
        ccc += "\"];\n";
        ccc +=enlaces;
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
        String enlaces="";
        for (Nodo i : p.Claves) {
            if (i != null) {
                if (cue == p.Cuentas) {
                    ccc += "<f"+i.id+">"+i.id+"\\n"+i.Fecha+"\\n"+i.Total+"\\n"+i.user.getNickname();
                } else {
                    ccc +="<f"+i.id+">"+ i.id+"\\n"+i.Fecha+"\\n"+i.Total+"\\n"+i.user.getNickname() + "|";
                }
                enlaces += "nodo0:f"+i.id+"->node"+i.Detalle.getPrimero().getId()+";";
                enlaces += i.Detalle.getDot();
            }
            cue++;
        }
        ccc += "\"];\n";
        ccc += enlaces;
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
