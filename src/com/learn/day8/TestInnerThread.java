package com.learn.day8;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestInnerThread {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(300, 300);
		final JPanel panel=new JPanel();
		panel.setSize(300, 300);
		frame.setContentPane(panel);
		frame.setVisible(true);
		Thread t=new Thread(){
			public void run(){
				int i=0;
				while(true){
					i=i==0?1:0;
					if(i==0){
						panel.setBackground(Color.BLACK);
					}else{
						panel.setBackground(Color.WHITE);
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
	}

}
