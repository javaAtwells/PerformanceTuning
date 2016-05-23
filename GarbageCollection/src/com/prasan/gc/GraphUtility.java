package com.prasan.gc;

import java.util.ArrayList;
import java.util.List;

public class GraphUtility {
	
	private List<Graph> list = new ArrayList<>();
	
	public void addGraph(Graph g){
		list.add(g);
	}
	
	public void removeGraph(Graph g){
		list.remove(g);
	}
	
	public void processGraph(Graph g){
		addGraph(g);
		System.out.println("Processing the graph " + g);
		//removeGraph(g);   // memory leak
	}
}
