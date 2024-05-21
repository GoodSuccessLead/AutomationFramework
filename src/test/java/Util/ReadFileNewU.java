package Util;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;

public class ReadFileNewU {
    public void UltimatereadFile() throws IOException {
        File archivo = new File("C:\\Anderson Cabana\\Proyectos\\Versiones_Proyecto\\v1.3\\Demo_Automatizacion\\Input\\Inputfile.xlsx"); // Replace with the actual file path
    try {
        InputStream input  = new FileInputStream(archivo);
        XSSFWorkbook libro = new XSSFWorkbook(input);

        XSSFSheet hoja = libro.getSheetAt(0);

        Row fila = hoja.getRow(1); // indice de file
        Iterator<Cell> columnas = fila.cellIterator();

        while(columnas.hasNext()){
            //String valor  = columnas.next().getStringCellValue();
            //System.out.print(valor);
            Cell celda = columnas.next();
            if(celda.getCellType() == CellType.STRING) {
                String valor = celda.getStringCellValue();
                System.out.println(valor);
            }
            if(celda.getCellType() == CellType.NUMERIC){
                double valor = celda.getNumericCellValue();
                System.out.println(valor);
            }
            if(celda.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(celda)){
                Date fecha = celda.getDateCellValue();
                System.out.println(fecha);
            }
        }

    }catch (Exception e){
        e.printStackTrace();
    }
    }
}
