public class Computer{
	public static String os="windows";
	public String ram;
	public static void main(String[]args){
		Computer comp1=new Computer();
		Computer comp2=new Computer();
		comp1.ram="8GB";
		comp2.ram="16GB";
        System.out.println("OS :"+Computer.os);
		System.out.println("computer 1 RAM :"+comp1.ram);
		System.out.println("computer 2 RAM :"+comp2.ram);
	}
}