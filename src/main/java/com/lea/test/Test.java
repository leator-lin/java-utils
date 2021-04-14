package com.lea.test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        System.out.println(isAnagram("haha", "ahha"));
//        int[] nums = {0,1,2,2,3,0,4,2};
//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
//        int[] nums = {};
//        System.out.println(removeDuplicates(nums));
//        System.out.println(removeElement(nums, 2));
//        System.out.println(searchInsert(nums, 0));
//        merge(nums1, 3, nums2, 3);
//        System.out.println(getRow(3).toString());
//        int[] prices = {7,1,5,3,6,4};
//        System.out.println(maxProfit(prices));
//        int[] numbers = {1,2,3,4};
//        int[] numbers = {2, 7, 11, 15};
//        int[] indexs = twoSum(numbers, 9);
//        rotate(numbers, 3);
//        System.out.println(containsDuplicate(numbers));
//        List<String> list1 = new ArrayList<>();
//        list1.add("1");
//        list1.add("2");
//        for(String list : list1) {
//            if("2".equals(list)) {
//                list1.remove(list);
//            }
//        }
//        System.out.println(list1.toString());
//        int[] nums = {0,0,1};
//        int[] nums = {4,3,2,7,8,2,3,1};
//        System.out.println(containsNearbyDuplicate(nums, 2));
//        System.out.println(missingNumber(nums));
//        System.out.println(findDisappearedNumbers(nums));
//        System.out.println(fib(4));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        char[] sToCharArray = s.toCharArray();
        char[] tToCharArray = t.toCharArray();
        Arrays.sort(sToCharArray);
        Arrays.sort(tToCharArray);
        return Arrays.equals(sToCharArray, tToCharArray);
    }

    public static int removeDuplicates(int[] nums) {
//        if(nums.length == 0) {
//            return 0;
//        }

        int i = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0) {
            return 0;
        }

        int i;
        for(i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return i;
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);

        for(int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        for(int i = 1; i <= numRows; i++) {
            List<Integer> rowList = new ArrayList<>();
            for(int j = 0; j < i; j++) {
                if(j == 0 || j == i - 1) {
                    rowList.add(j, 1);
                }
                else {
                    rowList.add(j, resultList.get(i - 2).get(j - 1) + resultList.get(i - 2).get(j));
                }
            }
            resultList.add(i - 1, rowList);
        }
        return resultList;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> resultList = new ArrayList<>();
        for(int i = 1; i <= rowIndex + 1; i++) {
            List<Integer> rowList = new ArrayList<>();
            for(int j = 0; j < i; j++) {
                if(j == 0 || j == i - 1) {
                    rowList.add(j, 1);
                }
                else {
                    rowList.add(j, resultList.get(i - 2).get(j - 1) + resultList.get(i - 2).get(j));
                }
            }
            resultList.add(i - 1, rowList);
        }
        return resultList.get(rowIndex);
    }

//    输入: [7,1,5,3,6,4]
//    输出: 5
//    解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
//    注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
    public static int maxProfit(int[] prices) {
        int maxProfitValue = 0;
        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                if(maxProfitValue < prices[j] - prices[i]) {
                    maxProfitValue = prices[j] - prices[i];
                }
            }
        }
        return maxProfitValue;
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] indexs = new int[2];
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(target == numbers[i] + numbers[j]) {
                    indexs[0] = i + 1;
                    indexs[1] = j + 1;
                    return indexs;
                }
            }
        }
        return indexs;
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> temNums = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(temNums.get(nums[i]) != null) {
                temNums.put(nums[i], temNums.get(nums[i]) + 1);
            }
            else {
                temNums.put(nums[i], 1);
            }
        }

        int majorityElement = Collections.max(temNums.keySet());
        return majorityElement;
    }

    public static void rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if((nums[j] == nums[i]) && (j - i <= k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int missingNumber(int[] nums) {
        boolean findNumber = false;
        for(int i = 1; i <= nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i == nums[j]) {
                    findNumber = true;
                    break;
                }
                findNumber = false;
            }

            if(!findNumber) {
                return i;
            }
        }
        return 0;
    }

    //[0,1,0,3,12]
    //[0,0,1]
    public static void moveZeroes(int[] nums) {
        if(nums == null) {
            return;
        }

        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        for(int k = j; k < nums.length; k++) {
            nums[k] = 0;
        }
    }

    // [3, 2, 1]
    // [1, 2]
    // [2, 2, 3, 1]
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        List<Integer> tmpList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(!tmpList.contains(nums[i])) {
                tmpList.add(nums[i]);
            }
        }
        if(tmpList.size() < 3) {
            return tmpList.get(tmpList.size() - 1);
        } else {
            return tmpList.get(tmpList.size() - 3);
        }
    }

    // [4,3,2,7,8,2,3,1]
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int newIndex = Math.abs(nums[i]) - 1;
            if (nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }

        List<Integer> result = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] > 0) {
                result.add(i);
            }
        }

        return result;
    }

    // [1,1,0,1,1,1]
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        ArrayList<Integer> maxConsecutiveOnesTmp = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                maxConsecutiveOnes++;
            } else if(nums[i] == 0) {
                maxConsecutiveOnesTmp.add(maxConsecutiveOnes);
                maxConsecutiveOnes = 0;
            }

            if(i == nums.length - 1) {
                maxConsecutiveOnesTmp.add(maxConsecutiveOnes);
            }
        }

        int result = 0;
        for(int j = 0; j < maxConsecutiveOnesTmp.size(); j++) {
            if(maxConsecutiveOnesTmp.get(j).intValue() > result) {
                result = maxConsecutiveOnesTmp.get(j);
            }
        }
        return result;
    }

    public static int fib(int N) {
        if(N == 0) {
            return 0;
        }

        if(N == 1) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }
}