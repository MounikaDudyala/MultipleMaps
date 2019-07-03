package com.imaginea.training.multiplemaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertListToMap {
	Map<Integer, List<Map<Integer, Object>>> map = new HashMap<>();

	public void listToMap(List<Level> list) {

		for (Level level : list) {
			List<Map<Integer, Object>> subList = new ArrayList<>();
			if (level.parentId == -1) {

				for (Level l : list) {
					if (l.parentId == level.id) {
						Map<Integer, Object> subMap = put(l.id, list, l.parentId);
						subList.add(subMap);
					}
				}
				if (subList.isEmpty()) {
					map.put(level.id, null);
				} else {
					map.put(level.id, subList);

				}
			}
		}
		Set<Entry<Integer, List<Map<Integer, Object>>>> mapSet = map.entrySet();
		for (Entry<Integer, List<Map<Integer, Object>>> entry : mapSet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

	public Map<Integer, Object> put(int id, List<Level> list, int parentId) {
		Map<Integer, Object> m = new HashMap<>();
		int  i = 0;
		for (Level l : list) {
			if (id == l.parentId) {
				for (Level l1 : list) {
					if (parentId == l1.id) {
						i = 1;
						m.put(id, put(l.id, list, l1.parentId));

					}

				}

			}

		}

		if (i == 0) {
			m.put(id, null);
		}

		return m;
	}
}
