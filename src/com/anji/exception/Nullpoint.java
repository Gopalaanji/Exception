package com.anji.exception;

//anji

public class Nullpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		/*
		 * if (str.equals("java")) { //NullPointerException
		 * System.out.println("yes! str equals to java"); } else {
		 * System.out.print("str not equals to java"); }
		 */

		/*
		 * StringBuffer buffer = null; if("Suneel".equals("Suneel")){
		 * buffer.append("Kumar"); } System.out.println(buffer); }
		 */

		// TODO Auto-generated method stub
		StringBuffer buffer = null;
		if ("Suneel".equals("Suneel")) {
			buffer = new StringBuffer();
			buffer.append("Kumar");
		}
		System.out.println(buffer);
	}

	/*
	 * Object obj1 = new Object(); System.out.println(obj1.hashCode());
	 * System.out.println(obj1.hashCode()); Object obj2 =
	 * null;//NullPointerException System.out.println(obj2.hashCode());
	 */
}
