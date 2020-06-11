package com.lea.myIOUtils;

import java.io.File;
import java.io.FileWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONArray;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class XMLStrToFile {
	public static void main(String[] args) {
		String requestInfo = "<ItemInfo><ItemStatistics>商品统计</ItemStatistics><Items><Item><ItemName>iPhone</ItemName><ItemNum>3</ItemNum><ItemValue>1000000</ItemValue></Item></Items><Remark>配送</Remark></ItemInfo>";
		getPdfInfo(requestInfo);
	}

	private static String getPdfInfo(String requestInfo) {
		JSONArray array = new JSONArray();

		try {// 将文件保存到指定目录下
			String savePath = "D:/request.xml";
			FileWriter fw = new FileWriter(savePath);
			fw.write(requestInfo);
			fw.flush();
			fw.close();
			// 获取指定节点的内容
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();

			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new File(savePath));
			NodeList pdfInfo = doc.getElementsByTagName("ItemName");
			for (int i = 0; i < pdfInfo.getLength(); i++) {
				String itemName = pdfInfo.item(i).getTextContent();
				System.out.println(itemName);
				array.put(itemName);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return array.toString();
	}
}
