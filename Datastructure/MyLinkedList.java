package Datastructure;

public class MyLinkedList<E>{
	private Node<E> head;	// head pointer
		@SuppressWarnings("hiding")// To avoid warning because of 
									//annoying generic's in java
		private class Node<E>{	// structure of Node class
		E data;
		Node<E> next;
		
		public Node(E data) // Constructor of Node class
		{
			this.data=data;
			this.next=null;
		}
	} 
	
	
	
	public void add(E data){
		Node<E> obj = new Node<>(data);	// Creating Node class object
		if(head == null){
			head = obj;
			return;
		}
		Node<E> temp = head;
		obj.next = temp;
		head = obj;
//		while(temp.next != null) { temp = temp.next; }
//		temp.next = obj;	
	}
	
	
	public void pop() {
		Node<E> temp = head;
		System.out.println(temp.data);
		head = head.next;
	}
	
	public boolean isEmpty()
	{
		if(head == null)	// if head is null the list is empty
			return true;
		else return false;
	}
	
	public void printAll()throws Exception
	{
		Node<E> temp = head;
		if(head == null)
			throw new Exception("Stack is Empty");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	void remove(int index)
	{
		Node<E> temp = head;
		int cnt = 1;
		if(index == 0)
		{
			head = head.next;
		}
		else
		{
			while(cnt<index)
			{
				temp = temp.next;
				cnt++;
			}
			Node<E> temp1 = temp.next.next;
			temp.next = temp1;
		}
	}
	
	void get(int index)
	{
		Node<E> temp = head;
		int cnt = 0;
		while(cnt<index)
		{
			temp = temp.next;
			cnt++;
		}
		System.out.println(temp.data);
	}
	
	void set(int index, E data)
	{
		Node<E> obj = new Node<>(data);
		Node<E> temp = head;
		int cnt = 1;
		if(index == 0)
		{
			obj.next = head;
			head = obj;
		}
		else
		{
			while(cnt<index)
			{
				temp = temp.next;
				cnt++;
			}
			obj.next = temp.next;
			temp.next = obj;			
		}
	}	
}







map<long long,long long> l,r;

int main()
{
 long long n, k,ans=0 ;
 scanf("%lld%lld",&n,&k);
 long long a[n];
 for(int i=0;i<n;i++)
  scanf("%lld",&a[i]);
 for(int i=0;i<n;i++)
  r[a[i]]++;
 for(int i=0;i<n;i++)
 {
  r[a[i]]--;
  if(a[i]%k==0)
  {
   ans+=l[a[i]/k]*r[a[i]*k];
  }
  l[a[i]]++;
 }
 printf("%lld\n",ans);
 return 0;
}