package components;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;

public class PDFReader {

    @Test
    public void readPDF() throws Exception {

        File file=new File("C:\\Users\\surendarg97\\Downloads\\Processing package.pdf");
        FileInputStream fis=new FileInputStream(file);
        PDDocument pdfdocument=PDDocument.load(fis);
        System.out.println(pdfdocument.getPages().getCount());

        PDFTextStripper pdfTextStripper= new PDFTextStripper();
        System.out.println(pdfTextStripper.getText(pdfdocument));

        pdfdocument.close();
        fis.close();
    }


}
