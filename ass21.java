public class ass21
{
	public static void main(String args[])
	{	
		Thread t = Thread.currentThread();
		System.out.println("NAME OF THE CURRENT THREAD IS : " + t.getName());
		System.out.println("PRIOTITY OF THE CURRENT THREAD IS : " + t.getPriority());
		t.setName("mythread");
		t.setPriority(2);
		System.out.println("NAME OF THE CURRENT THREAD IS : " + t.getName());
		System.out.println("PRIOTITY OF THE CURRENT THREAD IS : " + t.getPriority());
	}
}