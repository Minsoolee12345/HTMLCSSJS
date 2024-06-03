package sort;

public class MergeSort<T extends Comparable<T>> extends Sort<T>
{
	@Override
	public void sort(T[] dataList) 
	{
		setData(dataList);
		mergeSort(sortedData, 0, sortedData.length-1);
	}
	
	void mergeSort(T[] dataList, int start, int end)
	{
		// 시작이 끝보다 크거나 같으면 종료
		if (start >= end) return;
		
		// 배열을 중간으로 나눠서 재귀정렬...
		int mid = (start + end) / 2;
		mergeSort(dataList, start, mid);
		mergeSort(dataList, mid+1, end);
		merge(dataList, start, mid, end);
	}
	
	void merge(T[] dataList, int start, int mid, int end) 
	{
		// 배열 생성
		T[] tempList = (T[]) new Comparable[end-start + 1];
	
		int i = start, j = mid + 1, k = 0;
		
		// 두 배열을 비교하여 작은 값을 배열에 병합
		while (i <= mid && j <= end)
		{
			if (dataList[i].compareTo(dataList[j]) <= 0)
				tempList[k++] = dataList[i++];
			else
				tempList[k++] = dataList[j++];
		}
		
		
		//남은 요소들을 배열에 병합
		while (i <= mid) tempList[k++] = dataList[i++];
		while (j <= end) tempList[k++] = dataList[j++];
		
		// 생성한 배열을 원래 배열에 복사
		for (i = start, k = 0; k < tempList.length; i++, k++)
			dataList[i] = tempList[k];
		//System.arraycopy(dataList, start, tempList, 0, end-start+1);
	}

}
