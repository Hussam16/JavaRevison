package revision;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rectangleInCircle(8, 6, 5));
		System.out.println(rectangleInCircle(5, 9, 5));
		System.out.println(rectangleInCircle(4, 7, 4));
	}
	public static boolean rectangleInCircle(int w, int h, int radius) {
		boolean message=false;
		
		int areaRectangle=w*h;
		int areaCircle=(int) (3.14*radius*radius);
		if (areaRectangle<areaCircle) {
			message=true;
			}
		else if (areaRectangle==areaCircle||areaRectangle>areaCircle) {
			message=false;
			
		} 
			
		
		
		return message;
		
		
	  }

}
