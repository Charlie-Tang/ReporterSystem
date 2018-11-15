package com.reporter.test.Tools;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import com.reporter.test.Tools.XlsUtil_Folic2;

public class Element {

	public static void main(String[] args) throws Exception  {
//		String template = "C:\\Users\\tangqichang\\Desktop\\维生素\\Element_Template.pdf";
//		String config = "C:\\Users\\tangqichang\\Desktop\\维生素\\conf.xlsx";
//		String info = "C:\\Users\\tangqichang\\Desktop\\维生素\\info.xlsx";
//		String exp = "C:\\Users\\tangqichang\\Desktop\\维生素\\exp.xlsx";
//		String directoryName = "C:\\Users\\tangqichang\\Desktop\\维生素\\ZYL";
	}
	
	public void  Generated(String config,String info,String exp,String directoryName)throws Exception
	{
		String template = "C:\\Users\\tangqichang\\Desktop\\元素\\Element_Template.pdf";
		
		try {
			XlsUtil_Folic2.readValue(exp);
			XlsUtil_Folic2.readConfig(config);
			XlsUtil_Folic2.readInfo(info);    //生成pretreatment.xls文件
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File theDir = new File(directoryName);

		// if the directory does not exist, create it
		if (!theDir.exists()) {
			System.out.println("creating directory: " + directoryName);
			boolean result = false;

			try {
				theDir.mkdir();
				result = true;
			} catch (SecurityException se) {
				// handle it
			}
			if (result) {
				System.out.println("DIR created");
			}
		}
	    
		String line;
		
		//tmpfile.write("NUM\tNAME\tSEX\tBIRTHDAY\tTEL\tCOMPANY\tTYPE\tSAMDATE\tINSPECTDAY\tRS\tRS_RESULT\tDS\tDS_RESULT\tJS\tJS_RESULT");
		int t1_i = -1, t2_i = -1, t3_i = -1, t4_i = -1, t5_i = -1, t6_i = -1, t7_i = -1, t8_i = -1, t9_i = -1,t10_i = -1, t11_i = -1, t12_i = -1, t13_i = -1, t14_i = -1, t15_i = -1, t16_i = -1, t17_i = -1, t18_i = -1,t19_i = -1,t20_i = -1,t21_i = -1,t22_i = -1,t23_i = -1,t24_i = -1,t25_i = -1,t26_i = -1,t27_i = -1,t28_i = -1,t29_i = -1,t30_i = -1;
		LineNumberReader designFin = new LineNumberReader(
				new FileReader("pretreatment.xls"));
		//NAME\tSEX\tAGE\tTEL\tSAMDATE\tNUM\tINSPECTDAY\tCOMPANY\tTYPE\tZn\tMn\tMg\tCu\tFe\tSe\tCr\tCo\tSr\tI\tPb\tHg\tCd\tAs\tTl\tINSPECT_MAN\tEXAM_MAN\tREP_DAY
		while ((line = designFin.readLine()) != null) {
			String[] record = line.split("\t");
			System.out.println(record.length);
			if (designFin.getLineNumber() == 1) {
				for (int i = 0; i < record.length; i++) {
					if (record[i].endsWith("NAME")) {
						t1_i = i;
					} else if (record[i].endsWith("SEX")) {
						t2_i = i;
					} else if (record[i].endsWith("AGE")) {
						t3_i = i;
					} else if (record[i].endsWith("TEL")) {
						t4_i = i;
					} else if (record[i].endsWith("SAMDATE")) {
						t5_i = i;
					} else if (record[i].endsWith("NUM")) {
						t6_i = i;
					} else if (record[i].endsWith("INSPECTDAY")) {
						t7_i = i;
					} else if (record[i].endsWith("COMPANY")) {
						t8_i = i;
					} else if (record[i].endsWith("TYPE")) {
						t9_i = i;
					} else if (record[i].endsWith("Zn")) {
						t10_i = i;
					}  else if (record[i].endsWith("Mn")) {
						t11_i = i;
					}  else if (record[i].endsWith("Mg")) {
						t12_i = i;
					}  else if (record[i].endsWith("Cu")) {
						t13_i = i;
					}  else if (record[i].endsWith("Fe")) {
						t14_i = i;
					}  else if (record[i].endsWith("Se")) {
						t15_i = i;
					}  else if (record[i].endsWith("Cr")) {
						t16_i = i;
					}  else if (record[i].endsWith("Co")) {
						t17_i = i;
					}  else if (record[i].endsWith("Sr")) {
						t18_i = i;
					}  else if (record[i].endsWith("I")) {
						t19_i = i;
					}  else if (record[i].endsWith("Pb")) {
						t20_i = i;
					}  else if (record[i].endsWith("Hg")) {
						t21_i = i;
					}  else if (record[i].endsWith("Cd")) {
						t22_i = i;
					}  else if (record[i].endsWith("As")) {
						t23_i = i;
					}  else if (record[i].endsWith("Tl")) {
						t24_i = i;
					} else if (record[i].endsWith("INSPECT_MAN")) {
						t25_i = i;
					} else if (record[i].endsWith("EXAM_MAN")) {
						t26_i = i;
					} else if (record[i].endsWith("REP_DAY")) {
						t27_i = i;
					} else if (record[i].endsWith("UNORMAL1")) {
						t28_i = i;
					} else if (record[i].endsWith("UNORMAL2")) {
						t29_i = i;
					} else if (record[i].endsWith("DEC")) {
						t30_i = i;
					} 
					
				}
				continue;
			}
			Map<String, String> map1 = new HashMap<String, String>();  //14号宋佄1�7		
			Map<String, String> map2 = new HashMap<String, String>();  //12号宋佄1�7
			ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
			//NAME\tSEX\tAGE\tTEL\tSAMDATE\tNUM\tINSPECTDAY\tCOMPANY\tTYPE\tZn\tMn\tMg\tCu\tFe\tSe\tCr\tCo\tSr\tI\tPb\tHg\tCd\tAs\tTl\tINSPECT_MAN\tEXAM_MAN\tREP_DAY
			map1.put("NAME", record[t1_i]);
			map1.put("SEX", record[t2_i]);
			map1.put("AGE", record[t3_i]);
			map1.put("TEL", record[t4_i]);
			map1.put("SAMDATE", record[t5_i]);
			map1.put("NUM", record[t6_i]);
			map1.put("INSPECTDAY", record[t7_i]);
			map1.put("COMPANY", record[t8_i]);
			map1.put("TYPE", record[t9_i]);
			map1.put("Zn", record[t10_i]);
			map1.put("Mn", record[t11_i]);
			map1.put("Mg", record[t12_i]);
			map1.put("Cu", record[t13_i]);
			map1.put("Fe", record[t14_i]);
			map1.put("Se", record[t15_i]);
			map1.put("Cr", record[t16_i]);
			map1.put("Co", record[t17_i]);
			map1.put("Sr", record[t18_i]);
			map1.put("I", record[t19_i]);
			map1.put("Pb", record[t20_i]);
			map1.put("Hg", record[t21_i]);
			map1.put("Cd", record[t22_i]);
			map1.put("As", record[t23_i]);
			map1.put("Tl", record[t24_i]);
			map1.put("INSPECT_MAN", record[t25_i]);
			map1.put("EXAM_MAN", record[t26_i]);
			map1.put("REP_DAY", record[t27_i]);
			map1.put("UNORMAL1", record[t28_i]);
			map1.put("UNORMAL2", record[t29_i]);
			map1.put("DEC", record[t30_i]);
			map2.put("NAME1", record[t1_i]);
			map2.put("AGE1", record[t3_i]);
			map2.put("NUM1", record[t6_i]);
			list.add(map1);
			list.add(map2);
			String outname = directoryName + "/" + record[t6_i] + "_DX1596_正式报告"
					 + ".pdf";
			System.out.println(outname);
			convertTransData(list, template, outname);

		}
		System.out.println("执行完毕");
	}
	
		

	/**
	 * 将数据转换为输入字节浄
	 * */
	public static InputStream convertTransData(
			ArrayList<Map<String, String>> list, String template, String outname)
			throws Exception {
		if (list == null || list.isEmpty() || list.get(0) == null)
			return null;
		// String template="./test.pdf";
		try {
			ByteArrayOutputStream out = (ByteArrayOutputStream) generate(new PdfReader(template),list);

			ByteArrayInputStream ret = new ByteArrayInputStream(
					out.toByteArray());
			// 将pdf字节流输出到文件浄1�7
			FileOutputStream fos = new FileOutputStream(outname);
			fos.write(out.toByteArray());
			fos.close();
			out.close();
			return ret;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * 将数据，填入pdf表单 
	 * */
	public static ByteArrayOutputStream generate(PdfReader template,ArrayList<Map<String, String>>  data)
			throws Exception {

		BaseFont bfChinese = BaseFont.createFont("STSong-Light",
				"UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
		// BaseFont font =bfChinese;
		// BaseFont bfChinese = BaseFont.createFont("STSong-Light",
		// "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();

			PdfStamper stamp = new PdfStamper(template, out);
			AcroFields form = stamp.getAcroFields(); /* 取出报表模板中的扄1�7有字殄1�7 */

			// set the field values in the pdf form
			Map dat=data.get(0);
			for (Iterator it = dat.keySet().iterator(); it.hasNext();) {
				String key = (String) it.next();
				String value = (String) dat.get(key);
				form.setFieldProperty(key, "textsize", new Float(12), null); // 设置字体size 
				form.setFieldProperty(key, "textfont", bfChinese, null); // 设置字体
				form.setField(key, value);

			}
			
			dat=data.get(1);
			for (Iterator it = dat.keySet().iterator(); it.hasNext();) {
				String key = (String) it.next();
				String value = (String) dat.get(key);
				form.setFieldProperty(key, "textsize", new Float(9), null); // 设置字体size
				form.setFieldProperty(key, "textfont", bfChinese, null); // 设置字体
				form.setField(key, value);
			}

			stamp.setFormFlattening(false);
			stamp.close();
			template.close();

			return out;

		}

		catch (Exception e) {

			e.printStackTrace();

			return null;
		}

	}

}
