package com;
import java.io.*;
public class WritingFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileWriter writer=new FileWriter("C:\\Users\\abbur\\OneDrive\\Desktop\\test.txt")) {
			writer.write("I like pizza\nIt is really good");
			System.out.println("File has been written");
			}
		catch(FileNotFoundException e){
			System.out.println("Could not find file location");
			
		}
		catch(IOException e) {
		   System.out.println("Could nt load file");
		}

	}

}
