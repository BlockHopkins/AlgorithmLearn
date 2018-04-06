package utils;

import java.util.Scanner;

public class IOUtils {
	/**
	 * 通过输入获取一组数组
	 * @return
	 */
	public static int[] arrayInput(){
		println("请输入一组整型数组，用空格隔开：");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		String[] strArray = str.split(" ");
		int[] intArray = new int[strArray.length];
		for(int i=0; i<strArray.length; i++){
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		return intArray;
	}
	
	/**
	 * 输出
	 * @param obj
	 */
	public static void println(Object obj){
		System.out.println(obj);
	}
	
	/**
	 * 输出，带标签
	 * @param label
	 * @param obj
	 */
	public static void println(String label, Object obj){
		System.out.print(label+" --> ");
		println(obj);
	}
}
