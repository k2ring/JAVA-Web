package chapter09;

public class Ex9_6 {

	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));


	}
	
	
	public static String fillZero(String src, int length) {
		
		if(src ==null || src.length() ==length ) {
			return src;
		}else if(length <=0 ) {
			return "";
		}else if(src.length() > length) {
			return src.substring(0, length);
		}
		
		
		char arr []=new char[length];
		
		for(int i=0 ;i<arr.length; i++) {
			arr[i]='0';
		}
		
		
		System.arraycopy(src.toCharArray(), 0, arr, length-src.length(), src.length());
		
		return new String(arr);
		
	}
	
	

}
