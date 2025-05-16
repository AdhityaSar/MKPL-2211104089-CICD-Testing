package src.main.java;

public class Counter {

	private int counte;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		counte = 0;
	}
	
	public void increment() {
		counte++;
	}
	
	public void decrement() {
		counte--;
	}
	
	public int getCount() {
		return counte;
	}
	
}
