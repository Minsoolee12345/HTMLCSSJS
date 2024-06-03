package sort;

public class InsertionSort<T extends Comparable<T>> extends Sort<T>
{
	@Override
	public void sort(T[] dataList) 
	{
		setData(dataList);
		
		// 배열의 두 번째 요소부터 시작
		for (int i = 1; i < sortedData.length; i++)
		{
			// 현재 요소를 뒤 요소들과 비교하여 삽입할 위치 찾기
			int loc = findLessFromLast(sortedData, sortedData[i], i - 1);
			
			// 삽입할 위치가 현재 위치가 다를 때 요소를 삽입
			if (loc != i - 1)
				insertData(sortedData, loc + 1, i);
		}
	}

	private void insertData(T[] dataList, int target, int source) 
	{
		T temp = dataList[source];
		
		// 삽입할 위치부터 현재위치까지 한칸씩 오른쪽으로 이동
		for (int i = source; i > target; i--) 
		{
			dataList[i] = dataList[i - 1];
		}
		
		// 삽입할 위치에 요소를 삽입
		dataList[target] = temp;
	}

	private int findLessFromLast(T[] sortedData, T currentData, int last)
	{
		// 뒤에서부터 시작해서 특정 값보다 작거나 같은 값을 찾음 
		for (int i = last; i >= 0; i--) 
		{
			if (sortedData[i].compareTo(currentData) <= 0) return i;
		}
		return -1;
	}
}
