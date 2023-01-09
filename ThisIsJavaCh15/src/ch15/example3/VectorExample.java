package ch15.example3;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();

		list.add(new Board("title1", "contents1", "wirter1"));
		list.add(new Board("title2", "contents2", "wirter2"));
		list.add(new Board("title3", "contents3", "wirter3"));
		list.add(new Board("title4", "contents4", "wirter4"));
		list.add(new Board("title5", "contents5", "wirter5"));

		list.remove(2);
		list.remove(3);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
