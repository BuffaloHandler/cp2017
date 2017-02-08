package cp.week6;

/**
 *
 * @author Fabrizio Montesi <fmontesi@imada.sdu.dk>
 */
public class Exercise1
{
	/*
	- Create a Counter class storing an integer (a field called i), with an increment and decrement method.
	- Make Counter Thread-safe.
	- Does it make a different to declare i private or public?
	*/
	
	private static class counter{
		
		private int i;
		
		public counter(int i){
			this.i = i;
		}
		
		private void increment(){
			this.i = this.i + 1;
		}
		
		private void decrement(){
			this.i = this.i - 1;
		}
		
		private int getVal(){
			return i;
		}
	}

}
