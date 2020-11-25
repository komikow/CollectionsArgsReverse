package com.company;
//Отобразить в окне консоли аргументы командной строки в обратном порядке.
public class Main {

    public static void main(String[] args) {
	    for (int i= args.length-1; i>=0; i--){
            System.out.print("Args "+i+" = "+args[i]);
            System.out.print("; ");
        }
    }
}
