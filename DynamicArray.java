package classesandobjects;

public class DynamicArray {
	private int data[];
	private int nextelement_index;
	
	public DynamicArray()
	{
		data = new int[5];
		nextelement_index = 0;
	}

	public void add(int num) {
		// TODO Auto-generated method stub
		if(nextelement_index == data.length)
		{
			IncreaseCapacity();
		}
		data[nextelement_index] = num;
		nextelement_index++;
	}

	private void IncreaseCapacity() {
		// TODO Auto-generated method stub
		int temp[] = data;
		data = new int[2*temp.length];
		for(int i = 0;i < temp.length;i++)
			data[i]=temp[i];
	}

	public int size() {
		// TODO Auto-generated method stub
		return nextelement_index;
	}

	public int get(int i) {
		// TODO Auto-generated method stub
		if(i >= nextelement_index)
			return -1;
		return data[i];
	}

	public boolean isempty() {
		// TODO Auto-generated method stub
		return nextelement_index == 0;
	}

	public int removelast() {
		// TODO Auto-generated method stub
		if(nextelement_index == 0)
			return -1;
		
		int temp = data[nextelement_index - 1];
		data[nextelement_index - 1] = 0;
		nextelement_index--;
		return temp;
	}

	public void add(int index, int element) {
		// TODO Auto-generated method stub
		if(nextelement_index == data.length)
		{
			IncreaseCapacity();
		}
		
		for(int i = nextelement_index;i-1 >= index;i--)
		{
			data[i] = data[i-1];
		}
		
		data[index] = element;
		nextelement_index++;
		
		for(int i = 0;i < data.length;i++)
		{
			System.out.print(data[i] + " ");
		}
		
		System.out.println();
		
	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		if(nextelement_index == data.length)
		{
			IncreaseCapacity();
		}
		data[index] = 0;
		for(int i = index;i+1 < data.length;i++)
		{
			data[i] = data[i+1];
		}
		
		
		nextelement_index--;
		
		for(int i = 0;i < data.length;i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
	}

}
