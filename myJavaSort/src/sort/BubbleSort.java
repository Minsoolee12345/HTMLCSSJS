package sort;

public class BubbleSort<T extends Comparable<T>> extends Sort<T>
{
	@Override
	public void sort(T[] dataList)
	{
		setData(dataList);
		
		// 배열을 끝에서부터 시작까지 반복
		for (int last = sortedData.length - 1; last >= 1; last--) 
		{
			// 배열을 처음부터 last - 1까지 반복
			for (int i = 0; i <= last - 1; i++) 
			{
				// 현재가 다음보다 크면 교환
				if (sortedData[i].compareTo(sortedData[i + 1]) > 0)
					swap(sortedData, i, i+1);
			}
		}
	}

}
