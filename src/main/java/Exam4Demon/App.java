package Exam4Demon;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int length = 50; //���峤��50���������
		Random random = new Random();//�����������
		//����Ĵ���
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(100) +1;
			//�����Ǳ�֤���ɵ�������ĸ����㹻����ֹ���ظ����������ɿ�λ��
			if (!list.contains(number)) {
				list.add(number);
			}else{
				i--;
			}
			
		}
		for (int i = 0; i < length; i++) {
			System.out.println(list.get(i));
			if ((i+1) %10 ==0) {
				System.out.println("");
			}
			
		}

	}

    }
