package com;

public class Telephone2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] telephone= {{'1','2','3'},
				{'4','5','6'},
				{'7','8','9'},
				{'*','0','#'}};
		for(char[] row:telephone) {
			for(char number:row) {
				System.out.print(number+" ");
			}
			System.out.println();
		}

	}

}
