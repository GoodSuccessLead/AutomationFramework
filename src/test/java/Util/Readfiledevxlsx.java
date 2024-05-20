package Util;

import Task.LenguageTask;
import Task.PerfilTask;
import UserInterface.CredentialsUI;
import UserInterface.LenguageUI;
import UserInterface.PerfilUI;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Readfiledevxlsx {
    public void tesstnew() throws IOException {
        //Create an object of File class to open xlsx file
        File file = new File("C:\\Anderson Cabana\\Proyectos\\Versiones_Proyecto\\v1.3\\Demo_Automatizacion\\Input\\Inputfile.xlsx");

        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        //creating workbook instance that refers to .xls file
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);
        //creating a Sheet object
        XSSFSheet sheet = wb.getSheet("Inputfile");
        //get all rows in the sheet
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
       // int rowCount = sheet.getFirstRowNum() - sheet.getLastRowNum();
        //iterate over all the row to print the data present in each cell.
        for (int i = 0; i <= rowCount; i++) {

            //get cell count in a row
            int cellcount = sheet.getRow(i).getLastCellNum();

            //iterate over each cell to print its value
            System.out.println("Row " + i + " data is :");

            for (int j = 0; j < cellcount; j++) {
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + " | ");
            }
            System.out.println();
        }
        for (int i = 1; i <= rowCount; i++) {
            String username;
            String password;


            /*
            CredentialsUI user = new CredentialsUI();
            user.username.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
            user.password.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
            */

        }
        wb.close();
        inputStream.close();
    }
}
/*
        XSSFCell cell = sheet.getRow(1).createCell(6);
        if(confirmationMessage.isDisplayed()){
            cell.setCellValue("PASS");
        }else{
            cell.setCellValue("FAIL");
        }
        //To write into Excel File
        FileOutputStream outputStream = new FileOutputStream("C:\\Anderson Cabana\\Proyectos\\Versiones_Proyecto\\v1.2\\Demo_Automatizacion\\Input\\Inputfile.xlsx");
        wb.write(outputStream);
        */

