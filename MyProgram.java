// Fix the compilation error and invoke the method printMessage()of displayMessage class.

package JavaProgram;

class DisplayMessage {
	void printMessage() {
		System.out.println("Hello My Message");
		
	}
}

public class MyProgram {

	public static void main(String[] args) {
		DisplayMessage dis = new DisplayMessage();
		
		dis.printMessage();

	}

}
