package practice;

import java.sql.SQLException;

public class Chapter10 {
	
	try {
		int array[] = {1,3,5};
		Chapter10.validIndex(array,2);
		Chapter10.validIndex(array,3);
		
		System.out.println("validIndexの呼び出し終了");
	}catch(IllegalArgumentException e) {
		System.out.println("IllegalArgumentExeptinが発生しました");
		e.printStackTrace();
	}

}
