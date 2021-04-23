package com.stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PlayListQueue {

	LinkedList<String> q1 = new LinkedList<>();

	PlayListQueue(String[] songs) {
		List<String> asList = Arrays.asList(songs);
		q1.addAll(asList);

	}

	public String play(int i) {

			
			String s = q1.get(i);
			q1.remove(i);
			q1.addLast(s);
			
			return s;

	}

	public static String[] shift(String[] songs, int index, String removedsong) {

		for (int i = index; i < songs.length - 1; i++) {

			songs[i] = songs[i + 1];

		}
		songs[songs.length - 1] = removedsong;

		return songs;
	}

	public static void main(String[] args) {

		String[] songs = new String[] { "a", "b", "c", "d", "e" };

		PlayListQueue queus = new PlayListQueue(songs);

		Arrays.stream(songs).forEach(System.out::println);

		queus.play(2);

		queus.q1.forEach(System.out::println);
	}

}
