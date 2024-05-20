package Util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
//ULTIMO
public class ReadfileNewTest {
    public void testingfile() throws IOException {
        String fileLocation = "C:\\Anderson Cabana\\Proyectos\\Versiones_Proyecto\\v1.3\\Demo_Automatizacion\\Input\\Inputfile.xlsx"; // Replace with the actual file path

        try (FileInputStream file = new FileInputStream(fileLocation);
             Workbook workbook = new XSSFWorkbook(file)) {

            Sheet sheet = workbook.getSheetAt(0);
            Map<Integer, List<String>> data = new HashMap<>();

            int i = 0;
            for (Row row : sheet) {
                data.put(i, new ArrayList<>());
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            // Handle string data
                            data.get(i).add(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            // Handle numeric data
                            data.get(i).add(String.valueOf(cell.getNumericCellValue()));
                            break;
                        case BOOLEAN:
                            // Handle boolean data
                            data.get(i).add(String.valueOf(cell.getBooleanCellValue()));
                            break;
                        case FORMULA:
                            // Handle formula data
                            data.get(i).add(cell.getCellFormula());
                            break;
                        default:
                            data.get(i).add(""); // Default value for other cell types
                    }
                }
                i++;
            }
            System.out.println(data);
            // Now you have the data stored in the 'data' map
            // You can process it further as needed
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
