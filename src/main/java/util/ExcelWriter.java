/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Dog;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author mbralic
 */
public class ExcelWriter {
    
    
    private static final String FILTER_DESC = "Excel file(.xls)";
    private static final String FILTER_EXTENSION = "xls";
    private static final String FILTER_TITLE = "Selecte a file to save";
    private static  SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.");

    private static String getFilepath(String name) {

        FileNameExtensionFilter filter = new FileNameExtensionFilter(FILTER_DESC, FILTER_EXTENSION);

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        fileChooser.setDialogTitle(FILTER_TITLE);
        fileChooser.setSelectedFile(new File(name + FILTER_EXTENSION));
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile().getAbsolutePath();
        }

        return null;

    }
    
      public static void dogsInExcel(List<Dog> dogs) {

        String filepath = getFilepath("Dogs " + sdf.format(new Date()));

        if (filepath == null) {
            return;
        }

        try {

            HSSFWorkbook wb = new HSSFWorkbook();

            Row r;
            Cell cell;
            int row = 0;
            int column;


            wb.createSheet("Information about dogs");
            column = 0;
            r = wb.getSheetAt(0).createRow(row++);
            cell = r.createCell(column++);
            cell.setCellValue("Dog ID");
            cell = r.createCell(column++);
            cell.setCellValue("Dog name");
            cell = r.createCell(column++);
            cell.setCellValue("Chip number");
            cell = r.createCell(column++);
            cell.setCellValue("Year Of Adopt ");
            cell = r.createCell(column);
            cell.setCellValue("Year Of Birth");


            for (Dog d : dogs) {

                column = 0;
                r = wb.getSheetAt(0).createRow(row++);
                cell = r.createCell(column++);
                cell.setCellValue(d.getId());
                cell = r.createCell(column++);
                cell.setCellValue(d.getName());
                cell = r.createCell(column++);
                cell.setCellValue(d.getChipNumber());
                cell = r.createCell(column++);
                if(d.getYearOfAdopt() != null) {
                    cell.setCellValue(d.getYearOfAdopt());
                }
                cell = r.createCell(column);
                cell.setCellValue(d.getYearOfBirth());

            }
            writeFile(wb, filepath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(HSSFWorkbook wb, String filepath) throws IOException {

        FileOutputStream fileOut = new FileOutputStream(filepath);
        wb.write(fileOut);
        wb.close();
        fileOut.close();
    }
    

}
