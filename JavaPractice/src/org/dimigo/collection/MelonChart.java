package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {

	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("I LUV IT", "PSY"));
		list.add(new Music("맞지?", "언니쓰"));
		System.out.println("--<<멜론 차트>>--");
		printList(list);
		System.out.println("--<<2위곡 추가>>--");
		list.add(1, new Music("SIGNAL", "트와이스"));
		printList(list);
		System.out.println("--<<3위곡 변경>>--");
		list.set(2, new Music("팔레트", "아이유"));
		printList(list);
		System.out.println("--<<2위곡 삭제>>--");
		list.remove(1);
		printList(list);
		System.out.println("--<<전체리스트 삭제>>--");
		list.clear();
		printList(list);
	}

	public static void printList(List<Music> list) {
		for (Music value : list) {
			System.out.println(list.indexOf(value) + 1 + ". " + value.getTitle() + " (" + value.getSinger() + ")");
		}
		System.out.println();
	}

}
