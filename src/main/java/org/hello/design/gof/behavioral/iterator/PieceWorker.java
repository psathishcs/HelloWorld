package org.hello.design.gof.behavioral.iterator;

public class PieceWorker implements Employee{
	private double wagePerPiece;
	private int quantity;
	private String name;
	
	public PieceWorker(String name, double wagePerPiece, int quantity){
		this.wagePerPiece = wagePerPiece;
		setWagePerPiece(wagePerPiece);
		setQuantity(quantity);
	}

	public void setWagePerPiece(double wagePerPiece) {
		if (wagePerPiece > 0) {
			this.wagePerPiece = wagePerPiece;
		} else 
			this.wagePerPiece = 0;
	}

	public void setQuantity(int quantity) {
		if (quantity > 0 ) {
			this.quantity = quantity;
		}else 
			this.quantity = 0;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public double earnings() {
		return quantity * wagePerPiece;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PieceWorker : " + getName();
	}

}
