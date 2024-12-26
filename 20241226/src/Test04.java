import java.util.Stack;

public class Test04 {

	public static void main(String[] args) {
		// Stack : First In Last Out
		Stack<Integer> s = new Stack<>();
		
		// push(value)
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.toString());
		
		// pop()
		s.pop();
		System.out.println(s.toString());
		s.pop();
		System.out.println(s.toString());
	}

}
