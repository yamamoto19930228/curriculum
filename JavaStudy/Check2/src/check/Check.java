package check;

class Check {
	private static String firstName = "啓稔";
	private static String lastName = "山本";
	
	public static void main(String[]args){
		System.out.println("printNameメソッド → " + lastName + firstName);
		Pet javakichi = new  Pet("java吉", "hoge");
		javakichi.introduce();
		System.out.println();
		RobotPet robot = new  RobotPet("R2D2", "ルーク");
		robot.introduce();
		System.out.println();
	}
	
}