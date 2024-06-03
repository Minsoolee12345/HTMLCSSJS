package sort;

public class SelectionSort<T extends Comparable<T>> extends Sort<T> 
{
    @Override
    public void sort(T[] dataList)
    {
        // 정렬할 데이터를 부모 클래스의 필드에 설정
        setData(dataList);
        
        // 배열의 마지막 수부터 첫 번째 수까지 역순 반복
        for (int last = sortedData.length - 1; last >= 1; last--) 
        {
            // 현재 범위 내에서 최대값의 인덱스를 탐색
            int maxIndex = selectMax(sortedData, last);
            
            // 최대값이 현재 위치가 아니라면 최대값을 현재 위치로 이동시킴
            if (maxIndex != last)
                swap(sortedData, maxIndex, last);
        }
    }
    
    int selectMax(T[] dataList, int last)
    {
        // 초기 최대값을 배열의 첫 번째 원소로 설정하고
        T max = dataList[0];
        int maxIndex = 0;
        
        // 두 번째 원소부터 마지막 원소까지 반복문 돌림
        for (int i = 1 ; i <= last; i++)
        {
            // 현재 원소가 최대값보다 크다면 최대값과 최대값의 인덱스를 갱신함
            if (dataList[i].compareTo(max) >= 1) 
            {
                max = dataList[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }    
}
