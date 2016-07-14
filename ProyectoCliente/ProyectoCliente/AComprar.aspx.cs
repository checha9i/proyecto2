using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace ProyectoCliente
{
    public partial class AComprar : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["log"] == "no") {
                Server.Transfer("LogIn.aspx");
            }
            String user = Session["usuario"].ToString();
        }
    }
}