package com.shail.MultiThreading;

public class WorkerThread implements Runnable {

	
	private String command;
	
	public WorkerThread(String command) {
	
		this.command=command;
	}
	
	private void processCommand() {
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start Command = " + command);
		processCommand();
		System.out.println(Thread.currentThread().getName() + " End Command = " + command);
	}
	
	public String toString() {
		return command;
	}

}
