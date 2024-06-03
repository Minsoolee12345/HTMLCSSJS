package sort;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.MergeSort;
import sort.QuickSort;
import sort.SelectionSort;
import sort.Sort;

public class SortClassTest 
{
	public static void main(String[] args) 
	{
		//Integer[] dataList = {5, 21, 14, 3, 31, 8, 27, 15};
		//String[] dataList = {"abc", "ssssss", "wwerafd", "bandkflj;"};
		Double[] dataList = {10.4, 2.5, 26.5, 5.6};
		sortData(dataList);
	}
	
	static <T> void sortData(T[] dataList) 
	{
		Sort sort;
		
		sort = new SelectionSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
		
		sort = new InsertionSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
		
		sort = new BubbleSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
		
		sort = new MergeSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();
		
		sort = new QuickSort();
		sort.sort(dataList);
		System.out.printf("%-20s %s\n", "Input Data", sort.getOrgData());
		System.out.printf("%-20s %s\n", sort.getClass().getSimpleName() + " Result", sort.getSortedData());
		System.out.println();	
	}
}