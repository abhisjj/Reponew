package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String getData(int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Automation\\KiteZeroDha1\\src\\test\\resources\\filevelocity.xlsx");
		String value=WorkbookFactory.create(file).getSheet("Credentials").getRow(row).getCell(cell).getStringCellValue();
	return value;
	
	}

}
