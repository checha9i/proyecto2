<%@ Page Title="Carrito" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Carrito.aspx.cs" Inherits="ProyectoCliente.Carrito" %>

<asp:Content ID="BodyContent" ContentPlaceHolderID="MainContent" runat="server">
    
    <table style="width: 100%;">
        <tr>
            <td style="width: 441px">&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td style="width: 441px">    
                <asp:UpdatePanel ID="UpdatePanel1" runat="server" UpdateMode="Always">
              <ContentTemplate>

                  <img src="imagen/graficar.jpg" />

        </ContentTemplate>
              
                    </asp:UpdatePanel>
            </td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td style="width: 441px">
                <asp:Button ID="Button1" runat="server" ForeColor="Black" OnClick="Button1_Click" Text="Comprar" />
            </td>
            <td>
                <asp:Button ID="Button2" runat="server" ForeColor="Black" OnClick="Button2_Click" Text="Eliminar" />
            </td>
            <td>&nbsp;</td>
        </tr>
    </table>
</asp:Content>
