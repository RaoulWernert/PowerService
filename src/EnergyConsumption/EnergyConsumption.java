package EnergyConsumption;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Raoul on 3/12/2017.
 */
@WebService()
public class EnergyConsumption {
  @WebMethod
  public String Calculate(String type, String price) {
    float cost = Float.parseFloat(price);
    switch (type){
      case "1":
        return ""+(cost * 0.5);
      case "2":
        return ""+(cost * 0.7);
    }
    return "0";
  }
  public static void main(String[] argv) {
    Object implementor = new EnergyConsumption();
    String address = "http://localhost:9000/EnergyConsumption";
    Endpoint.publish(address, implementor);
  }
}
