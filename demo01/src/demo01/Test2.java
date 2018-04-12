package demo01;
/**
* @author 莫愁莫回首
* @创建时间：2018年2月28日 下午5:56:48
*/
public class Test2 {
	public static void main(String[] args) {
		getNum("da54afafea5445afx154fa");
	}
	
	public static void getNum(String str) {
		String num = "";
//		for (int i = 0; i < str.length(); i++) {
//			String s = str.substring(i, i+1);
//			
//			if(s.matches("^[0-9]{1}$")) {
//				num = num + s;
//			}
//		}
//		System.out.println(num);
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				num += str.charAt(i);
			}
		}
		
		
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
