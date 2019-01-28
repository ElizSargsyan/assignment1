package YourLnuUserName_assign1;

public class CollectionMain {
	public static void main(String[] args) {
		
		//List
		ArrayIntList lst=new ArrayIntList();
		if(lst.isEmpty()) {
			System.out.println("We have an empty list");
		}
		
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		System.out.println("Now we have " + lst);
		
		lst.addAt(7, 2);
		System.out.println("Adding 7 at position 2");
		System.out.println("Got a list "+ lst);
		//lst.addAt(4, 4);
		
		System.out.println("Removing element at position 1");
		lst.remove(1);
		System.out.println("Got a list "+ lst);
		
		System.out.println("First element of list is " + lst.get(1));
		System.out.println("Size of list is" + lst.size());
		
		//String str = lst.toString();
		//System.out.println(str);
		if(lst.indexOf(3) != -1) {
			System.out.println("Number 3 is at position " + lst.indexOf(3));
		}
		else{
			System.out.println("There isn't an element 3");
		}
		if(lst.indexOf(8) != -1) {
			System.out.println("Number 3 is at position " + lst.indexOf(3));
		}
		else{
			System.out.println("There isn't an element 8");
		}
		
		//Stack
		//TODO add some checkers
		ArrayIntStack stk = new ArrayIntStack();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		System.out.println(stk);
		System.out.println(stk.pop());
		System.out.println(stk);
		System.out.println(stk.peek());
		System.out.println(stk);
	}
}
