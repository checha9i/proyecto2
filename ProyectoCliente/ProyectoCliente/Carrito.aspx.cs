using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ProyectoCliente
{
    public partial class Carrito : System.Web.UI.Page
    {
        servicioweb.VolumenEsferaClient proxy = new servicioweb.VolumenEsferaClient();
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["log"] == "no")
            {
                Server.Transfer("LogIn.aspx");
            }
            String user = Session["usuario"].ToString();
            String dot = "digraph {n1->n2;}";
            graficar(dot);
         
        }
        public void graficar(String dot) {
            System.IO.File.WriteAllText(HttpContext.Current.Server.MapPath("~")+"/imagen/graficar.txt", dot);
            String Arguments = "cd.. \n cd.. \n cd..\n cd..\n cd..\n cd..\n cd.. \n cd C:\\Program Files (x86) \n cd Graphviz2.38 \n cd bin \n dot.exe -Tjpg  " + HttpContext.Current.Server.MapPath("~") + "/imagen/graficar.txt -o " + HttpContext.Current.Server.MapPath("~") + "/imagen/graficar.jpg";
            System.IO.File.WriteAllText(HttpContext.Current.Server.MapPath("~")+"/imagen/graficar.bat", Arguments);         
            System.Diagnostics.Process process = new System.Diagnostics.Process();
            System.Diagnostics.ProcessStartInfo startinfo=new  System.Diagnostics.ProcessStartInfo();
            startinfo.WindowStyle = System.Diagnostics.ProcessWindowStyle.Hidden;
            startinfo.FileName = "cmd.exe";
            startinfo.Arguments = HttpContext.Current.Server.MapPath("~")+"/imagen/graficar.bat";
            process.StartInfo = startinfo;
            process.Start();
        }
    }
}