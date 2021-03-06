package com.vincent.basic.concurrent;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

/**
 * Created by dell on 2017/4/14.
 */
public class SortTask extends RecursiveAction {
    final long[] array;
    final int start;
    final int end;
    private int THRESHOLD = 100; //For demo only

    public SortTask(long[] array) {
        this.array = array;
        this.start = 0;
        this.end = array.length - 1;
    }

    public SortTask(long[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    protected void compute() {
        if (end - start < THRESHOLD)
            sequentiallySort(array, start, end);
        else {
            int pivot = partition(array, start, end);
            new SortTask(array, start, pivot - 1).fork();
            new SortTask(array, pivot + 1, end).fork();
        }
    }

    private int partition(long[] array, int start, int end) {
        long x = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (array[j] <= x) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, end);
        return i + 1;
    }

    private void swap(long[] array, int i, int j) {
        if (i != j) {
            long temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    private void sequentiallySort(long[] array, int lo, int hi) {
        Arrays.sort(array, lo, hi + 1);
    }

    public static void main(String[] args) throws InterruptedException {
        final int size = 50;
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Random rnd = new Random(100);
        long[] array = new long[size];
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt();
        }
        forkJoinPool.submit(new SortTask(array));

        forkJoinPool.shutdown();
        forkJoinPool.awaitTermination(1000, TimeUnit.SECONDS);
        for (long aaa : array)
            System.out.println(aaa);
    }
}
