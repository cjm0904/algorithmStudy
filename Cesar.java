
package serial;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cesar {
	String caesar(String s, int n) {
		String result = "";
		int num = 26; //���ĺ� ����
		char[] arr = new char[s.length()];
		// �Լ��� �ϼ��ϼ���.
		n=n%26;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)!=' '){
				//�빮���� ���
				if(s.charAt(i)>='A'&& s.charAt(i)<='Z'){
					arr[i]=(char) (s.charAt(i) + n);
					if(arr[i]>='Z') arr[i]-=num;
				}
				//�ҹ����� ���
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
		System.out.println("s�� 'a B z', n�� 4�� ���: " + c.caesar("a B z", 4));
	}
}
