package check;

import constants.Constants;


class Check {
	private static String firstName = "啓稔";
	private static String lastName = "山本";
	
	public static void main(String[]args){
		System.out.println("printNameメソッド → " + getName(lastName, firstName));
		//クラスpetのインスタンスjavakichiを生成してメソッドintroduceを呼び出す
		Pet javakichi = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		javakichi.introduce();
		System.out.println();
		RobotPet robot = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robot.introduce();
		System.out.println();
	}
	
	public static String getName(String lastName , String firstName) {
		return lastName + firstName;
	}
}