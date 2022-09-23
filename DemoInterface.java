
public interface DemoInterface {

	
	void test();
	private void call() {
		System.out.println("private method");
	}
	default void text() {
		System.out.println("default method");
	}
	/*
	 * protected void video() {
	 * 
	 * }
	 */
	
}
