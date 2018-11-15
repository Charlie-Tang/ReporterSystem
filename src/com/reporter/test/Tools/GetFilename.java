package com.reporter.test.Tools;

import java.io.File;

public class GetFilename {

	public static void getFile(String path, int deep) {
		
		File file = new File(path); 
		
		File[] array = file.listFiles();  
		
		 for(int i=0;i<array.length;i++)
	        {   
	            if(array[i].isFile())//如果是文件
	            {   
	                    for (int j = 0; j < deep; j++)//输出前置空格
	                    System.out.print(" ");
	                // 只输出文件名字  
	                System.out.println( array[i].getName());   
	                // 输出当前文件的完整路径   
	               // System.out.println("#####" + array[i]);   
	                // 同样输出当前文件的完整路径   大家可以去掉注释 测试一下   
//	                System.out.println(array[i].getPath());   
	                
	                
	                
	            }
	            else if(array[i].isDirectory())//如果是文件夹
	            {  
	                    for (int j = 0; j < deep; j++)//输出前置空格
	                    System.out.print(" ");

	                    System.out.println( array[i].getName());
	                    //System.out.println(array[i].getPath());
	                    //文件夹需要调用递归 ，深度+1
	                getFile(array[i].getPath(),deep+1);  
	            }   
         }
	}
}
