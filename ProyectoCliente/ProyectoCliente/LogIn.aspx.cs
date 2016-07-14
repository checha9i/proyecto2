using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ProyectoCliente
{
    public partial class LogIn : System.Web.UI.Page
    {
        servicioweb.VolumenEsferaClient proxy = new servicioweb.VolumenEsferaClient();
        protected void Page_Load(object sender, EventArgs e)
        {
            Session["usuario"] = "";
            Session["log"] = "no";
        }
        protected void Login(object sender, EventArgs e)
        {
            String user = User.ToString(), pass = Password.ToString();
            //if (proxy.Login(user, pass) == "Ingreso")
            if(true)
            {
                Session["usuario"] = user;
                Session["log"] = "si";
                Server.Transfer("Catalogo.aspx");

            }
            else { 
            
            }
        }

    }
}