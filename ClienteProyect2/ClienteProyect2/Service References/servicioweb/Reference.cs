﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace ClienteProyect2.servicioweb {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(Namespace="http://Volumen/", ConfigurationName="servicioweb.VolumenEsfera")]
    public interface VolumenEsfera {
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el nombre de elemento arg0 del espacio de nombres  no está marcado para aceptar valores nil.
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/agregarcarritoRequest", ReplyAction="http://Volumen/VolumenEsfera/agregarcarritoResponse")]
        ClienteProyect2.servicioweb.agregarcarritoResponse agregarcarrito(ClienteProyect2.servicioweb.agregarcarritoRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/agregarcarritoRequest", ReplyAction="http://Volumen/VolumenEsfera/agregarcarritoResponse")]
        System.Threading.Tasks.Task<ClienteProyect2.servicioweb.agregarcarritoResponse> agregarcarritoAsync(ClienteProyect2.servicioweb.agregarcarritoRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el nombre de elemento User del espacio de nombres  no está marcado para aceptar valores nil.
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/LoginRequest", ReplyAction="http://Volumen/VolumenEsfera/LoginResponse")]
        ClienteProyect2.servicioweb.LoginResponse Login(ClienteProyect2.servicioweb.LoginRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/LoginRequest", ReplyAction="http://Volumen/VolumenEsfera/LoginResponse")]
        System.Threading.Tasks.Task<ClienteProyect2.servicioweb.LoginResponse> LoginAsync(ClienteProyect2.servicioweb.LoginRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el nombre de elemento return del espacio de nombres  no está marcado para aceptar valores nil.
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/CatalogoRequest", ReplyAction="http://Volumen/VolumenEsfera/CatalogoResponse")]
        ClienteProyect2.servicioweb.CatalogoResponse Catalogo(ClienteProyect2.servicioweb.CatalogoRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/CatalogoRequest", ReplyAction="http://Volumen/VolumenEsfera/CatalogoResponse")]
        System.Threading.Tasks.Task<ClienteProyect2.servicioweb.CatalogoResponse> CatalogoAsync(ClienteProyect2.servicioweb.CatalogoRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el nombre de elemento arg0 del espacio de nombres  no está marcado para aceptar valores nil.
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/dotcomprasRequest", ReplyAction="http://Volumen/VolumenEsfera/dotcomprasResponse")]
        ClienteProyect2.servicioweb.dotcomprasResponse dotcompras(ClienteProyect2.servicioweb.dotcomprasRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/dotcomprasRequest", ReplyAction="http://Volumen/VolumenEsfera/dotcomprasResponse")]
        System.Threading.Tasks.Task<ClienteProyect2.servicioweb.dotcomprasResponse> dotcomprasAsync(ClienteProyect2.servicioweb.dotcomprasRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el nombre de elemento arg0 del espacio de nombres  no está marcado para aceptar valores nil.
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/agregarcompraRequest", ReplyAction="http://Volumen/VolumenEsfera/agregarcompraResponse")]
        ClienteProyect2.servicioweb.agregarcompraResponse agregarcompra(ClienteProyect2.servicioweb.agregarcompraRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/agregarcompraRequest", ReplyAction="http://Volumen/VolumenEsfera/agregarcompraResponse")]
        System.Threading.Tasks.Task<ClienteProyect2.servicioweb.agregarcompraResponse> agregarcompraAsync(ClienteProyect2.servicioweb.agregarcompraRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el nombre de elemento arg0 del espacio de nombres  no está marcado para aceptar valores nil.
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/carritodotRequest", ReplyAction="http://Volumen/VolumenEsfera/carritodotResponse")]
        ClienteProyect2.servicioweb.carritodotResponse carritodot(ClienteProyect2.servicioweb.carritodotRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/carritodotRequest", ReplyAction="http://Volumen/VolumenEsfera/carritodotResponse")]
        System.Threading.Tasks.Task<ClienteProyect2.servicioweb.carritodotResponse> carritodotAsync(ClienteProyect2.servicioweb.carritodotRequest request);
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el nombre de elemento arg0 del espacio de nombres  no está marcado para aceptar valores nil.
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/comprarRequest", ReplyAction="http://Volumen/VolumenEsfera/comprarResponse")]
        ClienteProyect2.servicioweb.comprarResponse comprar(ClienteProyect2.servicioweb.comprarRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://Volumen/VolumenEsfera/comprarRequest", ReplyAction="http://Volumen/VolumenEsfera/comprarResponse")]
        System.Threading.Tasks.Task<ClienteProyect2.servicioweb.comprarResponse> comprarAsync(ClienteProyect2.servicioweb.comprarRequest request);
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class agregarcarritoRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="agregarcarrito", Namespace="http://Volumen/", Order=0)]
        public ClienteProyect2.servicioweb.agregarcarritoRequestBody Body;
        
        public agregarcarritoRequest() {
        }
        
        public agregarcarritoRequest(ClienteProyect2.servicioweb.agregarcarritoRequestBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class agregarcarritoRequestBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string arg0;
        
        [System.Runtime.Serialization.DataMemberAttribute(Order=1)]
        public int arg1;
        
        [System.Runtime.Serialization.DataMemberAttribute(Order=2)]
        public long arg2;
        
        public agregarcarritoRequestBody() {
        }
        
        public agregarcarritoRequestBody(string arg0, int arg1, long arg2) {
            this.arg0 = arg0;
            this.arg1 = arg1;
            this.arg2 = arg2;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class agregarcarritoResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="agregarcarritoResponse", Namespace="http://Volumen/", Order=0)]
        public ClienteProyect2.servicioweb.agregarcarritoResponseBody Body;
        
        public agregarcarritoResponse() {
        }
        
        public agregarcarritoResponse(ClienteProyect2.servicioweb.agregarcarritoResponseBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute()]
    public partial class agregarcarritoResponseBody {
        
        public agregarcarritoResponseBody() {
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class LoginRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="Login", Namespace="http://Volumen/", Order=0)]
        public ClienteProyect2.servicioweb.LoginRequestBody Body;
        
        public LoginRequest() {
        }
        
        public LoginRequest(ClienteProyect2.servicioweb.LoginRequestBody Body) {
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
        public ClienteProyect2.servicioweb.LoginResponseBody Body;
        
        public LoginResponse() {
        }
        
        public LoginResponse(ClienteProyect2.servicioweb.LoginResponseBody Body) {
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
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class CatalogoRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="Catalogo", Namespace="http://Volumen/", Order=0)]
        public ClienteProyect2.servicioweb.CatalogoRequestBody Body;
        
        public CatalogoRequest() {
        }
        
        public CatalogoRequest(ClienteProyect2.servicioweb.CatalogoRequestBody Body) {
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
        public ClienteProyect2.servicioweb.CatalogoResponseBody Body;
        
        public CatalogoResponse() {
        }
        
        public CatalogoResponse(ClienteProyect2.servicioweb.CatalogoResponseBody Body) {
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
    public partial class dotcomprasRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="dotcompras", Namespace="http://Volumen/", Order=0)]
        public ClienteProyect2.servicioweb.dotcomprasRequestBody Body;
        
        public dotcomprasRequest() {
        }
        
        public dotcomprasRequest(ClienteProyect2.servicioweb.dotcomprasRequestBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class dotcomprasRequestBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string arg0;
        
        public dotcomprasRequestBody() {
        }
        
        public dotcomprasRequestBody(string arg0) {
            this.arg0 = arg0;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class dotcomprasResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="dotcomprasResponse", Namespace="http://Volumen/", Order=0)]
        public ClienteProyect2.servicioweb.dotcomprasResponseBody Body;
        
        public dotcomprasResponse() {
        }
        
        public dotcomprasResponse(ClienteProyect2.servicioweb.dotcomprasResponseBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class dotcomprasResponseBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string @return;
        
        public dotcomprasResponseBody() {
        }
        
        public dotcomprasResponseBody(string @return) {
            this.@return = @return;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class agregarcompraRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="agregarcompra", Namespace="http://Volumen/", Order=0)]
        public ClienteProyect2.servicioweb.agregarcompraRequestBody Body;
        
        public agregarcompraRequest() {
        }
        
        public agregarcompraRequest(ClienteProyect2.servicioweb.agregarcompraRequestBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class agregarcompraRequestBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string arg0;
        
        [System.Runtime.Serialization.DataMemberAttribute(Order=1)]
        public int arg1;
        
        [System.Runtime.Serialization.DataMemberAttribute(Order=2)]
        public long arg2;
        
        public agregarcompraRequestBody() {
        }
        
        public agregarcompraRequestBody(string arg0, int arg1, long arg2) {
            this.arg0 = arg0;
            this.arg1 = arg1;
            this.arg2 = arg2;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class agregarcompraResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="agregarcompraResponse", Namespace="http://Volumen/", Order=0)]
        public ClienteProyect2.servicioweb.agregarcompraResponseBody Body;
        
        public agregarcompraResponse() {
        }
        
        public agregarcompraResponse(ClienteProyect2.servicioweb.agregarcompraResponseBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute()]
    public partial class agregarcompraResponseBody {
        
        public agregarcompraResponseBody() {
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class carritodotRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="carritodot", Namespace="http://Volumen/", Order=0)]
        public ClienteProyect2.servicioweb.carritodotRequestBody Body;
        
        public carritodotRequest() {
        }
        
        public carritodotRequest(ClienteProyect2.servicioweb.carritodotRequestBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class carritodotRequestBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string arg0;
        
        public carritodotRequestBody() {
        }
        
        public carritodotRequestBody(string arg0) {
            this.arg0 = arg0;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class carritodotResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="carritodotResponse", Namespace="http://Volumen/", Order=0)]
        public ClienteProyect2.servicioweb.carritodotResponseBody Body;
        
        public carritodotResponse() {
        }
        
        public carritodotResponse(ClienteProyect2.servicioweb.carritodotResponseBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class carritodotResponseBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string @return;
        
        public carritodotResponseBody() {
        }
        
        public carritodotResponseBody(string @return) {
            this.@return = @return;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class comprarRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="comprar", Namespace="http://Volumen/", Order=0)]
        public ClienteProyect2.servicioweb.comprarRequestBody Body;
        
        public comprarRequest() {
        }
        
        public comprarRequest(ClienteProyect2.servicioweb.comprarRequestBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute(Namespace="")]
    public partial class comprarRequestBody {
        
        [System.Runtime.Serialization.DataMemberAttribute(EmitDefaultValue=false, Order=0)]
        public string arg0;
        
        public comprarRequestBody() {
        }
        
        public comprarRequestBody(string arg0) {
            this.arg0 = arg0;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
    public partial class comprarResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Name="comprarResponse", Namespace="http://Volumen/", Order=0)]
        public ClienteProyect2.servicioweb.comprarResponseBody Body;
        
        public comprarResponse() {
        }
        
        public comprarResponse(ClienteProyect2.servicioweb.comprarResponseBody Body) {
            this.Body = Body;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.Runtime.Serialization.DataContractAttribute()]
    public partial class comprarResponseBody {
        
        public comprarResponseBody() {
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface VolumenEsferaChannel : ClienteProyect2.servicioweb.VolumenEsfera, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class VolumenEsferaClient : System.ServiceModel.ClientBase<ClienteProyect2.servicioweb.VolumenEsfera>, ClienteProyect2.servicioweb.VolumenEsfera {
        
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
        ClienteProyect2.servicioweb.agregarcarritoResponse ClienteProyect2.servicioweb.VolumenEsfera.agregarcarrito(ClienteProyect2.servicioweb.agregarcarritoRequest request) {
            return base.Channel.agregarcarrito(request);
        }
        
        public void agregarcarrito(string arg0, int arg1, long arg2) {
            ClienteProyect2.servicioweb.agregarcarritoRequest inValue = new ClienteProyect2.servicioweb.agregarcarritoRequest();
            inValue.Body = new ClienteProyect2.servicioweb.agregarcarritoRequestBody();
            inValue.Body.arg0 = arg0;
            inValue.Body.arg1 = arg1;
            inValue.Body.arg2 = arg2;
            ClienteProyect2.servicioweb.agregarcarritoResponse retVal = ((ClienteProyect2.servicioweb.VolumenEsfera)(this)).agregarcarrito(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<ClienteProyect2.servicioweb.agregarcarritoResponse> ClienteProyect2.servicioweb.VolumenEsfera.agregarcarritoAsync(ClienteProyect2.servicioweb.agregarcarritoRequest request) {
            return base.Channel.agregarcarritoAsync(request);
        }
        
        public System.Threading.Tasks.Task<ClienteProyect2.servicioweb.agregarcarritoResponse> agregarcarritoAsync(string arg0, int arg1, long arg2) {
            ClienteProyect2.servicioweb.agregarcarritoRequest inValue = new ClienteProyect2.servicioweb.agregarcarritoRequest();
            inValue.Body = new ClienteProyect2.servicioweb.agregarcarritoRequestBody();
            inValue.Body.arg0 = arg0;
            inValue.Body.arg1 = arg1;
            inValue.Body.arg2 = arg2;
            return ((ClienteProyect2.servicioweb.VolumenEsfera)(this)).agregarcarritoAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        ClienteProyect2.servicioweb.LoginResponse ClienteProyect2.servicioweb.VolumenEsfera.Login(ClienteProyect2.servicioweb.LoginRequest request) {
            return base.Channel.Login(request);
        }
        
        public string Login(string User, string Pass) {
            ClienteProyect2.servicioweb.LoginRequest inValue = new ClienteProyect2.servicioweb.LoginRequest();
            inValue.Body = new ClienteProyect2.servicioweb.LoginRequestBody();
            inValue.Body.User = User;
            inValue.Body.Pass = Pass;
            ClienteProyect2.servicioweb.LoginResponse retVal = ((ClienteProyect2.servicioweb.VolumenEsfera)(this)).Login(inValue);
            return retVal.Body.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<ClienteProyect2.servicioweb.LoginResponse> ClienteProyect2.servicioweb.VolumenEsfera.LoginAsync(ClienteProyect2.servicioweb.LoginRequest request) {
            return base.Channel.LoginAsync(request);
        }
        
        public System.Threading.Tasks.Task<ClienteProyect2.servicioweb.LoginResponse> LoginAsync(string User, string Pass) {
            ClienteProyect2.servicioweb.LoginRequest inValue = new ClienteProyect2.servicioweb.LoginRequest();
            inValue.Body = new ClienteProyect2.servicioweb.LoginRequestBody();
            inValue.Body.User = User;
            inValue.Body.Pass = Pass;
            return ((ClienteProyect2.servicioweb.VolumenEsfera)(this)).LoginAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        ClienteProyect2.servicioweb.CatalogoResponse ClienteProyect2.servicioweb.VolumenEsfera.Catalogo(ClienteProyect2.servicioweb.CatalogoRequest request) {
            return base.Channel.Catalogo(request);
        }
        
        public string Catalogo() {
            ClienteProyect2.servicioweb.CatalogoRequest inValue = new ClienteProyect2.servicioweb.CatalogoRequest();
            inValue.Body = new ClienteProyect2.servicioweb.CatalogoRequestBody();
            ClienteProyect2.servicioweb.CatalogoResponse retVal = ((ClienteProyect2.servicioweb.VolumenEsfera)(this)).Catalogo(inValue);
            return retVal.Body.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<ClienteProyect2.servicioweb.CatalogoResponse> ClienteProyect2.servicioweb.VolumenEsfera.CatalogoAsync(ClienteProyect2.servicioweb.CatalogoRequest request) {
            return base.Channel.CatalogoAsync(request);
        }
        
        public System.Threading.Tasks.Task<ClienteProyect2.servicioweb.CatalogoResponse> CatalogoAsync() {
            ClienteProyect2.servicioweb.CatalogoRequest inValue = new ClienteProyect2.servicioweb.CatalogoRequest();
            inValue.Body = new ClienteProyect2.servicioweb.CatalogoRequestBody();
            return ((ClienteProyect2.servicioweb.VolumenEsfera)(this)).CatalogoAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        ClienteProyect2.servicioweb.dotcomprasResponse ClienteProyect2.servicioweb.VolumenEsfera.dotcompras(ClienteProyect2.servicioweb.dotcomprasRequest request) {
            return base.Channel.dotcompras(request);
        }
        
        public string dotcompras(string arg0) {
            ClienteProyect2.servicioweb.dotcomprasRequest inValue = new ClienteProyect2.servicioweb.dotcomprasRequest();
            inValue.Body = new ClienteProyect2.servicioweb.dotcomprasRequestBody();
            inValue.Body.arg0 = arg0;
            ClienteProyect2.servicioweb.dotcomprasResponse retVal = ((ClienteProyect2.servicioweb.VolumenEsfera)(this)).dotcompras(inValue);
            return retVal.Body.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<ClienteProyect2.servicioweb.dotcomprasResponse> ClienteProyect2.servicioweb.VolumenEsfera.dotcomprasAsync(ClienteProyect2.servicioweb.dotcomprasRequest request) {
            return base.Channel.dotcomprasAsync(request);
        }
        
        public System.Threading.Tasks.Task<ClienteProyect2.servicioweb.dotcomprasResponse> dotcomprasAsync(string arg0) {
            ClienteProyect2.servicioweb.dotcomprasRequest inValue = new ClienteProyect2.servicioweb.dotcomprasRequest();
            inValue.Body = new ClienteProyect2.servicioweb.dotcomprasRequestBody();
            inValue.Body.arg0 = arg0;
            return ((ClienteProyect2.servicioweb.VolumenEsfera)(this)).dotcomprasAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        ClienteProyect2.servicioweb.agregarcompraResponse ClienteProyect2.servicioweb.VolumenEsfera.agregarcompra(ClienteProyect2.servicioweb.agregarcompraRequest request) {
            return base.Channel.agregarcompra(request);
        }
        
        public void agregarcompra(string arg0, int arg1, long arg2) {
            ClienteProyect2.servicioweb.agregarcompraRequest inValue = new ClienteProyect2.servicioweb.agregarcompraRequest();
            inValue.Body = new ClienteProyect2.servicioweb.agregarcompraRequestBody();
            inValue.Body.arg0 = arg0;
            inValue.Body.arg1 = arg1;
            inValue.Body.arg2 = arg2;
            ClienteProyect2.servicioweb.agregarcompraResponse retVal = ((ClienteProyect2.servicioweb.VolumenEsfera)(this)).agregarcompra(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<ClienteProyect2.servicioweb.agregarcompraResponse> ClienteProyect2.servicioweb.VolumenEsfera.agregarcompraAsync(ClienteProyect2.servicioweb.agregarcompraRequest request) {
            return base.Channel.agregarcompraAsync(request);
        }
        
        public System.Threading.Tasks.Task<ClienteProyect2.servicioweb.agregarcompraResponse> agregarcompraAsync(string arg0, int arg1, long arg2) {
            ClienteProyect2.servicioweb.agregarcompraRequest inValue = new ClienteProyect2.servicioweb.agregarcompraRequest();
            inValue.Body = new ClienteProyect2.servicioweb.agregarcompraRequestBody();
            inValue.Body.arg0 = arg0;
            inValue.Body.arg1 = arg1;
            inValue.Body.arg2 = arg2;
            return ((ClienteProyect2.servicioweb.VolumenEsfera)(this)).agregarcompraAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        ClienteProyect2.servicioweb.carritodotResponse ClienteProyect2.servicioweb.VolumenEsfera.carritodot(ClienteProyect2.servicioweb.carritodotRequest request) {
            return base.Channel.carritodot(request);
        }
        
        public string carritodot(string arg0) {
            ClienteProyect2.servicioweb.carritodotRequest inValue = new ClienteProyect2.servicioweb.carritodotRequest();
            inValue.Body = new ClienteProyect2.servicioweb.carritodotRequestBody();
            inValue.Body.arg0 = arg0;
            ClienteProyect2.servicioweb.carritodotResponse retVal = ((ClienteProyect2.servicioweb.VolumenEsfera)(this)).carritodot(inValue);
            return retVal.Body.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<ClienteProyect2.servicioweb.carritodotResponse> ClienteProyect2.servicioweb.VolumenEsfera.carritodotAsync(ClienteProyect2.servicioweb.carritodotRequest request) {
            return base.Channel.carritodotAsync(request);
        }
        
        public System.Threading.Tasks.Task<ClienteProyect2.servicioweb.carritodotResponse> carritodotAsync(string arg0) {
            ClienteProyect2.servicioweb.carritodotRequest inValue = new ClienteProyect2.servicioweb.carritodotRequest();
            inValue.Body = new ClienteProyect2.servicioweb.carritodotRequestBody();
            inValue.Body.arg0 = arg0;
            return ((ClienteProyect2.servicioweb.VolumenEsfera)(this)).carritodotAsync(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        ClienteProyect2.servicioweb.comprarResponse ClienteProyect2.servicioweb.VolumenEsfera.comprar(ClienteProyect2.servicioweb.comprarRequest request) {
            return base.Channel.comprar(request);
        }
        
        public void comprar(string arg0) {
            ClienteProyect2.servicioweb.comprarRequest inValue = new ClienteProyect2.servicioweb.comprarRequest();
            inValue.Body = new ClienteProyect2.servicioweb.comprarRequestBody();
            inValue.Body.arg0 = arg0;
            ClienteProyect2.servicioweb.comprarResponse retVal = ((ClienteProyect2.servicioweb.VolumenEsfera)(this)).comprar(inValue);
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<ClienteProyect2.servicioweb.comprarResponse> ClienteProyect2.servicioweb.VolumenEsfera.comprarAsync(ClienteProyect2.servicioweb.comprarRequest request) {
            return base.Channel.comprarAsync(request);
        }
        
        public System.Threading.Tasks.Task<ClienteProyect2.servicioweb.comprarResponse> comprarAsync(string arg0) {
            ClienteProyect2.servicioweb.comprarRequest inValue = new ClienteProyect2.servicioweb.comprarRequest();
            inValue.Body = new ClienteProyect2.servicioweb.comprarRequestBody();
            inValue.Body.arg0 = arg0;
            return ((ClienteProyect2.servicioweb.VolumenEsfera)(this)).comprarAsync(inValue);
        }
    }
}
