package day01;

public class Test02 {
	int i,j;
	public static void main(String[] args) {
for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 10-i; j++) 
		System.out.print(" ");
	for (int j = 0; j < 10; j++) 
	System.out.print("  *");
	System.out.println();
}
	}
}
