package arrays;

/* Find the smallest & the second-smallest element in a given array.
Eg 1 :- [5,1,4,3,8] -> [1,3]
Eg 2 :- [5,1,4,3,1] -> [1,3]
Eg 3 :- [1,1,1,1,1] -> [-1,-1]
*/


// Link : https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1
// 2 loops

class Compute
{
    public long[] minAnd2ndMin(long a[], long n) {
        long smallest = a[0];
        for(long num : a) {
            if(num < smallest)
                smallest = num;
        }
        long secSmallest = Long.MAX_VALUE;
        for(long num : a) {
            if(num == smallest)
                continue;
            if(num < secSmallest)
                secSmallest = num;
        }

        if(secSmallest == Long.MAX_VALUE)
            return new long[] {-1, -1};
        else
            return new long[] {smallest, secSmallest};
    }
}

// Link : https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1
// 1 loop

class Compute1
{
    public long[] minAnd2ndMin(long a[], long n) {
        long min = Long.MAX_VALUE, secMin = Long.MAX_VALUE;

        for(long num : a) {
            if(num < min) {
                // num = 3, [min -> 5, secMin -> 8]
                // [min -> 3, secMin -> 5]
                secMin = min;
                min = num;
            }
            else if(num != min && num < secMin) {
                secMin = num;
            }
        }

        if(secMin == Long.MAX_VALUE)
            return new long[] {-1, -1};
        else
            return new long[] {min, secMin};
    }
}