package com.prasan.forkJoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class FindMax extends RecursiveTask<Integer> {

	private int[] array;
	private int start;
	private int end;

	public FindMax(int[] array, int start, int end) {
		super();
		this.array = array;
		this.start = start;
		this.end = end;
	}

	public FindMax(int[] array) {
		super();
		this.array = array;
		start = 0;
		end = array.length;
	}

	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub
		System.out.println("executing " + Thread.currentThread().getName()
				+ " with " + start + ", " + end);
		if (end - start <= 20) {
			int max = array[start];
			int i = start + 1;
			while (i < end) {
				if (array[i] > max) {
					max = array[i];
				}
				i++;
			}
			return max;
		} else {
			int mid = (end - start) / 2 + start;
			FindMax left = new FindMax(array, start, mid);
			FindMax right = new FindMax(array, mid + 1, end);
			left.fork();
			return Math.max(right.compute(), left.join());
		}

	}

}

public class ForkAndJoinTest {
	public static void main(String[] args) {
		int[] array = new int[5000];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10000);
		}
		ForkJoinPool forkJoinPool = new ForkJoinPool();
		FindMax task = new FindMax(array);
		forkJoinPool.invoke(task);
		try {
			System.out.println("Maximum value: " + task.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}