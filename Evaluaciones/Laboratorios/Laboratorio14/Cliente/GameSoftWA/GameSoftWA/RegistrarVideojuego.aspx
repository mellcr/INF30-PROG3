<%@ Page Title="" Language="C#" MasterPageFile="~/GameSoft.Master" AutoEventWireup="true" CodeBehind="RegistrarVideojuego.aspx.cs" Inherits="GameSoftWA.RegistrarVideojuego" %>
<asp:Content ID="Content1" ContentPlaceHolderID="cphTitulo" runat="server">
    Registrar Videojuego
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="cphScripts" runat="server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="cphContenido" runat="server">
    <div class="container">
        <div class="card">
            <div class="card-header">
                <h2>
                    <!-- Cambiar el titulo dependiendo de si se registran o muestran datos -->
                    <asp:Label ID="lblTitulo" runat="server" Text="lblTitulo"></asp:Label>
                </h2>
            </div>
            <div class="card-body">
                <div class="row">
                    <div class="col-md-6">
                        <asp:Label ID="lblFotoVideojuego" CssClass="form-label" runat="server" Text="Foto del Videojuego:"></asp:Label><br />
                        <div class="text-center">
                            <asp:Image ID="imgFotoVideojuego" alt="Foto del videojuego" runat="server" CssClass="img-fluid img-thumbnail mb-2" ImageUrl="/Images/placeholder.jpg"/>
                        </div>
                        <asp:FileUpload ID="fileUploadFotoVideojuego" CssClass="form-control mb-2" runat="server" onchange="this.form.submit()" ClientIDMode="Static" />
                    </div>
                    <div class="col-md-6">
                        <div class="col-md-6 mb-3">
                            <asp:Label ID="lblIdVideojuego" CssClass="col-form-label" runat="server" Text="ID del Videojuego:"></asp:Label>
                            <asp:TextBox ID="txtIdVideojuego" CssClass="form-control" Enabled="false" runat="server"></asp:TextBox>
                        </div>
                        <div class="col-md-12 mb-3">
                            <asp:Label ID="lblNombre" runat="server" Text="Nombre del Videojuego:" CssClass="col-form-label" />
                            <asp:TextBox ID="txtNombre" CssClass="form-control" runat="server"></asp:TextBox>
                        </div>
                        <div class="col-md-12 mb-3">
                            <asp:Label ID="lblGenero" runat="server" Text="Género:" CssClass="col-form-label" />
                            <asp:DropDownList ID="ddlGenero" runat="server" CssClass="form-select">
                                
                            </asp:DropDownList>
                        </div>
                        <div class="col-md-12 mb-3">
                            <asp:Label ID="lblFechaLanzamiento" runat="server" Text="Fecha de Lanzamiento:" CssClass="col-form-label" />
                            <input type="date" ID="dtpFechaLanzamiento" runat="server" class="form-control" >
                        </div>
                        <div class="col-md-12 mb-3">
                            <asp:Label ID="lblCostoDesarrollo" runat="server" Text="Costo de Desarrollo ($):" CssClass="col-form-label" />
                            <asp:TextBox ID="txtCostoDesarrollo" CssClass="form-control" runat="server"></asp:TextBox>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 mb-3">
                        <asp:Label ID="lblClasificacion" runat="server" Text="Clasificación:" CssClass="col-form-label" />
                        <div class="form-control">
                            <div class="form-check form-check-inline">
                                <input id="rbEveryone" class="form-check-input" type="radio" runat="server" />
                                <label id="lblEveryone" class="form-check-label" for="cphContenido_rbEveryone">EVERYONE (E)</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input id="rbTeen" class="form-check-input" type="radio" runat="server" />
                                <label id="lblTeen" class="form-check-label" for="cphContenido_rbTeen">TEEN (T)</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input id="rbMature" class="form-check-input" type="radio" runat="server" />
                                <label id="lblMature" class="form-check-label" for="cphContenido_rbMature">MATURE (M)</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input id="rbAdultsOnly" class="form-check-input" type="radio" runat="server" />
                                <label id="lblAdultsOnly" class="form-check-label" for="cphContenido_rbAdultsOnly">ADULTS ONLY (A)</label>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="card-footer clearfix">
                <asp:Button ID="btnRegresar" runat="server" Text="Regresar" CssClass="float-start btn btn-secondary" OnClick="btnRegresar_Click"/>
                <asp:Button ID="btnGuardar" runat="server" Text="Guardar" CssClass="float-end btn btn-primary" OnClick="btnGuardar_Click" />
            </div>
        </div>
    </div>
</asp:Content>