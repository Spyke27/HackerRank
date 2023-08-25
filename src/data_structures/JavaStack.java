package data_structures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text for check: ");
		String input = sc.next();
		
		System.out.println(checkBalanced(input, '(', ')') &&
						   checkBalanced(input, '[', ']') &&
						   checkBalanced(input, '{', '}'));
		
		sc.close();
	}
	
	public static boolean checkBalanced(String input, char opening, char closing) {
		Stack<String> stack = new Stack<>();
		
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			if(c == opening) {
				stack.push(String.valueOf(c));
			} 
			if(c == closing) {
				if(stack.isEmpty()) {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		
		return stack.isEmpty();
	}

}
