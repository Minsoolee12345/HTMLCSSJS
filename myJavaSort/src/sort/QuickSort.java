package sort;

public class QuickSort<T extends Comparable<T>> extends Sort<T> 
{
	@Override
	public void sort(T[] dataList)
	{
		setData(dataList);
		quickSort(sortedData, 0, sortedData.length-1);
	}
	
	void quickSort(T[] dataList, int start, int end) 
	{
		// 시작과 끝이 크거나 같으면 종료
		if (start >= end) return;
		
		// 분할하고 분할된 부분을 재귀정렬..
		int p = partition(dataList, start, end);
		quickSort(dataList, start,  p-1);
		quickSort(dataList, p+1, end);
	}
	
	
	int partition(T[] dataList, int start, int end)
	{
		// 피벗 설정
		T pivot = dataList[end];
		
		// 왼쪽 끝으로 설정
		int leftEnd = start - 1;
		
		// 피벗을 기준으로 작은값들은 왼쪽, 큰값들은 오른쪽으로 이동
		for (int i = start; i <= end - 1; i++) 
		{
			if (dataList[i].compareTo(pivot) <= 0) 
			{
				swap(dataList, ++leftEnd, i);
			}
		}
		
		// 피벗을 올바른 위치에 놓음?
		swap(dataList, leftEnd + 1, end);
		return leftEnd + 1; 
	}

}
