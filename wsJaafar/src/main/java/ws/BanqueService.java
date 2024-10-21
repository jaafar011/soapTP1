package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name = "montant") double mt){
         return mt*11;
    }
    @WebMethod
    public compte Getcompte(@WebParam(name="code") int code){
return new compte(code,Math.random()*9098,new Date());
    }
    @WebMethod
    public List<compte> Getallcompte(){
        return List.of(
                new compte(2,Math.random()*9098,new Date()),
        new compte(1,Math.random()*9098,new Date()),
        new compte(3,Math.random()*9098,new Date())
        );
    }
}
