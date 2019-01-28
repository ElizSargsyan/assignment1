package YourLnuUserName_assign1;
import java.lang.IndexOutOfBoundsException;

public class ArrayIntList extends AbstractIntCollection implements IntList
{
	
	public ArrayIntList() {};
	
	@Override
	public void add(int n) {
		// TODO check
		int[] temp=new int[size+1];
		System.arraycopy(values,0,temp,0,size); 
		temp[size]=n;
		values=temp;
		++size;
	}

	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		// TODO check
		if(!checkIndex(index,size)){
			throw new IndexOutOfBoundsException(index);
		}
		else {
			int[] temp=new int[size+1];
			System.arraycopy(values, 0, temp, 0, index);
			temp[index]=n;
			System.arraycopy(values, index, temp, index+1, size-index);
			++size;
			values=temp;
		}
	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		// TODO check
		if(!checkIndex(index,size)){
			throw new IndexOutOfBoundsException(index);
		}
		else {
			int[] temp=new int[size-1];
			System.arraycopy(values, 0, temp, 0, index);
			System.arraycopy(values, index+1, temp, index, size-index-1);
			--size;
			values=temp;
		}
	}

	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		// TODO check
		if(!checkIndex(index,size)){
			throw new IndexOutOfBoundsException(index);
		}
		else {
			return values[index];
		}
	}

	@Override
	public int indexOf(int n) {
		// TODO check
		for(int i=0;i<size;++i){
			if(values[i]==n) {
				return i;
			}
		}
		return -1;
	}
	
}