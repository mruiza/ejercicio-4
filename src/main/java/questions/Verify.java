package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.BufferedInputStream;
import java.net.URL;

public class Verify implements Question<Boolean> {

    public String title;

    public Verify(String title) {
        this.title = title;
    }

    public static Verify toThe(String title) {
        return new Verify(title);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String urlPDF ="https://www.grupobancolombia.com/wps/wcm/connect/f7a3486a-41af-46b9-8157-2fde21fa4d0a/poli%CC%81ticas-tratamiento-y-proteccio%CC%81n-de-datos-personales-de-proveedores-grupo-bancolombia.pdf.pdf?MOD=AJPERES&CVID=l33Qn2Y";
        String output ="";
        boolean flag = false;
        try{
            URL url = new URL(urlPDF);

            //CREAMOS UN INPUTSTREAM PARA PODER EXTRAER EL ARCHIVO DE LA CONEXION
            BufferedInputStream file = new BufferedInputStream(url.openStream());
            PDDocument document = null;
            try {
                document = PDDocument.load(file);
                output = new PDFTextStripper().getText(document);
                System.out.println(output);
            } finally {
                if (document != null) {
                    document.close();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        if(output.trim().contains(title)){
            flag =  true;
        }
        return flag;
    }
}

