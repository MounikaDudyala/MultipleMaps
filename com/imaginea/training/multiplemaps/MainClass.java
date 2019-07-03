package com.imaginea.training.multiplemaps;

import java.util.List;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		List<Level> list = new ArrayList<Level>();
		// list.add(new Level(1,-1));
		list.add(new Level(11, 1));
		list.add(new Level(2, -1));
		list.add(new Level(21, 2));
		list.add(new Level(22, 2));
		list.add(new Level(31, 3));
		list.add(new Level(331, 31));
		list.add(new Level(34, 3));
		list.add(new Level(3, -1));
		list.add(new Level(1, -1));
		list.add(new Level(30, 1));
		list.add(new Level(122, 3));
		list.add(new Level(121, 34));
		ConvertListToMap convert = new ConvertListToMap();
		convert.listToMap(list);
	}
}