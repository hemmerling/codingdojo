package com.hemmerling.gameoflife.coderetreat03;

public class Zelle {
	private Status status;
	
	public Zelle(){
		this.status = Status.TOT;
	}
	
	public Zelle(Status status){
		this.status = status;
	}
	
	public Status getStatus() {
		return this.status;
	}
	
	public void setStatus(Status status){
		this.status = status;
	}
	
	public enum Status { TOT, LEBENDIG }
}
