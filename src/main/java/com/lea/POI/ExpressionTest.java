package com.lea.POI;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExpressionTest {
	public static void main(String[] args) {

		FileOutputStream fileOut = null;
		try {
			// 创建一个工作薄
			HSSFWorkbook wb = new HSSFWorkbook();
			// 取得第一个sheet
			HSSFSheet sheet1 = wb.createSheet("test");
			// 取得第一个sheet的第一行
			HSSFRow row1 = sheet1.createRow(0);
			// 取得第一个sheet的第一行的第一个cell
			HSSFCell cell1 = row1.createCell(0);
			// 直接赋值
			cell1.setCellValue("10");

			// 取得第一个sheet的第一行的第二个cell
			HSSFCell cell2 = row1.createCell(2);

			// 设置计算式
			cell2.setCellFormula("A1 + 100");
			
			//cell.setCellType(CELL_TYPE_NUMERIC);

			// 设置强制执行再计算
			sheet1.setForceFormulaRecalculation(true);

			// 写入excel文件
			fileOut = new FileOutputStream("E://workbook.xls");
			wb.write(fileOut);
			fileOut.close();
		} catch (IOException io) {
			io.printStackTrace();
			System.out.println("erorr : " + io.getMessage());
		} finally {
			if (fileOut != null) {
				try {
					fileOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
