package com.java.ot;

public class Main {
	
	private Input inputIns = new Input();
	private Proccess proccess = new Proccess();
	private Output output = new Output();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		
		//�Է�
		String input = main.inputIns.input();
		
		//ó��
		String str = main.proccess.proccess(input);
		
		//���
		main.output.output(str);
	}

}
