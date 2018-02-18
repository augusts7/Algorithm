public class ExamOne {
    public static void main(String[] args)
    {
        int S[]  = {5,10,15,8,11,12,13};
        int index = S.length;
        int x = 13;
        seqsearch(index,x, S);

    }
    public static void seqsearch(int n, int x, int[] S ) //n is the number of elements - x is the element to find
    {
        int count = 1;
        boolean found = true;
        while (count <= n && found == true)
        {

            if (x == S[count - 1])
            {
                System.out.println("The number is in the array number " + (count - 1));
                found = false;
            }
            else
            count ++;
        }
        if (found == true) {
            System.out.println("The number is not in the array");
        }


    }

}
