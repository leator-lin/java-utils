package com.lea.POI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * 思路：
 * 1，创建一个excel文件；
 * 2，使用java操作excel文件写入数据，并且用单元格的公式计算；
 * @author c1053
 *
 */
public class CreateCells {
	public static void main(String[] args) throws IOException {
		try {
			FileOutputStream fileOut = new FileOutputStream("E://test.xls");
			HSSFWorkbook wb = new HSSFWorkbook();//创建工作簿
			HSSFSheet sheet = wb.createSheet("分模块现金流量表");
			sheet = wb.getSheetAt(0);
			HSSFRow row = sheet.createRow(0);
			row = sheet.getRow(1);
			HSSFCell cell = row.getCell(1);
			HSSFCellStyle cellStyle = cell.getCellStyle();
			cell.setCellValue("单元格内容");
			wb.write(fileOut);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
