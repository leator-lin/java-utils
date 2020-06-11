package com.lea.POI;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * 思路：
 * 1,生成一个excel文件，采用输出流；
 * 2,使用POI往这个文件写入数据
 * @author c1053
 *
 */
public class TestPOI {
	public static void main(String[] args) {
//		String sixBuf = "ROUND(AE6-AF6-AH6 -AG6,2)";
//		oneRow.getCell(6).setCellFormula(sixBuf.toString());
		//sheet.setForceFormulaRecalculation(true);
		//org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator.evaluate(org.apache.poi.ss.usermodel.Cell cell);
		//String sixBuf = "SUM(A1:A2)";
		try {
            HSSFWorkbook workbook= new HSSFWorkbook();
            HSSFSheet sheet= workbook.createSheet("test");
            HSSFCellStyle cellStyle = workbook.createCellStyle();
            cellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); // 下边框
            HSSFRow row0 = sheet.createRow(1);
            HSSFCell cell0 = row0.createCell(1);
            cell0.setCellValue(28);
            cell0.setCellStyle(cellStyle);
            cellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);// 上边框    		
            HSSFRow row1 = sheet.createRow(2);
    		HSSFCell cell1 = row1.createCell(2);
    		cell1.setCellValue(30);
            cell1.setCellStyle(cellStyle);
            FileOutputStream os = new FileOutputStream("E:\\fisrtExcel.xls");
            workbook.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ok");
    }
}
