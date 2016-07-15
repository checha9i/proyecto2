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
           
            
            if (Session["log"].ToString() == "no")
            {
                Server.Transfer("LogIn.aspx");
            }
            String user = Session["usuario"].ToString();


            String dot = proxy.dotcompras(Session["usuario"].ToString());

            graficar(dot);
            
        }
        public void graficar(String dot) {
            System.IO.File.WriteAllText(HttpContext.Current.Server.MapPath("~")+"imagen\\graficar.txt", dot);
            String Arguments = "cd.. \n cd.. \n cd..\n cd..\n cd..\n cd..\n cd.. \n cd C:\\Program Files (x86) \n cd Graphviz2.38 \n cd bin \n dot.exe -Tjpg  " + HttpContext.Current.Server.MapPath("~") + "imagen\\graficar.txt -o " + HttpContext.Current.Server.MapPath("~") + "imagen\\graficar.jpg";
            System.IO.File.WriteAllText(HttpContext.Current.Server.MapPath("~")+"imagen\\graficar.bat", Arguments);         
         
String Arguments1 = HttpContext.Current.Server.MapPath("~")+"imagen\\graficar.bat";

System.Diagnostics.ProcessStartInfo info = new System.Diagnostics.ProcessStartInfo(Arguments1, "/f /a");
System.Diagnostics.Process p = new System.Diagnostics.Process();
p.StartInfo = info;
p.Start();
p.WaitForExit();
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            proxy.comprar(Session["usuario"].ToString());
        }

        protected void Button2_Click(object sender, EventArgs e)
        {

            proxy.eliminarcomprar(Session["usuario"].ToString());
        }

    }
}