package YourLnuUserName_assign1;

public class ArrayIntStack extends AbstractIntCollection implements IntStack
{
	ArrayIntStack() {};
	
	@Override
	public void push(int n) {
		// TODO Auto-generated method stub
		int[] temp=new int[size+1];
		System.arraycopy(values,0,temp,0,size); 
		temp[size]=n;
		values=temp;
		++size;
	}

	@Override
	public int pop() throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(size==0)
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			int res = values[size-1]; 
			int[] temp=new int[size-1];
			System.arraycopy(values, 0, temp, 0, values.length-1);
			--size;
			values=temp;
			return res;
		}
	}

	@Override
	public int peek() throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(size==0)
		{
			throw new IndexOutOfBoundsException();
		}
		else
		{
			return values[size-1];
		}
	}
	
}
