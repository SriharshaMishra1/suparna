package Pravakar;

 
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.util.Properties;

	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
    public class FileUtils1 {

		
		String filepath="./NewData/commondata.properties";
		String excelpath="./NewData/testdata.xlsx";
		public Properties getpropertyFileobject() throws Throwable
		{
			FileInputStream fis=new FileInputStream(filepath);
			Properties pobj=new Properties();
			 pobj.load(fis);
			return pobj;
		}
		public String getExcelData(String sheetName,int rowNum,int CelNum) throws Throwable
			{
			
			FileInputStream fis=new FileInputStream(excelpath);
					{
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sh=wb.getSheet(sheetName);
				String data=sh.getRow(rowNum).getCell(CelNum).getStringCellValue();
				wb.close();
				return data;
					}
			}
				public void SetExcelData(String SheetName,int rowNum,int colNum,String data)throws Throwable
				{
				FileInputStream fis=new FileInputStream(excelpath);
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sh=wb.getSheet(SheetName);
				sh.getRow(rowNum).createCell(colNum).setCellValue(data);
				FileOutputStream fos=new FileOutputStream(excelpath);
				wb.write(fos);
				wb.close();
				
					}
				
					
		}
		 
		 
