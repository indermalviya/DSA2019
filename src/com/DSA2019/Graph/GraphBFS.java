/**
 * 
 */
package com.DSA2019.Graph;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Atul Sharma
 *
 */
public class GraphBFS {

	int V;
	LinkedList<Integer> adjListArray[];

	/**
	 * 
	 */
	public GraphBFS(int v) {
		this.V = v;
		adjListArray = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adjListArray[i] = new LinkedList<Integer>();
		}
	}

	// adding the edge to the given graph
	void addEdge(int src, int des) {
		adjListArray[src].add(des);
	}

	public static void main(String[] args) {
		GraphBFS gbfs = new GraphBFS(4);
		gbfs.addEdge(0, 1);
		gbfs.addEdge(0, 2);
		gbfs.addEdge(1, 2);
		gbfs.addEdge(2, 0);
		gbfs.addEdge(2, 3);
		gbfs.addEdge(3, 3);
		gbfs.bFSInGrapgh(2);
	}

	/**
	 * @param i
	 */
	// this will give BFS from given verted
	private void bFSInGrapgh(int i) {

		// mark all the vertex as not visited, default set to false.
		boolean[] visited = new boolean[V];

		LinkedList<Integer> queue = new LinkedList<Integer>();

		// make the current vertex as visited
		visited[i] = true;
		queue.add(i);

		while (!queue.isEmpty()) {
			// dequeue a vertex from the queue and print it.
			i = queue.poll();
			System.out.print(i + " ");
			ListIterator<Integer> iterator = adjListArray[i].listIterator();

			while (iterator.hasNext()) {
				int n = iterator.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}

		}

	}

}
