package main.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	
	static class Graph {
		private int totalNodes;
		// adjacent list is an 2-dimension array of presenting the 
		// relation between each node in the graph
		private LinkedList<Integer> adjacentList[];
		
		Graph(int totalNodes) {
			this.totalNodes = totalNodes;
			this.adjacentList = new LinkedList[totalNodes];
			for (int i = 0; i < totalNodes; i++) {
				adjacentList[i] = new LinkedList();
			}
		}
		
		void addEdge(int node, int edge) {
			this.adjacentList[node].add(edge);
		}
		
		void traverse(int startNode) {
			// maintain a visited boolean array of each nodes
			boolean visited[] = new boolean[this.totalNodes];
			
			// create a ueue for BFS
			LinkedList<Integer> queue = new LinkedList<Integer>();
			
			// mark start node visited status to true
			visited[startNode] = true;
			queue.add(startNode);
			
			Iterator<Integer> it = adjacentList[startNode].iterator();
			while(it.hasNext()) {
				int nextNode = it.next();
				if (!visited[nextNode]) {
					visited[nextNode] = true;
					queue.add(nextNode);
				}
			}
			
			Iterator<Integer> it2 = queue.iterator();
			while(it2.hasNext()) {
				System.out.print(it2.next() + " ");
			}
		}
	}
	
	public static void main(String args[]) {
		Graph graph = new Graph(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
		graph.traverse(0);
		
	}
	

}
