package com.reporter.test.Tools;
//package cn.genomics.pdf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.format.CellNumberStringMod;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;


/**
 * xls工具�?
 * 
 * @author hjn
 * 
 */
public class XlsUtil_Folic {
	
	
	
	private static HashMap<String, String> consultValue1= new HashMap<String, String>();
	private static HashMap<String, String> consultValue2= new HashMap<String, String>();
	private static HashMap<String, String> consultValue3= new HashMap<String, String>();
	private static HashMap<String, String> consultValue4= new HashMap<String, String>();
	private static HashMap<String, String> consultValue5= new HashMap<String, String>();
	private static HashMap<String, String> consultValue6= new HashMap<String, String>();
	private static HashMap<String, String> consultValue7= new HashMap<String, String>();
	private static HashMap<String, String> consultValue8= new HashMap<String, String>();
	private static HashMap<String, String> consultValue9= new HashMap<String, String>();
	private static HashMap<String, String> consultValue10= new HashMap<String, String>();
	private static HashMap<String, String> consultValue11= new HashMap<String, String>();
	private static HashMap<String, String> consultValue12= new HashMap<String, String>();
	private static HashMap<String, String> consultValue13= new HashMap<String, String>();
	private static HashMap<String, String> consultValue14= new HashMap<String, String>();
	private static HashMap<String, String> consultValue15= new HashMap<String, String>();
	private static HashMap<String, String> consultValue16= new HashMap<String, String>();
	private static HashMap<String, String> consultValue17= new HashMap<String, String>();
	private static HashMap<String, String> consultValue18= new HashMap<String, String>();
	private static HashMap<String, String> consultValue19= new HashMap<String, String>();
	private static HashMap<String, String> consultValue20= new HashMap<String, String>();
	private static HashMap<String, String> consultValue21= new HashMap<String, String>();
	private static HashMap<String, String> consultValue22= new HashMap<String, String>();
	private static HashMap<String, String> consultValue23= new HashMap<String, String>();
	private static HashMap<String, String> consultValue24= new HashMap<String, String>();
	private static HashMap<String, String> consultValue25= new HashMap<String, String>();
	private static HashMap<String, String> consultValue26= new HashMap<String, String>();
	private static HashMap<String, String> consultValue27= new HashMap<String, String>();
	private static HashMap<String, String> consultValue28= new HashMap<String, String>();
	private static HashMap<String, String> consultValue29= new HashMap<String, String>();
	private static HashMap<String, String> consultValue30= new HashMap<String, String>();
	private static HashMap<String, String> consultValue31= new HashMap<String, String>();
	private static HashMap<String, String> consultValue32= new HashMap<String, String>();
	private static HashMap<String, String> consultValue33= new HashMap<String, String>();
	private static HashMap<String, String> consultValue34= new HashMap<String, String>();
	private static HashMap<String, String> consultValue35= new HashMap<String, String>();
	private static HashMap<String, String> consultValue36= new HashMap<String, String>();
	private static HashMap<String, String> consultValue37= new HashMap<String, String>();
	private static HashMap<String, String> consultValue38= new HashMap<String, String>();
	private static HashMap<String, String> consultValue39= new HashMap<String, String>();
	private static HashMap<String, String> consultValue40= new HashMap<String, String>();
	private static HashMap<String, String> consultValue41= new HashMap<String, String>();
	private static HashMap<String, String> consultValue42= new HashMap<String, String>();
	private static HashMap<String, String> consultValue43= new HashMap<String, String>();
	private static HashMap<String, String> consultValue44= new HashMap<String, String>();
	private static HashMap<String, String> consultValue45= new HashMap<String, String>();
	private static HashMap<String, String> consultValue46= new HashMap<String, String>();
	private static HashMap<String, String> consultValue47= new HashMap<String, String>();
	private static HashMap<String, String> consultValue48= new HashMap<String, String>();
	private static HashMap<String, String> consultValue49= new HashMap<String, String>();
	private static HashMap<String, String> consultValue50= new HashMap<String, String>();
	private static HashMap<String, String> consultValue51= new HashMap<String, String>();
	private static HashMap<String, String> consultValue52= new HashMap<String, String>();
	private static HashMap<String, String> consultValue53= new HashMap<String, String>();
	private static HashMap<String, String> consultValue54= new HashMap<String, String>();
	private static HashMap<String, String> consultValue55= new HashMap<String, String>();
	private static HashMap<String, String> consultValue56= new HashMap<String, String>();
	private static HashMap<String, String> consultValue57= new HashMap<String, String>();
	private static HashMap<String, String> consultValue58= new HashMap<String, String>();
	private static HashMap<String, String> consultValue59= new HashMap<String, String>();
	private static HashMap<String, String> consultValue60= new HashMap<String, String>();
	private static HashMap<String, String> consultValue61= new HashMap<String, String>();
	private static HashMap<String, String> consultValue62= new HashMap<String, String>();
	private static HashMap<String, String> consultValue63= new HashMap<String, String>();
	private static HashMap<String, String> consultValue64= new HashMap<String, String>();
	private static HashMap<String, String> consultValue65= new HashMap<String, String>();
	private static HashMap<String, String> consultValue66= new HashMap<String, String>();
	private static HashMap<String, String> consultValue67= new HashMap<String, String>();
	private static HashMap<String, String> consultValue68= new HashMap<String, String>();
	private static HashMap<String, String> consultValue69= new HashMap<String, String>();
	private static HashMap<String, String> consultValue70= new HashMap<String, String>();
	private static HashMap<String, String> consultValue71= new HashMap<String, String>();
	private static HashMap<String, String> consultValue72= new HashMap<String, String>();
	private static HashMap<String, String> consultValue73= new HashMap<String, String>();
	private static HashMap<String, String> consultValue74= new HashMap<String, String>();
	private static HashMap<String, String> consultValue75= new HashMap<String, String>();
	private static HashMap<String, String> consultValue76= new HashMap<String, String>();
	private static HashMap<String, String> consultValue77= new HashMap<String, String>();
	private static HashMap<String, String> consultValue78= new HashMap<String, String>();
	private static HashMap<String, String> consultValue79= new HashMap<String, String>();
	private static HashMap<String, String> consultValue80= new HashMap<String, String>();
	private static HashMap<String, String> consultValue81= new HashMap<String, String>();
	private static HashMap<String, String> consultValue82= new HashMap<String, String>();
	private static HashMap<String, String> consultValue83= new HashMap<String, String>();
	private static HashMap<String, String> consultValue84= new HashMap<String, String>();
	private static HashMap<String, String> consultValue85= new HashMap<String, String>();
	private static HashMap<String, String> consultValue86= new HashMap<String, String>();
	private static HashMap<String, String> consultValue87= new HashMap<String, String>();
	private static HashMap<String, String> consultValue88= new HashMap<String, String>();
	private static HashMap<String, String> consultValue89= new HashMap<String, String>();
	private static HashMap<String, String> consultValue90= new HashMap<String, String>();
	private static HashMap<String, String> consultValue91= new HashMap<String, String>();
	private static HashMap<String, String> consultValue92= new HashMap<String, String>();
	private static HashMap<String, String> consultValue93= new HashMap<String, String>();
	private static HashMap<String, String> consultValue94= new HashMap<String, String>();
	private static HashMap<String, String> consultValue95= new HashMap<String, String>();
	private static HashMap<String, String> consultValue96= new HashMap<String, String>();
	private static HashMap<String, String> consultValue97= new HashMap<String, String>();
	private static HashMap<String, String> consultValue98= new HashMap<String, String>();
	private static HashMap<String, String> consultValue99= new HashMap<String, String>();
	private static HashMap<String, String> consultValue100= new HashMap<String, String>();
	private static HashMap<String, String> consultValue101= new HashMap<String, String>();
	private static HashMap<String, String> consultValue102= new HashMap<String, String>();
	private static HashMap<String, String> consultValue103= new HashMap<String, String>();
	private static HashMap<String, String> consultValue104= new HashMap<String, String>();
	private static HashMap<String, String> consultValue105= new HashMap<String, String>();
	private static HashMap<String, String> consultValue106= new HashMap<String, String>();
	private static HashMap<String, String> consultValue107= new HashMap<String, String>();
	private static HashMap<String, String> consultValue108= new HashMap<String, String>();
	private static HashMap<String, String> consultValue109= new HashMap<String, String>();
	private static HashMap<String, String> consultValue110= new HashMap<String, String>();
	private static HashMap<String, String> consultValue111= new HashMap<String, String>();
	private static HashMap<String, String> consultValue112= new HashMap<String, String>();
	private static HashMap<String, String> consultValue113= new HashMap<String, String>();
	private static HashMap<String, String> consultValue114= new HashMap<String, String>();
	private static HashMap<String, String> consultValue115= new HashMap<String, String>();
	private static HashMap<String, String> consultValue116= new HashMap<String, String>();
	private static HashMap<String, String> consultValue117= new HashMap<String, String>();
	private static HashMap<String, String> consultValue118= new HashMap<String, String>();
	private static HashMap<String, String> consultValue119= new HashMap<String, String>();
	private static HashMap<String, String> consultValue120= new HashMap<String, String>();
	private static HashMap<String, String> consultValue121= new HashMap<String, String>();
	private static HashMap<String, String> consultValue122= new HashMap<String, String>();
	private static HashMap<String, String> consultValue123= new HashMap<String, String>();
	private static HashMap<String, String> consultValue124= new HashMap<String, String>();
	private static HashMap<String, String> consultValue125= new HashMap<String, String>();
	private static HashMap<String, String> consultValue126= new HashMap<String, String>();
	private static HashMap<String, String> consultValue127= new HashMap<String, String>();
	private static HashMap<String, String> consultValue128= new HashMap<String, String>();
	private static HashMap<String, String> consultValue129= new HashMap<String, String>();
	private static HashMap<String, String> consultValue130= new HashMap<String, String>();
	private static HashMap<String, String> consultValue131= new HashMap<String, String>();
	private static HashMap<String, String> consultValue132= new HashMap<String, String>();
	private static HashMap<String, String> consultValue133= new HashMap<String, String>();
	private static HashMap<String, String> consultValue134= new HashMap<String, String>();
	
	
	
    private static HashMap<String, String> config = new HashMap<String, String>();
	
	public static void readValue(String filePath) throws IOException {
		String fileType = filePath.substring(filePath.lastIndexOf(".") + 1,
				filePath.length());
		InputStream stream = new FileInputStream(filePath);
		Workbook wb = null;
		if (fileType.equals("xls")) {
			wb = new HSSFWorkbook(stream);
		} else if (fileType.equals("xlsx")) {
			wb = new XSSFWorkbook(stream);
		} else {
			System.out.println("您输入的excel格式不正确?");
		}
		
		
		Sheet sheet1 = wb.getSheetAt(0);
		for (Row row : sheet1) {
			if(row.getRowNum()==0)   //跳过首行title
			{
				continue;
			}
			
			Cell cell=row.getCell(3);
//			cell.setCellType(CellType.STRING);
			consultValue1.put(row.getCell(2).getStringCellValue(), cell.toString());
			
			cell=row.getCell(4);
//			cell.setCellType(CellType.STRING);
			consultValue2.put(row.getCell(2).getStringCellValue(), cell.toString());
			
			cell=row.getCell(5);
//			cell.setCellType(CellType.STRING);
			consultValue3.put(row.getCell(2).getStringCellValue(), cell.toString());
			
//			cell=row.getCell(4);
//			cell.setCellType(CellType.STRING);
//			consultValue4.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
//			cell=row.getCell(5);
//			cell.setCellType(CellType.STRING);
//			consultValue5.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			
			cell=row.getCell(6);
//			cell.setCellType(CellType.STRING);
			consultValue4.put(row.getCell(2).getStringCellValue(), cell.toString());
			
			cell=row.getCell(7);
			System.out.println(cell);
//			cell.setCellType(CellType.STRING);
			consultValue5.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(8);
//			cell.setCellType(CellType.STRING);
			consultValue6.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(9);
//			cell.setCellType(CellType.STRING);
			consultValue7.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(10);
//			cell.setCellType(CellType.STRING);
			consultValue8.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(11);
//			cell.setCellType(CellType.STRING);
			consultValue9.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(12);
//			cell.setCellType(CellType.STRING);
			consultValue10.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(13);
//			cell.setCellType(CellType.STRING);
			consultValue11.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(14);
//			cell.setCellType(CellType.STRING);
			consultValue12.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(15);
//			cell.setCellType(CellType.STRING);
			consultValue13.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(16);
//			cell.setCellType(CellType.STRING);
			consultValue14.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(17);
//			cell.setCellType(CellType.STRING);
			consultValue15.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(18);
//			cell.setCellType(CellType.STRING);
			consultValue16.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(19);
//			cell.setCellType(CellType.STRING);
			consultValue17.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(20);
//			cell.setCellType(CellType.STRING);
			consultValue18.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(21);
//			cell.setCellType(CellType.STRING);
			consultValue19.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(22);
//			cell.setCellType(CellType.STRING);
			consultValue20.put(row.getCell(2).getStringCellValue(), cell.toString());
			
			cell=row.getCell(23);
//			cell.setCellType(CellType.STRING);
			consultValue21.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(24);
//			cell.setCellType(CellType.STRING);
			consultValue22.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(25);
//			cell.setCellType(CellType.STRING);
			consultValue23.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(26);
//			cell.setCellType(CellType.STRING);
			consultValue24.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(27);
//			cell.setCellType(CellType.STRING);
			consultValue25.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(28);
//			cell.setCellType(CellType.STRING);
			consultValue26.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(29);
//			cell.setCellType(CellType.STRING);
			consultValue27.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(30);
//			cell.setCellType(CellType.STRING);
			consultValue28.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(31);
//			cell.setCellType(CellType.STRING);
			consultValue29.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(32);
//			cell.setCellType(CellType.STRING);
			consultValue30.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(33);
//			cell.setCellType(CellType.STRING);
			consultValue31.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(34);
//			cell.setCellType(CellType.STRING);
			consultValue32.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(35);
//			cell.setCellType(CellType.STRING);
			consultValue33.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(36);
//			cell.setCellType(CellType.STRING);
			consultValue34.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(37);
//			cell.setCellType(CellType.STRING);
			consultValue35.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(38);
//			cell.setCellType(CellType.STRING);
			consultValue36.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(39);
//			cell.setCellType(CellType.STRING);
			consultValue37.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(40);
//			cell.setCellType(CellType.STRING);
			consultValue38.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(41);
//			cell.setCellType(CellType.STRING);
			consultValue39.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(42);
//			cell.setCellType(CellType.STRING);
			consultValue40.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(43);
//			cell.setCellType(CellType.STRING);
			consultValue41.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(44);
//			cell.setCellType(CellType.STRING);
			consultValue42.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(45);
//			cell.setCellType(CellType.STRING);
			consultValue43.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(46);
//			cell.setCellType(CellType.STRING);
			consultValue44.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(47);
//			cell.setCellType(CellType.STRING);
			consultValue45.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(48);
//			cell.setCellType(CellType.STRING);
			consultValue46.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(49);
//			cell.setCellType(CellType.STRING);
			consultValue47.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(50);
//			cell.setCellType(CellType.STRING);
			consultValue48.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(51);
//			cell.setCellType(CellType.STRING);
			consultValue49.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(52);
//			cell.setCellType(CellType.STRING);
			consultValue50.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(53);
//			cell.setCellType(CellType.STRING);
			consultValue51.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(54);
//			cell.setCellType(CellType.STRING);
			consultValue52.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(55);
//			cell.setCellType(CellType.STRING);
			consultValue53.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(56);
//			cell.setCellType(CellType.STRING);
			consultValue54.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(57);
//			cell.setCellType(CellType.STRING);
			consultValue55.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(58);
//			cell.setCellType(CellType.STRING);
			consultValue56.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(59);
//			cell.setCellType(CellType.STRING);
			consultValue57.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(60);
//			cell.setCellType(CellType.STRING);
			consultValue58.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(61);
//			cell.setCellType(CellType.STRING);
			consultValue59.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(62);
//			cell.setCellType(CellType.STRING);
			consultValue60.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(63);
//			cell.setCellType(CellType.STRING);
			consultValue61.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(64);
//			cell.setCellType(CellType.STRING);
			consultValue62.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(65);
//			cell.setCellType(CellType.STRING);
			consultValue63.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(66);
//			cell.setCellType(CellType.STRING);
			consultValue64.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(67);
//			cell.setCellType(CellType.STRING);
			consultValue65.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(68);
//			cell.setCellType(CellType.STRING);
			consultValue66.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(69);
//			cell.setCellType(CellType.STRING);
			consultValue67.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(70);
//			cell.setCellType(CellType.STRING);
			consultValue68.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(71);
//			cell.setCellType(CellType.STRING);
			consultValue69.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(72);
//			cell.setCellType(CellType.STRING);
			consultValue70.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(73);
//			cell.setCellType(CellType.STRING);
			consultValue71.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(74);
//			cell.setCellType(CellType.STRING);
			consultValue72.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(75);
//			cell.setCellType(CellType.STRING);
			consultValue73.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(76);
//			cell.setCellType(CellType.STRING);
			consultValue74.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(77);
//			cell.setCellType(CellType.STRING);
			consultValue75.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(78);
//			cell.setCellType(CellType.STRING);
			consultValue76.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(79);
//			cell.setCellType(CellType.STRING);
			consultValue77.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(80);
//			cell.setCellType(CellType.STRING);
			consultValue78.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(81);
//			cell.setCellType(CellType.STRING);
			consultValue79.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(82);
//			cell.setCellType(CellType.STRING);
			consultValue80.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(83);
//			cell.setCellType(CellType.STRING);
			consultValue81.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(84);
//			cell.setCellType(CellType.STRING);
			consultValue82.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(85);
//			cell.setCellType(CellType.STRING);
			consultValue83.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(86);
//			cell.setCellType(CellType.STRING);
			consultValue84.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(87);
//			cell.setCellType(CellType.STRING);
			consultValue85.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(88);
//			cell.setCellType(CellType.STRING);
			consultValue86.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(89);
//			cell.setCellType(CellType.STRING);
			consultValue87.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(90);
//			cell.setCellType(CellType.STRING);
			consultValue88.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(91);
//			cell.setCellType(CellType.STRING);
			consultValue89.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(92);
//			cell.setCellType(CellType.STRING);
			consultValue90.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(93);
//			cell.setCellType(CellType.STRING);
			consultValue91.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(94);
//			cell.setCellType(CellType.STRING);
			consultValue92.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(95);
//			cell.setCellType(CellType.STRING);
			consultValue93.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(96);
//			cell.setCellType(CellType.STRING);
			consultValue94.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(97);
//			cell.setCellType(CellType.STRING);
			consultValue95.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(98);
//			cell.setCellType(CellType.STRING);
			consultValue96.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(99);
//			cell.setCellType(CellType.STRING);
			consultValue97.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(100);
//			cell.setCellType(CellType.STRING);
			consultValue98.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(101);
//			cell.setCellType(CellType.STRING);
			consultValue99.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(102);
//			cell.setCellType(CellType.STRING);
			consultValue100.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(103);
//			cell.setCellType(CellType.STRING);
			consultValue101.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(104);
//			cell.setCellType(CellType.STRING);
			consultValue102.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(105);
//			cell.setCellType(CellType.STRING);
			consultValue103.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(106);
//			cell.setCellType(CellType.STRING);
			consultValue104.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(107);
//			cell.setCellType(CellType.STRING);
			consultValue105.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(108);
//			cell.setCellType(CellType.STRING);
			consultValue106.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(109);
//			cell.setCellType(CellType.STRING);
			consultValue107.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(110);
//			cell.setCellType(CellType.STRING);
			consultValue108.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(111);
//			cell.setCellType(CellType.STRING);
			consultValue109.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(112);
//			cell.setCellType(CellType.STRING);
			consultValue110.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(113);
//			cell.setCellType(CellType.STRING);
			consultValue111.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(114);
//			cell.setCellType(CellType.STRING);
			consultValue112.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(115);
//			cell.setCellType(CellType.STRING);
			consultValue113.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(116);
//			cell.setCellType(CellType.STRING);
			consultValue114.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(117);
//			cell.setCellType(CellType.STRING);
			consultValue115.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(118);
//			cell.setCellType(CellType.STRING);
			consultValue116.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(119);
//			cell.setCellType(CellType.STRING);
			consultValue117.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(120);
//			cell.setCellType(CellType.STRING);
			consultValue118.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(121);
//			cell.setCellType(CellType.STRING);
			consultValue119.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(122);
//			cell.setCellType(CellType.STRING);
			consultValue120.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(123);
//			cell.setCellType(CellType.STRING);
			consultValue121.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(124);
//			cell.setCellType(CellType.STRING);
			consultValue122.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(125);
//			cell.setCellType(CellType.STRING);
			consultValue123.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(126);
//			cell.setCellType(CellType.STRING);
			consultValue124.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(127);
//			cell.setCellType(CellType.STRING);
			consultValue125.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(128);
//			cell.setCellType(CellType.STRING);
			consultValue126.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(129);
//			cell.setCellType(CellType.STRING);
			consultValue127.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(130);
//			cell.setCellType(CellType.STRING);
			consultValue128.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(131);
//			cell.setCellType(CellType.STRING);
			consultValue129.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(132);
//			cell.setCellType(CellType.STRING);
			consultValue130.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(133);
//			cell.setCellType(CellType.STRING);
			consultValue131.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(134);
//			cell.setCellType(CellType.STRING);
			consultValue132.put(row.getCell(2).getStringCellValue(), cell.toString());
			cell=row.getCell(135);
//			cell.setCellType(CellType.STRING);
			consultValue133.put(row.getCell(2).getStringCellValue(), cell.toString());

			cell=row.getCell(136);
//			cell.setCellType(CellType.STRING);
			consultValue134.put(row.getCell(2).getStringCellValue(), cell.toString());


		
		}

	}
	public static void readInfo(String filePath) throws IOException {
		String fileType = filePath.substring(filePath.lastIndexOf(".") + 1,
				filePath.length());
		InputStream stream = new FileInputStream(filePath);
		Workbook wb = null;
		if (fileType.equals("xls")) {
			wb = new HSSFWorkbook(stream);
		} else if (fileType.equals("xlsx")) {
			wb = new XSSFWorkbook(stream);
		} else {
			System.out.println("您输入的excel格式不对");
		}
		Sheet sheet1 = wb.getSheetAt(0);  //获得第一张表
		int inst_i=0,sam_i=0,get_i=0,name_i=0,sex_i=0,age_i=0,dec_i=0,samt_i=0,tel_i=0;
		
		
		BufferedWriter tmpfile = new BufferedWriter(new FileWriter(new File("pretreatment.xls")));
		for (Row row : sheet1) {
			if(row.getRowNum()==0)   //首行title处理
			{
				for (Cell cell : row) {
					if(cell.getStringCellValue().equals("送检单位"))
					{
						inst_i=cell.getColumnIndex();
					}
					else if(cell.getStringCellValue().equals("样本编号"))
					{
						sam_i=cell.getColumnIndex();
					}
					else if(cell.getStringCellValue().equals("采样日期"))
					{
						get_i=cell.getColumnIndex();
					}
					else if(cell.getStringCellValue().equals("受检者姓名") )
					{
						name_i=cell.getColumnIndex();
					}
					else if(cell.getStringCellValue().equals("受检者性别"))
					{
						sex_i=cell.getColumnIndex();
					}
					else if(cell.getStringCellValue().equals("出生日期"))
					{
						age_i=cell.getColumnIndex();
					}
					else if(cell.getStringCellValue().equals("检测日期"))
					{
						dec_i=cell.getColumnIndex();
					}
					else if(cell.getStringCellValue().equals("样本类型"))
					{
						samt_i=cell.getColumnIndex();
					}
					else if(cell.getStringCellValue().equals("联系电话"))
					{
						tel_i=cell.getColumnIndex();
					}
				}
				//tmpfile.write("NAME\tSEX\tAGE\tCODE\tCOLLECTION\tDETECTION\tHOSPITAL\tUMFA\t5-MTHF\tRESULT\tDOCTOR\tINSPECTOR\tDATE\n");
				tmpfile.write("NUM\tNAME\tSEX\tBIRTHDAY\tTEL\tCOMPANY\tTYPE\tSAMDATE\tINSPECTDAY\tV1\tV1_RESULT\tV2\tV2_RESULT\tV3\tV3_RESULT\tV4\tV4_RESULT\tV5\tV5_RESULT\tV6\tV6_RESULT\tV7\tV7_RESULT\tV8\tV8_RESULT\tV9\tV9_RESULT\tV10\tV10_RESULT\tV11\tV11_RESULT\tV12\tV12_RESULT\tV13\tV13_RESULT\tV14\tV14_RESULT\tV15\tV15_RESULT\tV16\tV16_RESULT\tV17\tV17_RESULT\tV18\tV18_RESULT\tV19\tV19_RESULT\tV20\tV20_RESULT\tV21\tV21_RESULT\tV22\tV22_RESULT\tV23\tV23_RESULT\tV24\tV24_RESULT\tV25\tV25_RESULT\tV26\tV26_RESULT\tV27\tV27_RESULT\tV28\tV28_RESULT\tV29\tV29_RESULT\tV30\tV30_RESULT\tV31\tV31_RESULT\tV32\tV32_RESULT\tV33\tV33_RESULT\tV34\tV34_RESULT\tV35\tV35_RESULT\tV36\tV36_RESULT\tV37\tV37_RESULT\tV38\tV38_RESULT\tV39\tV39_RESULT\tV40\tV40_RESULT\tV41\tV41_RESULT\tV42\tV42_RESULT\tV43\tV43_RESULT\tV44\tV44_RESULT\tV45\tV45_RESULT\tV46\tV46_RESULT\tV47\tV47_RESULT\tV48\tV48_RESULT\tV49\tV49_RESULT\tV50\tV50_RESULT\tV51\tV51_RESULT\tV52\tV52_RESULT\tV53\tV53_RESULT\tV54\tV54_RESULT\tV55\tV55_RESULT\tV56\tV56_RESULT\tV57\tV57_RESULT\tV58\tV58_RESULT\tV59\tV59_RESULT\tV60\tV60_RESULT\tV61\tV61_RESULT\tV62\tV62_RESULT\tV63\tV63_RESULT\tV64\tV64_RESULT\tV65\tV65_RESULT\tV66\tV66_RESULT\tV67\tV67_RESULT\tV68\tV68_RESULT\tV69\tV69_RESULT\tV70\tV70_RESULT\tV71\tV71_RESULT\tV72\tV72_RESULT\tV73\tV73_RESULT\tV74\tV74_RESULT\tV75\tV75_RESULT\tV76\tV76_RESULT\tV77\tV77_RESULT\tV78\tV78_RESULT\tV79\tV79_RESULT\tV80\tV80_RESULT\tV81\tV81_RESULT\tV82\tV82_RESULT\tV83\tV83_RESULT\tV84\tV84_RESULT\tV85\tV85_RESULT\tV86\tV86_RESULT\tV87\tV87_RESULT\tV88\tV88_RESULT\tV89\tV89_RESULT\tV90\tV90_RESULT\tV91\tV91_RESULT\tV92\tV92_RESULT\tV93\tV93_RESULT\tV94\tV94_RESULT\tV95\tV95_RESULT\tV96\tV96_RESULT\tV97\tV97_RESULT\tV98\tV98_RESULT\tV99\tV99_RESULT\tV100\tV100_RESULT\tV101\tV101_RESULT\tV102\tV102_RESULT\tV103\tV103_RESULT\tV104\tV104_RESULT\tV105\tV105_RESULT\tV106\tV106_RESULT\tV107\tV107_RESULT\tV108\tV108_RESULT\tV109\tV109_RESULT\tV110\tV110_RESULT\tV111\tV111_RESULT\tV112\tV112_RESULT\tV113\tV113_RESULT\tV114\tV114_RESULT\tV115\tV115_RESULT\tV116\tV116_RESULT\tV117\tV117_RESULT\tV118\tV118_RESULT\tV119\tV119_RESULT\tV120\tV120_RESULT\tV121\tV121_RESULT\tV122\tV122_RESULT\tV123\tV123_RESULT\tV124\tV124_RESULT\tV125\tV125_RESULT\tV126\tV126_RESULT\tV127\tV127_RESULT\tV128\tV128_RESULT\tV129\tV129_RESULT\tV130\tV130_RESULT\tV131\tV131_RESULT\tV132\tV132_RESULT\tV133\tV133_RESULT\tV134\tV134_RESULT\n");
				
				continue;
			}
			
			String val1=consultValue1.get(  row.getCell(sam_i).getStringCellValue());
			String val2=consultValue2.get(  row.getCell(sam_i).getStringCellValue());	
			String val3=consultValue3.get(  row.getCell(sam_i).getStringCellValue());
			String val4=consultValue4.get(  row.getCell(sam_i).getStringCellValue());
			String val5=consultValue5.get(  row.getCell(sam_i).getStringCellValue());
			String val6=consultValue6.get(  row.getCell(sam_i).getStringCellValue());
			String val7=consultValue7.get(  row.getCell(sam_i).getStringCellValue());
			String val8=consultValue8.get(  row.getCell(sam_i).getStringCellValue());
			String val9=consultValue9.get(  row.getCell(sam_i).getStringCellValue());
			String val10=consultValue10.get(  row.getCell(sam_i).getStringCellValue());
			String val11=consultValue11.get(  row.getCell(sam_i).getStringCellValue());
			String val12=consultValue12.get(  row.getCell(sam_i).getStringCellValue());
			String val13=consultValue13.get(  row.getCell(sam_i).getStringCellValue());
			String val14=consultValue14.get(  row.getCell(sam_i).getStringCellValue());
			String val15=consultValue15.get(  row.getCell(sam_i).getStringCellValue());
			String val16=consultValue16.get(  row.getCell(sam_i).getStringCellValue());
			String val17=consultValue17.get(  row.getCell(sam_i).getStringCellValue());
			String val18=consultValue18.get(  row.getCell(sam_i).getStringCellValue());
			String val19=consultValue19.get(  row.getCell(sam_i).getStringCellValue());
			String val20=consultValue20.get(  row.getCell(sam_i).getStringCellValue());
			String val21=consultValue21.get(  row.getCell(sam_i).getStringCellValue());
			String val22=consultValue22.get(  row.getCell(sam_i).getStringCellValue());
			String val23=consultValue23.get(  row.getCell(sam_i).getStringCellValue());
			String val24=consultValue24.get(  row.getCell(sam_i).getStringCellValue());
			String val25=consultValue25.get(  row.getCell(sam_i).getStringCellValue());
			String val26=consultValue26.get(  row.getCell(sam_i).getStringCellValue());
			String val27=consultValue27.get(  row.getCell(sam_i).getStringCellValue());
			String val28=consultValue28.get(  row.getCell(sam_i).getStringCellValue());
			String val29=consultValue29.get(  row.getCell(sam_i).getStringCellValue());
			String val30=consultValue30.get(  row.getCell(sam_i).getStringCellValue());
			String val31=consultValue31.get(  row.getCell(sam_i).getStringCellValue());
			String val32=consultValue32.get(  row.getCell(sam_i).getStringCellValue());
			String val33=consultValue33.get(  row.getCell(sam_i).getStringCellValue());
			String val34=consultValue34.get(  row.getCell(sam_i).getStringCellValue());
			String val35=consultValue35.get(  row.getCell(sam_i).getStringCellValue());
			String val36=consultValue36.get(  row.getCell(sam_i).getStringCellValue());
			String val37=consultValue37.get(  row.getCell(sam_i).getStringCellValue());
			String val38=consultValue38.get(  row.getCell(sam_i).getStringCellValue());
			String val39=consultValue39.get(  row.getCell(sam_i).getStringCellValue());
			String val40=consultValue40.get(  row.getCell(sam_i).getStringCellValue());
			String val41=consultValue41.get(  row.getCell(sam_i).getStringCellValue());
			String val42=consultValue42.get(  row.getCell(sam_i).getStringCellValue());
			String val43=consultValue43.get(  row.getCell(sam_i).getStringCellValue());
			String val44=consultValue44.get(  row.getCell(sam_i).getStringCellValue());
			String val45=consultValue45.get(  row.getCell(sam_i).getStringCellValue());
			String val46=consultValue46.get(  row.getCell(sam_i).getStringCellValue());
			String val47=consultValue47.get(  row.getCell(sam_i).getStringCellValue());
			String val48=consultValue48.get(  row.getCell(sam_i).getStringCellValue());
			String val49=consultValue49.get(  row.getCell(sam_i).getStringCellValue());
			String val50=consultValue50.get(  row.getCell(sam_i).getStringCellValue());
			String val51=consultValue51.get(  row.getCell(sam_i).getStringCellValue());
			String val52=consultValue52.get(  row.getCell(sam_i).getStringCellValue());
			String val53=consultValue53.get(  row.getCell(sam_i).getStringCellValue());
			String val54=consultValue54.get(  row.getCell(sam_i).getStringCellValue());
			String val55=consultValue55.get(  row.getCell(sam_i).getStringCellValue());
			String val56=consultValue56.get(  row.getCell(sam_i).getStringCellValue());
			String val57=consultValue57.get(  row.getCell(sam_i).getStringCellValue());
			String val58=consultValue58.get(  row.getCell(sam_i).getStringCellValue());
			String val59=consultValue59.get(  row.getCell(sam_i).getStringCellValue());
			String val60=consultValue60.get(  row.getCell(sam_i).getStringCellValue());
			String val61=consultValue61.get(  row.getCell(sam_i).getStringCellValue());
			String val62=consultValue62.get(  row.getCell(sam_i).getStringCellValue());
			String val63=consultValue63.get(  row.getCell(sam_i).getStringCellValue());
			String val64=consultValue64.get(  row.getCell(sam_i).getStringCellValue());
			String val65=consultValue65.get(  row.getCell(sam_i).getStringCellValue());
			String val66=consultValue66.get(  row.getCell(sam_i).getStringCellValue());
			String val67=consultValue67.get(  row.getCell(sam_i).getStringCellValue());
			String val68=consultValue68.get(  row.getCell(sam_i).getStringCellValue());
			String val69=consultValue69.get(  row.getCell(sam_i).getStringCellValue());
			String val70=consultValue70.get(  row.getCell(sam_i).getStringCellValue());
			String val71=consultValue71.get(  row.getCell(sam_i).getStringCellValue());
			String val72=consultValue72.get(  row.getCell(sam_i).getStringCellValue());
			String val73=consultValue73.get(  row.getCell(sam_i).getStringCellValue());
			String val74=consultValue74.get(  row.getCell(sam_i).getStringCellValue());
			String val75=consultValue75.get(  row.getCell(sam_i).getStringCellValue());
			String val76=consultValue76.get(  row.getCell(sam_i).getStringCellValue());
			String val77=consultValue77.get(  row.getCell(sam_i).getStringCellValue());
			String val78=consultValue78.get(  row.getCell(sam_i).getStringCellValue());
			String val79=consultValue79.get(  row.getCell(sam_i).getStringCellValue());
			String val80=consultValue80.get(  row.getCell(sam_i).getStringCellValue());
			String val81=consultValue81.get(  row.getCell(sam_i).getStringCellValue());
			String val82=consultValue82.get(  row.getCell(sam_i).getStringCellValue());
			String val83=consultValue83.get(  row.getCell(sam_i).getStringCellValue());
			String val84=consultValue84.get(  row.getCell(sam_i).getStringCellValue());
			String val85=consultValue85.get(  row.getCell(sam_i).getStringCellValue());
			String val86=consultValue86.get(  row.getCell(sam_i).getStringCellValue());
			String val87=consultValue87.get(  row.getCell(sam_i).getStringCellValue());
			String val88=consultValue88.get(  row.getCell(sam_i).getStringCellValue());
			String val89=consultValue89.get(  row.getCell(sam_i).getStringCellValue());
			String val90=consultValue90.get(  row.getCell(sam_i).getStringCellValue());
			String val91=consultValue91.get(  row.getCell(sam_i).getStringCellValue());
			String val92=consultValue92.get(  row.getCell(sam_i).getStringCellValue());
			String val93=consultValue93.get(  row.getCell(sam_i).getStringCellValue());
			String val94=consultValue94.get(  row.getCell(sam_i).getStringCellValue());
			String val95=consultValue95.get(  row.getCell(sam_i).getStringCellValue());
			String val96=consultValue96.get(  row.getCell(sam_i).getStringCellValue());
			String val97=consultValue97.get(  row.getCell(sam_i).getStringCellValue());
			String val98=consultValue98.get(  row.getCell(sam_i).getStringCellValue());
			String val99=consultValue99.get(  row.getCell(sam_i).getStringCellValue());
			String val100=consultValue100.get(  row.getCell(sam_i).getStringCellValue());
			String val101=consultValue101.get(  row.getCell(sam_i).getStringCellValue());
			String val102=consultValue102.get(  row.getCell(sam_i).getStringCellValue());
			String val103=consultValue103.get(  row.getCell(sam_i).getStringCellValue());
			String val104=consultValue104.get(  row.getCell(sam_i).getStringCellValue());
			String val105=consultValue105.get(  row.getCell(sam_i).getStringCellValue());
			String val106=consultValue106.get(  row.getCell(sam_i).getStringCellValue());
			String val107=consultValue107.get(  row.getCell(sam_i).getStringCellValue());
			String val108=consultValue108.get(  row.getCell(sam_i).getStringCellValue());
			String val109=consultValue109.get(  row.getCell(sam_i).getStringCellValue());
			String val110=consultValue110.get(  row.getCell(sam_i).getStringCellValue());
			String val111=consultValue111.get(  row.getCell(sam_i).getStringCellValue());
			String val112=consultValue112.get(  row.getCell(sam_i).getStringCellValue());
			String val113=consultValue113.get(  row.getCell(sam_i).getStringCellValue());
			String val114=consultValue114.get(  row.getCell(sam_i).getStringCellValue());
			String val115=consultValue115.get(  row.getCell(sam_i).getStringCellValue());
			String val116=consultValue116.get(  row.getCell(sam_i).getStringCellValue());
			String val117=consultValue117.get(  row.getCell(sam_i).getStringCellValue());
			String val118=consultValue118.get(  row.getCell(sam_i).getStringCellValue());
			String val119=consultValue119.get(  row.getCell(sam_i).getStringCellValue());
			String val120=consultValue120.get(  row.getCell(sam_i).getStringCellValue());
			String val121=consultValue121.get(  row.getCell(sam_i).getStringCellValue());
			String val122=consultValue122.get(  row.getCell(sam_i).getStringCellValue());
			String val123=consultValue123.get(  row.getCell(sam_i).getStringCellValue());
			String val124=consultValue124.get(  row.getCell(sam_i).getStringCellValue());
			String val125=consultValue125.get(  row.getCell(sam_i).getStringCellValue());
			String val126=consultValue126.get(  row.getCell(sam_i).getStringCellValue());
			String val127=consultValue127.get(  row.getCell(sam_i).getStringCellValue());
			String val128=consultValue128.get(  row.getCell(sam_i).getStringCellValue());
			String val129=consultValue129.get(  row.getCell(sam_i).getStringCellValue());
			String val130=consultValue130.get(  row.getCell(sam_i).getStringCellValue());
			String val131=consultValue131.get(  row.getCell(sam_i).getStringCellValue());
			String val132=consultValue132.get(  row.getCell(sam_i).getStringCellValue());
			String val133=consultValue133.get(  row.getCell(sam_i).getStringCellValue());
			String val134=consultValue134.get(  row.getCell(sam_i).getStringCellValue());
			
			
			String result1 = config.get("NORMAL_NORMAL");
			String result2 = config.get("NORMAL_NORMAL");
			String result3 = config.get("NORMAL_NORMAL");
			String result4 = config.get("NORMAL_NORMAL");
			String result5 = config.get("NORMAL_NORMAL");
			String result6 = config.get("NORMAL_NORMAL");
			String result7 = config.get("NORMAL_NORMAL");
			String result8 = config.get("NORMAL_NORMAL");
			String result9 = config.get("NORMAL_NORMAL");
			String result10 = config.get("NORMAL_NORMAL");
			String result11 = config.get("NORMAL_NORMAL");
			String result12 = config.get("NORMAL_NORMAL");
			String result13 = config.get("NORMAL_NORMAL");
			String result14 = config.get("NORMAL_NORMAL");
			String result15 = config.get("NORMAL_NORMAL");
			String result16 = config.get("NORMAL_NORMAL");
			String result17 = config.get("NORMAL_NORMAL");
			String result18 = config.get("NORMAL_NORMAL");
			String result19 = config.get("NORMAL_NORMAL");
			String result20 = config.get("NORMAL_NORMAL");
			String result21 = config.get("NORMAL_NORMAL");
			String result22 = config.get("NORMAL_NORMAL");
			String result23 = config.get("NORMAL_NORMAL");
			String result24 = config.get("NORMAL_NORMAL");
			String result25 = config.get("NORMAL_NORMAL");
			String result26 = config.get("NORMAL_NORMAL");
			String result27 = config.get("NORMAL_NORMAL");
			String result28 = config.get("NORMAL_NORMAL");
			String result29 = config.get("NORMAL_NORMAL");
			String result30 = config.get("NORMAL_NORMAL");
			String result31 = config.get("NORMAL_NORMAL");
			String result32 = config.get("NORMAL_NORMAL");
			String result33 = config.get("NORMAL_NORMAL");
			String result34 = config.get("NORMAL_NORMAL");
			String result35 = config.get("NORMAL_NORMAL");
			String result36 = config.get("NORMAL_NORMAL");
			String result37 = config.get("NORMAL_NORMAL");
			String result38 = config.get("NORMAL_NORMAL");
			String result39 = config.get("NORMAL_NORMAL");
			String result40 = config.get("NORMAL_NORMAL");
			String result41 = config.get("NORMAL_NORMAL");
			String result42 = config.get("NORMAL_NORMAL");
			String result43 = config.get("NORMAL_NORMAL");
			String result44 = config.get("NORMAL_NORMAL");
			String result45 = config.get("NORMAL_NORMAL");
			String result46 = config.get("NORMAL_NORMAL");
			String result47 = config.get("NORMAL_NORMAL");
			String result48 = config.get("NORMAL_NORMAL");
			String result49 = config.get("NORMAL_NORMAL");
			String result50 = config.get("NORMAL_NORMAL");
			String result51 = config.get("NORMAL_NORMAL");
			String result52 = config.get("NORMAL_NORMAL");
			String result53 = config.get("NORMAL_NORMAL");
			String result54 = config.get("NORMAL_NORMAL");
			String result55 = config.get("NORMAL_NORMAL");
			String result56 = config.get("NORMAL_NORMAL");
			String result57 = config.get("NORMAL_NORMAL");
			String result58 = config.get("NORMAL_NORMAL");
			String result59 = config.get("NORMAL_NORMAL");
			String result60 = config.get("NORMAL_NORMAL");
			String result61 = config.get("NORMAL_NORMAL");
			String result62 = config.get("NORMAL_NORMAL");
			String result63 = config.get("NORMAL_NORMAL");
			String result64 = config.get("NORMAL_NORMAL");
			String result65 = config.get("NORMAL_NORMAL");
			String result66 = config.get("NORMAL_NORMAL");
			String result67 = config.get("NORMAL_NORMAL");
			String result68 = config.get("NORMAL_NORMAL");
			String result69 = config.get("NORMAL_NORMAL");
			String result70 = config.get("NORMAL_NORMAL");
			String result71 = config.get("NORMAL_NORMAL");
			String result72 = config.get("NORMAL_NORMAL");
			String result73 = config.get("NORMAL_NORMAL");
			String result74 = config.get("NORMAL_NORMAL");
			String result75 = config.get("NORMAL_NORMAL");
			String result76 = config.get("NORMAL_NORMAL");
			String result77 = config.get("NORMAL_NORMAL");
			String result78 = config.get("NORMAL_NORMAL");
			String result79 = config.get("NORMAL_NORMAL");
			String result80 = config.get("NORMAL_NORMAL");
			String result81 = config.get("NORMAL_NORMAL");
			String result82 = config.get("NORMAL_NORMAL");
			String result83 = config.get("NORMAL_NORMAL");
			String result84 = config.get("NORMAL_NORMAL");
			String result85 = config.get("NORMAL_NORMAL");
			String result86 = config.get("NORMAL_NORMAL");
			String result87 = config.get("NORMAL_NORMAL");
			String result88 = config.get("NORMAL_NORMAL");
			String result89 = config.get("NORMAL_NORMAL");
			String result90 = config.get("NORMAL_NORMAL");
			String result91 = config.get("NORMAL_NORMAL");
			String result92 = config.get("NORMAL_NORMAL");
			String result93 = config.get("NORMAL_NORMAL");
			String result94 = config.get("NORMAL_NORMAL");
			String result95 = config.get("NORMAL_NORMAL");
			String result96 = config.get("NORMAL_NORMAL");
			String result97 = config.get("NORMAL_NORMAL");
			String result98 = config.get("NORMAL_NORMAL");
			String result99 = config.get("NORMAL_NORMAL");
			String result100 = config.get("NORMAL_NORMAL");
			String result101 = config.get("NORMAL_NORMAL");
			String result102 = config.get("NORMAL_NORMAL");
			String result103 = config.get("NORMAL_NORMAL");
			String result104 = config.get("NORMAL_NORMAL");
			String result105 = config.get("NORMAL_NORMAL");
			String result106 = config.get("NORMAL_NORMAL");
			String result107 = config.get("NORMAL_NORMAL");
			String result108 = config.get("NORMAL_NORMAL");
			String result109 = config.get("NORMAL_NORMAL");
			String result110 = config.get("NORMAL_NORMAL");
			String result111 = config.get("NORMAL_NORMAL");
			String result112 = config.get("NORMAL_NORMAL");
			String result113 = config.get("NORMAL_NORMAL");
			String result114 = config.get("NORMAL_NORMAL");
			String result115 = config.get("NORMAL_NORMAL");
			String result116 = config.get("NORMAL_NORMAL");
			String result117 = config.get("NORMAL_NORMAL");
			String result118 = config.get("NORMAL_NORMAL");
			String result119 = config.get("NORMAL_NORMAL");
			String result120 = config.get("NORMAL_NORMAL");
			String result121 = config.get("NORMAL_NORMAL");
			String result122 = config.get("NORMAL_NORMAL");
			String result123 = config.get("NORMAL_NORMAL");
			String result124 = config.get("NORMAL_NORMAL");
			String result125 = config.get("NORMAL_NORMAL");
			String result126 = config.get("NORMAL_NORMAL");
			String result127 = config.get("NORMAL_NORMAL");
			String result128 = config.get("NORMAL_NORMAL");
			String result129 = config.get("NORMAL_NORMAL");
			String result130 = config.get("NORMAL_NORMAL");
			String result131 = config.get("NORMAL_NORMAL");
			String result132 = config.get("NORMAL_NORMAL");
			String result133 = config.get("NORMAL_NORMAL");
			String result134 = config.get("NORMAL_NORMAL");
			
//			System.out.println(val1);
//			System.out.println(val2);
//			System.out.println(val3);
//			System.out.println(val4);
//			System.out.println(val5);
//			System.out.println(val6);
//			System.out.println(val7);
//			System.out.println(val8);
//			System.out.println(val9);
//			System.out.println(val10);
//			System.out.println(val11);
//			System.out.println(val12);
//			System.out.println(val13);
//			System.out.println(val14);
//			System.out.println(val15);
//			System.out.println(val16);
//			System.out.println(val17);
//			System.out.println(val18);
//			System.out.println(val19);
//			System.out.println(val20);
//			System.out.println(val21);
//			System.out.println(val22);
//			System.out.println(val23);
//			System.out.println(val24);
			
			
			
			

			if((Double.valueOf( val1 )   > Double.valueOf(config.get("REF1")))){result1=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val2 )   > Double.valueOf(config.get("REF2")))){result2=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val3 )   > Double.valueOf(config.get("REF3")))){result3=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val4 )   > Double.valueOf(config.get("REF4")))){result4=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val5 )   > Double.valueOf(config.get("REF5")))){result5=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val6 )   > Double.valueOf(config.get("REF6")))){result6=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val7 )   > Double.valueOf(config.get("REF7")))){result7=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val8 )   > Double.valueOf(config.get("REF8")))){result8=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val9 )   > Double.valueOf(config.get("REF9")))){result9=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val10 )   > Double.valueOf(config.get("REF10")))){result10=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val11 )   > Double.valueOf(config.get("REF11")))){result11=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val12 )   > Double.valueOf(config.get("REF12")))){result12=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val13 )   > Double.valueOf(config.get("REF13")))){result13=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val14 )   > Double.valueOf(config.get("REF14")))){result14=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val15 )   > Double.valueOf(config.get("REF15")))){result15=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val16 )   > Double.valueOf(config.get("REF16")))){result16=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val17 )   > Double.valueOf(config.get("REF17")))){result17=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val18 )   > Double.valueOf(config.get("REF18")))){result18=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val19 )   > Double.valueOf(config.get("REF19")))){result19=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val20 )   > Double.valueOf(config.get("REF20")))){result20=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val21 )   > Double.valueOf(config.get("REF21")))){result21=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val22 )   > Double.valueOf(config.get("REF22")))){result22=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val23 )   > Double.valueOf(config.get("REF23")))){result23=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val24 )   > Double.valueOf(config.get("REF24")))){result24=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val25 )   > Double.valueOf(config.get("REF25")))){result25=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val26 )   > Double.valueOf(config.get("REF26")))){result26=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val27 )   > Double.valueOf(config.get("REF27")))){result27=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val28 )   > Double.valueOf(config.get("REF28")))){result28=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val29 )   > Double.valueOf(config.get("REF29")))){result29=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val30 )   > Double.valueOf(config.get("REF30")))){result30=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val31 )   > Double.valueOf(config.get("REF31")))){result31=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val32 )   > Double.valueOf(config.get("REF32")))){result32=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val33 )   > Double.valueOf(config.get("REF33")))){result33=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val34 )   > Double.valueOf(config.get("REF34")))){result34=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val35 )   > Double.valueOf(config.get("REF35")))){result35=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val36 )   > Double.valueOf(config.get("REF36")))){result36=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val37 )   > Double.valueOf(config.get("REF37")))){result37=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val38 )   > Double.valueOf(config.get("REF38")))){result38=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val39 )   > Double.valueOf(config.get("REF39")))){result39=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val40 )   > Double.valueOf(config.get("REF40")))){result40=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val41 )   > Double.valueOf(config.get("REF41")))){result41=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val42 )   > Double.valueOf(config.get("REF42")))){result42=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val43 )   > Double.valueOf(config.get("REF43")))){result43=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val44 )   > Double.valueOf(config.get("REF44")))){result44=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val45 )   > Double.valueOf(config.get("REF45")))){result45=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val46 )   > Double.valueOf(config.get("REF46")))){result46=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val47 )   > Double.valueOf(config.get("REF47")))){result47=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val48 )   > Double.valueOf(config.get("REF48")))){result48=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val49 )   > Double.valueOf(config.get("REF49")))){result49=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val50 )   > Double.valueOf(config.get("REF50")))){result50=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val51 )   > Double.valueOf(config.get("REF51")))){result51=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val52 )   > Double.valueOf(config.get("REF52")))){result52=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val53 )   > Double.valueOf(config.get("REF53")))){result53=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val54 )   > Double.valueOf(config.get("REF54")))){result54=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val55 )   > Double.valueOf(config.get("REF55")))){result55=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val56 )   > Double.valueOf(config.get("REF56")))){result56=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val57 )   > Double.valueOf(config.get("REF57")))){result57=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val58 )   > Double.valueOf(config.get("REF58")))){result58=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val59 )   > Double.valueOf(config.get("REF59")))){result59=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val60 )   > Double.valueOf(config.get("REF60")))){result60=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val61 )   > Double.valueOf(config.get("REF61")))){result61=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val62 )   > Double.valueOf(config.get("REF62")))){result62=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val63 )   > Double.valueOf(config.get("REF63")))){result63=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val64 )   > Double.valueOf(config.get("REF64")))){result64=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val65 )   > Double.valueOf(config.get("REF65")))){result65=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val66 )   > Double.valueOf(config.get("REF66")))){result66=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val67 )   > Double.valueOf(config.get("REF67")))){result67=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val68 )   > Double.valueOf(config.get("REF68")))){result68=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val69 )   > Double.valueOf(config.get("REF69")))){result69=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val70 )   > Double.valueOf(config.get("REF70")))){result70=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val71 )   > Double.valueOf(config.get("REF71")))){result71=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val72 )   > Double.valueOf(config.get("REF72")))){result72=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val73 )   > Double.valueOf(config.get("REF73")))){result73=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val74 )   > Double.valueOf(config.get("REF74")))){result74=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val75 )   > Double.valueOf(config.get("REF75")))){result75=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val76 )   > Double.valueOf(config.get("REF76")))){result76=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val77 )   > Double.valueOf(config.get("REF77")))){result77=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val78 )   > Double.valueOf(config.get("REF78")))){result78=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val79 )   > Double.valueOf(config.get("REF79")))){result79=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val80 )   > Double.valueOf(config.get("REF80")))){result80=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val81 )   > Double.valueOf(config.get("REF81")))){result81=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val82 )   > Double.valueOf(config.get("REF82")))){result82=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val83 )   > Double.valueOf(config.get("REF83")))){result83=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val84 )   > Double.valueOf(config.get("REF84")))){result84=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val85 )   > Double.valueOf(config.get("REF85")))){result85=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val86 )   > Double.valueOf(config.get("REF86")))){result86=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val87 )   > Double.valueOf(config.get("REF87")))){result87=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val88 )   > Double.valueOf(config.get("REF88")))){result88=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val89 )   > Double.valueOf(config.get("REF89")))){result89=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val90 )   > Double.valueOf(config.get("REF90")))){result90=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val91 )   > Double.valueOf(config.get("REF91")))){result91=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val92 )   > Double.valueOf(config.get("REF92")))){result92=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val93 )   > Double.valueOf(config.get("REF93")))){result93=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val94 )   > Double.valueOf(config.get("REF94")))){result94=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val95 )   > Double.valueOf(config.get("REF95")))){result95=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val96 )   > Double.valueOf(config.get("REF96")))){result96=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val97 )   > Double.valueOf(config.get("REF97")))){result97=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val98 )   > Double.valueOf(config.get("REF98")))){result98=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val99 )   > Double.valueOf(config.get("REF99")))){result99=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val100 )   > Double.valueOf(config.get("REF100")))){result100=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val101 )   > Double.valueOf(config.get("REF101")))){result101=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val102 )   > Double.valueOf(config.get("REF102")))){result102=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val103 )   > Double.valueOf(config.get("REF103")))){result103=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val104 )   > Double.valueOf(config.get("REF104")))){result104=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val105 )   > Double.valueOf(config.get("REF105")))){result105=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val106 )   > Double.valueOf(config.get("REF106")))){result106=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val107 )   > Double.valueOf(config.get("REF107")))){result107=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val108 )   > Double.valueOf(config.get("REF108")))){result108=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val109 )   > Double.valueOf(config.get("REF109")))){result109=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val110 )   > Double.valueOf(config.get("REF110")))){result110=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val111 )   > Double.valueOf(config.get("REF111")))){result111=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val112 )   > Double.valueOf(config.get("REF112")))){result112=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val113 )   > Double.valueOf(config.get("REF113")))){result113=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val114 )   > Double.valueOf(config.get("REF114")))){result114=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val115 )   > Double.valueOf(config.get("REF115")))){result115=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val116 )   > Double.valueOf(config.get("REF116")))){result116=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val117 )   > Double.valueOf(config.get("REF117")))){result117=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val118 )   > Double.valueOf(config.get("REF118")))){result118=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val119 )   > Double.valueOf(config.get("REF119")))){result119=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val120 )   > Double.valueOf(config.get("REF120")))){result120=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val121 )   > Double.valueOf(config.get("REF121")))){result121=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val122 )   > Double.valueOf(config.get("REF122")))){result122=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val123 )   > Double.valueOf(config.get("REF123")))){result123=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val124 )   > Double.valueOf(config.get("REF124")))){result124=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val125 )   > Double.valueOf(config.get("REF125")))){result125=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val126 )   > Double.valueOf(config.get("REF126")))){result126=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val127 )   > Double.valueOf(config.get("REF127")))){result127=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val128 )   > Double.valueOf(config.get("REF128")))){result128=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val129 )   > Double.valueOf(config.get("REF129")))){result129=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val130 )   > Double.valueOf(config.get("REF130")))){result130=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val131 )   > Double.valueOf(config.get("REF131")))){result131=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val132 )   > Double.valueOf(config.get("REF132")))){result132=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val133 )   > Double.valueOf(config.get("REF133")))){result133=config.get("HIGH_NORMAL");}
			if((Double.valueOf( val134 )   > Double.valueOf(config.get("REF134")))){result134=config.get("HIGH_NORMAL");}
			
			
			
			if((Double.valueOf( val1 )   < Double.valueOf(config.get("REFL1")))){result1=config.get("LOW_NORMAL");}
			if((Double.valueOf( val2 )   < Double.valueOf(config.get("REFL2")))){result2=config.get("LOW_NORMAL");}
			if((Double.valueOf( val3 )   < Double.valueOf(config.get("REFL3")))){result3=config.get("LOW_NORMAL");}
			if((Double.valueOf( val4 )   < Double.valueOf(config.get("REFL4")))){result4=config.get("LOW_NORMAL");}
			if((Double.valueOf( val5 )   < Double.valueOf(config.get("REFL5")))){result5=config.get("LOW_NORMAL");}
			if((Double.valueOf( val6 )   < Double.valueOf(config.get("REFL6")))){result6=config.get("LOW_NORMAL");}
			if((Double.valueOf( val7 )   < Double.valueOf(config.get("REFL7")))){result7=config.get("LOW_NORMAL");}
			if((Double.valueOf( val8 )   < Double.valueOf(config.get("REFL8")))){result8=config.get("LOW_NORMAL");}
			if((Double.valueOf( val9 )   < Double.valueOf(config.get("REFL9")))){result9=config.get("LOW_NORMAL");}
			if((Double.valueOf( val10 )   < Double.valueOf(config.get("REFL10")))){result10=config.get("LOW_NORMAL");}
			if((Double.valueOf( val11 )   < Double.valueOf(config.get("REFL11")))){result11=config.get("LOW_NORMAL");}
			if((Double.valueOf( val12 )   < Double.valueOf(config.get("REFL12")))){result12=config.get("LOW_NORMAL");}
			if((Double.valueOf( val13 )   < Double.valueOf(config.get("REFL13")))){result13=config.get("LOW_NORMAL");}
			if((Double.valueOf( val14 )   < Double.valueOf(config.get("REFL14")))){result14=config.get("LOW_NORMAL");}
			if((Double.valueOf( val15 )   < Double.valueOf(config.get("REFL15")))){result15=config.get("LOW_NORMAL");}
			if((Double.valueOf( val16 )   < Double.valueOf(config.get("REFL16")))){result16=config.get("LOW_NORMAL");}
			if((Double.valueOf( val17 )   < Double.valueOf(config.get("REFL17")))){result17=config.get("LOW_NORMAL");}
			if((Double.valueOf( val18 )   < Double.valueOf(config.get("REFL18")))){result18=config.get("LOW_NORMAL");}
			if((Double.valueOf( val19 )   < Double.valueOf(config.get("REFL19")))){result19=config.get("LOW_NORMAL");}
			if((Double.valueOf( val20 )   < Double.valueOf(config.get("REFL20")))){result20=config.get("LOW_NORMAL");}
			if((Double.valueOf( val21 )   < Double.valueOf(config.get("REFL21")))){result21=config.get("LOW_NORMAL");}
			if((Double.valueOf( val22 )   < Double.valueOf(config.get("REFL22")))){result22=config.get("LOW_NORMAL");}
			if((Double.valueOf( val23 )   < Double.valueOf(config.get("REFL23")))){result23=config.get("LOW_NORMAL");}
			if((Double.valueOf( val24 )   < Double.valueOf(config.get("REFL24")))){result24=config.get("LOW_NORMAL");}
			if((Double.valueOf( val25 )   < Double.valueOf(config.get("REFL25")))){result25=config.get("LOW_NORMAL");}
			if((Double.valueOf( val26 )   < Double.valueOf(config.get("REFL26")))){result26=config.get("LOW_NORMAL");}
			if((Double.valueOf( val27 )   < Double.valueOf(config.get("REFL27")))){result27=config.get("LOW_NORMAL");}
			if((Double.valueOf( val28 )   < Double.valueOf(config.get("REFL28")))){result28=config.get("LOW_NORMAL");}
			if((Double.valueOf( val29 )   < Double.valueOf(config.get("REFL29")))){result29=config.get("LOW_NORMAL");}
			if((Double.valueOf( val30 )   < Double.valueOf(config.get("REFL30")))){result30=config.get("LOW_NORMAL");}
			if((Double.valueOf( val31 )   < Double.valueOf(config.get("REFL31")))){result31=config.get("LOW_NORMAL");}
			if((Double.valueOf( val32 )   < Double.valueOf(config.get("REFL32")))){result32=config.get("LOW_NORMAL");}
			if((Double.valueOf( val33 )   < Double.valueOf(config.get("REFL33")))){result33=config.get("LOW_NORMAL");}
			if((Double.valueOf( val34 )   < Double.valueOf(config.get("REFL34")))){result34=config.get("LOW_NORMAL");}
			if((Double.valueOf( val35 )   < Double.valueOf(config.get("REFL35")))){result35=config.get("LOW_NORMAL");}
			if((Double.valueOf( val36 )   < Double.valueOf(config.get("REFL36")))){result36=config.get("LOW_NORMAL");}
			if((Double.valueOf( val37 )   < Double.valueOf(config.get("REFL37")))){result37=config.get("LOW_NORMAL");}
			if((Double.valueOf( val38 )   < Double.valueOf(config.get("REFL38")))){result38=config.get("LOW_NORMAL");}
			if((Double.valueOf( val39 )   < Double.valueOf(config.get("REFL39")))){result39=config.get("LOW_NORMAL");}
			if((Double.valueOf( val40 )   < Double.valueOf(config.get("REFL40")))){result40=config.get("LOW_NORMAL");}
			if((Double.valueOf( val41 )   < Double.valueOf(config.get("REFL41")))){result41=config.get("LOW_NORMAL");}
			if((Double.valueOf( val42 )   < Double.valueOf(config.get("REFL42")))){result42=config.get("LOW_NORMAL");}
			if((Double.valueOf( val43 )   < Double.valueOf(config.get("REFL43")))){result43=config.get("LOW_NORMAL");}
			if((Double.valueOf( val44 )   < Double.valueOf(config.get("REFL44")))){result44=config.get("LOW_NORMAL");}
			if((Double.valueOf( val45 )   < Double.valueOf(config.get("REFL45")))){result45=config.get("LOW_NORMAL");}
			if((Double.valueOf( val46 )   < Double.valueOf(config.get("REFL46")))){result46=config.get("LOW_NORMAL");}
			if((Double.valueOf( val47 )   < Double.valueOf(config.get("REFL47")))){result47=config.get("LOW_NORMAL");}
			if((Double.valueOf( val48 )   < Double.valueOf(config.get("REFL48")))){result48=config.get("LOW_NORMAL");}
			if((Double.valueOf( val49 )   < Double.valueOf(config.get("REFL49")))){result49=config.get("LOW_NORMAL");}
			if((Double.valueOf( val50 )   < Double.valueOf(config.get("REFL50")))){result50=config.get("LOW_NORMAL");}
			if((Double.valueOf( val51 )   < Double.valueOf(config.get("REFL51")))){result51=config.get("LOW_NORMAL");}
			if((Double.valueOf( val52 )   < Double.valueOf(config.get("REFL52")))){result52=config.get("LOW_NORMAL");}
			if((Double.valueOf( val53 )   < Double.valueOf(config.get("REFL53")))){result53=config.get("LOW_NORMAL");}
			if((Double.valueOf( val54 )   < Double.valueOf(config.get("REFL54")))){result54=config.get("LOW_NORMAL");}
			if((Double.valueOf( val55 )   < Double.valueOf(config.get("REFL55")))){result55=config.get("LOW_NORMAL");}
			if((Double.valueOf( val56 )   < Double.valueOf(config.get("REFL56")))){result56=config.get("LOW_NORMAL");}
			if((Double.valueOf( val57 )   < Double.valueOf(config.get("REFL57")))){result57=config.get("LOW_NORMAL");}
			if((Double.valueOf( val58 )   < Double.valueOf(config.get("REFL58")))){result58=config.get("LOW_NORMAL");}
			if((Double.valueOf( val59 )   < Double.valueOf(config.get("REFL59")))){result59=config.get("LOW_NORMAL");}
			if((Double.valueOf( val60 )   < Double.valueOf(config.get("REFL60")))){result60=config.get("LOW_NORMAL");}
			if((Double.valueOf( val61 )   < Double.valueOf(config.get("REFL61")))){result61=config.get("LOW_NORMAL");}
			if((Double.valueOf( val62 )   < Double.valueOf(config.get("REFL62")))){result62=config.get("LOW_NORMAL");}
			if((Double.valueOf( val63 )   < Double.valueOf(config.get("REFL63")))){result63=config.get("LOW_NORMAL");}
			if((Double.valueOf( val64 )   < Double.valueOf(config.get("REFL64")))){result64=config.get("LOW_NORMAL");}
			if((Double.valueOf( val65 )   < Double.valueOf(config.get("REFL65")))){result65=config.get("LOW_NORMAL");}
			if((Double.valueOf( val66 )   < Double.valueOf(config.get("REFL66")))){result66=config.get("LOW_NORMAL");}
			if((Double.valueOf( val67 )   < Double.valueOf(config.get("REFL67")))){result67=config.get("LOW_NORMAL");}
			if((Double.valueOf( val68 )   < Double.valueOf(config.get("REFL68")))){result68=config.get("LOW_NORMAL");}
			if((Double.valueOf( val69 )   < Double.valueOf(config.get("REFL69")))){result69=config.get("LOW_NORMAL");}
			if((Double.valueOf( val70 )   < Double.valueOf(config.get("REFL70")))){result70=config.get("LOW_NORMAL");}
			if((Double.valueOf( val71 )   < Double.valueOf(config.get("REFL71")))){result71=config.get("LOW_NORMAL");}
			if((Double.valueOf( val72 )   < Double.valueOf(config.get("REFL72")))){result72=config.get("LOW_NORMAL");}
			if((Double.valueOf( val73 )   < Double.valueOf(config.get("REFL73")))){result73=config.get("LOW_NORMAL");}
			if((Double.valueOf( val74 )   < Double.valueOf(config.get("REFL74")))){result74=config.get("LOW_NORMAL");}
			if((Double.valueOf( val75 )   < Double.valueOf(config.get("REFL75")))){result75=config.get("LOW_NORMAL");}
			if((Double.valueOf( val76 )   < Double.valueOf(config.get("REFL76")))){result76=config.get("LOW_NORMAL");}
			if((Double.valueOf( val77 )   < Double.valueOf(config.get("REFL77")))){result77=config.get("LOW_NORMAL");}
			if((Double.valueOf( val78 )   < Double.valueOf(config.get("REFL78")))){result78=config.get("LOW_NORMAL");}
			if((Double.valueOf( val79 )   < Double.valueOf(config.get("REFL79")))){result79=config.get("LOW_NORMAL");}
			if((Double.valueOf( val80 )   < Double.valueOf(config.get("REFL80")))){result80=config.get("LOW_NORMAL");}
			if((Double.valueOf( val81 )   < Double.valueOf(config.get("REFL81")))){result81=config.get("LOW_NORMAL");}
			if((Double.valueOf( val82 )   < Double.valueOf(config.get("REFL82")))){result82=config.get("LOW_NORMAL");}
			if((Double.valueOf( val83 )   < Double.valueOf(config.get("REFL83")))){result83=config.get("LOW_NORMAL");}
			if((Double.valueOf( val84 )   < Double.valueOf(config.get("REFL84")))){result84=config.get("LOW_NORMAL");}
			if((Double.valueOf( val85 )   < Double.valueOf(config.get("REFL85")))){result85=config.get("LOW_NORMAL");}
			if((Double.valueOf( val86 )   < Double.valueOf(config.get("REFL86")))){result86=config.get("LOW_NORMAL");}
			if((Double.valueOf( val87 )   < Double.valueOf(config.get("REFL87")))){result87=config.get("LOW_NORMAL");}
			if((Double.valueOf( val88 )   < Double.valueOf(config.get("REFL88")))){result88=config.get("LOW_NORMAL");}
			if((Double.valueOf( val89 )   < Double.valueOf(config.get("REFL89")))){result89=config.get("LOW_NORMAL");}
			if((Double.valueOf( val90 )   < Double.valueOf(config.get("REFL90")))){result90=config.get("LOW_NORMAL");}
			if((Double.valueOf( val91 )   < Double.valueOf(config.get("REFL91")))){result91=config.get("LOW_NORMAL");}
			if((Double.valueOf( val92 )   < Double.valueOf(config.get("REFL92")))){result92=config.get("LOW_NORMAL");}
			if((Double.valueOf( val93 )   < Double.valueOf(config.get("REFL93")))){result93=config.get("LOW_NORMAL");}
			if((Double.valueOf( val94 )   < Double.valueOf(config.get("REFL94")))){result94=config.get("LOW_NORMAL");}
			if((Double.valueOf( val95 )   < Double.valueOf(config.get("REFL95")))){result95=config.get("LOW_NORMAL");}
			if((Double.valueOf( val96 )   < Double.valueOf(config.get("REFL96")))){result96=config.get("LOW_NORMAL");}
			if((Double.valueOf( val97 )   < Double.valueOf(config.get("REFL97")))){result97=config.get("LOW_NORMAL");}
			if((Double.valueOf( val98 )   < Double.valueOf(config.get("REFL98")))){result98=config.get("LOW_NORMAL");}
			if((Double.valueOf( val99 )   < Double.valueOf(config.get("REFL99")))){result99=config.get("LOW_NORMAL");}
			if((Double.valueOf( val100 )   < Double.valueOf(config.get("REFL100")))){result100=config.get("LOW_NORMAL");}
			if((Double.valueOf( val101 )   < Double.valueOf(config.get("REFL101")))){result101=config.get("LOW_NORMAL");}
			if((Double.valueOf( val102 )   < Double.valueOf(config.get("REFL102")))){result102=config.get("LOW_NORMAL");}
			if((Double.valueOf( val103 )   < Double.valueOf(config.get("REFL103")))){result103=config.get("LOW_NORMAL");}
			if((Double.valueOf( val104 )   < Double.valueOf(config.get("REFL104")))){result104=config.get("LOW_NORMAL");}
			if((Double.valueOf( val105 )   < Double.valueOf(config.get("REFL105")))){result105=config.get("LOW_NORMAL");}
			if((Double.valueOf( val106 )   < Double.valueOf(config.get("REFL106")))){result106=config.get("LOW_NORMAL");}
			if((Double.valueOf( val107 )   < Double.valueOf(config.get("REFL107")))){result107=config.get("LOW_NORMAL");}
			if((Double.valueOf( val108 )   < Double.valueOf(config.get("REFL108")))){result108=config.get("LOW_NORMAL");}
			if((Double.valueOf( val109 )   < Double.valueOf(config.get("REFL109")))){result109=config.get("LOW_NORMAL");}
			if((Double.valueOf( val110 )   < Double.valueOf(config.get("REFL110")))){result110=config.get("LOW_NORMAL");}
			if((Double.valueOf( val111 )   < Double.valueOf(config.get("REFL111")))){result111=config.get("LOW_NORMAL");}
			if((Double.valueOf( val112 )   < Double.valueOf(config.get("REFL112")))){result112=config.get("LOW_NORMAL");}
			if((Double.valueOf( val113 )   < Double.valueOf(config.get("REFL113")))){result113=config.get("LOW_NORMAL");}
			if((Double.valueOf( val114 )   < Double.valueOf(config.get("REFL114")))){result114=config.get("LOW_NORMAL");}
			if((Double.valueOf( val115 )   < Double.valueOf(config.get("REFL115")))){result115=config.get("LOW_NORMAL");}
			if((Double.valueOf( val116 )   < Double.valueOf(config.get("REFL116")))){result116=config.get("LOW_NORMAL");}
			if((Double.valueOf( val117 )   < Double.valueOf(config.get("REFL117")))){result117=config.get("LOW_NORMAL");}
			if((Double.valueOf( val118 )   < Double.valueOf(config.get("REFL118")))){result118=config.get("LOW_NORMAL");}
			if((Double.valueOf( val119 )   < Double.valueOf(config.get("REFL119")))){result119=config.get("LOW_NORMAL");}
			if((Double.valueOf( val120 )   < Double.valueOf(config.get("REFL120")))){result120=config.get("LOW_NORMAL");}
			if((Double.valueOf( val121 )   < Double.valueOf(config.get("REFL121")))){result121=config.get("LOW_NORMAL");}
			if((Double.valueOf( val122 )   < Double.valueOf(config.get("REFL122")))){result122=config.get("LOW_NORMAL");}
			if((Double.valueOf( val123 )   < Double.valueOf(config.get("REFL123")))){result123=config.get("LOW_NORMAL");}
			if((Double.valueOf( val124 )   < Double.valueOf(config.get("REFL124")))){result124=config.get("LOW_NORMAL");}
			if((Double.valueOf( val125 )   < Double.valueOf(config.get("REFL125")))){result125=config.get("LOW_NORMAL");}
			if((Double.valueOf( val126 )   < Double.valueOf(config.get("REFL126")))){result126=config.get("LOW_NORMAL");}
			if((Double.valueOf( val127 )   < Double.valueOf(config.get("REFL127")))){result127=config.get("LOW_NORMAL");}
			if((Double.valueOf( val128 )   < Double.valueOf(config.get("REFL128")))){result128=config.get("LOW_NORMAL");}
			if((Double.valueOf( val129 )   < Double.valueOf(config.get("REFL129")))){result129=config.get("LOW_NORMAL");}
			if((Double.valueOf( val130 )   < Double.valueOf(config.get("REFL130")))){result130=config.get("LOW_NORMAL");}
			if((Double.valueOf( val131 )   < Double.valueOf(config.get("REFL131")))){result131=config.get("LOW_NORMAL");}
			if((Double.valueOf( val132 )   < Double.valueOf(config.get("REFL132")))){result132=config.get("LOW_NORMAL");}
			if((Double.valueOf( val133 )   < Double.valueOf(config.get("REFL133")))){result133=config.get("LOW_NORMAL");}
			if((Double.valueOf( val134 )   < Double.valueOf(config.get("REFL134")))){result134=config.get("LOW_NORMAL");}
			
			
			row.getCell(sam_i).setCellType(CellType.STRING);
			row.getCell(name_i).setCellType(CellType.STRING);
			row.getCell(sex_i).setCellType(CellType.STRING);
			row.getCell(age_i).setCellType(CellType.STRING);
			row.getCell(tel_i).setCellType(CellType.STRING);
			row.getCell(inst_i).setCellType(CellType.STRING);
			row.getCell(samt_i).setCellType(CellType.STRING);
			row.getCell(get_i).setCellType(CellType.STRING);
			row.getCell(dec_i).setCellType(CellType.STRING);
			//tmpfile.write("NUM\tNAME\tSEX\tBIRTHDAY\tTEL\tCOMPANY\tTYPE\tSAMDATE\tINSPECTDAY\tRS\tRS_RESULT\tDS\tDS_RESULT\tJS\tJS_RESULT");
			tmpfile.write(String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
					row.getCell(sam_i).getStringCellValue(),
					row.getCell(name_i).getStringCellValue(),
					row.getCell(sex_i).getStringCellValue(),
					row.getCell(age_i).getStringCellValue(),
					row.getCell(tel_i).getStringCellValue(),
					row.getCell(inst_i).getStringCellValue(),
					row.getCell(samt_i).getStringCellValue(),
					row.getCell(get_i).getStringCellValue(),
                    row.getCell(dec_i).getStringCellValue(),
					consultValue1.get(  row.getCell(sam_i).getStringCellValue()),
					result1,
					consultValue2.get(  row.getCell(sam_i).getStringCellValue()),
					result2,
					consultValue3.get(  row.getCell(sam_i).getStringCellValue()),
					result3,
					consultValue4.get(  row.getCell(sam_i).getStringCellValue()),
					result4,
					consultValue5.get(  row.getCell(sam_i).getStringCellValue()),
					result5,
					consultValue6.get(  row.getCell(sam_i).getStringCellValue()),
					result6,
					consultValue7.get(  row.getCell(sam_i).getStringCellValue()),
					result7,
					consultValue8.get(  row.getCell(sam_i).getStringCellValue()),
					result8,
					consultValue9.get(  row.getCell(sam_i).getStringCellValue()),
					result9,
					consultValue10.get(  row.getCell(sam_i).getStringCellValue()),
					result10,
					consultValue11.get(  row.getCell(sam_i).getStringCellValue()),
					result11,
					consultValue12.get(  row.getCell(sam_i).getStringCellValue()),
					result12,
					consultValue13.get(  row.getCell(sam_i).getStringCellValue()),
					result13,
					consultValue14.get(  row.getCell(sam_i).getStringCellValue()),
					result14,
					consultValue15.get(  row.getCell(sam_i).getStringCellValue()),
					result15,
					consultValue16.get(  row.getCell(sam_i).getStringCellValue()),
					result16,
					consultValue17.get(  row.getCell(sam_i).getStringCellValue()),
					result17,
					consultValue18.get(  row.getCell(sam_i).getStringCellValue()),
					result18,
					consultValue19.get(  row.getCell(sam_i).getStringCellValue()),
					result19,
					consultValue20.get(  row.getCell(sam_i).getStringCellValue()),
					result20,
					consultValue21.get(  row.getCell(sam_i).getStringCellValue()),
					result21,
					consultValue22.get(  row.getCell(sam_i).getStringCellValue()),
					result22,
					consultValue23.get(  row.getCell(sam_i).getStringCellValue()),
					result23,
					consultValue24.get(  row.getCell(sam_i).getStringCellValue()),
					result24,
					consultValue25.get(  row.getCell(sam_i).getStringCellValue()),
					result25,
					consultValue26.get(  row.getCell(sam_i).getStringCellValue()),
					result26,
					consultValue27.get(  row.getCell(sam_i).getStringCellValue()),
					result27,
					consultValue28.get(  row.getCell(sam_i).getStringCellValue()),
					result28,
					consultValue29.get(  row.getCell(sam_i).getStringCellValue()),
					result29,
					consultValue30.get(  row.getCell(sam_i).getStringCellValue()),
					result30,
					consultValue31.get(  row.getCell(sam_i).getStringCellValue()),
					result31,
					consultValue32.get(  row.getCell(sam_i).getStringCellValue()),
					result32,
					consultValue33.get(  row.getCell(sam_i).getStringCellValue()),
					result33,
					consultValue34.get(  row.getCell(sam_i).getStringCellValue()),
					result34,
					consultValue35.get(  row.getCell(sam_i).getStringCellValue()),
					result35,
					consultValue36.get(  row.getCell(sam_i).getStringCellValue()),
					result36,
					consultValue37.get(  row.getCell(sam_i).getStringCellValue()),
					result37,
					consultValue38.get(  row.getCell(sam_i).getStringCellValue()),
					result38,
					consultValue39.get(  row.getCell(sam_i).getStringCellValue()),
					result39,
					consultValue40.get(  row.getCell(sam_i).getStringCellValue()),
					result40,
					consultValue41.get(  row.getCell(sam_i).getStringCellValue()),
					result41,
					consultValue42.get(  row.getCell(sam_i).getStringCellValue()),
					result42,
					consultValue43.get(  row.getCell(sam_i).getStringCellValue()),
					result43,
					consultValue44.get(  row.getCell(sam_i).getStringCellValue()),
					result44,
					consultValue45.get(  row.getCell(sam_i).getStringCellValue()),
					result45,
					consultValue46.get(  row.getCell(sam_i).getStringCellValue()),
					result46,
					consultValue47.get(  row.getCell(sam_i).getStringCellValue()),
					result47,
					consultValue48.get(  row.getCell(sam_i).getStringCellValue()),
					result48,
					consultValue49.get(  row.getCell(sam_i).getStringCellValue()),
					result49,
					consultValue50.get(  row.getCell(sam_i).getStringCellValue()),
					result50,
					consultValue51.get(  row.getCell(sam_i).getStringCellValue()),
					result51,
					consultValue52.get(  row.getCell(sam_i).getStringCellValue()),
					result52,
					consultValue53.get(  row.getCell(sam_i).getStringCellValue()),
					result53,
					consultValue54.get(  row.getCell(sam_i).getStringCellValue()),
					result54,
					consultValue55.get(  row.getCell(sam_i).getStringCellValue()),
					result55,
					consultValue56.get(  row.getCell(sam_i).getStringCellValue()),
					result56,
					consultValue57.get(  row.getCell(sam_i).getStringCellValue()),
					result57,
					consultValue58.get(  row.getCell(sam_i).getStringCellValue()),
					result58,
					consultValue59.get(  row.getCell(sam_i).getStringCellValue()),
					result59,
					consultValue60.get(  row.getCell(sam_i).getStringCellValue()),
					result60,
					consultValue61.get(  row.getCell(sam_i).getStringCellValue()),
					result61,
					consultValue62.get(  row.getCell(sam_i).getStringCellValue()),
					result62,
					consultValue63.get(  row.getCell(sam_i).getStringCellValue()),
					result63,
					consultValue64.get(  row.getCell(sam_i).getStringCellValue()),
					result64,
					consultValue65.get(  row.getCell(sam_i).getStringCellValue()),
					result65,
					consultValue66.get(  row.getCell(sam_i).getStringCellValue()),
					result66,
					consultValue67.get(  row.getCell(sam_i).getStringCellValue()),
					result67,
					consultValue68.get(  row.getCell(sam_i).getStringCellValue()),
					result68,
					consultValue69.get(  row.getCell(sam_i).getStringCellValue()),
					result69,
					consultValue70.get(  row.getCell(sam_i).getStringCellValue()),
					result70,
					consultValue71.get(  row.getCell(sam_i).getStringCellValue()),
					result71,
					consultValue72.get(  row.getCell(sam_i).getStringCellValue()),
					result72,
					consultValue73.get(  row.getCell(sam_i).getStringCellValue()),
					result73,
					consultValue74.get(  row.getCell(sam_i).getStringCellValue()),
					result74,
					consultValue75.get(  row.getCell(sam_i).getStringCellValue()),
					result75,
					consultValue76.get(  row.getCell(sam_i).getStringCellValue()),
					result76,
					consultValue77.get(  row.getCell(sam_i).getStringCellValue()),
					result77,
					consultValue78.get(  row.getCell(sam_i).getStringCellValue()),
					result78,
					consultValue79.get(  row.getCell(sam_i).getStringCellValue()),
					result79,
					consultValue80.get(  row.getCell(sam_i).getStringCellValue()),
					result80,
					consultValue81.get(  row.getCell(sam_i).getStringCellValue()),
					result81,
					consultValue82.get(  row.getCell(sam_i).getStringCellValue()),
					result82,
					consultValue83.get(  row.getCell(sam_i).getStringCellValue()),
					result83,
					consultValue84.get(  row.getCell(sam_i).getStringCellValue()),
					result84,
					consultValue85.get(  row.getCell(sam_i).getStringCellValue()),
					result85,
					consultValue86.get(  row.getCell(sam_i).getStringCellValue()),
					result86,
					consultValue87.get(  row.getCell(sam_i).getStringCellValue()),
					result87,
					consultValue88.get(  row.getCell(sam_i).getStringCellValue()),
					result88,
					consultValue89.get(  row.getCell(sam_i).getStringCellValue()),
					result89,
					consultValue90.get(  row.getCell(sam_i).getStringCellValue()),
					result90,
					consultValue91.get(  row.getCell(sam_i).getStringCellValue()),
					result91,
					consultValue92.get(  row.getCell(sam_i).getStringCellValue()),
					result92,
					consultValue93.get(  row.getCell(sam_i).getStringCellValue()),
					result93,
					consultValue94.get(  row.getCell(sam_i).getStringCellValue()),
					result94,
					consultValue95.get(  row.getCell(sam_i).getStringCellValue()),
					result95,
					consultValue96.get(  row.getCell(sam_i).getStringCellValue()),
					result96,
					consultValue97.get(  row.getCell(sam_i).getStringCellValue()),
					result97,
					consultValue98.get(  row.getCell(sam_i).getStringCellValue()),
					result98,
					consultValue99.get(  row.getCell(sam_i).getStringCellValue()),
					result99,
					consultValue100.get(  row.getCell(sam_i).getStringCellValue()),
					result100,
					consultValue101.get(  row.getCell(sam_i).getStringCellValue()),
					result101,
					consultValue102.get(  row.getCell(sam_i).getStringCellValue()),
					result102,
					consultValue103.get(  row.getCell(sam_i).getStringCellValue()),
					result103,
					consultValue104.get(  row.getCell(sam_i).getStringCellValue()),
					result104,
					consultValue105.get(  row.getCell(sam_i).getStringCellValue()),
					result105,
					consultValue106.get(  row.getCell(sam_i).getStringCellValue()),
					result106,
					consultValue107.get(  row.getCell(sam_i).getStringCellValue()),
					result107,
					consultValue108.get(  row.getCell(sam_i).getStringCellValue()),
					result108,
					consultValue109.get(  row.getCell(sam_i).getStringCellValue()),
					result109,
					consultValue110.get(  row.getCell(sam_i).getStringCellValue()),
					result110,
					consultValue111.get(  row.getCell(sam_i).getStringCellValue()),
					result111,
					consultValue112.get(  row.getCell(sam_i).getStringCellValue()),
					result112,
					consultValue113.get(  row.getCell(sam_i).getStringCellValue()),
					result113,
					consultValue114.get(  row.getCell(sam_i).getStringCellValue()),
					result114,
					consultValue115.get(  row.getCell(sam_i).getStringCellValue()),
					result115,
					consultValue116.get(  row.getCell(sam_i).getStringCellValue()),
					result116,
					consultValue117.get(  row.getCell(sam_i).getStringCellValue()),
					result117,
					consultValue118.get(  row.getCell(sam_i).getStringCellValue()),
					result118,
					consultValue119.get(  row.getCell(sam_i).getStringCellValue()),
					result119,
					consultValue120.get(  row.getCell(sam_i).getStringCellValue()),
					result120,
					consultValue121.get(  row.getCell(sam_i).getStringCellValue()),
					result121,
					consultValue122.get(  row.getCell(sam_i).getStringCellValue()),
					result122,
					consultValue123.get(  row.getCell(sam_i).getStringCellValue()),
					result123,
					consultValue124.get(  row.getCell(sam_i).getStringCellValue()),
					result124,
					consultValue125.get(  row.getCell(sam_i).getStringCellValue()),
					result125,
					consultValue126.get(  row.getCell(sam_i).getStringCellValue()),
					result126,
					consultValue127.get(  row.getCell(sam_i).getStringCellValue()),
					result127,
					consultValue128.get(  row.getCell(sam_i).getStringCellValue()),
					result128,
					consultValue129.get(  row.getCell(sam_i).getStringCellValue()),
					result129,
					consultValue130.get(  row.getCell(sam_i).getStringCellValue()),
					result130,
					consultValue131.get(  row.getCell(sam_i).getStringCellValue()),
					result131,
					consultValue132.get(  row.getCell(sam_i).getStringCellValue()),
					result132,
					consultValue133.get(  row.getCell(sam_i).getStringCellValue()),
					result133,
					consultValue134.get(  row.getCell(sam_i).getStringCellValue()),
					result134
					));
			
		}
		
		tmpfile.close();
	}
	
	public static void readConfig(String filePath) throws IOException {
		String fileType = filePath.substring(filePath.lastIndexOf(".") + 1,
				filePath.length());
		InputStream stream = new FileInputStream(filePath);
		Workbook wb = null;
		if (fileType.equals("xls")) {
			wb = new HSSFWorkbook(stream);
		} else if (fileType.equals("xlsx")) {
			wb = new XSSFWorkbook(stream);
		} else {
			System.out.println("您输入的excel格式不对");
		}
		Sheet sheet1 = wb.getSheetAt(0);
		
		Cell cell;
		/*cell=sheet1.getRow(2).getCell(0);
		cell.setCellType(CellType.STRING);   //无论cell是double还是string.强制转化为string.
		config.put("SIGN", cell.getStringCellValue() );   //存储判定符号。这样可以区别后面是要比大还是比小�??
		*/
		config.put("REF0","0");
		
		cell=sheet1.getRow(1).getCell(2);
		cell.setCellType(CellType.STRING);  
		config.put("REF1", cell.getStringCellValue() );
		
		cell=sheet1.getRow(3).getCell(2);
		cell.setCellType(CellType.STRING);   //无论cell是double还是string.强制转化为string.
		config.put("REF2", cell.getStringCellValue() );
		
		cell=sheet1.getRow(5).getCell(2);
		cell.setCellType(CellType.STRING);   //无论cell是double还是string.强制转化为string.
		config.put("REF3", cell.getStringCellValue() );
		
		
		cell=sheet1.getRow(7).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF4", cell.getStringCellValue());
		
		cell=sheet1.getRow(9).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF5", cell.getStringCellValue());
		
		cell=sheet1.getRow(11).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF6", cell.getStringCellValue());
		
		cell=sheet1.getRow(13).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF7", cell.getStringCellValue());
		cell=sheet1.getRow(15).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF8", cell.getStringCellValue());
		cell=sheet1.getRow(17).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF9", cell.getStringCellValue());
		cell=sheet1.getRow(19).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF10", cell.getStringCellValue());
		cell=sheet1.getRow(21).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF11", cell.getStringCellValue());
		cell=sheet1.getRow(23).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF12", cell.getStringCellValue());
		cell=sheet1.getRow(25).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF13", cell.getStringCellValue());
		cell=sheet1.getRow(27).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF14", cell.getStringCellValue());
		cell=sheet1.getRow(29).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF15", cell.getStringCellValue());
		cell=sheet1.getRow(31).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF16", cell.getStringCellValue());
		cell=sheet1.getRow(33).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF17", cell.getStringCellValue());
		cell=sheet1.getRow(35).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF18", cell.getStringCellValue());
		cell=sheet1.getRow(37).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF19", cell.getStringCellValue());
		cell=sheet1.getRow(39).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF20", cell.getStringCellValue());
		cell=sheet1.getRow(41).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF21", cell.getStringCellValue());
		cell=sheet1.getRow(43).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF22", cell.getStringCellValue());
		cell=sheet1.getRow(45).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF23", cell.getStringCellValue());
		cell=sheet1.getRow(47).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF24", cell.getStringCellValue());
		cell=sheet1.getRow(49).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF25", cell.getStringCellValue());
		cell=sheet1.getRow(51).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF26", cell.getStringCellValue());
		cell=sheet1.getRow(53).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF27", cell.getStringCellValue());
		cell=sheet1.getRow(55).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF28", cell.getStringCellValue());
		cell=sheet1.getRow(57).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF29", cell.getStringCellValue());
		cell=sheet1.getRow(59).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF30", cell.getStringCellValue());
		cell=sheet1.getRow(61).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF31", cell.getStringCellValue());
		cell=sheet1.getRow(63).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF32", cell.getStringCellValue());
		cell=sheet1.getRow(65).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF33", cell.getStringCellValue());
		cell=sheet1.getRow(67).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF34", cell.getStringCellValue());
		cell=sheet1.getRow(69).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF35", cell.getStringCellValue());
		cell=sheet1.getRow(71).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF36", cell.getStringCellValue());
		cell=sheet1.getRow(73).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF37", cell.getStringCellValue());
		cell=sheet1.getRow(75).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF38", cell.getStringCellValue());
		cell=sheet1.getRow(77).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF39", cell.getStringCellValue());
		cell=sheet1.getRow(79).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF40", cell.getStringCellValue());
		cell=sheet1.getRow(81).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF41", cell.getStringCellValue());
		cell=sheet1.getRow(83).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF42", cell.getStringCellValue());
		cell=sheet1.getRow(85).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF43", cell.getStringCellValue());
		cell=sheet1.getRow(87).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF44", cell.getStringCellValue());
		cell=sheet1.getRow(89).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF45", cell.getStringCellValue());
		cell=sheet1.getRow(91).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF46", cell.getStringCellValue());
		cell=sheet1.getRow(93).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF47", cell.getStringCellValue());
		cell=sheet1.getRow(95).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF48", cell.getStringCellValue());
		cell=sheet1.getRow(97).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF49", cell.getStringCellValue());
		cell=sheet1.getRow(99).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF50", cell.getStringCellValue());
		cell=sheet1.getRow(101).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF51", cell.getStringCellValue());
		cell=sheet1.getRow(103).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF52", cell.getStringCellValue());
		cell=sheet1.getRow(105).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF53", cell.getStringCellValue());
		cell=sheet1.getRow(107).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF54", cell.getStringCellValue());
		cell=sheet1.getRow(109).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF55", cell.getStringCellValue());
		cell=sheet1.getRow(111).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF56", cell.getStringCellValue());
		cell=sheet1.getRow(113).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF57", cell.getStringCellValue());
		cell=sheet1.getRow(115).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF58", cell.getStringCellValue());
		cell=sheet1.getRow(117).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF59", cell.getStringCellValue());
		cell=sheet1.getRow(119).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF60", cell.getStringCellValue());
		cell=sheet1.getRow(121).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF61", cell.getStringCellValue());
		cell=sheet1.getRow(123).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF62", cell.getStringCellValue());
		cell=sheet1.getRow(125).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF63", cell.getStringCellValue());
		cell=sheet1.getRow(127).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF64", cell.getStringCellValue());
		cell=sheet1.getRow(129).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF65", cell.getStringCellValue());
		cell=sheet1.getRow(131).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF66", cell.getStringCellValue());
		cell=sheet1.getRow(133).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF67", cell.getStringCellValue());
		cell=sheet1.getRow(135).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF68", cell.getStringCellValue());
		cell=sheet1.getRow(137).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF69", cell.getStringCellValue());
		cell=sheet1.getRow(139).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF70", cell.getStringCellValue());
		cell=sheet1.getRow(141).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF71", cell.getStringCellValue());
		cell=sheet1.getRow(143).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF72", cell.getStringCellValue());
		cell=sheet1.getRow(145).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF73", cell.getStringCellValue());
		cell=sheet1.getRow(147).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF74", cell.getStringCellValue());
		cell=sheet1.getRow(149).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF75", cell.getStringCellValue());
		cell=sheet1.getRow(151).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF76", cell.getStringCellValue());
		cell=sheet1.getRow(153).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF77", cell.getStringCellValue());
		cell=sheet1.getRow(155).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF78", cell.getStringCellValue());
		cell=sheet1.getRow(157).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF79", cell.getStringCellValue());
		cell=sheet1.getRow(159).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF80", cell.getStringCellValue());
		cell=sheet1.getRow(161).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF81", cell.getStringCellValue());
		cell=sheet1.getRow(163).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF82", cell.getStringCellValue());
		cell=sheet1.getRow(165).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF83", cell.getStringCellValue());
		cell=sheet1.getRow(167).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF84", cell.getStringCellValue());
		cell=sheet1.getRow(169).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF85", cell.getStringCellValue());
		cell=sheet1.getRow(171).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF86", cell.getStringCellValue());
		cell=sheet1.getRow(173).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF87", cell.getStringCellValue());
		cell=sheet1.getRow(175).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF88", cell.getStringCellValue());
		cell=sheet1.getRow(177).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF89", cell.getStringCellValue());
		cell=sheet1.getRow(179).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF90", cell.getStringCellValue());
		cell=sheet1.getRow(181).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF91", cell.getStringCellValue());
		cell=sheet1.getRow(183).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF92", cell.getStringCellValue());
		cell=sheet1.getRow(185).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF93", cell.getStringCellValue());
		cell=sheet1.getRow(187).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF94", cell.getStringCellValue());
		cell=sheet1.getRow(189).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF95", cell.getStringCellValue());
		cell=sheet1.getRow(191).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF96", cell.getStringCellValue());
		cell=sheet1.getRow(193).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF97", cell.getStringCellValue());
		cell=sheet1.getRow(195).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF98", cell.getStringCellValue());
		cell=sheet1.getRow(197).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF99", cell.getStringCellValue());
		cell=sheet1.getRow(199).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF100", cell.getStringCellValue());
		cell=sheet1.getRow(201).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF101", cell.getStringCellValue());
		cell=sheet1.getRow(203).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF102", cell.getStringCellValue());
		cell=sheet1.getRow(205).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF103", cell.getStringCellValue());
		cell=sheet1.getRow(207).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF104", cell.getStringCellValue());
		cell=sheet1.getRow(209).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF105", cell.getStringCellValue());
		cell=sheet1.getRow(211).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF106", cell.getStringCellValue());
		cell=sheet1.getRow(213).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF107", cell.getStringCellValue());
		cell=sheet1.getRow(215).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF108", cell.getStringCellValue());
		cell=sheet1.getRow(217).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF109", cell.getStringCellValue());
		cell=sheet1.getRow(219).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF110", cell.getStringCellValue());
		cell=sheet1.getRow(221).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF111", cell.getStringCellValue());
		cell=sheet1.getRow(223).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF112", cell.getStringCellValue());
		cell=sheet1.getRow(225).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF113", cell.getStringCellValue());
		cell=sheet1.getRow(227).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF114", cell.getStringCellValue());
		cell=sheet1.getRow(229).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF115", cell.getStringCellValue());
		cell=sheet1.getRow(231).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF116", cell.getStringCellValue());
		cell=sheet1.getRow(233).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF117", cell.getStringCellValue());
		cell=sheet1.getRow(235).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF118", cell.getStringCellValue());
		cell=sheet1.getRow(237).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF119", cell.getStringCellValue());
		cell=sheet1.getRow(239).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF120", cell.getStringCellValue());
		cell=sheet1.getRow(241).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF121", cell.getStringCellValue());
		cell=sheet1.getRow(243).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF122", cell.getStringCellValue());
		cell=sheet1.getRow(245).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF123", cell.getStringCellValue());
		cell=sheet1.getRow(247).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF124", cell.getStringCellValue());
		cell=sheet1.getRow(249).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF125", cell.getStringCellValue());
		cell=sheet1.getRow(251).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF126", cell.getStringCellValue());
		cell=sheet1.getRow(253).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF127", cell.getStringCellValue());
		cell=sheet1.getRow(255).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF128", cell.getStringCellValue());
		cell=sheet1.getRow(257).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF129", cell.getStringCellValue());
		cell=sheet1.getRow(259).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF130", cell.getStringCellValue());
		cell=sheet1.getRow(261).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF131", cell.getStringCellValue());
		cell=sheet1.getRow(263).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF132", cell.getStringCellValue());
		cell=sheet1.getRow(265).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF133", cell.getStringCellValue());
		cell=sheet1.getRow(267).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REF134", cell.getStringCellValue());
		
		
		
		cell=sheet1.getRow(1).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL1", cell.getStringCellValue() );
		cell=sheet1.getRow(3).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL2", cell.getStringCellValue() );
		cell=sheet1.getRow(5).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL3", cell.getStringCellValue() );
		cell=sheet1.getRow(7).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL4", cell.getStringCellValue() );
		cell=sheet1.getRow(9).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL5", cell.getStringCellValue() );
		cell=sheet1.getRow(11).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL6", cell.getStringCellValue() );
		cell=sheet1.getRow(13).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL7", cell.getStringCellValue() );
		cell=sheet1.getRow(15).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL8", cell.getStringCellValue() );
		cell=sheet1.getRow(17).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL9", cell.getStringCellValue() );
		cell=sheet1.getRow(19).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL10", cell.getStringCellValue() );
		cell=sheet1.getRow(21).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL11", cell.getStringCellValue() );
		cell=sheet1.getRow(23).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL12", cell.getStringCellValue() );
		cell=sheet1.getRow(25).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL13", cell.getStringCellValue() );
		cell=sheet1.getRow(27).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL14", cell.getStringCellValue() );
		cell=sheet1.getRow(29).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL15", cell.getStringCellValue() );
		cell=sheet1.getRow(31).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL16", cell.getStringCellValue() );
		cell=sheet1.getRow(33).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL17", cell.getStringCellValue() );
		cell=sheet1.getRow(35).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL18", cell.getStringCellValue() );
		cell=sheet1.getRow(37).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL19", cell.getStringCellValue() );
		cell=sheet1.getRow(39).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL20", cell.getStringCellValue() );
		cell=sheet1.getRow(41).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL21", cell.getStringCellValue() );
		cell=sheet1.getRow(43).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL22", cell.getStringCellValue() );
		cell=sheet1.getRow(45).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL23", cell.getStringCellValue() );
		cell=sheet1.getRow(47).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL24", cell.getStringCellValue() );
		cell=sheet1.getRow(49).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL25", cell.getStringCellValue() );
		cell=sheet1.getRow(51).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL26", cell.getStringCellValue() );
		cell=sheet1.getRow(53).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL27", cell.getStringCellValue() );
		cell=sheet1.getRow(55).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL28", cell.getStringCellValue() );
		cell=sheet1.getRow(57).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL29", cell.getStringCellValue() );
		cell=sheet1.getRow(59).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL30", cell.getStringCellValue() );
		cell=sheet1.getRow(61).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL31", cell.getStringCellValue() );
		cell=sheet1.getRow(63).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL32", cell.getStringCellValue() );
		cell=sheet1.getRow(65).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL33", cell.getStringCellValue() );
		cell=sheet1.getRow(67).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL34", cell.getStringCellValue() );
		cell=sheet1.getRow(69).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL35", cell.getStringCellValue() );
		cell=sheet1.getRow(71).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL36", cell.getStringCellValue() );
		cell=sheet1.getRow(73).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL37", cell.getStringCellValue() );
		cell=sheet1.getRow(75).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL38", cell.getStringCellValue() );
		cell=sheet1.getRow(77).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL39", cell.getStringCellValue() );
		cell=sheet1.getRow(79).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL40", cell.getStringCellValue() );
		cell=sheet1.getRow(81).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL41", cell.getStringCellValue() );
		cell=sheet1.getRow(83).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL42", cell.getStringCellValue() );
		cell=sheet1.getRow(85).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL43", cell.getStringCellValue() );
		cell=sheet1.getRow(87).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL44", cell.getStringCellValue() );
		cell=sheet1.getRow(89).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL45", cell.getStringCellValue() );
		cell=sheet1.getRow(91).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL46", cell.getStringCellValue() );
		cell=sheet1.getRow(93).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL47", cell.getStringCellValue() );
		cell=sheet1.getRow(95).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL48", cell.getStringCellValue() );
		cell=sheet1.getRow(97).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL49", cell.getStringCellValue() );
		cell=sheet1.getRow(99).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL50", cell.getStringCellValue() );
		cell=sheet1.getRow(101).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL51", cell.getStringCellValue() );
		cell=sheet1.getRow(103).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL52", cell.getStringCellValue() );
		cell=sheet1.getRow(105).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL53", cell.getStringCellValue() );
		cell=sheet1.getRow(107).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL54", cell.getStringCellValue() );
		cell=sheet1.getRow(109).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL55", cell.getStringCellValue() );
		cell=sheet1.getRow(111).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL56", cell.getStringCellValue() );
		cell=sheet1.getRow(113).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL57", cell.getStringCellValue() );
		cell=sheet1.getRow(115).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL58", cell.getStringCellValue() );
		cell=sheet1.getRow(117).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL59", cell.getStringCellValue() );
		cell=sheet1.getRow(119).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL60", cell.getStringCellValue() );
		cell=sheet1.getRow(121).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL61", cell.getStringCellValue() );
		cell=sheet1.getRow(123).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL62", cell.getStringCellValue() );
		cell=sheet1.getRow(125).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL63", cell.getStringCellValue() );
		cell=sheet1.getRow(127).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL64", cell.getStringCellValue() );
		cell=sheet1.getRow(129).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL65", cell.getStringCellValue() );
		cell=sheet1.getRow(131).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL66", cell.getStringCellValue() );
		cell=sheet1.getRow(133).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL67", cell.getStringCellValue() );
		cell=sheet1.getRow(135).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL68", cell.getStringCellValue() );
		cell=sheet1.getRow(137).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL69", cell.getStringCellValue() );
		cell=sheet1.getRow(139).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL70", cell.getStringCellValue() );
		cell=sheet1.getRow(141).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL71", cell.getStringCellValue() );
		cell=sheet1.getRow(143).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL72", cell.getStringCellValue() );
		cell=sheet1.getRow(145).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL73", cell.getStringCellValue() );
		cell=sheet1.getRow(147).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL74", cell.getStringCellValue() );
		cell=sheet1.getRow(149).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL75", cell.getStringCellValue() );
		cell=sheet1.getRow(151).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL76", cell.getStringCellValue() );
		cell=sheet1.getRow(153).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL77", cell.getStringCellValue() );
		cell=sheet1.getRow(155).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL78", cell.getStringCellValue() );
		cell=sheet1.getRow(157).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL79", cell.getStringCellValue() );
		cell=sheet1.getRow(159).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL80", cell.getStringCellValue() );
		cell=sheet1.getRow(161).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL81", cell.getStringCellValue() );
		cell=sheet1.getRow(163).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL82", cell.getStringCellValue() );
		cell=sheet1.getRow(165).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL83", cell.getStringCellValue() );
		cell=sheet1.getRow(167).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL84", cell.getStringCellValue() );
		cell=sheet1.getRow(169).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL85", cell.getStringCellValue() );
		cell=sheet1.getRow(171).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL86", cell.getStringCellValue() );
		cell=sheet1.getRow(173).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL87", cell.getStringCellValue() );
		cell=sheet1.getRow(175).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL88", cell.getStringCellValue() );
		cell=sheet1.getRow(177).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL89", cell.getStringCellValue() );
		cell=sheet1.getRow(179).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL90", cell.getStringCellValue() );
		cell=sheet1.getRow(181).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL91", cell.getStringCellValue() );
		cell=sheet1.getRow(183).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL92", cell.getStringCellValue() );
		cell=sheet1.getRow(185).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL93", cell.getStringCellValue() );
		cell=sheet1.getRow(187).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL94", cell.getStringCellValue() );
		cell=sheet1.getRow(189).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL95", cell.getStringCellValue() );
		cell=sheet1.getRow(191).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL96", cell.getStringCellValue() );
		cell=sheet1.getRow(193).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL97", cell.getStringCellValue() );
		cell=sheet1.getRow(195).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL98", cell.getStringCellValue() );
		cell=sheet1.getRow(197).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL99", cell.getStringCellValue() );
		cell=sheet1.getRow(199).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL100", cell.getStringCellValue() );
		cell=sheet1.getRow(201).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL101", cell.getStringCellValue() );
		cell=sheet1.getRow(203).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL102", cell.getStringCellValue() );
		cell=sheet1.getRow(205).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL103", cell.getStringCellValue() );
		cell=sheet1.getRow(207).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL104", cell.getStringCellValue() );
		cell=sheet1.getRow(209).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL105", cell.getStringCellValue() );
		cell=sheet1.getRow(211).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL106", cell.getStringCellValue() );
		cell=sheet1.getRow(213).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL107", cell.getStringCellValue() );
		cell=sheet1.getRow(215).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL108", cell.getStringCellValue() );
		cell=sheet1.getRow(217).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL109", cell.getStringCellValue() );
		cell=sheet1.getRow(219).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL110", cell.getStringCellValue() );
		cell=sheet1.getRow(221).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL111", cell.getStringCellValue() );
		cell=sheet1.getRow(223).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL112", cell.getStringCellValue() );
		cell=sheet1.getRow(225).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL113", cell.getStringCellValue() );
		cell=sheet1.getRow(227).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL114", cell.getStringCellValue() );
		cell=sheet1.getRow(229).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL115", cell.getStringCellValue() );
		cell=sheet1.getRow(231).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL116", cell.getStringCellValue() );
		cell=sheet1.getRow(233).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL117", cell.getStringCellValue() );
		cell=sheet1.getRow(235).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL118", cell.getStringCellValue() );
		cell=sheet1.getRow(237).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL119", cell.getStringCellValue() );
		cell=sheet1.getRow(239).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL120", cell.getStringCellValue() );
		cell=sheet1.getRow(241).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL121", cell.getStringCellValue() );
		cell=sheet1.getRow(243).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL122", cell.getStringCellValue() );
		cell=sheet1.getRow(245).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL123", cell.getStringCellValue() );
		cell=sheet1.getRow(247).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL124", cell.getStringCellValue() );
		cell=sheet1.getRow(249).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL125", cell.getStringCellValue() );
		cell=sheet1.getRow(251).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL126", cell.getStringCellValue() );
		cell=sheet1.getRow(253).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL127", cell.getStringCellValue() );
		cell=sheet1.getRow(255).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL128", cell.getStringCellValue() );
		cell=sheet1.getRow(257).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL129", cell.getStringCellValue() );
		cell=sheet1.getRow(259).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL130", cell.getStringCellValue() );
		cell=sheet1.getRow(261).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL131", cell.getStringCellValue() );
		cell=sheet1.getRow(263).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL132", cell.getStringCellValue() );
		cell=sheet1.getRow(265).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL133", cell.getStringCellValue() );
		cell=sheet1.getRow(267).getCell(0);
		cell.setCellType(CellType.STRING);
		config.put("REFL134", cell.getStringCellValue() );
		
		cell=sheet1.getRow(269).getCell(1);
		cell.setCellType(CellType.STRING);   //无论cell是double还是string.强制转化为string.
		config.put("NORMAL_NORMAL", cell.getStringCellValue() );
		
		cell=sheet1.getRow(270).getCell(1);
		cell.setCellType(CellType.STRING);   //无论cell是double还是string.强制转化为string.
		config.put("HIGH_NORMAL", cell.getStringCellValue() );
		
		cell=sheet1.getRow(271).getCell(1);
		cell.setCellType(CellType.STRING);   //无论cell是double还是string.强制转化为string.
		config.put("LOW_NORMAL", cell.getStringCellValue() );
		
}
	
	
	
	public static boolean write(String outPath) throws Exception {
		String fileType = outPath.substring(outPath.lastIndexOf(".") + 1,
				outPath.length());
		System.out.println(fileType);
		// 创建工作文档对象
		Workbook wb = null;
		if (fileType.equals("xls")) {
			wb = new HSSFWorkbook();
		} else if (fileType.equals("xlsx")) {
			wb = new XSSFWorkbook();
		} else {
			System.out.println("您的文档格式不正确！");
			return false;
		}
		// 创建sheet对象
		Sheet sheet1 = (Sheet) wb.createSheet("sheet1");
		// 循环写入行数�?
		for (int i = 0; i < 5; i++) {
			Row row = (Row) sheet1.createRow(i);
			// 循环写入列数�?
			for (int j = 0; j < 8; j++) {
				Cell cell = row.createCell(j);
				cell.setCellValue("测试"+j);
			}
		}
		// 创建文件�?
		FileOutputStream stream = new FileOutputStream(outPath);
		// 写入数据
		wb.write(stream);
		// 关闭文件�?
		stream.close();
		return true;
	}
}
