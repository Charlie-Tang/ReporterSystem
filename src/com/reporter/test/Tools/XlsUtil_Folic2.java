package com.reporter.test.Tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 * xls工具类
 * 
 * @author hjn
 * 
 */
public class XlsUtil_Folic2 {
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
	
	
	
	
    private static HashMap<String, String> config = new HashMap<String, String>();
    private static String unormal1 = "";
    private static String unormal2 = "";
    private static String dec = "";
	
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
			System.out.println("您输入的excel格式不正确");
		}
		
		Date date=new Date();
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		
		Sheet sheet1 = wb.getSheetAt(0);
		for (Row row : sheet1) {
			if(row.getRowNum()==0)   //跳过首行title
			{
				continue;
			}
			Cell cell=row.getCell(3);
			cell.setCellType(CellType.STRING);
			consultValue1.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			
			cell=row.getCell(4);
			cell.setCellType(CellType.STRING);
			consultValue2.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			
			cell=row.getCell(5);
			cell.setCellType(CellType.STRING);
			consultValue3.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			
			cell=row.getCell(6);
			cell.setCellType(CellType.STRING);
			consultValue4.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			cell=row.getCell(7);
			cell.setCellType(CellType.STRING);
			consultValue5.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			cell=row.getCell(8);
			cell.setCellType(CellType.STRING);
			consultValue6.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			cell=row.getCell(9);
			cell.setCellType(CellType.STRING);
			consultValue7.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			cell=row.getCell(10);
			cell.setCellType(CellType.STRING);
			consultValue8.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			cell=row.getCell(11);
			cell.setCellType(CellType.STRING);
			consultValue9.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			cell=row.getCell(12);
			cell.setCellType(CellType.STRING);
			consultValue10.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			cell=row.getCell(13);
			cell.setCellType(CellType.STRING);
			consultValue11.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			cell=row.getCell(14);
			cell.setCellType(CellType.STRING);
			consultValue12.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			cell=row.getCell(15);
			cell.setCellType(CellType.STRING);
			consultValue13.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			cell=row.getCell(16);
			cell.setCellType(CellType.STRING);
			consultValue14.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());
			cell=row.getCell(17);
			cell.setCellType(CellType.STRING);
			consultValue15.put(row.getCell(2).getStringCellValue(), cell.getStringCellValue());

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
		int inst_i=-1,sam_i=-1,get_i=-1,name_i=-1,sex_i=-1,age_i=-1,dec_i=-1,samt_i=-1,tel_i=-1,insp_i=-1,exam_i=-1,rep_i=-1;
		
		Date date=new Date();
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		
		//BufferedWriter tmpfile = new BufferedWriter(new FileWriter(new File("C:\\Users\\huangshenghao\\Desktop\\报告\\元素软件包\\pretreatment.xls")));
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
					else if(cell.getStringCellValue().equals("受检者年龄"))
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
					}else if(cell.getStringCellValue().equals("检测人"))
					{
						insp_i=cell.getColumnIndex();
					}else if(cell.getStringCellValue().equals("审核人"))
					{
						exam_i=cell.getColumnIndex();
					}else if(cell.getStringCellValue().equals("报告日期"))
					{
						rep_i=cell.getColumnIndex();
					}
				}
				//tmpfile.write("NAME\tSEX\tAGE\tCODE\tCOLLECTION\tDETECTION\tHOSPITAL\tUMFA\t5-MTHF\tRESULT\tDOCTOR\tINSPECTOR\tDATE\n");
				tmpfile.write("NAME\tSEX\tAGE\tTEL\tSAMDATE\tNUM\tINSPECTDAY\tCOMPANY\tTYPE\tZn\tMn\tMg\tCu\tFe\tSe\tCr\tCo\tSr\tI\tPb\tHg\tCd\tAs\tTl\tINSPECT_MAN\tEXAM_MAN\tREP_DAY\tUNORMAL1\tUNORMAL2\tDEC\n");
				continue;
			}
			
			unormal1 = "";
			unormal2 = "";
			dec      = "";
			String val1=consultValue1.get(row.getCell(sam_i).getStringCellValue());
			String val2=consultValue2.get(row.getCell(sam_i).getStringCellValue());	
			String val3=consultValue3.get(row.getCell(sam_i).getStringCellValue());
			String val4=consultValue4.get(row.getCell(sam_i).getStringCellValue());
			String val5=consultValue5.get(row.getCell(sam_i).getStringCellValue());
			String val6=consultValue6.get(row.getCell(sam_i).getStringCellValue());
			String val7=consultValue7.get(row.getCell(sam_i).getStringCellValue());
			String val8=consultValue8.get(row.getCell(sam_i).getStringCellValue());
			String val9=consultValue9.get(row.getCell(sam_i).getStringCellValue());
			String val10=consultValue10.get(row.getCell(sam_i).getStringCellValue());
			String val11=consultValue11.get(row.getCell(sam_i).getStringCellValue());
			String val12=consultValue12.get(row.getCell(sam_i).getStringCellValue());
			String val13=consultValue13.get(row.getCell(sam_i).getStringCellValue());
			String val14=consultValue14.get(row.getCell(sam_i).getStringCellValue());
			String val15=consultValue15.get(row.getCell(sam_i).getStringCellValue());
			
//			String result1 = val1+" "+config.get("NORMAL_NORMAL");
//			String result2 = val2+" "+config.get("NORMAL_NORMAL");
//			String result3 = val3+" "+config.get("NORMAL_NORMAL");
//			String result4 = val4+" "+config.get("NORMAL_NORMAL");
//			String result5 = val5+" "+config.get("NORMAL_NORMAL");
//			String result6 = val6+" "+config.get("NORMAL_NORMAL");
//			String result7 = val7+" "+config.get("NORMAL_NORMAL");
//			String result8 = val8+" "+config.get("NORMAL_NORMAL");
//			String result9 = val9+" "+config.get("NORMAL_NORMAL");
//			String result10 = val10+" "+config.get("NORMAL_NORMAL");
//			String result11 = val11+" "+config.get("NORMAL_NORMAL");
//			String result12 = val12+" "+config.get("NORMAL_NORMAL");
//			String result13 = val13+" "+config.get("NORMAL_NORMAL");
//			String result14 = val14+" "+config.get("NORMAL_NORMAL");
//			String result15 = val15+" "+config.get("NORMAL_NORMAL");
			
			String result1 = val1;
			String result2 = val2;
			String result3 = val3;
			String result4 = val4;
			String result5 = val5;
			String result6 = val6;
			String result7 = val7;
			String result8 = val8;
			String result9 = val9;
			String result10 = val10;
			String result11 = val11;
			String result12 = val12;
			String result13 = val13;
			String result14 = val14;
			String result15 = val15;
			
			
			if((!val1.equals("ND")&&(Double.valueOf( val1 )> Double.valueOf(config.get("REF1"))))){result1=val1+" "+config.get("HIGH_NORMAL");unormal1=unormal1+"锌"+" ";dec=dec+config.get("H1")+"**";}
			if((!val2.equals("ND")&&(Double.valueOf( val2 )   > Double.valueOf(config.get("REF2"))))){result2=val2+" "+config.get("HIGH_NORMAL");unormal1=unormal1+"锰"+" ";dec=dec+config.get("H2")+"**";}
			if((!val3.equals("ND")&&(Double.valueOf( val3 )   > Double.valueOf(config.get("REF3"))))){result3=val3+" "+config.get("HIGH_NORMAL");unormal1=unormal1+"镁"+" ";dec=dec+config.get("H3")+"**";}
			if((!val4.equals("ND")&&(Double.valueOf( val4 )   > Double.valueOf(config.get("REF4"))))){result4=val4+" "+config.get("HIGH_NORMAL");unormal1=unormal1+"铜"+" ";dec=dec+config.get("H4")+"**";}
			if((!val5.equals("ND")&&(Double.valueOf( val5 )   > Double.valueOf(config.get("REF5"))))){result5=val5+" "+config.get("HIGH_NORMAL");unormal1=unormal1+"铁"+" ";dec=dec+config.get("H5")+"**";}
			if((!val6.equals("ND")&&(Double.valueOf( val6 )   > Double.valueOf(config.get("REF6"))))){result6=val6+" "+config.get("HIGH_NORMAL");unormal1=unormal1+"硒"+" ";dec=dec+config.get("H6")+"**";}
			if((!val7.equals("ND")&&(Double.valueOf( val7 )   > Double.valueOf(config.get("REF7"))))){result7=val7+" "+config.get("HIGH_NORMAL");unormal1=unormal1+"铬"+" ";dec=dec+config.get("H7")+"**";}
			if((!val8.equals("ND")&&(Double.valueOf( val8 )   > Double.valueOf(config.get("REF8"))))){result8=val8+" "+config.get("HIGH_NORMAL");unormal1=unormal1+"钴 "+" ";dec=dec+config.get("H8")+"**";}
			if((!val9.equals("ND")&&(Double.valueOf( val9 )   > Double.valueOf(config.get("REF9"))))){result9=val9+" "+config.get("HIGH_NORMAL");unormal1=unormal1+"锶"+" ";dec=dec+config.get("H9")+"**";}
			if((!val10.equals("ND")&&(Double.valueOf( val10 )   > Double.valueOf(config.get("REF10"))))){result10=val10+" "+config.get("HIGH_NORMAL");unormal1=unormal1+"碘"+" ";dec=dec+config.get("H10")+"**";}
			if((!val11.equals("ND")&&(Double.valueOf( val11 )   > Double.valueOf(config.get("REF11"))))){result11=val11+" "+config.get("HIGH_NORMAL");unormal2=unormal2+"铅"+" ";dec=dec+config.get("H11")+"**";}
			if((!val12.equals("ND")&&(Double.valueOf( val12 )   > Double.valueOf(config.get("REF12"))))){result12=val12+" "+config.get("HIGH_NORMAL");unormal2=unormal2+"汞"+" ";dec=dec+config.get("H12")+"**";}
			if((!val13.equals("ND")&&(Double.valueOf( val13 )   > Double.valueOf(config.get("REF13"))))){result13=val13+" "+config.get("HIGH_NORMAL");unormal2=unormal2+"镉"+" ";dec=dec+config.get("H13")+"**";}
			if((!val14.equals("ND")&&(Double.valueOf( val14 )   > Double.valueOf(config.get("REF14"))))){result14=val14+" "+config.get("HIGH_NORMAL");unormal2=unormal2+"砷"+" ";dec=dec+config.get("H14")+"**";}
			if((!val15.equals("ND")&&(Double.valueOf( val15 )   > Double.valueOf(config.get("REF15"))))){result15=val15+" "+config.get("HIGH_NORMAL");unormal2=unormal2+"铊"+" ";dec=dec+config.get("H15")+"**";}
			
			if((!val1.equals("ND")&&(Double.valueOf( val1 )   < Double.valueOf(config.get("REFL1"))))){result1=val1+" "+config.get("LOW_NORMAL");unormal1=unormal1+"锌"+" ";dec=dec+config.get("L1")+"**";}
			if((!val2.equals("ND")&&(Double.valueOf( val2 )   < Double.valueOf(config.get("REFL2"))))){result2=val2+" "+config.get("LOW_NORMAL");unormal1=unormal1+"锰"+" ";dec=dec+config.get("L2")+"**";}
			if((!val3.equals("ND")&&(Double.valueOf( val3 )   < Double.valueOf(config.get("REFL3"))))){result3=val3+" "+config.get("LOW_NORMAL");unormal1=unormal1+"镁"+" ";dec=dec+config.get("L3")+"**";}
			if((!val4.equals("ND")&&(Double.valueOf( val4 )   < Double.valueOf(config.get("REFL4"))))){result4=val4+" "+config.get("LOW_NORMAL");unormal1=unormal1+"铜"+" ";dec=dec+config.get("L4")+"**";}
			if((!val5.equals("ND")&&(Double.valueOf( val5 )   < Double.valueOf(config.get("REFL5"))))){result5=val5+" "+config.get("LOW_NORMAL");unormal1=unormal1+"铁"+" ";dec=dec+config.get("L5")+"**";}
			if((!val6.equals("ND")&&(Double.valueOf( val6 )   < Double.valueOf(config.get("REFL6"))))){result6=val6+" "+config.get("LOW_NORMAL");unormal1=unormal1+"硒"+" ";dec=dec+config.get("L6")+"**";}
			if((!val7.equals("ND")&&(Double.valueOf( val7 )   < Double.valueOf(config.get("REFL7"))))){result7=val7+" "+config.get("LOW_NORMAL");unormal1=unormal1+"铬"+" ";dec=dec+config.get("L7")+"**";}
			if((!val8.equals("ND")&&(Double.valueOf( val8 )   < Double.valueOf(config.get("REFL8"))))){result8=val8+" "+config.get("LOW_NORMAL");unormal1=unormal1+"钴"+" ";dec=dec+config.get("L8")+"**";}
			if((!val9.equals("ND")&&(Double.valueOf( val9 )   < Double.valueOf(config.get("REFL9"))))){result9=val9+" "+config.get("LOW_NORMAL");unormal1=unormal1+"锶"+" ";dec=dec+config.get("L9")+"**";}
			if((!val10.equals("ND")&&(Double.valueOf( val10 )   < Double.valueOf(config.get("REFL10"))))){result10=val10+" "+config.get("LOW_NORMAL");unormal1=unormal1+"碘"+" ";dec=dec+config.get("L10")+"**";}
			if((!val11.equals("ND")&&(Double.valueOf( val11 )   < Double.valueOf(config.get("REFL11"))))){result11=val11+" "+config.get("LOW_NORMAL");unormal2=unormal2+"铅"+" ";dec=dec+config.get("L11")+"**";}
			if((!val12.equals("ND")&&(Double.valueOf( val12 )   < Double.valueOf(config.get("REFL12"))))){result12=val12+" "+config.get("LOW_NORMAL");unormal2=unormal2+"汞"+" ";dec=dec+config.get("L12")+"**";}
			if((!val13.equals("ND")&&(Double.valueOf( val13 )   < Double.valueOf(config.get("REFL13"))))){result13=val13+" "+config.get("LOW_NORMAL");unormal2=unormal2+"镉"+" ";dec=dec+config.get("L13")+"**";}
			if((!val14.equals("ND")&&(Double.valueOf( val14 )   < Double.valueOf(config.get("REFL14"))))){result14=val14+" "+config.get("LOW_NORMAL");unormal2=unormal2+"砷"+" ";dec=dec+config.get("L14")+"**";}
			if((!val15.equals("ND")&&(Double.valueOf( val15 )   < Double.valueOf(config.get("REFL15"))))){result15=val15+" "+config.get("LOW_NORMAL");unormal2=unormal2+"铊"+" ";dec=dec+config.get("L15")+"**";}
			
			
			
			if(unormal1.equals("")&&unormal2.equals(""))
			{
				dec = "您全部的检测项都是正常的。";
			}
			if(unormal1.equals(""))
			{
				unormal1 = "无。";
			}
			if(unormal2.equals(""))
			{
				unormal2 = "无。";
			}
			XSSFCell cell1 = (XSSFCell) row.getCell(name_i);
			cell1.setCellType(CellType.STRING);
			
			XSSFCell cell2 = (XSSFCell) row.getCell(age_i);
			cell2.setCellType(CellType.STRING);
			
			XSSFCell cell3 = (XSSFCell) row.getCell(tel_i);
			cell3.setCellType(CellType.STRING);
			
			XSSFCell cell4 = (XSSFCell) row.getCell(insp_i);
//			cell4.setCellType(CellType.STRING);
			
			XSSFCell cell5 = (XSSFCell) row.getCell(rep_i);
			cell5.setCellType(CellType.STRING);
			
			XSSFCell cell6 = (XSSFCell) row.getCell(get_i);
			cell6.setCellType(CellType.STRING);
			
			XSSFCell cell7 = (XSSFCell) row.getCell(dec_i);
			cell7.setCellType(CellType.STRING);
			
			
			
			
			
			//tmpfile.write("NUM\tNAME\tSEX\tBIRTHDAY\tTEL\tCOMPANY\tTYPE\tSAMDATE\tINSPECTDAY\tRS\tRS_RESULT\tDS\tDS_RESULT\tJS\tJS_RESULT");
			tmpfile.write(String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
					cell1.getStringCellValue(),
					row.getCell(sex_i).getStringCellValue(),
					cell2.getStringCellValue(),
					cell3.getStringCellValue(),
					cell6.getStringCellValue(),
					row.getCell(sam_i).getStringCellValue(),
					cell7.getStringCellValue(),
					row.getCell(inst_i).getStringCellValue(),
					row.getCell(samt_i).getStringCellValue(),
					result1,
					result2,
					result3,
					result4,
					result5,
					result6,
					result7,
					result8,
					result9,
					result10,
					result11,
					result12,
					result13,
					result14,
					result15,
                    "",
                    "",
                    cell5.getStringCellValue(),
                    unormal1,
                    unormal2,
                    dec
					
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
		config.put("SIGN", cell.getStringCellValue() );   //存储判定符号。这样可以区别后面是要比大还是比小。
		*/
		config.put("REF0","0");
		
		cell=sheet1.getRow(1).getCell(3);
		cell.setCellType(CellType.STRING);  
		config.put("REF1", cell.getStringCellValue() );
		
		cell=sheet1.getRow(2).getCell(3);
		cell.setCellType(CellType.STRING);   //无论cell是double还是string.强制转化为string.
		config.put("REF2", cell.getStringCellValue() );
		
		cell=sheet1.getRow(3).getCell(3);
		cell.setCellType(CellType.STRING);   //无论cell是double还是string.强制转化为string.
		config.put("REF3", cell.getStringCellValue() );
		
		
		cell=sheet1.getRow(4).getCell(3);
		cell.setCellType(CellType.STRING);
		config.put("REF4", cell.getStringCellValue());
		
		cell=sheet1.getRow(5).getCell(3);
		cell.setCellType(CellType.STRING);
		config.put("REF5", cell.getStringCellValue());
		
		cell=sheet1.getRow(6).getCell(3);
		cell.setCellType(CellType.STRING);
		config.put("REF6", cell.getStringCellValue());
		
		cell=sheet1.getRow(7).getCell(3);
		cell.setCellType(CellType.STRING);
		config.put("REF7", cell.getStringCellValue());
		cell=sheet1.getRow(8).getCell(3);
		cell.setCellType(CellType.STRING);
		config.put("REF8", cell.getStringCellValue());
		cell=sheet1.getRow(9).getCell(3);
		cell.setCellType(CellType.STRING);
		config.put("REF9", cell.getStringCellValue());
		cell=sheet1.getRow(10).getCell(3);
		cell.setCellType(CellType.STRING);
		config.put("REF10", cell.getStringCellValue());
		cell=sheet1.getRow(11).getCell(3);
		cell.setCellType(CellType.STRING);
		config.put("REF11", cell.getStringCellValue());
		cell=sheet1.getRow(12).getCell(3);
		cell.setCellType(CellType.STRING);
		config.put("REF12", cell.getStringCellValue());
		cell=sheet1.getRow(13).getCell(3);
		cell.setCellType(CellType.STRING);
		config.put("REF13", cell.getStringCellValue());
		cell=sheet1.getRow(14).getCell(3);
		cell.setCellType(CellType.STRING);
		config.put("REF14", cell.getStringCellValue());
		cell=sheet1.getRow(15).getCell(3);
		cell.setCellType(CellType.STRING);
		config.put("REF15", cell.getStringCellValue());
		
		
		
		
		cell=sheet1.getRow(1).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL1", cell.getStringCellValue() );
		cell=sheet1.getRow(2).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL2", cell.getStringCellValue() );
		cell=sheet1.getRow(3).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL3", cell.getStringCellValue() );
		cell=sheet1.getRow(4).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL4", cell.getStringCellValue() );
		cell=sheet1.getRow(5).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL5", cell.getStringCellValue() );
		cell=sheet1.getRow(6).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL6", cell.getStringCellValue() );
		cell=sheet1.getRow(7).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL7", cell.getStringCellValue() );
		cell=sheet1.getRow(8).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL8", cell.getStringCellValue() );
		cell=sheet1.getRow(9).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL9", cell.getStringCellValue() );
		cell=sheet1.getRow(10).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL10", cell.getStringCellValue() );
		cell=sheet1.getRow(11).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL11", cell.getStringCellValue() );
		cell=sheet1.getRow(12).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL12", cell.getStringCellValue() );
		cell=sheet1.getRow(13).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL13", cell.getStringCellValue() );
		cell=sheet1.getRow(14).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL14", cell.getStringCellValue() );
		cell=sheet1.getRow(15).getCell(2);
		cell.setCellType(CellType.STRING);
		config.put("REFL15", cell.getStringCellValue() );
		
		
		cell=sheet1.getRow(17).getCell(1);
		cell.setCellType(CellType.STRING);   //无论cell是double还是string.强制转化为string.
		config.put("NORMAL_NORMAL", cell.getStringCellValue() );
		
		cell=sheet1.getRow(18).getCell(1);
		cell.setCellType(CellType.STRING);   //无论cell是double还是string.强制转化为string.
		config.put("HIGH_NORMAL", cell.getStringCellValue() );
		
		cell=sheet1.getRow(19).getCell(1);
		cell.setCellType(CellType.STRING);   //无论cell是double还是string.强制转化为string.
		config.put("LOW_NORMAL", cell.getStringCellValue() );
		
		
		
		
		cell=sheet1.getRow(1).getCell(5);
		config.put("H1", cell.getStringCellValue() );
		cell=sheet1.getRow(2).getCell(5);
		config.put("H2", cell.getStringCellValue() );
		cell=sheet1.getRow(3).getCell(5);
		config.put("H3", cell.getStringCellValue() );
		cell=sheet1.getRow(4).getCell(5);
		config.put("H4", cell.getStringCellValue() );
		cell=sheet1.getRow(5).getCell(5);
		config.put("H5", cell.getStringCellValue() );
		cell=sheet1.getRow(6).getCell(5);
		config.put("H6", cell.getStringCellValue() );
		cell=sheet1.getRow(7).getCell(5);
		config.put("H7", cell.getStringCellValue() );
		cell=sheet1.getRow(8).getCell(5);
		config.put("H8", cell.getStringCellValue() );
		cell=sheet1.getRow(9).getCell(5);
		config.put("H9", cell.getStringCellValue() );
		cell=sheet1.getRow(10).getCell(5);
		config.put("H10", cell.getStringCellValue() );
		cell=sheet1.getRow(11).getCell(5);
		config.put("H11", cell.getStringCellValue() );
		cell=sheet1.getRow(12).getCell(5);
		config.put("H12", cell.getStringCellValue() );
		cell=sheet1.getRow(13).getCell(5);
		config.put("H13", cell.getStringCellValue() );
		cell=sheet1.getRow(14).getCell(5);
		config.put("H14", cell.getStringCellValue() );
		cell=sheet1.getRow(15).getCell(5);
		config.put("H15", cell.getStringCellValue() );
		
		
		cell=sheet1.getRow(1).getCell(6);
		config.put("L1", cell.getStringCellValue() );
		cell=sheet1.getRow(2).getCell(6);
		config.put("L2", cell.getStringCellValue() );
		cell=sheet1.getRow(3).getCell(6);
		config.put("L3", cell.getStringCellValue() );
		cell=sheet1.getRow(4).getCell(6);
		config.put("L4", cell.getStringCellValue() );
		cell=sheet1.getRow(5).getCell(6);
		config.put("L5", cell.getStringCellValue() );
		cell=sheet1.getRow(6).getCell(6);
		config.put("L6", cell.getStringCellValue() );
		cell=sheet1.getRow(7).getCell(6);
		config.put("L7", cell.getStringCellValue() );
		cell=sheet1.getRow(8).getCell(6);
		config.put("L8", cell.getStringCellValue() );
		cell=sheet1.getRow(9).getCell(6);
		config.put("L9", cell.getStringCellValue() );
		cell=sheet1.getRow(10).getCell(6);
		config.put("L10", cell.getStringCellValue() );
		cell=sheet1.getRow(11).getCell(6);
		config.put("L11", cell.getStringCellValue() );
		cell=sheet1.getRow(12).getCell(6);
		config.put("L12", cell.getStringCellValue() );
		cell=sheet1.getRow(13).getCell(6);
		config.put("L13", cell.getStringCellValue() );
		cell=sheet1.getRow(14).getCell(6);
		config.put("L14", cell.getStringCellValue() );
		cell=sheet1.getRow(15).getCell(6);
		config.put("L15", cell.getStringCellValue() );
		
		
		
		
		
		
		
		
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
		// 循环写入行数据
		for (int i = 0; i < 5; i++) {
			Row row = (Row) sheet1.createRow(i);
			// 循环写入列数据
			for (int j = 0; j < 8; j++) {
				Cell cell = row.createCell(j);
				cell.setCellValue("测试"+j);
			}
		}
		// 创建文件流
		FileOutputStream stream = new FileOutputStream(outPath);
		// 写入数据
		wb.write(stream);
		// 关闭文件流
		stream.close();
		return true;
	}
}
