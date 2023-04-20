package testMain;

import java.io.IOException;
import modelos.*;
import com.mycompany.proyecto7c.*;
import graphic.Carbon;


public class TestMain {

    public static void main(String[] args) throws IOException {
        Carbon testInterfaz = new Carbon();
        String urlBase = "https://api.websitecarbon.com/site?url=";
        String urlDop = "";
        String urlTotal = urlBase + urlDop;
        try{
        String fichero = ConexionHTTP.peticionHttpGet(urlTotal);

        Common common = (Common) JsonService.stringToPojo(fichero, Common.class);
        System.out.println(common);
        } catch (IOException e){
            System.out.println("URL no correcto");
        }

    }
}
