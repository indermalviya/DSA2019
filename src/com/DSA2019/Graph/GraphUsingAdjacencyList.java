/**
 * 
 */
package com.DSA2019.Graph;

import java.util.LinkedList;

/**
 * @author Atul Sharma
 *
 */
public class GraphUsingAdjacencyList {

	static class Graph {
		// number of nodes in graphs or vertices
		int V;
		// adjListArray will be of type list with integer
		LinkedList<Integer> adjListArray[];

		/**
		 * @param v
		 */
		public Graph(int v) {
			V = v;
			adjListArray = new LinkedList[v];
			for (int i = 0; i < v; i++) {
				adjListArray[i] = new LinkedList<Integer>();
			}
		}

	}

	public static void addEdge(Graph graph, int src, int des) {

		graph.adjListArray[src].add(des);

		/*
		 * since this is an undirected graph we need 
		 * to add both the src and the dest and kindof link them 
		 */ 
		graph.adjListArray[des].add(src);
	}

	public static void printGraph(Graph graph) {

		for (int i = 0; i < graph.V; i++) {
			System.out.println("Adjacency list of vertex : " + i);
			System.out.print("head");
			for (Integer crawl : graph.adjListArray[i]) {
				System.out.print(" --> " + crawl);
			}
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {

		int vertex = 5;
		Graph graph = new Graph(vertex);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);
		printGraph(graph);

	}

}
