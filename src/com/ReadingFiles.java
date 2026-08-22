package com;
import java.io.*;
public class ReadingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath="C:\\Users\\abbur\\OneDrive\\Desktop\\test.txt";
		try(BufferedReader reader=new BufferedReader(new FileReader(filepath))){
			String line;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not locate file");
		}
		catch(IOException e) {
			System.out.println("Something went wrong");
		}
		

	}

}
