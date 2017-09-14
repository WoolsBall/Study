package com.learn.day8;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * ≤‚ ‘Runnable
 */
public class TestRunnable extends JFrame implements Runnable {

	@Override
	public void run() {
		int i=0;
		JPanel panel=new JPanel();
		panel.setSize(300, 300);
		this.setContentPane(panel);
		while(true){
			i=i==0?1:0;
			if(i==0){
				panel.setBackground(Color.BLACK);
			}else{
					panel.setBackground(Color.WHITE);
			}
			
		}

	}

	public static void main(String[] args) {
		TestRunnable t=new TestRunnable();
		t.setSize(300, 300);
		t.setVisible(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Thread th=new Thread(t);
		th.start();
	}
}
