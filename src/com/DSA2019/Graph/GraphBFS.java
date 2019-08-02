/**
 * 
 */
package com.DSA2019.Graph;

import java.util.LinkedList;

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
	private  void bFSInGrapgh(int i) {
		
	}

}
