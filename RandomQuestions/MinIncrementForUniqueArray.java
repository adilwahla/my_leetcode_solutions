package Recursion.Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class MinIncrementForUniqueArray {
    // Java Implementation of above approach


	// function to find minimum increment required
	static int minIncrementForUnique(int[] A)
	{
		// collect frequency of each element
		TreeMap<Integer, Integer> dict
			= new TreeMap<Integer, Integer>();
		HashSet<Integer> used = new HashSet<Integer>();

	// Load Frequency Map (Element -> Count) and Used Set
		for (int i : A) {
			if (dict.containsKey(i))
				dict.put(i, dict.get(i) + 1);
			else {
				dict.put(i, 1);
				used.add(i);
			}
		}

		int maxUsed = 0; // Works for +ve numbers
		int ans = 0;

		for (Map.Entry<Integer, Integer> entry :
			dict.entrySet()) {

			int value = entry.getKey();
			int freq = entry.getValue();

			if (freq <= 1) //If not a duplicate, skip
				continue;

			int duplicates = freq - 1; // Number of duplicates 1 less than count
		
		// Start with next best option for this duplicate:
		// CurNum + 1 or an earlier maximum number that has been used
			int cur = Math.max(value + 1, maxUsed);
			while (duplicates > 0) {
				if (!used.contains(cur)) {
					ans += cur - value; // Number of increments = Available Spot - Duplicate Value
					used.add(cur);
					duplicates--;
					maxUsed = cur;
				}
				cur++;
			}
		}

		// return answer
		return ans;
	}

	// Driver code

	public static void main(String[] args)
	{
		int[] A = { 3, 2, 1, 2, 1, 2, 6, 7 };
		System.out.print(minIncrementForUnique2(A));
	}
// Best easy solution 
    public static int minIncrementForUnique2(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i=1;i<nums.length;i++){
            int prev=nums[i-1];
            int cur=nums[i];
            if(prev>=cur){
                result+=prev-cur+1;
                nums[i]=prev+1;
            }
        }
        return result;
    }



        public static  int minIncrementForUnique1(int[] nums) {
            int maxVal = 0;
            for (int x : nums) {
                maxVal = Math.max(maxVal, x);
            }
            
            int[] count = new int[nums.length + maxVal];
            for (int x : nums) {
                count[x]++;
            }
    
            int moves = 0;
            int taken = 0;
            for (int x = 0; x < nums.length + maxVal; ++x) {
                if (count[x] >= 2) {
                    taken += count[x] - 1;
                    moves -= x * (count[x] - 1);
                } else if (taken > 0 && count[x] == 0) {
                    taken--;
                    moves += x;
                }
            }
    
            return moves;
        }
    
}

// This code is contributed by Aditya


