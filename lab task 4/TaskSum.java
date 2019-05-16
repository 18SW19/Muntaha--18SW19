class TaskSum
{
    public static void main(String[]nah)
    {
        int [][]a1=new int[][]{{9,8,7},{6,5,4}};
        int [][]a2=new int[][]{{4,5,6},{7,8,9}};
        int [][]a3=new int[2][3];
        for(int a=0;a<a3.length;a++)
        {
            for(int b=0;b ;a3[0].length;b++)
            {
                a3[a][b]=a1[a][b]+a2[a][b];
                System.out.println(a3[a][b]+" at index["+a+"]["+b+"]");
            }
        }

    }
}