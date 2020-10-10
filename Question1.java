import java.util.ArrayList;
import java.util.Iterator;

public class Q1 {
	ArrayList<String> list=new  ArrayList<String>();
	
	static void PrintAll(ArrayList<String> list) {
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
	}
	public static void main(String[] args) {
		ArrayList<String> list=new  ArrayList<String>();
		for(int i=1;i<=10;i++) {
			list.add("Element "+i);
		}
		PrintAll(list);
	}
}
