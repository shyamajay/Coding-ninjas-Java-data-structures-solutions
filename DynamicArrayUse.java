package classesandobjects;

public class DynamicArrayUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray d = new DynamicArray();
		for(int i = 1;i < 100;i++)
		{
			d.add(100+i);
		}
		System.out.println(d.size());
		d.add(98,10);
		System.out.println(d.size());
		d.remove(98);
		System.out.println(d.size());
		System.out.println(d.get(2));
		
		while(!d.isempty())
		{
			System.out.println(d.removelast());
			System.out.println("size - " + d.size());
		}

	}

}
