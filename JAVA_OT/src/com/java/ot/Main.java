package com.java.ot;

public class Main {
	
	private Input inputIns = new Input();
	private Proccess proccess = new Proccess();
	private Output output = new Output();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		
		//입력
		String input = main.inputIns.input();
		
		//처리
		String str = main.proccess.proccess(input);
		
		//출력
		main.output.output(str);
	}

}
