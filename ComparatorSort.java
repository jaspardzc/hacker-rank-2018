package main;

import java.util.Comparator;

/**
 * Comparator with Object Array
 * - score DESC
 * - name ASC
 * @author kevinzeng
 *
 */
public class ComparatorSort {
	
	static class Player {
		private String name;
		private Integer score;
		
		public String getName() {
			return this.name;
		}
		
		public Integer getScore() {
			return this.score;
		}
	}
	
	static class Checker implements Comparator<Player> {
		@Override
		public int compare(Player player1, Player player2) {
			if (player1.getScore() != player2.getScore()) {
				return player2.getScore() - player1.getScore();
			} else {
				return player1.getName().compareTo(player2.getName());
			}
		}
	}

}
