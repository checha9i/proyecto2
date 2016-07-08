using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(ClienteEDDProyecto.Startup))]
namespace ClienteEDDProyecto
{
    public partial class Startup {
        public void Configuration(IAppBuilder app) {
            ConfigureAuth(app);
        }
    }
}
