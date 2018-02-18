public class BinarySearch {
    public static void main(String[] args)
    {
        int S[] = {2,4,6,8,10,12,14,16,18,20,22,24};
        int index = S.length;
        int x = 19;
        binsearch(S,x);

    }
    public static int binsearch(int [] S,int x)
    {
        int low = 0;
        int high = S.length - 1;
        int mid;

        while (low <= high)
        {
            mid = (low + high) / 2;
            if (x < S[mid])
            {
                high = mid - 1;
            }
            else if (x > S[mid])
            {
                low = mid + 1;
            }
            else
                return mid;
        }
        return -1;
    }
}
