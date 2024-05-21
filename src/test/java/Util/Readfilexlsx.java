package Util;
import io.cucumber.messages.types.Examples;
import io.cucumber.plugin.event.Node;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Readfilexlsx {
    public void readfiles() throws IOException {

        FileInputStream file = new FileInputStream("src/test/resources/ExcelData/Inputfile.xlsx");

        XSSFWorkbook testnew = new XSSFWorkbook(file);
        XSSFSheet sheet = testnew.getSheetAt(0);

       int rowcount = sheet.getLastRowNum();
       int colcount = sheet.getRow(1).getLastCellNum();

       System.out.println("Row count: " +rowcount+ "  |  colcount: " +colcount);
         for (int i = 0; i <=rowcount; i++)
            {
                XSSFRow celldata = sheet.getRow(i);
                String environment = celldata.getCell(0).getStringCellValue(); //QA
                String username = celldata.getCell(1).getStringCellValue(); //CORREO
                String password = celldata.getCell(2).getStringCellValue(); //depapym
                String lenguage =  celldata.getCell(3).getStringCellValue();
                String perfil   = celldata.getCell(4).getStringCellValue();
                String menuprincipal = celldata.getCell(5).getStringCellValue();
                String submenu = celldata.getCell(6).getStringCellValue();
                String option = celldata.getCell(7).getStringCellValue();
                String group = celldata.getCell(8).getStringCellValue();
                String region = celldata.getCell(9).getStringCellValue();
                String country = celldata.getCell(10).getStringCellValue();
                String bank = celldata.getCell(11).getStringCellValue();
                String bankstatus = celldata.getCell(12).getStringCellValue();
                String category = celldata.getCell(13).getStringCellValue();
                String subcategory = celldata.getCell(14).getStringCellValue();
                String period = celldata.getCell(15).getStringCellValue();
                String feecode = celldata.getCell(16).getStringCellValue();
                String feename = celldata.getCell(17).getStringCellValue();
                String invoicenum = celldata.getCell(18).getStringCellValue();

                System.out.println(environment+ " | " +username+ " | " +password+ " | " +lenguage+ " | " +
                                    perfil+ " | " + menuprincipal+ " | " +submenu+ " | " +option+ " | " +
                                    group+ " | " + region + " | " +country+ " | " +bank+ " | " +
                                    bankstatus+ " | " +category+ " | " +subcategory+ " | " +period+ " | " +
                                    feecode+ " | " +feename+ " | " +invoicenum );
            }
    }
}
    

