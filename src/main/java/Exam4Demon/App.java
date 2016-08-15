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
    	int length = 50; //定义长度50个随机数；
		Random random = new Random();//定义随机函数
		//对象的创建
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(100) +1;
			//以下是保证生成的随机数的个数足够，防止有重复随机数是造成空位。
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
