import java.util.*;
class selectionsort
{
    public void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=SC.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            a[i]=SC.nextInt();
        }
        for (int i=0;i<n-1;i++)
        {
            int small=a[i];
            int pos=i;
            for (int j=i+1;j<n;j++)
            {
                if (small>a[j])
                {
                    small=a[j];
                    pos=j;
                }
            }
            int temp=a[i];
            a[i]=small;
            a[pos]=temp;
        }
        System.out.println("The sorted array:");
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
            