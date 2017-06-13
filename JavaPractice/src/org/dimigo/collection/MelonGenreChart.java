package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String args[]) {

		Map<String, List<Music>> map = new HashMap<>();
		List<Music> balladArrayList = new ArrayList<Music>();
		List<Music> danceArrayList = new ArrayList<Music>();
		danceArrayList.add(new Music("I LUV IT", "PSY"));
		danceArrayList.add(new Music("맞지?", "언니쓰"));
		balladArrayList.add(new Music("팔레트", "아이유"));

		map.put("발라드", balladArrayList);
		map.put("댄스", danceArrayList);

		System.out.println("--<<멜론 장르별 차트>>--");
		printMap(map);

		System.out.println("--<<댄스 2위곡 변경>>--");
		danceArrayList.set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);

		System.out.println("--<<댄스 1위곡 삭제>>--");
		danceArrayList.remove(0);
		printMap(map);

		System.out.println("--<<전체리스트 삭제>>--");
		map.clear();
		printMap(map);
	}

	public static void printMap(Map<String, List<Music>> map) {
		for (String genre : map.keySet()) {
			System.out.println("[" + genre + "]");
			int cnt = 1;
			for (Music value : map.get(genre)) {
				System.out.println(cnt + ". " + value.getTitle() + " (" + value.getSinger() + ")");
				cnt++;
			}
		}
		System.out.println();
	}
}
