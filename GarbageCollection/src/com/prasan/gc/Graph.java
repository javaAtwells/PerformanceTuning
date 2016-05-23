package com.prasan.gc;

public class Graph {
	private Point[] points;
	
	public Graph(Point[] points){
		super();
		this.points = points;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Graph [points = "+ points.length + "]";
	}
}
