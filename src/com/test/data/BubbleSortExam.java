package com.test.data;

import java.util.Arrays;

public class BubbleSortExam {
    public static void main(String[] args) {
        int [] nums = {1,7,2,4,3,5,6,3,8,0};
        System.out.println("---정렬전---");
        System.out.println(Arrays.toString(nums));
        int j;

        // 오름차순 정렬 --> 정렬 알고리즘은 Bubble sort 알고리즘을 사용...
        // outer for문이 한 번 반복할대마다 배열의 왼쪽으로 가장 작은수가 옮겨짐

        for(int i = nums.length - 1; i>0; i--) {
            for(j=0; j < i; j++){
                // 만약 앞의 수가 뒤의 수보다 더 크다면 swap 연산을 진행
                if(nums[j]>nums[j+1]) {
                    int temp = nums[j]; // swap을 위해 값을 임시 저장
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }

        }

        System.out.println("---정렬후---");
        System.out.println(Arrays.toString(nums));


        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));

    }
    
}
