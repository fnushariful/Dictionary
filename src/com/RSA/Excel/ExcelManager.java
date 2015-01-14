/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RSA.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author Sabuz
 */
public class ExcelManager implements ExcelConnection {
    
    @Override
    public List<DictionaryBean> getAllData()
    {
        List<DictionaryBean> db = new ArrayList<>();
        
        try
        {
            File file = new File("Dictionary.xls");
            FileInputStream fis = new FileInputStream(file);
            
            HSSFWorkbook wb = new HSSFWorkbook(fis);
            HSSFSheet sheet = wb.getSheetAt(0);
            
            Iterator<Row> row = sheet.iterator();
            
              while(row.hasNext())
              {
                Row temp = row.next();
                DictionaryBean dc = new DictionaryBean();
                dc.setEnglishWord(temp.getCell(0).getStringCellValue().trim());
                dc.setBanglaWord(temp.getCell(1).getStringCellValue().trim());
                dc.setPartsOfSpeech(temp.getCell(2).getStringCellValue().trim());
                db.add(dc);
              }
            
        }catch(Exception ex)
        {
            return db;
        }
        
        
        return db;
    }
    
   @Override 
   public void saveData(DictionaryBean db, int position)
   {
        try
        {
            File file = new File("Dictionary.xls");
            FileInputStream fis = new FileInputStream(file);
            
            HSSFWorkbook wb = new HSSFWorkbook(fis);
            HSSFSheet sheet = wb.getSheetAt(0);
            
              if(position == -1)
                  position = sheet.getLastRowNum() + 1;
              
             Row row = sheet.createRow(position);
             row.createCell(0).setCellValue(db.getEnglishWord());
             row.createCell(1).setCellValue(db.getBanglaword());
             row.createCell(2).setCellValue(db.getPartsOfSpeech());
             
             fis.close();
             
             FileOutputStream fos = new FileOutputStream(file);
             wb.write(fos);
             fos.close();
       
        }catch(Exception ex)
        {
       
        }
        
   }
   
}
