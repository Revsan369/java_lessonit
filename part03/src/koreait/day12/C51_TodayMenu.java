package koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C51_TodayMenu {
	public static void main(String[] args) {
		System.out.println("������ ����޴� ��ǥ�մϴ�.!!!");
		String foods = "ġ�� , ������ , ��â, �Ұ���, �ܹ���, ��¡�ȸ";
		//key: �޴��̸�, value : ��ǥ�� 
		//�ʱ�ȭ
		HashMap<String,Integer> map = new HashMap<>();
		map.put("ġ��",0);
		map.put("������",0);
		map.put("��â",0);
		map.put("�Ұ���",0);
		map.put("�ܹ���",0);
		map.put("��¡�ȸ",0);
		
		Scanner sc = new Scanner(System.in);
		while(true) {  	//�޴� ���� (�ݺ�)
			System.out.println(foods);
			System.out.print("���� �޴� ���ĸ� �Է��ϼ���.(����� end �Է�) -> ");
			String menu = sc.nextLine();
			if(menu.equals("end")) break;
			
			if(!map.containsKey(menu)) {   //map�� key���� menu �Է¹��ڿ��� ������
				System.out.println("���� �޴��Դϴ�.�޴��� �߰��մϴ�.~~.");
//				System.out.println("���� �޴��Դϴ�.�ٸ����� ��ǥ���ּ���.");
				map.put(menu,1);     foods += "," + menu;
				continue;
			}	
			//�Է¹��� menu �� value���� �������� -> +1�ϱ� -> ����� �����ϱ�.
			int temp = map.get(menu);
//			++temp;    //map.put(menu, temp);
			map.put(menu, ++temp);		//���� => put
//			map.put(menu, temp++);		//put => ����
			System.out.println(map);
		}
		
		System.out.println("��ǥ �����մϴ�.");
		System.out.println(map);
	System.out.println("�ִ� ��ǥ�� : " + Collections.max(map.values()));	//���� ū value
	System.out.println("����  : " + Collections.max(map.keySet()));	//���� ū key
		//Entry<Key,Value> 
		
	}

}