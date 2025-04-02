package com.example.binarySearch;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BinarySearchController {
@GetMapping("/binary-search")
public String binarySearch(@RequestParam List<Integer> arr, @RequestParam int target) {
    int[] array=new int[arr.size()];
    for(int i=0;i<arr.size();i++) {
        array[i]=arr.get(i);
    }
    Arrays.sort(array);
    int index=binarySearch(array, target);
    if(index == -1) {
        return"Target not found";
    } else {
        return "Target found at index "+index;
    }
}


    private int binarySearch(int[] arr, int target){
        int left=0, right=arr.length-1;
        while(left<=right) 
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target) 
            return mid;
            if(arr[mid]<target)left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
}
