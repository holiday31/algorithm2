package jimin.leetcode;

public class LongPressedName {
	public boolean isLongPressedName(String name, String typed) {
        
        int nl=name.length();
        int tl=typed.length();
        int index=0;
        for(int i=0;i<tl;i++){
            char n=name.charAt(index);  //name�� index ��ġ�� ����
            char t=typed.charAt(i);     //typed�� i ��ġ�� ����
            
            if(n==t){   //��ġ�� ���ڰ� ������
                if((i==(tl-1))&&(index==(nl-1)))
                    break;
                else if((i==(tl-1))&&(index!=(nl-1)))
                    return false;
                if(index!=(nl-1))
                    index++;
                continue;
            }
            else{       //��ġ�� ���ڰ� �ٸ���
                if(((i==0)&&(index==0))||(i==(tl-1)))
                    return false;
                if(t==typed.charAt(i-1)){
                    continue;
                }
                else{
                    return false;
                }
            }
           
        }
         return true;
       
    }
}
