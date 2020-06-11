package com.lea.myJavaUtil;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) {
		String excelPath = "E:\\test.xls";
		
		
		Workbook workbook = null;
		try {
			// XSSFWorkbook used for .xslx (>= 2007), HSSWorkbook for 03 .xsl
			workbook = new XSSFWorkbook();// XSSFWorkbook();//WorkbookFactory.create(inputStream);
		} catch (Exception e) {
			System.out.println("创建Excel失败: ");
			e.printStackTrace();
		}
		if (workbook != null) {
			Sheet sheet = workbook.createSheet("测试数据");
			Row row0 = sheet.createRow(0);
			for (int i = 0; i < 6; i++) {
				Cell cell = row0.createCell(i, Cell.CELL_TYPE_STRING);
				cell.setCellValue("列标题" + i);
			}
			for (int rowNum = 1; rowNum < 10; rowNum++) {
				Row row = sheet.createRow(rowNum);
				for (int i = 0; i < 6; i++) {
					Cell cell = row.createCell(i, Cell.CELL_TYPE_STRING);
					cell.setCellValue("单元格" + String.valueOf(rowNum + 1)
							+ String.valueOf(i + 1));
				}
			}
			try {
				FileOutputStream outputStream = new FileOutputStream(excelPath);
				workbook.write(outputStream);
				outputStream.flush();
				outputStream.close();
			} catch (Exception e) {
				System.out.println("写入Excel失败: ");
				e.printStackTrace();
			}
		}
	}
}