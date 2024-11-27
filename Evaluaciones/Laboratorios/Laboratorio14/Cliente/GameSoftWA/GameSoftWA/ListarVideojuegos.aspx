<%@ Page Title="" Language="C#" MasterPageFile="~/GameSoft.Master" AutoEventWireup="true" CodeBehind="ListarVideojuegos.aspx.cs" Inherits="GameSoftWA.ListarVideojuegos" %>
<asp:Content ID="Content1" ContentPlaceHolderID="cphTitulo" runat="server">
    Listar Videojuegos
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="cphScripts" runat="server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="cphContenido" runat="server">
    <div class="container">
        <div class="card">
            <div class="card-header">
                <h2>Listado de Videojuegos</h2>
            </div>
            <div class="card-body">
                <div class="row align-items-center mb-3">
                    <div class="col-12 col-md-auto me-2">
                        <asp:Label ID="lblNombre" runat="server" Text="Nombre: " CssClass="col-form-label"></asp:Label>
                    </div>
                    <div class="col-12 col-md-6 me-2 mt-3 mt-md-0">
                        <asp:TextBox ID="txtNombre" runat="server" CssClass="form-control"></asp:TextBox>
                    </div>
                    <div class="col-12 col-md-auto me-2 mt-3 mt-md-0">
                        <asp:LinkButton ID="lbBuscar" runat="server" CssClass="btn btn-info" Text="<i class='fa-solid fa-magnifying-glass'></i> Buscar" />
                    </div>
                    <div class="col-12 col-md text-md-end mt-3 mt-md-0">
                        <asp:LinkButton ID="lbRegistrar" runat="server" CssClass="btn btn-success" Text="<i class='fa-solid fa-plus'></i> Registrar Videojuego" OnClick="lbRegistrar_Click"/>
                    </div>
                </div>
                <div class="row">
                    <asp:GridView ID="gvVideojuegos" runat="server" AllowPaging="true" PageSize="5" AutoGenerateColumns="false" CssClass="table table-hover table-responsive table-striped" ShowHeaderWhenEmpty="true">
                        <Columns>
                            <asp:BoundField HeaderText="Id" />
                            <asp:BoundField HeaderText="Nombre" />
                            <asp:BoundField HeaderText="Genero" />
                            <asp:BoundField HeaderText="Calificación" />
                            <asp:TemplateField>
                                <ItemTemplate>
                                    <asp:LinkButton runat="server" Text="<i class='fa-solid fa-eye'></i>" OnClick="lbVisualizar_Click"/>
                                </ItemTemplate>
                            </asp:TemplateField>
                        </Columns>
                    </asp:GridView>
                    <EmptyDataTemplate>
                        No hay datos disponibles.
                    </EmptyDataTemplate>
                </div>
            </div>
        </div>
    </div>
</asp:Content>