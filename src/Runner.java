public class Runner
{
    public static void main(String[] args)
    {
        int[] check = randIntArr(10);
        printArr(check);

        long start = System.currentTimeMillis();
        QuickSortMethod.quickSort(check,0,check.length-1);
        long diff = System.currentTimeMillis() - start;
        printArr(check);
        System.out.println(diff + "\n");
    }

    /**
     * Creates array of random integers
     * @param count number of number in the array
     * @return array with random integers
     */
    public static int[] randIntArr(int count)
    {
        int[] randArr = new int[count];

        for(int i=0; i<randArr.length;i++)
        {
            randArr[i] = (int)(Math.random()*10001);
        }
        return(randArr);
    }

    /**
     * Prints array with commas separating each value
     * @param arr int array to print
     */
    public static void printArr(int[] arr)
    {
        String out = "";

        for(int i =0;i<arr.length;i++)
        {
            out += arr[i];
            if(i != arr.length-1)
            {
                out += ", ";
            }
        }
        System.out.println(out);
    }
}
