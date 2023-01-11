package ch15.example10;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {

		return Integer.compare(o2.price, o1.price); // 가격순 정렬
		// return o1.name.compareTo(o2.name); // 이름순 정렬
	}

}
