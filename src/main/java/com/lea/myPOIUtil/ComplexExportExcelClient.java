package com.lea.myPOIUtil;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

public class ComplexExportExcelClient {

	private static HSSFWorkbook wb = new HSSFWorkbook();

	private static HSSFSheet sheet = wb.createSheet("现金流量表");

	public static void main(String[] args) {
		String functionId = "e6d43a8a-e684-4961-84b8-78d1817c86da";
		String argumentId = "3ffc1af7-d4ef-4a43-9dab-d8ea70057b23";
		List<String> list = new ArrayList<String>();
		int startYear = 2014;
		int year = 10;

		// String sql = "select FIXED_ASSETS_ from EC_NEW_ARGUMENT"
		int[] years = new int[2 + year];

		// 通过开始年份和使用期限来生成一个年份数组
		for (int i = 0; i < years.length; i++) {
			years[i] = startYear++;
		}

		// 计算该报表的列数
		int number = 6 + year;

		sheet.setColumnWidth(0, 3000);
		sheet.setColumnWidth(1, 8000);
		sheet.setColumnWidth(2, 10000);
		sheet.setColumnWidth(3, 6000);
		// 给工作表列定义列宽(实际应用自己更改列数)
		for (int i = 3; i < number; i++) {
			sheet.setColumnWidth(i, 4000);
		}

		// 创建单元格样式
		HSSFCellStyle cellStyle = wb.createCellStyle();

		// 指定单元格居中对齐
		cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);

		// 指定单元格垂直居中对齐
		cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);

		// 指定当单元格内容显示不下时自动换行
		cellStyle.setWrapText(true);
		// 给单元格加上边框
		cellStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); // 下边框
		cellStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);// 左边框
		cellStyle.setBorderTop(HSSFCellStyle.BORDER_THIN);// 上边框
		cellStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);// 右边框

		// 设置单元格字体
		HSSFFont font = wb.createFont();
		font.setFontName("宋体");
		font.setFontHeight((short) 200);
		cellStyle.setFont(font);

		/**
		 * 表格的第一行，创建报表头部
		 */
		createNormalHead("配电网优化运行与故障自愈模块现金流量表", number);

		/**
		 * 表格的第二行
		 */
		HSSFRow row2 = sheet.createRow(1);
		HSSFCell cell2 = row2.createCell(10);
		// cell2.setCellStyle(cellStyle);
		cell2.setCellValue(new HSSFRichTextString("单位：元"));

		/**
		 * 表格的第三行到第五行
		 */
		HSSFRow row3 = sheet.createRow(2);
		HSSFCell cell3 = row3.createCell(0);
		// cell3.setCellStyle(cellStyle);
		cell3.setCellValue(new HSSFRichTextString("序号"));
		// 合并第一列的第三行到第五行
		// sheet.addMergedRegion(new Region(2, (short) 0, 4, (short)
		// 0));//过时了，用下面的方法代替
		sheet.addMergedRegion(new CellRangeAddress(2, 4, 0, 0));

		HSSFCell cell4 = row3.createCell(1);
		// cell4.setCellStyle(cellStyle);
		cell4.setCellValue(new HSSFRichTextString("项目"));
		// 合并第二列的第三行到第五行
		// sheet.addMergedRegion(new Region(2, (short) 1, 4, (short) 1));
		sheet.addMergedRegion(new CellRangeAddress(2, 4, 1, 1));

		HSSFCell cell5 = row3.createCell(2);
		// cell5.setCellStyle(cellStyle);
		cell5.setCellValue(new HSSFRichTextString("备注"));
		// 合并第三列的第三行到第五行
		sheet.addMergedRegion(new CellRangeAddress(2, 4, 2, 2));

		HSSFCell cell6 = row3.createCell(3);
		cell6.setCellValue(new HSSFRichTextString("合计"));
		// 合并第四列的第三行到第五行
		sheet.addMergedRegion(new CellRangeAddress(2, 4, 3, 3));

		HSSFCell cell7 = row3.createCell(5);
		cell7.setCellValue(new HSSFRichTextString("建设期"));

		HSSFCell cell8 = row3.createCell(6);
		cell8.setCellValue(new HSSFRichTextString("投产期"));
		// 合并第三行的第7列到第16列
		sheet.addMergedRegion(new CellRangeAddress(2, 2, 6, 15));

		HSSFCell cellYear;
		HSSFCell cellYearIndex;
		HSSFRow row4 = sheet.createRow(3);
		HSSFRow row5 = sheet.createRow(4);

		int z = 0;
		int l = 0;
		for (int i = 4; i < number; i++) {
			cellYear = row4.createCell(i);
			cellYearIndex = row5.createCell(i);
			cellYear.setCellValue(years[z++]);
			cellYearIndex.setCellValue(l++);
		}

		/**
		 * 表格的第六行
		 */
		HSSFRow row6 = sheet.createRow(5);
		HSSFCell cell9 = row6.createCell(1);
		cell9.setCellValue(new HSSFRichTextString("现金流入"));
		HSSFCell cell9_1 = row6.createCell(3);
		cell9_1.setCellFormula("SUM(F6:P6)");// 固定投资---------------------------------------------------------------
		/**
		 * 从第三年开始，10年里每年的选择设备后获得效益总和
		 */
		HSSFCell cell10 = row6.createCell(6);
		cell10.setCellFormula("SUM(G7:G13)");// 公式计算---------------------------------------------
		HSSFCell cell11 = row6.createCell(7);
		cell11.setCellFormula("SUM(H7:H13)");// 公式计算---------------------------------------------
		HSSFCell cell12 = row6.createCell(8);
		cell12.setCellFormula("SUM(I7:I13)");// 公式计算---------------------------------------------
		HSSFCell cell13 = row6.createCell(9);
		cell13.setCellFormula("SUM(J7:J13)");// 公式计算---------------------------------------------
		HSSFCell cell14 = row6.createCell(10);
		cell14.setCellFormula("SUM(K7:K13)");// 公式计算---------------------------------------------
		HSSFCell cell15 = row6.createCell(11);
		cell15.setCellFormula("SUM(L7:L13)");// 公式计算---------------------------------------------
		HSSFCell cell16 = row6.createCell(12);
		cell16.setCellFormula("SUM(M7:M13)");// 公式计算---------------------------------------------
		HSSFCell cell17 = row6.createCell(13);
		cell17.setCellFormula("SUM(N7:N13)");// 公式计算---------------------------------------------
		HSSFCell cell18 = row6.createCell(14);
		cell18.setCellFormula("SUM(O7:O13)");// 公式计算---------------------------------------------
		HSSFCell cell19 = row6.createCell(15);
		cell19.setCellFormula("SUM(P7:P13)");// 公式计算---------------------------------------------

		/*
		 * 回收固定资产余值的合计------------------------------------------------------------
		 * -----------
		 */

		/**
		 * 表格的第七行到第十四行，最后一行设置为回收固定资产的余值 技术：涉及到查询数据库还有数据是否每年不一样
		 */
		// HSSFRow line;
		// HSSFCell lineCell;
		// for(int i = 6; i <= 13; i++) {
		// line = sheet.createRow();
		// if(i == 13) {
		// /**
		// * 设置第十四行的序号后就continue;
		// */
		// continue;
		// }
		// }

		HSSFRow row7 = sheet.createRow(6);
		HSSFCell cell7_1 = row7.createCell(1);
		cell7_1.setCellValue(new HSSFRichTextString("降低网损效益"));
		HSSFCell cell7_2 = row7.createCell(2);
		cell7_2.setCellValue(new HSSFRichTextString("平均购电价格*购电量*网损率降低值"));
		HSSFCell cell7_3 = row7.createCell(3);
		cell7_3.setCellValue(2875014.259);
		HSSFCell cell7_6;
		for (int i = 6; i < 16; i++) {
			cell7_6 = row7.createCell(i);
			cell7_6.setCellValue(287501.4259);
		}

		HSSFRow row14 = sheet.createRow(13);
		HSSFCell cell14_1 = row14.createCell(1);
		cell14_1.setCellValue(new HSSFRichTextString("回收固定资产余值"));
		HSSFCell cell14_2 = row14.createCell(2);
		cell14_2.setCellValue(new HSSFRichTextString("按固定资产投资5%计取"));
		HSSFCell cell14_3 = row14.createCell(3);
		cell14_3.setCellFormula("SUM(F9:P9)");// 公式计算---------------------------------------------
		HSSFCell cell14_15 = row14.createCell(15);
		cell14_15.setCellFormula("D16*0.05");

		/**
		 * 表格的第十五行
		 */
		HSSFRow row15 = sheet.createRow(14);
		HSSFCell cell15_1 = row15.createCell(1);
		// cell15_1.setCellStyle(cellStyle);
		cell15_1.setCellValue(new HSSFRichTextString("现金流出"));
		HSSFCell cell15_2 = row15.createCell(3);
		// cell15_2.setCellStyle(cellStyle);
		cell15_2.setCellFormula("D16+D17");// 公式计算---------------------------------------------

		HSSFCell cell15_3 = row15.createCell(4);
		// cell15_3.setCellStyle(cellStyle);
		cell15_3.setCellFormula("E16+E17");// 公式计算---------------------------------------------
		HSSFCell cell15_4 = row15.createCell(5);
		// cell15_4.setCellStyle(cellStyle);
		cell15_4.setCellFormula("F16+F17");// 公式计算---------------------------------------------

		/**
		 * 10年里面的现金流出
		 */
		HSSFCell cell15_5 = row15.createCell(6);
		cell15_5.setCellFormula("G16+G17");
		// 公式计算---------------------------------------------
		HSSFCell cell15_6 = row15.createCell(7);
		cell15_6.setCellFormula("H16+H17");// 公式计算---------------------------------------------
		HSSFCell cell15_7 = row15.createCell(8);
		cell15_7.setCellFormula("I16+I17");// 公式计算---------------------------------------------
		HSSFCell cell15_8 = row15.createCell(9);
		cell15_8.setCellFormula("J16+J17");// 公式计算---------------------------------------------
		HSSFCell cell15_9 = row15.createCell(10);
		cell15_9.setCellFormula("K16+K17");// 公式计算---------------------------------------------
		HSSFCell cell15_10 = row15.createCell(11);
		cell15_10.setCellFormula("L16+L17");// 公式计算---------------------------------------------
		HSSFCell cell15_11 = row15.createCell(12);
		cell15_11.setCellFormula("M16+M17");// 公式计算---------------------------------------------
		HSSFCell cell15_12 = row15.createCell(13);
		cell15_12.setCellFormula("N16+N17");// 公式计算---------------------------------------------
		HSSFCell cell15_13 = row15.createCell(14);
		cell15_13.setCellFormula("O16+O17");// 公式计算---------------------------------------------
		HSSFCell cell15_14 = row15.createCell(15);
		cell15_14.setCellFormula("P16+P17");// 公式计算---------------------------------------------

		/**
		 * 表格的第十六行
		 */
		HSSFRow row16 = sheet.createRow(15);
		HSSFCell cell16_1 = row16.createCell(1);
		cell16_1.setCellValue(new HSSFRichTextString("配电网优化运行与故障自愈模块固定资产投资"));// 查询数据库--------------------------
		HSSFCell cell16_2 = row16.createCell(2);
		cell16_2.setCellValue(new HSSFRichTextString(
				"数据来源于《基于检测调控一体化技术职能配电设备示范与应用》课题任务书中的资本性支出+《示范工程关键技术及集成应用与示范》的资本性支出均摊）"));// 查询数据库--------------------------
		HSSFCell cell16_3 = row16.createCell(3);
		cell16_3.setCellValue(1650000);// 查询数据库--------------------------------------------
		HSSFCell cell16_4 = row16.createCell(4);
		cell16_4.setCellFormula("D16");// 查询数据库--------------------------------------------

		/**
		 * 表格的十七行
		 */
		HSSFRow row17 = sheet.createRow(16);
		HSSFCell cell17_1 = row17.createCell(1);
		cell17_1.setCellValue(new HSSFRichTextString("智能电网增量运维费用"));
		HSSFCell cell17_2 = row17.createCell(2);
		cell17_2.setCellValue(new HSSFRichTextString("取固定资产投资2%"));
		HSSFCell cell17_3 = row17.createCell(3);
		cell17_3.setCellFormula("SUM(F17:P17)");// 查询数据库--------------------------------------------
		/**
		 * 表格的第十七行10年的智能电网增量运维费用
		 */
		HSSFCell cell17T;
		for (int i = 0; i < year; i++) {
			cell17T = row17.createCell(6 + i);
			cell17T.setCellFormula("D16*0.02");
		}

		/**
		 * 表格的第十八行
		 */
		HSSFRow row18 = sheet.createRow(17);
		HSSFCell cell18_1 = row18.createCell(1);
		cell18_1.setCellValue(new HSSFRichTextString("净现金流量"));
		HSSFCell cell18_2 = row18.createCell(3);
		cell18_2.setCellFormula("D6-D15");
		
		// 查询数据库--------------------------------------
		HSSFCell cell18_3 = row18.createCell(4);
		cell18_3.setCellFormula("E6-E15");// 公式计算---------------------------------------------
		HSSFCell cell18_4 = row18.createCell(5);
		cell18_4.setCellFormula("F6-F15");// 公式计算---------------------------------------------

		/**
		 * 10年的净现金流量
		 */
		HSSFCell cell18_5 = row18.createCell(6);
		cell18_5.setCellFormula("G6-G15");// 公式计算---------------------------------------------
		HSSFCell cell18_6 = row18.createCell(7);
		cell18_6.setCellFormula("H6-H15");// 公式计算---------------------------------------------
		HSSFCell cell18_7 = row18.createCell(8);
		cell18_7.setCellFormula("I6-I15");// 公式计算---------------------------------------------
		HSSFCell cell18_8 = row18.createCell(9);
		cell18_8.setCellFormula("J6-J15");// 公式计算---------------------------------------------
		HSSFCell cell18_9 = row18.createCell(10);
		cell18_9.setCellFormula("K6-K15");// 公式计算---------------------------------------------
		HSSFCell cell18_10 = row18.createCell(11);
		cell18_10.setCellFormula("L6-L15");// 公式计算---------------------------------------------
		HSSFCell cell18_11 = row18.createCell(12);
		cell18_11.setCellFormula("M6-M15");// 公式计算---------------------------------------------
		HSSFCell cell18_12 = row18.createCell(13);
		cell18_12.setCellFormula("N6-N15");// 公式计算---------------------------------------------
		HSSFCell cell18_13 = row18.createCell(14);
		cell18_13.setCellFormula("O6-O15");// 公式计算---------------------------------------------
		HSSFCell cell18_14 = row18.createCell(15);
		cell18_14.setCellFormula("P6-P15");// 公式计算---------------------------------------------

		/**
		 * 表格的第十九行
		 */
		HSSFRow row19 = sheet.createRow(18);
		HSSFCell cell19_1 = row19.createCell(1);
		cell19_1.setCellValue(new HSSFRichTextString("累计净现金流量"));
		HSSFCell cell19_2 = row19.createCell(3);
		cell19_2.setCellFormula("SUM(F19:P19)");// 公式计算---------------------------------------------
		HSSFCell cell19_3 = row19.createCell(4);
		cell19_3.setCellFormula("E18");// 公式计算---------------------------------------------
		HSSFCell cell19_4 = row19.createCell(5);
		cell19_4.setCellFormula("F18+E19");// 公式计算---------------------------------------------

		/**
		 * 10年的累计净现金流量
		 */
		HSSFCell cell19_5 = row19.createCell(6);
		cell19_5.setCellFormula("G18+F19");// 公式计算---------------------------------------------
		HSSFCell cell19_6 = row19.createCell(7);
		cell19_6.setCellFormula("H18+G19");// 公式计算---------------------------------------------
		HSSFCell cell19_7 = row19.createCell(8);
		cell19_7.setCellFormula("I18+H19");// 公式计算---------------------------------------------
		HSSFCell cell19_8 = row19.createCell(9);
		cell19_8.setCellFormula("J18+I19");// 公式计算---------------------------------------------
		HSSFCell cell19_9 = row19.createCell(10);
		cell19_9.setCellFormula("K18+J19");// 公式计算---------------------------------------------
		HSSFCell cell19_10 = row19.createCell(11);
		cell19_10.setCellFormula("L18+K19");// 公式计算---------------------------------------------
		HSSFCell cell19_11 = row19.createCell(12);
		cell19_11.setCellFormula("M18+L19");// 公式计算---------------------------------------------
		HSSFCell cell19_12 = row19.createCell(13);
		cell19_12.setCellFormula("N18+M19");// 公式计算---------------------------------------------
		HSSFCell cell19_13 = row19.createCell(14);
		cell19_13.setCellFormula("O18+N19");// 公式计算---------------------------------------------
		HSSFCell cell19_14 = row19.createCell(15);
		cell19_14.setCellFormula("P18+O19");// 公式计算---------------------------------------------

		/**
		 * 表格的第二十行到第二十二行
		 */
		HSSFRow row20 = sheet.createRow(19);
		HSSFRow row21 = sheet.createRow(20);
		HSSFRow row22 = sheet.createRow(21);
		HSSFCell cell20_0 = row20.createCell(0);
		HSSFCell cell20 = row20.createCell(1);
		HSSFCell cell21 = row21.createCell(1);
		HSSFCell cell22 = row22.createCell(1);
		HSSFCell cell20_2 = row20.createCell(2);
		HSSFCell cell21_2 = row21.createCell(2);
		HSSFCell cell22_2 = row22.createCell(2);

		// cell20_0.setCellStyle(cellStyle);
		/*
		 * cell20.setCellStyle(cellStyle); cell21.setCellStyle(cellStyle);
		 * cell22.setCellStyle(cellStyle);
		 */
		cell20_0.setCellValue(new HSSFRichTextString("计算指标"));
		// 合并第一列的第二十行到第二十二行
		// sheet.addMergedRegion(new Region(19, (short) 0, 21, (short) 0));
		sheet.addMergedRegion(new CellRangeAddress(19, 21, 0, 0));
		cell20.setCellValue(new HSSFRichTextString("内部收益率"));
		cell20_2.setCellFormula("IRR(E18:P18)");
		cell21.setCellValue(new HSSFRichTextString("净现值"));
		cell21_2.setCellFormula("NPV(D24,E18:P18)");
		/*HSSFCell backYear;
		int backDay = 0;
		for(int o = 6; o <= 16; o++) {
			backYear = row19.getCell(o);
			System.out.println(backYear.getNumericCellValue());
			if((int)(backYear.getNumericCellValue()) > 0) {
				backDay = o - 1;
			}
		}*/
		
		cell22.setCellValue(new HSSFRichTextString("投资回收期"));
		cell22_2.setCellValue(3);// 可能需要导入生成的excel表格然后获取累计净现金流量为正的单元格---------------------------?-----------------------

		// 定义一个基准收益率单元格
		HSSFRow row24 = sheet.createRow(23);
		HSSFCell cell24C = row24.createCell(2);
		cell24C.setCellStyle(cellStyle);
		cell24C.setCellValue("基准收益率");
		HSSFCell cell24D = row24.createCell(3);

		/*
		 * for (Iterator<Row> rit = sheet.rowIterator(); rit.hasNext();) {
		 * //得到行对象 Row row = rit.next(); //根据行对象得到所有的单元格,遍历所有单元格 for
		 * (Iterator<Cell> cit = row.cellIterator(); cit.hasNext();) { //得到该单元格
		 * Cell cell = cit.next(); cell.setCellStyle(cellStyle); } } }
		 */

		/**
		 * 思路： 1，遍历整个表格； 2，获取每个单元格； 3，获取到为空值就new一个单元格对象； 4，获取到不为空值就直接套用边框格式.
		 */

		int tableCol = 16;
		int tableRow = 22;
		HSSFRow rowT;
		HSSFCell cellT;
		HSSFSheet sheetT = wb.getSheetAt(0);
		for (int i = 0; i < tableRow; i++) {
			/**
			 * 思路： 
			 * 1，获取这个工作表的行； 
			 * 2，如果行为空的话，就新建； 
			 * 3，新建了行后，就新建单元格；
			 * 4，给所有的单元格套上格式；
			 * 5，如果是6到21行，则再加上保留小数点两位
			 */
			
			if(i < 6 && i > 21) {
				if (sheetT.getRow(i) == null) {
					rowT = sheet.createRow(i);
					for (int m = 0; m < tableCol; m++) {
						if (rowT.getCell(m) == null) {
							cellT = rowT.createCell(m);
							cellT.setCellStyle(cellStyle);
						} else {
							cellT = rowT.getCell(m);
							cellT.setCellStyle(cellStyle);
						}
					}
				} else {
					for (int m = 0; m < tableCol; m++) {
						if (sheetT.getRow(i).getCell(m) == null) {
							cellT = sheetT.getRow(i).createCell(m);
							cellT.setCellStyle(cellStyle);
						} else {
							cellT = sheetT.getRow(i).getCell(m);
							cellT.setCellStyle(cellStyle);
						}
					}
				}
			}
			else {
				cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("0.00")); 
				if (sheetT.getRow(i) == null) {
					rowT = sheet.createRow(i);
					for (int m = 0; m < tableCol; m++) {
						if (rowT.getCell(m) == null) {
							cellT = rowT.createCell(m);
							cellT.setCellStyle(cellStyle);
						} else {
							cellT = rowT.getCell(m);
							cellT.setCellStyle(cellStyle);
						}
					}
				} else {
					for (int m = 0; m < tableCol; m++) {
						if (sheetT.getRow(i).getCell(m) == null) {
							cellT = sheetT.getRow(i).createCell(m);
							cellT.setCellStyle(cellStyle);
						} else {
							cellT = sheetT.getRow(i).getCell(m);
							cellT.setCellStyle(cellStyle);
						}
					}
				}
			}
		}

		HSSFCellStyle cellStylePercent = wb.createCellStyle();
		cellStylePercent.setDataFormat(HSSFDataFormat.getBuiltinFormat("0%"));
		cell24D.setCellStyle(cellStylePercent);// 查询数据库，需要用户输入的------------------------------------------------
		cell24D.setCellValue(0.07);
		
		// 设置表格强制计算
		sheet.setForceFormulaRecalculation(true);
		outputExcel("webapps//gedi//Dw_plugin//excel_Test", "show.xls");
	}

	public static void createNormalHead(String headString, int colSum) {
		HSSFRow row = sheet.createRow(0);

		// 设置第一行
		HSSFCell cell = row.createCell(0);
		row.setHeight((short) 400);

		// 定义单元格为字符串类型
		cell.setCellType(HSSFCell.ENCODING_UTF_16);
		cell.setCellValue(new HSSFRichTextString(headString));

		// 指定合并区域
		sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, (colSum - 1)));

		HSSFCellStyle cellStyle = wb.createCellStyle();

		cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 指定单元格居中对齐
		cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 指定单元格垂直居中对齐
		cellStyle.setWrapText(true);// 指定单元格自动换行

		// 设置单元格字体
		HSSFFont font = wb.createFont();
		font.setFontName("宋体");
		font.setFontHeight((short) 300);
		cellStyle.setFont(font);

		cell.setCellStyle(cellStyle);
	}

	public static void outputExcel(String folderName,
			String fileName) {
		File folder = new File(folderName);
		FileOutputStream file;
		if (folder.mkdirs()) {
			try {
				file = new FileOutputStream(new File(folder + "//" + fileName));
				System.out.println(new File(folder + "//" + fileName).getAbsolutePath());
				wb.write(file);
				file.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				file = new FileOutputStream(new File(folder + "//" + fileName));
				wb.write(file);
				file.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
