package com.prasan.gc;

public class GraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphUtility util = new GraphUtility();
		for(int i=1; i<= 1000;i++){
			Point[] points = new Point[i*100];
			
			for(int j=0;j< points.length;j++){
				Point point = new Point(j+100,j+200);
				points[j]=point;
			}
			Graph graph = new Graph(points);
			util.processGraph(graph);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
