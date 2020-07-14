package Questions;

class Stack{
	char arr[] = new char[100];
	static int top = -1;
	void push(char c)
	{
		if(top == 99)
			System.out.println("Stack is full");
		else
		{
			arr[++top] = c;
		}	
	}
	char pop()
	{
		if(top == -1)
			{
			System.out.println("Stack is Empty");
			return '\0';
			}
		
		else
		{
			return arr[top--];
		}
	}
	
	static boolean isEmpty() 
	{ 
		return (top == -1) ? true : false; 
	} 
	
	void Balanced(char arr[])
	{
		boolean flag = true;
		System.out.println(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='(' || arr[i]=='{' || arr[i]=='[')
				push(arr[i]);
			else {
					if(isEmpty())
					{
						flag = false;
						break;
					}
					if(!check(pop(), arr[i]))	// follow strictly in this order
					{
						flag = false;
						break;
					}
				}
			
		}
		if(!isEmpty())
		{
			flag = false;
		}
		
		
		if(flag == false)
		{
			System.out.println("Not Balanced");
		}
		else
			System.out.println("Balanced");
	}
	boolean check(char one, char two)
	{
		if(one == '(' && two == ')')
			return true;
		else if(one == '{' && two == '}')
			return true;
		else if(one == '[' && two == ']')
			return true;
		else
			return false;
	}
	
}

public class BalancedParenthesis {
	
	public static void main(String args[])
	{
		Stack obj = new Stack();
		String str = "([]";
		char [] arr = str.toCharArray();
		obj.Balanced(arr);
	}
}