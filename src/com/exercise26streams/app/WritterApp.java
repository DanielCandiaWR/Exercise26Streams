package com.exercise26streams.app;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;
public class WritterApp {
	public static void main(String[] args) {
		final int LIMIT = 24;
		File myFile = null;
		FileWriter myWriter = null;
		BufferedWriter myBuffer = null;
		Scanner input = new Scanner(System.in);
		int table= 0;
		
		try {
			myFile = new File("e:\\a\\b.txt");
			myWriter = new FileWriter(myFile); //Sobreescribe el contenido
			//myWriter = new FileWriter(myFile,true);
			myBuffer = new BufferedWriter(myWriter);
			System.out.print("Input the multiplication table: ");
			table = input.nextInt();
			for(int i=0;i<=LIMIT;i++) {
				System.out.format("%d x %d = %d\n", table,i,table*i);
				myBuffer.write(String.format("%d x %d = %d\n", table,i,table*i));
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				myBuffer.close();
				myWriter = null;
				myFile = null;
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
