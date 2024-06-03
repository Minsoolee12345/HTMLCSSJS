package sort;

import java.util.Arrays;

public abstract class Sort<T> 
{
    // 원본 데이터 배열
    T[] orgData;
    
    // 정렬된 데이터 배열
    T[] sortedData;
    
    public abstract void sort(T[] dataList);
    
    void swap(T[] dataList, int a, int b) 
    {
        // 교환할 인덱스가 같으면 아무 작업도 안함
        if (a == b) return;
        
        // 임시 변수를 사용하여 값 교환
        T temp = dataList[a];
        dataList[a] = dataList[b];
        dataList[b] = temp;
    }
    
   
    public void setData(T[] dataList) 
    {
        this.orgData = dataList;
        
        // 원본 배열을 복사하여 정렬된 배열로 사용
        this.sortedData = dataList.clone();
    }
    
    //원본 데이터 배열을 문자열로 반환합니다.
    public String getOrgData() {
        return Arrays.toString(orgData);
    }
    
    
     //정렬된 데이터 배열을 문자열로 반환합니다.
    public String getSortedData() {
        return Arrays.toString(sortedData);
    }

}
