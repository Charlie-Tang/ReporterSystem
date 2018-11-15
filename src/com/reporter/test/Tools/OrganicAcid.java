package com.reporter.test.Tools;
//package cn.genomics.pdf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import com.reporter.test.Tools.XlsUtil_Folic;

public class OrganicAcid {
	
//	String template = "C:\\Users\\tangqichang\\Documents\\Tencent Files\\604623486\\FileRecv\\templateNew.pdf";//设定的pdf模板所在位置
//	String config = "C:\\Users\\tangqichang\\Documents\\Tencent Files\\604623486\\FileRecv\\rangeNew.xlsx";//这三个exl表格的位置是固定的
//	String info = "C:\\Users\\tangqichang\\Documents\\Tencent Files\\604623486\\FileRecv\\info.xlsx";
//	String exp = "C:\\Users\\tangqichang\\Documents\\Tencent Files\\604623486\\FileRecv\\testR.xlsx";
//	String directoryName = "D:\\outdir";//生成的文件夹所在位置
	
	//三个要导入的xlsx表格名称、文件夹名
	public void Generated(String config,String info,String exp,String directoryName) throws FileNotFoundException, DocumentException, IOException
	
	{
		String template = "C:\\Users\\tangqichang\\Desktop\\有机酸\\templateNew.pdf";
		
		try {
			XlsUtil_Folic.readValue(exp);
			XlsUtil_Folic.readConfig(config);
			XlsUtil_Folic.readInfo(info);    //生成pretreatment.xls文件
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//插入图片
		
		
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
		int t1_i = -1, t2_i = -1, t3_i = -1, t4_i = -1, t5_i = -1, t6_i = -1, t7_i = -1, t8_i = -1, t9_i = -1, V1 = -1, V1_i = -1, V2 = -1, V2_i = -1,V3=-1,V3_i=-1,V4=-1,V4_i=-1,V5=-1,V5_i=-1,V6=-1,V6_i=-1,V7=-1,V7_i=-1,V8=-1,V8_i=-1,V9=-1,V9_i=-1,V10=-1,V10_i=-1,V11=-1,V11_i=-1,V12=-1,V12_i=-1,V13=-1,V13_i=-1,V14=-1,V14_i=-1,V15=-1,V15_i=-1,V16=-1,V16_i=-1,V17=-1,V17_i=-1,V18=-1,V18_i=-1,V19=-1,V19_i=-1,V20=-1,V20_i=-1,V21=-1,V21_i=-1,V22=-1,V22_i=-1,V23=-1,V23_i=-1,V24=-1,V24_i=-1,V25=-1,V25_i=-1,V26=-1,V26_i=-1,V27=-1,V27_i=-1,V28=-1,V28_i=-1,V29=-1,V29_i=-1,V30=-1,V30_i=-1,V31=-1,V31_i=-1,V32=-1,V32_i=-1,V33=-1,V33_i=-1,V34=-1,V34_i=-1,V35=-1,V35_i=-1,V36=-1,V36_i=-1,V37=-1,V37_i=-1,V38=-1,V38_i=-1,V39=-1,V39_i=-1,V40=-1,V40_i=-1,V41=-1,V41_i=-1,V42=-1,V42_i=-1,V43=-1,V43_i=-1,V44=-1,V44_i=-1,V45=-1,V45_i=-1,V46=-1,V46_i=-1,V47=-1,V47_i=-1,V48=-1,V48_i=-1,V49=-1,V49_i=-1,V50=-1,V50_i=-1,V51=-1,V51_i=-1,V52=-1,V52_i=-1,V53=-1,V53_i=-1,V54=-1,V54_i=-1,V55=-1,V55_i=-1,V56=-1,V56_i=-1,V57=-1,V57_i=-1,V58=-1,V58_i=-1,V59=-1,V59_i=-1,V60=-1,V60_i=-1,V61=-1,V61_i=-1,V62=-1,V62_i=-1,V63=-1,V63_i=-1,V64=-1,V64_i=-1,V65=-1,V65_i=-1,V66=-1,V66_i=-1,V67=-1,V67_i=-1,V68=-1,V68_i=-1,V69=-1,V69_i=-1,V70=-1,V70_i=-1,V71=-1,V71_i=-1,V72=-1,V72_i=-1,V73=-1,V73_i=-1,V74=-1,V74_i=-1,V75=-1,V75_i=-1,V76=-1,V76_i=-1,V77=-1,V77_i=-1,V78=-1,V78_i=-1,V79=-1,V79_i=-1,V80=-1,V80_i=-1,V81=-1,V81_i=-1,V82=-1,V82_i=-1,V83=-1,V83_i=-1,V84=-1,V84_i=-1,V85=-1,V85_i=-1,V86=-1,V86_i=-1,V87=-1,V87_i=-1,V88=-1,V88_i=-1,V89=-1,V89_i=-1,V90=-1,V90_i=-1,V91=-1,V91_i=-1,V92=-1,V92_i=-1,V93=-1,V93_i=-1,V94=-1,V94_i=-1,V95=-1,V95_i=-1,V96=-1,V96_i=-1,V97=-1,V97_i=-1,V98=-1,V98_i=-1,V99=-1,V99_i=-1,V100=-1,V100_i=-1,V101=-1,V101_i=-1,V102=-1,V102_i=-1,V103=-1,V103_i=-1,V104=-1,V104_i=-1,V105=-1,V105_i=-1,V106=-1,V106_i=-1,V107=-1,V107_i=-1,V108=-1,V108_i=-1,V109=-1,V109_i=-1,V110=-1,V110_i=-1,V111=-1,V111_i=-1,V112=-1,V112_i=-1,V113=-1,V113_i=-1,V114=-1,V114_i=-1,V115=-1,V115_i=-1,V116=-1,V116_i=-1,V117=-1,V117_i=-1,V118=-1,V118_i=-1,V119=-1,V119_i=-1,V120=-1,V120_i=-1,V121=-1,V121_i=-1,V122=-1,V122_i=-1,V123=-1,V123_i=-1,V124=-1,V124_i=-1,V125=-1,V125_i=-1,V126=-1,V126_i=-1,V127=-1,V127_i=-1,V128=-1,V128_i=-1,V129=-1,V129_i=-1,V130=-1,V130_i=-1,V131=-1,V131_i=-1,V132=-1,V132_i=-1,V133=-1,V133_i=-1,V134=-1,V134_i=-1;
		LineNumberReader designFin = null;
		try {
			designFin = new LineNumberReader(
					new FileReader("pretreatment.xls"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			while ((line = designFin.readLine()) != null) {
				String[] record = line.split("\t");
				if (designFin.getLineNumber() == 1) {
					for (int i = 0; i < record.length; i++) {
						if (record[i].endsWith("NUM")) {
							t1_i = i;
						} else if (record[i].endsWith("NAME")) {
							t2_i = i;
						} else if (record[i].endsWith("SEX")) {
							t3_i = i;
						} else if (record[i].endsWith("BIRTHDAY")) {
							t4_i = i;
						} else if (record[i].endsWith("TEL")) {
							t5_i = i;
						} else if (record[i].endsWith("COMPANY")) {
							t6_i = i;
						} else if (record[i].endsWith("TYPE")) {
							t7_i = i;
						} else if (record[i].endsWith("SAMDATE")) {
							t8_i = i;
						} else if (record[i].endsWith("INSPECTDAY")) {
							t9_i = i;
						} else if (record[i].endsWith("V1")) {
							V1 = i;
						} else if (record[i].endsWith("V1_RESULT")) {
							V1_i = i;
						} else if (record[i].endsWith("V2")) {
							V2 = i;
						} else if (record[i].endsWith("V2_RESULT")) {
							V2_i = i;
						}else if (record[i].endsWith("V3")) {
							V3 = i;
						} else if (record[i].endsWith("V3_RESULT")) {
							V3_i = i;
						}else if (record[i].endsWith("V4")) {
							V4 = i;
						} else if (record[i].endsWith("V4_RESULT")) {
						V4_i = i;
						}else if (record[i].endsWith("V5")) {
						V5 = i;
						} else if (record[i].endsWith("V5_RESULT")) {
						V5_i = i;
						}else if (record[i].endsWith("V6")) {
						V6 = i;
						} else if (record[i].endsWith("V6_RESULT")) {
						V6_i = i;
						}else if (record[i].endsWith("V7")) {
						V7 = i;
						} else if (record[i].endsWith("V7_RESULT")) {
						V7_i = i;
						}else if (record[i].endsWith("V8")) {
						V8 = i;
						} else if (record[i].endsWith("V8_RESULT")) {
						V8_i = i;
						}else if (record[i].endsWith("V9")) {
						V9 = i;
						} else if (record[i].endsWith("V9_RESULT")) {
						V9_i = i;
						}else if (record[i].endsWith("V10")) {
						V10 = i;
						} else if (record[i].endsWith("V10_RESULT")) {
						V10_i = i;
						}else if (record[i].endsWith("V11")) {
						V11 = i;
						} else if (record[i].endsWith("V11_RESULT")) {
						V11_i = i;
						}else if (record[i].endsWith("V12")) {
						V12 = i;
						} else if (record[i].endsWith("V12_RESULT")) {
						V12_i = i;
						}else if (record[i].endsWith("V13")) {
						V13 = i;
						} else if (record[i].endsWith("V13_RESULT")) {
						V13_i = i;
						}else if (record[i].endsWith("V14")) {
						V14 = i;
						} else if (record[i].endsWith("V14_RESULT")) {
						V14_i = i;
						}else if (record[i].endsWith("V15")) {
						V15 = i;
						} else if (record[i].endsWith("V15_RESULT")) {
						V15_i = i;
						}else if (record[i].endsWith("V16")) {
						V16 = i;
						} else if (record[i].endsWith("V16_RESULT")) {
						V16_i = i;
						}else if (record[i].endsWith("V17")) {
						V17 = i;
						} else if (record[i].endsWith("V17_RESULT")) {
						V17_i = i;
						}else if (record[i].endsWith("V18")) {
						V18 = i;
						} else if (record[i].endsWith("V18_RESULT")) {
						V18_i = i;
						}else if (record[i].endsWith("V19")) {
						V19 = i;
						} else if (record[i].endsWith("V19_RESULT")) {
						V19_i = i;
						}else if (record[i].endsWith("V20")) {
						V20 = i;
						} else if (record[i].endsWith("V20_RESULT")) {
						V20_i = i;
						}else if (record[i].endsWith("V21")) {
						V21 = i;
						} else if (record[i].endsWith("V21_RESULT")) {
						V21_i = i;
						}else if (record[i].endsWith("V22")) {
						V22 = i;
						} else if (record[i].endsWith("V22_RESULT")) {
						V22_i = i;
						}else if (record[i].endsWith("V23")) {
						V23 = i;
						} else if (record[i].endsWith("V23_RESULT")) {
						V23_i = i;
						}else if (record[i].endsWith("V24")) {
						V24 = i;
						} else if (record[i].endsWith("V24_RESULT")) {
						V24_i = i;
						}else if (record[i].endsWith("V25")) {
						V25 = i;
						} else if (record[i].endsWith("V25_RESULT")) {
						V25_i = i;
						}else if (record[i].endsWith("V26")) {
						V26 = i;
						} else if (record[i].endsWith("V26_RESULT")) {
						V26_i = i;
						}else if (record[i].endsWith("V27")) {
						V27 = i;
						} else if (record[i].endsWith("V27_RESULT")) {
						V27_i = i;
						}else if (record[i].endsWith("V28")) {
						V28 = i;
						} else if (record[i].endsWith("V28_RESULT")) {
						V28_i = i;
						}else if (record[i].endsWith("V29")) {
						V29 = i;
						} else if (record[i].endsWith("V29_RESULT")) {
						V29_i = i;
						}else if (record[i].endsWith("V30")) {
						V30 = i;
						} else if (record[i].endsWith("V30_RESULT")) {
						V30_i = i;
						}else if (record[i].endsWith("V31")) {
						V31 = i;
						} else if (record[i].endsWith("V31_RESULT")) {
						V31_i = i;
						}else if (record[i].endsWith("V32")) {
						V32 = i;
						} else if (record[i].endsWith("V32_RESULT")) {
						V32_i = i;
						}else if (record[i].endsWith("V33")) {
						V33 = i;
						} else if (record[i].endsWith("V33_RESULT")) {
						V33_i = i;
						}else if (record[i].endsWith("V34")) {
						V34 = i;
						} else if (record[i].endsWith("V34_RESULT")) {
						V34_i = i;
						}else if (record[i].endsWith("V35")) {
						V35 = i;
						} else if (record[i].endsWith("V35_RESULT")) {
						V35_i = i;
						}else if (record[i].endsWith("V36")) {
						V36 = i;
						} else if (record[i].endsWith("V36_RESULT")) {
						V36_i = i;
						}else if (record[i].endsWith("V37")) {
						V37 = i;
						} else if (record[i].endsWith("V37_RESULT")) {
						V37_i = i;
						}else if (record[i].endsWith("V38")) {
						V38 = i;
						} else if (record[i].endsWith("V38_RESULT")) {
						V38_i = i;
						}else if (record[i].endsWith("V39")) {
						V39 = i;
						} else if (record[i].endsWith("V39_RESULT")) {
						V39_i = i;
						}else if (record[i].endsWith("V40")) {
						V40 = i;
						} else if (record[i].endsWith("V40_RESULT")) {
						V40_i = i;
						}else if (record[i].endsWith("V41")) {
						V41 = i;
						} else if (record[i].endsWith("V41_RESULT")) {
						V41_i = i;
						}else if (record[i].endsWith("V42")) {
						V42 = i;
						} else if (record[i].endsWith("V42_RESULT")) {
						V42_i = i;
						}else if (record[i].endsWith("V43")) {
						V43 = i;
						} else if (record[i].endsWith("V43_RESULT")) {
						V43_i = i;
						}else if (record[i].endsWith("V44")) {
						V44 = i;
						} else if (record[i].endsWith("V44_RESULT")) {
						V44_i = i;
						}else if (record[i].endsWith("V45")) {
						V45 = i;
						} else if (record[i].endsWith("V45_RESULT")) {
						V45_i = i;
						}else if (record[i].endsWith("V46")) {
						V46 = i;
						} else if (record[i].endsWith("V46_RESULT")) {
						V46_i = i;
						}else if (record[i].endsWith("V47")) {
						V47 = i;
						} else if (record[i].endsWith("V47_RESULT")) {
						V47_i = i;
						}else if (record[i].endsWith("V48")) {
						V48 = i;
						} else if (record[i].endsWith("V48_RESULT")) {
						V48_i = i;
						}else if (record[i].endsWith("V49")) {
						V49 = i;
						} else if (record[i].endsWith("V49_RESULT")) {
						V49_i = i;
						}else if (record[i].endsWith("V50")) {
						V50 = i;
						} else if (record[i].endsWith("V50_RESULT")) {
						V50_i = i;
						}else if (record[i].endsWith("V51")) {
						V51 = i;
						} else if (record[i].endsWith("V51_RESULT")) {
						V51_i = i;
						}else if (record[i].endsWith("V52")) {
						V52 = i;
						} else if (record[i].endsWith("V52_RESULT")) {
						V52_i = i;
						}else if (record[i].endsWith("V53")) {
						V53 = i;
						} else if (record[i].endsWith("V53_RESULT")) {
						V53_i = i;
						}else if (record[i].endsWith("V54")) {
						V54 = i;
						} else if (record[i].endsWith("V54_RESULT")) {
						V54_i = i;
						}else if (record[i].endsWith("V55")) {
						V55 = i;
						} else if (record[i].endsWith("V55_RESULT")) {
						V55_i = i;
						}else if (record[i].endsWith("V56")) {
						V56 = i;
						} else if (record[i].endsWith("V56_RESULT")) {
						V56_i = i;
						}else if (record[i].endsWith("V57")) {
						V57 = i;
						} else if (record[i].endsWith("V57_RESULT")) {
						V57_i = i;
						}else if (record[i].endsWith("V58")) {
						V58 = i;
						} else if (record[i].endsWith("V58_RESULT")) {
						V58_i = i;
						}else if (record[i].endsWith("V59")) {
						V59 = i;
						} else if (record[i].endsWith("V59_RESULT")) {
						V59_i = i;
						}else if (record[i].endsWith("V60")) {
						V60 = i;
						} else if (record[i].endsWith("V60_RESULT")) {
						V60_i = i;
						}else if (record[i].endsWith("V61")) {
						V61 = i;
						} else if (record[i].endsWith("V61_RESULT")) {
						V61_i = i;
						}else if (record[i].endsWith("V62")) {
						V62 = i;
						} else if (record[i].endsWith("V62_RESULT")) {
						V62_i = i;
						}else if (record[i].endsWith("V63")) {
						V63 = i;
						} else if (record[i].endsWith("V63_RESULT")) {
						V63_i = i;
						}else if (record[i].endsWith("V64")) {
						V64 = i;
						} else if (record[i].endsWith("V64_RESULT")) {
						V64_i = i;
						}else if (record[i].endsWith("V65")) {
						V65 = i;
						} else if (record[i].endsWith("V65_RESULT")) {
						V65_i = i;
						}else if (record[i].endsWith("V66")) {
						V66 = i;
						} else if (record[i].endsWith("V66_RESULT")) {
						V66_i = i;
						}else if (record[i].endsWith("V67")) {
						V67 = i;
						} else if (record[i].endsWith("V67_RESULT")) {
						V67_i = i;
						}else if (record[i].endsWith("V68")) {
						V68 = i;
						} else if (record[i].endsWith("V68_RESULT")) {
						V68_i = i;
						}else if (record[i].endsWith("V69")) {
						V69 = i;
						} else if (record[i].endsWith("V69_RESULT")) {
						V69_i = i;
						}else if (record[i].endsWith("V70")) {
						V70 = i;
						} else if (record[i].endsWith("V70_RESULT")) {
						V70_i = i;
						}else if (record[i].endsWith("V71")) {
						V71 = i;
						} else if (record[i].endsWith("V71_RESULT")) {
						V71_i = i;
						}else if (record[i].endsWith("V72")) {
						V72 = i;
						} else if (record[i].endsWith("V72_RESULT")) {
						V72_i = i;
						}else if (record[i].endsWith("V73")) {
						V73 = i;
						} else if (record[i].endsWith("V73_RESULT")) {
						V73_i = i;
						}else if (record[i].endsWith("V74")) {
						V74 = i;
						} else if (record[i].endsWith("V74_RESULT")) {
						V74_i = i;
						}else if (record[i].endsWith("V75")) {
						V75 = i;
						} else if (record[i].endsWith("V75_RESULT")) {
						V75_i = i;
						}else if (record[i].endsWith("V76")) {
						V76 = i;
						} else if (record[i].endsWith("V76_RESULT")) {
						V76_i = i;
						}else if (record[i].endsWith("V77")) {
						V77 = i;
						} else if (record[i].endsWith("V77_RESULT")) {
						V77_i = i;
						}else if (record[i].endsWith("V78")) {
						V78 = i;
						} else if (record[i].endsWith("V78_RESULT")) {
						V78_i = i;
						}else if (record[i].endsWith("V79")) {
						V79 = i;
						} else if (record[i].endsWith("V79_RESULT")) {
						V79_i = i;
						}else if (record[i].endsWith("V80")) {
						V80 = i;
						} else if (record[i].endsWith("V80_RESULT")) {
						V80_i = i;
						}else if (record[i].endsWith("V81")) {
						V81 = i;
						} else if (record[i].endsWith("V81_RESULT")) {
						V81_i = i;
						}else if (record[i].endsWith("V82")) {
						V82 = i;
						} else if (record[i].endsWith("V82_RESULT")) {
						V82_i = i;
						}else if (record[i].endsWith("V83")) {
						V83 = i;
						} else if (record[i].endsWith("V83_RESULT")) {
						V83_i = i;
						}else if (record[i].endsWith("V84")) {
						V84 = i;
						} else if (record[i].endsWith("V84_RESULT")) {
						V84_i = i;
						}else if (record[i].endsWith("V85")) {
						V85 = i;
						} else if (record[i].endsWith("V85_RESULT")) {
						V85_i = i;
						}else if (record[i].endsWith("V86")) {
						V86 = i;
						} else if (record[i].endsWith("V86_RESULT")) {
						V86_i = i;
						}else if (record[i].endsWith("V87")) {
						V87 = i;
						} else if (record[i].endsWith("V87_RESULT")) {
						V87_i = i;
						}else if (record[i].endsWith("V88")) {
						V88 = i;
						} else if (record[i].endsWith("V88_RESULT")) {
						V88_i = i;
						}else if (record[i].endsWith("V89")) {
						V89 = i;
						} else if (record[i].endsWith("V89_RESULT")) {
						V89_i = i;
						}else if (record[i].endsWith("V90")) {
						V90 = i;
						} else if (record[i].endsWith("V90_RESULT")) {
						V90_i = i;
						}else if (record[i].endsWith("V91")) {
						V91 = i;
						} else if (record[i].endsWith("V91_RESULT")) {
						V91_i = i;
						}else if (record[i].endsWith("V92")) {
						V92 = i;
						} else if (record[i].endsWith("V92_RESULT")) {
						V92_i = i;
						}else if (record[i].endsWith("V93")) {
						V93 = i;
						} else if (record[i].endsWith("V93_RESULT")) {
						V93_i = i;
						}else if (record[i].endsWith("V94")) {
						V94 = i;
						} else if (record[i].endsWith("V94_RESULT")) {
						V94_i = i;
						}else if (record[i].endsWith("V95")) {
						V95 = i;
						} else if (record[i].endsWith("V95_RESULT")) {
						V95_i = i;
						}else if (record[i].endsWith("V96")) {
						V96 = i;
						} else if (record[i].endsWith("V96_RESULT")) {
						V96_i = i;
						}else if (record[i].endsWith("V97")) {
						V97 = i;
						} else if (record[i].endsWith("V97_RESULT")) {
						V97_i = i;
						}else if (record[i].endsWith("V98")) {
						V98 = i;
						} else if (record[i].endsWith("V98_RESULT")) {
						V98_i = i;
						}else if (record[i].endsWith("V99")) {
						V99 = i;
						} else if (record[i].endsWith("V99_RESULT")) {
						V99_i = i;
						}else if (record[i].endsWith("V100")) {
						V100 = i;
						} else if (record[i].endsWith("V100_RESULT")) {
						V100_i = i;
						}else if (record[i].endsWith("V101")) {
						V101 = i;
						} else if (record[i].endsWith("V101_RESULT")) {
						V101_i = i;
						}else if (record[i].endsWith("V102")) {
						V102 = i;
						} else if (record[i].endsWith("V102_RESULT")) {
						V102_i = i;
						}else if (record[i].endsWith("V103")) {
						V103 = i;
						} else if (record[i].endsWith("V103_RESULT")) {
						V103_i = i;
						}else if (record[i].endsWith("V104")) {
						V104 = i;
						} else if (record[i].endsWith("V104_RESULT")) {
						V104_i = i;
						}else if (record[i].endsWith("V105")) {
						V105 = i;
						} else if (record[i].endsWith("V105_RESULT")) {
						V105_i = i;
						}else if (record[i].endsWith("V106")) {
						V106 = i;
						} else if (record[i].endsWith("V106_RESULT")) {
						V106_i = i;
						}else if (record[i].endsWith("V107")) {
						V107 = i;
						} else if (record[i].endsWith("V107_RESULT")) {
						V107_i = i;
						}else if (record[i].endsWith("V108")) {
						V108 = i;
						} else if (record[i].endsWith("V108_RESULT")) {
						V108_i = i;
						}else if (record[i].endsWith("V109")) {
						V109 = i;
						} else if (record[i].endsWith("V109_RESULT")) {
						V109_i = i;
						}else if (record[i].endsWith("V110")) {
						V110 = i;
						} else if (record[i].endsWith("V110_RESULT")) {
						V110_i = i;
						}else if (record[i].endsWith("V111")) {
						V111 = i;
						} else if (record[i].endsWith("V111_RESULT")) {
						V111_i = i;
						}else if (record[i].endsWith("V112")) {
						V112 = i;
						} else if (record[i].endsWith("V112_RESULT")) {
						V112_i = i;
						}else if (record[i].endsWith("V113")) {
						V113 = i;
						} else if (record[i].endsWith("V113_RESULT")) {
						V113_i = i;
						}else if (record[i].endsWith("V114")) {
						V114 = i;
						} else if (record[i].endsWith("V114_RESULT")) {
						V114_i = i;
						}else if (record[i].endsWith("V115")) {
						V115 = i;
						} else if (record[i].endsWith("V115_RESULT")) {
						V115_i = i;
						}else if (record[i].endsWith("V116")) {
						V116 = i;
						} else if (record[i].endsWith("V116_RESULT")) {
						V116_i = i;
						}else if (record[i].endsWith("V117")) {
						V117 = i;
						} else if (record[i].endsWith("V117_RESULT")) {
						V117_i = i;
						}else if (record[i].endsWith("V118")) {
						V118 = i;
						} else if (record[i].endsWith("V118_RESULT")) {
						V118_i = i;
						}else if (record[i].endsWith("V119")) {
						V119 = i;
						} else if (record[i].endsWith("V119_RESULT")) {
						V119_i = i;
						}else if (record[i].endsWith("V120")) {
						V120 = i;
						} else if (record[i].endsWith("V120_RESULT")) {
						V120_i = i;
						}else if (record[i].endsWith("V121")) {
						V121 = i;
						} else if (record[i].endsWith("V121_RESULT")) {
						V121_i = i;
						}else if (record[i].endsWith("V122")) {
						V122 = i;
						} else if (record[i].endsWith("V122_RESULT")) {
						V122_i = i;
						}else if (record[i].endsWith("V123")) {
						V123 = i;
						} else if (record[i].endsWith("V123_RESULT")) {
						V123_i = i;
						}else if (record[i].endsWith("V124")) {
						V124 = i;
						} else if (record[i].endsWith("V124_RESULT")) {
						V124_i = i;
						}else if (record[i].endsWith("V125")) {
						V125 = i;
						} else if (record[i].endsWith("V125_RESULT")) {
						V125_i = i;
						}else if (record[i].endsWith("V126")) {
						V126 = i;
						} else if (record[i].endsWith("V126_RESULT")) {
						V126_i = i;
						}else if (record[i].endsWith("V127")) {
						V127 = i;
						} else if (record[i].endsWith("V127_RESULT")) {
						V127_i = i;
						}else if (record[i].endsWith("V128")) {
						V128 = i;
						} else if (record[i].endsWith("V128_RESULT")) {
						V128_i = i;
						}else if (record[i].endsWith("V129")) {
						V129 = i;
						} else if (record[i].endsWith("V129_RESULT")) {
						V129_i = i;
						}else if (record[i].endsWith("V130")) {
						V130 = i;
						} else if (record[i].endsWith("V130_RESULT")) {
						V130_i = i;
						}else if (record[i].endsWith("V131")) {
						V131 = i;
						} else if (record[i].endsWith("V131_RESULT")) {
						V131_i = i;
						}else if (record[i].endsWith("V132")) {
						V132 = i;
						} else if (record[i].endsWith("V132_RESULT")) {
						V132_i = i;
						}else if (record[i].endsWith("V133")) {
						V133 = i;
						} else if (record[i].endsWith("V133_RESULT")) {
						V133_i = i;
						}else if (record[i].endsWith("V134")) {
						V134 = i;
						} else if (record[i].endsWith("V134_RESULT")) {
						V134_i = i;
						}
						
					}
					continue;
				}
				Map<String, String> map1 = new HashMap<String, String>();  	
				Map<String, String> map2 = new HashMap<String, String>();  
				ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();

				map1.put("NUM", record[t1_i]);
				map1.put("NAME", record[t2_i]);
				map1.put("SEX", record[t3_i]);
				map1.put("BIRTHDAY", record[t4_i]);
				map1.put("TEL", record[t5_i]);
				map1.put("COMPANY", record[t6_i]);
				map1.put("TYPE", record[t7_i]);
				map1.put("SAMDATE", record[t8_i]);
				map1.put("INSPECTDAY", record[t9_i]);
				map1.put("V1", record[V1]);
				map1.put("V1_RESULT", record[V1_i]);
				map1.put("V2", record[V2]);
				map1.put("V2_RESULT", record[V2_i]);
				map1.put("V3", record[V3]);
				map1.put("V3_RESULT", record[V3_i]);
				map1.put("V4", record[V4]);
				map1.put("V4_RESULT", record[V4_i]);
				map1.put("V5", record[V5]);
				map1.put("V5_RESULT", record[V5_i]);
				map1.put("V6", record[V6]);
				map1.put("V6_RESULT", record[V6_i]);
				map1.put("V7", record[V7]);
				map1.put("V7_RESULT", record[V7_i]);
				map1.put("V8", record[V8]);
				map1.put("V8_RESULT", record[V8_i]);
				map1.put("V9", record[V9]);
				map1.put("V9_RESULT", record[V9_i]);
				map1.put("V10", record[V10]);
				map1.put("V10_RESULT", record[V10_i]);
				map1.put("V11", record[V11]);
				map1.put("V11_RESULT", record[V11_i]);
				map1.put("V12", record[V12]);
				map1.put("V12_RESULT", record[V12_i]);
				map1.put("V13", record[V13]);
				map1.put("V13_RESULT", record[V13_i]);
				map1.put("V14", record[V14]);
				map1.put("V14_RESULT", record[V14_i]);
				map1.put("V15", record[V15]);
				map1.put("V15_RESULT", record[V15_i]);
				map1.put("V16", record[V16]);
				map1.put("V16_RESULT", record[V16_i]);
				map1.put("V17", record[V17]);
				map1.put("V17_RESULT", record[V17_i]);
				map1.put("V18", record[V18]);
				map1.put("V18_RESULT", record[V18_i]);
				map1.put("V19", record[V19]);
				map1.put("V19_RESULT", record[V19_i]);
				map1.put("V20", record[V20]);
				map1.put("V20_RESULT", record[V20_i]);
				map1.put("V21", record[V21]);
				map1.put("V21_RESULT", record[V21_i]);
				map1.put("V22", record[V22]);
				map1.put("V22_RESULT", record[V22_i]);
				map1.put("V23", record[V23]);
				map1.put("V23_RESULT", record[V23_i]);
				map1.put("V24", record[V24]);
				map1.put("V24_RESULT", record[V24_i]);
				map1.put("V25", record[V25]);
				map1.put("V25_RESULT", record[V25_i]);
				map1.put("V26", record[V26]);
				map1.put("V26_RESULT", record[V26_i]);
				map1.put("V27", record[V27]);
				map1.put("V27_RESULT", record[V27_i]);
				map1.put("V28", record[V28]);
				map1.put("V28_RESULT", record[V28_i]);
				map1.put("V29", record[V29]);
				map1.put("V29_RESULT", record[V29_i]);
				map1.put("V30", record[V30]);
				map1.put("V30_RESULT", record[V30_i]);
				map1.put("V31", record[V31]);
				map1.put("V31_RESULT", record[V31_i]);
				map1.put("V32", record[V32]);
				map1.put("V32_RESULT", record[V32_i]);
				map1.put("V33", record[V33]);
				map1.put("V33_RESULT", record[V33_i]);
				map1.put("V34", record[V34]);
				map1.put("V34_RESULT", record[V34_i]);
				map1.put("V35", record[V35]);
				map1.put("V35_RESULT", record[V35_i]);
				map1.put("V36", record[V36]);
				map1.put("V36_RESULT", record[V36_i]);
				map1.put("V37", record[V37]);
				map1.put("V37_RESULT", record[V37_i]);
				map1.put("V38", record[V38]);
				map1.put("V38_RESULT", record[V38_i]);
				map1.put("V39", record[V39]);
				map1.put("V39_RESULT", record[V39_i]);
				map1.put("V40", record[V40]);
				map1.put("V40_RESULT", record[V40_i]);
				map1.put("V41", record[V41]);
				map1.put("V41_RESULT", record[V41_i]);
				map1.put("V42", record[V42]);
				map1.put("V42_RESULT", record[V42_i]);
				map1.put("V43", record[V43]);
				map1.put("V43_RESULT", record[V43_i]);
				map1.put("V44", record[V44]);
				map1.put("V44_RESULT", record[V44_i]);
				map1.put("V45", record[V45]);
				map1.put("V45_RESULT", record[V45_i]);
				map1.put("V46", record[V46]);
				map1.put("V46_RESULT", record[V46_i]);
				map1.put("V47", record[V47]);
				map1.put("V47_RESULT", record[V47_i]);
				map1.put("V48", record[V48]);
				map1.put("V48_RESULT", record[V48_i]);
				map1.put("V49", record[V49]);
				map1.put("V49_RESULT", record[V49_i]);
				map1.put("V50", record[V50]);
				map1.put("V50_RESULT", record[V50_i]);
				map1.put("V51", record[V51]);
				map1.put("V51_RESULT", record[V51_i]);
				map1.put("V52", record[V52]);
				map1.put("V52_RESULT", record[V52_i]);
				map1.put("V53", record[V53]);
				map1.put("V53_RESULT", record[V53_i]);
				map1.put("V54", record[V54]);
				map1.put("V54_RESULT", record[V54_i]);
				map1.put("V55", record[V55]);
				map1.put("V55_RESULT", record[V55_i]);
				map1.put("V56", record[V56]);
				map1.put("V56_RESULT", record[V56_i]);
				map1.put("V57", record[V57]);
				map1.put("V57_RESULT", record[V57_i]);
				map1.put("V58", record[V58]);
				map1.put("V58_RESULT", record[V58_i]);
				map1.put("V59", record[V59]);
				map1.put("V59_RESULT", record[V59_i]);
				map1.put("V60", record[V60]);
				map1.put("V60_RESULT", record[V60_i]);
				map1.put("V61", record[V61]);
				map1.put("V61_RESULT", record[V61_i]);
				map1.put("V62", record[V62]);
				map1.put("V62_RESULT", record[V62_i]);
				map1.put("V63", record[V63]);
				map1.put("V63_RESULT", record[V63_i]);
				map1.put("V64", record[V64]);
				map1.put("V64_RESULT", record[V64_i]);
				map1.put("V65", record[V65]);
				map1.put("V65_RESULT", record[V65_i]);
				map1.put("V66", record[V66]);
				map1.put("V66_RESULT", record[V66_i]);
				map1.put("V67", record[V67]);
				map1.put("V67_RESULT", record[V67_i]);
				map1.put("V68", record[V68]);
				map1.put("V68_RESULT", record[V68_i]);
				map1.put("V69", record[V69]);
				map1.put("V69_RESULT", record[V69_i]);
				map1.put("V70", record[V70]);
				map1.put("V70_RESULT", record[V70_i]);
				map1.put("V71", record[V71]);
				map1.put("V71_RESULT", record[V71_i]);
				map1.put("V72", record[V72]);
				map1.put("V72_RESULT", record[V72_i]);
				map1.put("V73", record[V73]);
				map1.put("V73_RESULT", record[V73_i]);
				map1.put("V74", record[V74]);
				map1.put("V74_RESULT", record[V74_i]);
				map1.put("V75", record[V75]);
				map1.put("V75_RESULT", record[V75_i]);
				map1.put("V76", record[V76]);
				map1.put("V76_RESULT", record[V76_i]);
				map1.put("V77", record[V77]);
				map1.put("V77_RESULT", record[V77_i]);
				map1.put("V78", record[V78]);
				map1.put("V78_RESULT", record[V78_i]);
				map1.put("V79", record[V79]);
				map1.put("V79_RESULT", record[V79_i]);
				map1.put("V80", record[V80]);
				map1.put("V80_RESULT", record[V80_i]);
				map1.put("V81", record[V81]);
				map1.put("V81_RESULT", record[V81_i]);
				map1.put("V82", record[V82]);
				map1.put("V82_RESULT", record[V82_i]);
				map1.put("V83", record[V83]);
				map1.put("V83_RESULT", record[V83_i]);
				map1.put("V84", record[V84]);
				map1.put("V84_RESULT", record[V84_i]);
				map1.put("V85", record[V85]);
				map1.put("V85_RESULT", record[V85_i]);
				map1.put("V86", record[V86]);
				map1.put("V86_RESULT", record[V86_i]);
				map1.put("V87", record[V87]);
				map1.put("V87_RESULT", record[V87_i]);
				map1.put("V88", record[V88]);
				map1.put("V88_RESULT", record[V88_i]);
				map1.put("V89", record[V89]);
				map1.put("V89_RESULT", record[V89_i]);
				map1.put("V90", record[V90]);
				map1.put("V90_RESULT", record[V90_i]);
				map1.put("V91", record[V91]);
				map1.put("V91_RESULT", record[V91_i]);
				map1.put("V92", record[V92]);
				map1.put("V92_RESULT", record[V92_i]);
				map1.put("V93", record[V93]);
				map1.put("V93_RESULT", record[V93_i]);
				map1.put("V94", record[V94]);
				map1.put("V94_RESULT", record[V94_i]);
				map1.put("V95", record[V95]);
				map1.put("V95_RESULT", record[V95_i]);
				map1.put("V96", record[V96]);
				map1.put("V96_RESULT", record[V96_i]);
				map1.put("V97", record[V97]);
				map1.put("V97_RESULT", record[V97_i]);
				map1.put("V98", record[V98]);
				map1.put("V98_RESULT", record[V98_i]);
				map1.put("V99", record[V99]);
				map1.put("V99_RESULT", record[V99_i]);
				map1.put("V100", record[V100]);
				map1.put("V100_RESULT", record[V100_i]);
				map1.put("V101", record[V101]);
				map1.put("V101_RESULT", record[V101_i]);
				map1.put("V102", record[V102]);
				map1.put("V102_RESULT", record[V102_i]);
				map1.put("V103", record[V103]);
				map1.put("V103_RESULT", record[V103_i]);
				map1.put("V104", record[V104]);
				map1.put("V104_RESULT", record[V104_i]);
				map1.put("V105", record[V105]);
				map1.put("V105_RESULT", record[V105_i]);
				map1.put("V106", record[V106]);
				map1.put("V106_RESULT", record[V106_i]);
				map1.put("V107", record[V107]);
				map1.put("V107_RESULT", record[V107_i]);
				map1.put("V108", record[V108]);
				map1.put("V108_RESULT", record[V108_i]);
				map1.put("V109", record[V109]);
				map1.put("V109_RESULT", record[V109_i]);
				map1.put("V110", record[V110]);
				map1.put("V110_RESULT", record[V110_i]);
				map1.put("V111", record[V111]);
				map1.put("V111_RESULT", record[V111_i]);
				map1.put("V112", record[V112]);
				map1.put("V112_RESULT", record[V112_i]);
				map1.put("V113", record[V113]);
				map1.put("V113_RESULT", record[V113_i]);
				map1.put("V114", record[V114]);
				map1.put("V114_RESULT", record[V114_i]);
				map1.put("V115", record[V115]);
				map1.put("V115_RESULT", record[V115_i]);
				map1.put("V116", record[V116]);
				map1.put("V116_RESULT", record[V116_i]);
				map1.put("V117", record[V117]);
				map1.put("V117_RESULT", record[V117_i]);
				map1.put("V118", record[V118]);
				map1.put("V118_RESULT", record[V118_i]);
				map1.put("V119", record[V119]);
				map1.put("V119_RESULT", record[V119_i]);
				map1.put("V120", record[V120]);
				map1.put("V120_RESULT", record[V120_i]);
				map1.put("V121", record[V121]);
				map1.put("V121_RESULT", record[V121_i]);
				map1.put("V122", record[V122]);
				map1.put("V122_RESULT", record[V122_i]);
				map1.put("V123", record[V123]);
				map1.put("V123_RESULT", record[V123_i]);
				map1.put("V124", record[V124]);
				map1.put("V124_RESULT", record[V124_i]);
				map1.put("V125", record[V125]);
				map1.put("V125_RESULT", record[V125_i]);
				map1.put("V126", record[V126]);
				map1.put("V126_RESULT", record[V126_i]);
				map1.put("V127", record[V127]);
				map1.put("V127_RESULT", record[V127_i]);
				map1.put("V128", record[V128]);
				map1.put("V128_RESULT", record[V128_i]);
				map1.put("V129", record[V129]);
				map1.put("V129_RESULT", record[V129_i]);
				map1.put("V130", record[V130]);
				map1.put("V130_RESULT", record[V130_i]);
				map1.put("V131", record[V131]);
				map1.put("V131_RESULT", record[V131_i]);
				map1.put("V132", record[V132]);
				map1.put("V132_RESULT", record[V132_i]);
				map1.put("V133", record[V133]);
				map1.put("V133_RESULT", record[V133_i]);
				map1.put("V134", record[V134]);
				map1.put("V134_RESULT", record[V134_i]);
				list.add(map1);
				list.add(map2);
				String outname = directoryName + "/" + record[t1_i] + "-"
						+ record[t2_i] + "-" + record[t3_i] + "-" + record[t7_i]+".pdf";
				try {
					convertTransData(list, template, outname);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//		System.out.println("执行完毕");
	

	
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
			FileOutputStream fos = new FileOutputStream(outname);
			fos.write(out.toByteArray());
			fos.close();
			out.close();
			return ret;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	
	
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
			AcroFields form = stamp.getAcroFields(); 

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
				form.setFieldProperty(key, "textsize", new Float(12), null); // 设置字体size
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
