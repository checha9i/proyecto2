using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication1
{
    public partial class LogIn : System.Web.UI.Page
    {
        servicioweb.ServiciosWebClient proxy = new servicioweb.ServiciosWebClient();

        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void LogIn(object sender, EventArgs e)
        {
            String name = User.ToString(),pass=Password.ToString();
            

        }
    }
}