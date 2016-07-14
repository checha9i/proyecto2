using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
//using ClienteEDDProyecto.servicioweb;

namespace WebApplication1
{
    public partial class LogIn : System.Web.UI.Page
    {
       // ClienteEDDProyecto.servicioweb.ServiciosWebClient proxy = new ClienteEDDProyecto.servicioweb.ServiciosWebClient();
       // ProyectoCliente.servicioweb.VolumenEsferaClient proxy = new ProyectoCliente.servicioweb.VolumenEsferaClient();
        protected void Page_Load(object sender, EventArgs e)
        {
            Session["usuario"] = "";
        }

        protected void Login(object sender, EventArgs e)
        {
      //      String user = User.ToString(), pass = Password.ToString();
        //    if (proxy.Login(user, pass) == "Ingreso") {
        //        Server.Transfer("About.aspx");
        //    }
        }


    }
}