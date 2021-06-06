package utilities;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FilloReader {

    private static Fillo fillo=new Fillo();


    public static String readingExcelFile(String columnName) throws FilloException {
    Connection connnectionObj=fillo.getConnection("E:\\LocalGitHubRepository\\IntelliJIDEAProjects\\WGSCOPY\\WGSCOPY\\src\\test\\resources\\TestData\\TestDataSheet.xlsx");
    Recordset recordSet=connnectionObj.executeQuery("select * from DataSheet where TC_ID='SC001'");
    recordSet.next();
    return recordSet.getField(columnName);
    }

}
