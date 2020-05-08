import java.util.HashSet;
public class HashCodes {
	public static void main(String args[]) {
		Pen pen1=new Pen(10,"Blue");
		Pen pen2=new Pen(10,"Blue");
		
		System.out.println(pen1);
		System.out.println(pen2);
		System.out.println(pen1.equals(pen2));
	}
}
class Pen{
	int price;
	String color;
	public Pen(int price,String color) {
		this.price=price;
		this.color=color;
		
	}
	@Override
	public boolean equals(Object obj) {
		Pen that=(Pen)obj;
		boolean isEqual=this.price==that.price&&this.color.equals(that.color);
		return isEqual;
	}
	@Override
	public int hashCode() {
		return price+color.hashCode();
		
	}
	
}
//Get different hash values means treated different objects