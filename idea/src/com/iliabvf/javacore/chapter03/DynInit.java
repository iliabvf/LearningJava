package com.iliabvf.javacore.chapter03;

// В  этом примере демонстрируется динамическая инициализация 
class DynInit { 
	public static void main (String args[])   { 
		double a = 3.0, b =  4.0; 
		// динамическая инициализация переменной с 
		double с = Math.sqrt(a * a + b * b); 
		System.out.println("Гипoтeнyзa равна" + с);
	}
}