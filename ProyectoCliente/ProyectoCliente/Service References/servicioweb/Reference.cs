﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace ProyectoCliente.servicioweb {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(Namespace="http://Volumen/", ConfigurationName="servicioweb.VolumenEsfera")]
    public interface VolumenEsfera {
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el nombre de elemento return del espacio de nombres  no está marcado para aceptar valores nil.
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/CatalogoRequest", ReplyAction="http://Volumen/VolumenEsfera/CatalogoResponse")]
        ProyectoCliente.servicioweb.CatalogoResponse Catalogo(ProyectoCliente.servicioweb.CatalogoRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/CatalogoRequest", ReplyAction="http://Volumen/VolumenEsfera/CatalogoResponse")]
        System.Threading.Tasks.Task<ProyectoCliente.servicioweb.CatalogoResponse> CatalogoAsync(ProyectoCliente.servicioweb.CatalogoRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el nombre de elemento return del espacio de nombres  no está marcado para aceptar valores nil.
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/ImagenesRRequest", ReplyAction="http://Volumen/VolumenEsfera/ImagenesRResponse")]
        ProyectoCliente.servicioweb.ImagenesRResponse ImagenesR(ProyectoCliente.servicioweb.ImagenesRRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/ImagenesRRequest", ReplyAction="http://Volumen/VolumenEsfera/ImagenesRResponse")]
        System.Threading.Tasks.Task<ProyectoCliente.servicioweb.ImagenesRResponse> ImagenesRAsync(ProyectoCliente.servicioweb.ImagenesRRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el nombre de elemento User del espacio de nombres  no está marcado para aceptar valores nil.
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/LoginRequest", ReplyAction="http://Volumen/VolumenEsfera/LoginResponse")]
        ProyectoCliente.servicioweb.LoginResponse Login(ProyectoCliente.servicioweb.LoginRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/LoginRequest", ReplyAction="http://Volumen/VolumenEsfera/LoginResponse")]
        System.Threading.Tasks.Task<ProyectoCliente.servicioweb.LoginResponse> LoginAsync(ProyectoCliente.servicioweb.LoginRequest request);
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class CatalogoRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="Catalogo", Namespace="http://Volumen/", Order=0)]
        public ProyectoCliente.servicioweb.CatalogoRequestBody Body;
        
        public CatalogoRequest() {
        }
        
        public CatalogoRequest(ProyectoCliente.servicioweb.CatalogoRequestBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute()]
    public partial class CatalogoRequestBody {
        
        public CatalogoRequestBody() {
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class CatalogoResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="CatalogoResponse", Namespace="http://Volumen/", Order=0)]
        public ProyectoCliente.servicioweb.CatalogoResponseBody Body;
        
        public CatalogoResponse() {
        }
        
        public CatalogoResponse(ProyectoCliente.servicioweb.CatalogoResponseBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class CatalogoResponseBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string @return;
        
        public CatalogoResponseBody() {
        }
        
        public CatalogoResponseBody(string @return) {
            this.@return = @return;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class ImagenesRRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="ImagenesR", Namespace="http://Volumen/", Order=0)]
        public ProyectoCliente.servicioweb.ImagenesRRequestBody Body;
        
        public ImagenesRRequest() {
        }
        
        public ImagenesRRequest(ProyectoCliente.servicioweb.ImagenesRRequestBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute()]
    public partial class ImagenesRRequestBody {
        
        public ImagenesRRequestBody() {
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class ImagenesRResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="ImagenesRResponse", Namespace="http://Volumen/", Order=0)]
        public ProyectoCliente.servicioweb.ImagenesRResponseBody Body;
        
        public ImagenesRResponse() {
        }
        
        public ImagenesRResponse(ProyectoCliente.servicioweb.ImagenesRResponseBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class ImagenesRResponseBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string @return;
        
        public ImagenesRResponseBody() {
        }
        
        public ImagenesRResponseBody(string @return) {
            this.@return = @return;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class LoginRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="Login", Namespace="http://Volumen/", Order=0)]
        public ProyectoCliente.servicioweb.LoginRequestBody Body;
        
        public LoginRequest() {
        }
        
        public LoginRequest(ProyectoCliente.servicioweb.LoginRequestBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class LoginRequestBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string User;
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=1)]
        public string Pass;
        
        public LoginRequestBody() {
        }
        
        public LoginRequestBody(string User, string Pass) {
            this.User = User;
            this.Pass = Pass;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class LoginResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="LoginResponse", Namespace="http://Volumen/", Order=0)]
        public ProyectoCliente.servicioweb.LoginResponseBody Body;
        
        public LoginResponse() {
        }
        
        public LoginResponse(ProyectoCliente.servicioweb.LoginResponseBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class LoginResponseBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string @return;
        
        public LoginResponseBody() {
        }
        
        public LoginResponseBody(string @return) {
            this.@return = @return;
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface VolumenEsferaChannel : ProyectoCliente.servicioweb.VolumenEsfera, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class VolumenEsferaClient : System.ServiceModel.ClientBase<ProyectoCliente.servicioweb.VolumenEsfera>, ProyectoCliente.servicioweb.VolumenEsfera {
        
        public VolumenEsferaClient() {
        }
        
        public VolumenEsferaClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public VolumenEsferaClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public VolumenEsferaClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public VolumenEsferaClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        ProyectoCliente.servicioweb.CatalogoResponse ProyectoCliente.servicioweb.VolumenEsfera.Catalogo(ProyectoCliente.servicioweb.CatalogoRequest request) {
            return base.Channel.Catalogo(request);
        }
        
        public string Catalogo() {
            ProyectoCliente.servicioweb.CatalogoRequest inValue = new ProyectoCliente.servicioweb.CatalogoRequest();
            inValue.Body = new ProyectoCliente.servicioweb.CatalogoRequestBody();
            ProyectoCliente.servicioweb.CatalogoResponse retVal = ((ProyectoCliente.servicioweb.VolumenEsfera)(this)).Catalogo(inValue);
            return retVal.Body.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<ProyectoCliente.servicioweb.CatalogoResponse> ProyectoCliente.servicioweb.VolumenEsfera.CatalogoAsync(ProyectoCliente.servicioweb.CatalogoRequest request) {
            return base.Channel.CatalogoAsync(request);
        }
        
        public System.Threading.Tasks.Task<ProyectoCliente.servicioweb.CatalogoResponse> CatalogoAsync() {
            ProyectoCliente.servicioweb.CatalogoRequest inValue = new ProyectoCliente.servicioweb.CatalogoRequest();
            inValue.Body = new ProyectoCliente.servicioweb.CatalogoRequestBody();
            return ((ProyectoCliente.servicioweb.VolumenEsfera)(this)).CatalogoAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        ProyectoCliente.servicioweb.ImagenesRResponse ProyectoCliente.servicioweb.VolumenEsfera.ImagenesR(ProyectoCliente.servicioweb.ImagenesRRequest request) {
            return base.Channel.ImagenesR(request);
        }
        
        public string ImagenesR() {
            ProyectoCliente.servicioweb.ImagenesRRequest inValue = new ProyectoCliente.servicioweb.ImagenesRRequest();
            inValue.Body = new ProyectoCliente.servicioweb.ImagenesRRequestBody();
            ProyectoCliente.servicioweb.ImagenesRResponse retVal = ((ProyectoCliente.servicioweb.VolumenEsfera)(this)).ImagenesR(inValue);
            return retVal.Body.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<ProyectoCliente.servicioweb.ImagenesRResponse> ProyectoCliente.servicioweb.VolumenEsfera.ImagenesRAsync(ProyectoCliente.servicioweb.ImagenesRRequest request) {
            return base.Channel.ImagenesRAsync(request);
        }
        
        public System.Threading.Tasks.Task<ProyectoCliente.servicioweb.ImagenesRResponse> ImagenesRAsync() {
            ProyectoCliente.servicioweb.ImagenesRRequest inValue = new ProyectoCliente.servicioweb.ImagenesRRequest();
            inValue.Body = new ProyectoCliente.servicioweb.ImagenesRRequestBody();
            return ((ProyectoCliente.servicioweb.VolumenEsfera)(this)).ImagenesRAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        ProyectoCliente.servicioweb.LoginResponse ProyectoCliente.servicioweb.VolumenEsfera.Login(ProyectoCliente.servicioweb.LoginRequest request) {
            return base.Channel.Login(request);
        }
        
        public string Login(string User, string Pass) {
            ProyectoCliente.servicioweb.LoginRequest inValue = new ProyectoCliente.servicioweb.LoginRequest();
            inValue.Body = new ProyectoCliente.servicioweb.LoginRequestBody();
            inValue.Body.User = User;
            inValue.Body.Pass = Pass;
            ProyectoCliente.servicioweb.LoginResponse retVal = ((ProyectoCliente.servicioweb.VolumenEsfera)(this)).Login(inValue);
            return retVal.Body.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<ProyectoCliente.servicioweb.LoginResponse> ProyectoCliente.servicioweb.VolumenEsfera.LoginAsync(ProyectoCliente.servicioweb.LoginRequest request) {
            return base.Channel.LoginAsync(request);
        }
        
        public System.Threading.Tasks.Task<ProyectoCliente.servicioweb.LoginResponse> LoginAsync(string User, string Pass) {
            ProyectoCliente.servicioweb.LoginRequest inValue = new ProyectoCliente.servicioweb.LoginRequest();
            inValue.Body = new ProyectoCliente.servicioweb.LoginRequestBody();
            inValue.Body.User = User;
            inValue.Body.Pass = Pass;
            return ((ProyectoCliente.servicioweb.VolumenEsfera)(this)).LoginAsync(inValue);
        }
    }
}