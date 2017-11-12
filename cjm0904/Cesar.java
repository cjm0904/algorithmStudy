
package serial;

public class Cesar {
	String caesar(String s, int n) {
		String result = "";
		int num = 26; //알파벳 개수
		char[] arr = new char[s.length()];
		// 함수를 완성하세요.
		n=n%26;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)!=' '){
				//대문자인 경우
				if(s.charAt(i)>='A'&& s.charAt(i)<='Z'){
					arr[i]=(char) (s.charAt(i) + n);
					if(arr[i]>='Z') arr[i]-=num;
				}
				//소문자인 경우
				else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
					arr[i]=(char) (s.charAt(i) + n);
					if(arr[i]>='z') arr[i]-=num;
				}				
			}
			//System.out.println(arr[i]);

			result = new String(arr,0, arr.length);
		}
		
		return result;
	}

	public static void main(String[] args) {
		Cesar c = new Cesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}
}
