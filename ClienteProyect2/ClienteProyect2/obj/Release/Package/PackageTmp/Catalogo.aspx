﻿<%@ Page Title="LogIn" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Catalogo.aspx.cs" Inherits="ClienteProyect2.Catalogo" %>


<asp:Content ID="BodyContent" ContentPlaceHolderID="MainContent" runat="server">
    <h3>Catalogo</h3>
    <p>
        <table style="width:100%;">
            <tr>
                <td style="width: 656px">&nbsp;</td>
                <td>Ingrese Codigo del Producto</td>
                <td>
                    <asp:TextBox ID="Codigo" runat="server" ForeColor="Black" Height="22px"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td style="width: 656px">
                    <asp:Table ID="Table1" runat="server"  BorderStyle="Dotted" CellPadding="10">
                    </asp:Table>
                </td>
                <td>Ingrese cantidad</td>
                <td>
                    <asp:TextBox ID="cantidad" runat="server" ForeColor="Black"></asp:TextBox>
                </td>
            </tr>
            <tr>
                <td style="width: 656px">
                    <asp:Button ID="Anterior" runat="server" OnClick="Anterior_Click" Text="anterior" cssClass="btn btn-success" />
                    <asp:Button ID="Siguiente" runat="server" Text="Siguiente" OnClick="Siguiente_Click" cssClass="btn btn-success"/>
                    <asp:Label ID="Label1" runat="server" Text="Label"></asp:Label>
                </td>
                <td>
                    <asp:Button ID="Button1" runat="server" ForeColor="Black" OnClick="Button1_Click" Text="Agregar a Carrito" />
                </td>
                <td>
                    <asp:Button ID="Button2" runat="server" ForeColor="Black" Text="Por Comprar" OnClick="Button2_Click" />
                </td>
            </tr>
            <tr>
                <td style="width: 656px">
                    &nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            
            <tr>
                <td style="width: 656px">
                    &nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td style="width: 656px">
                    &nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
        </table>
    </p>
    <p>&nbsp;</p>
</asp:Content>
