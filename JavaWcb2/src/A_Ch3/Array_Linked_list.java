package A_Ch3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Array_Linked_list {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		list1.add("りんご");
		list1.add("みかん");
		System.out.println(list1);
		
		//位置を指定する
		list1.add(1, "バナナ");
		System.out.println(list1);
		
		//要素を取得する
		System.out.println(list1.get(0));
		
		//存在チェック
		list1.contains("バナナ");
		System.out.println(list1.contains("バナナ"));
		
		//要素数を取得
		list1.size();
		System.out.println(list1.size());
		
		list1.remove("バナナ");
		System.out.println(list1);
		list1.remove("なし");
		System.out.println(list1);
		
		list1.remove(0);
		
		System.out.println(list1);
		
	}
	
}