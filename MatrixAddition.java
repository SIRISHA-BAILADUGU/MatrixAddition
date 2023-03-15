import java.util.*;
public class MatrixAddition {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    if(a==d && b==c)
    {
        int p[][]=new int[a][b];
        int q[][]=new int[c][d];
        int r[][]=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
            p[i][j]=sc.nextInt();
        }

        }
        for(int i=0;i<c;i++)
        {
        for(int j=0;j<d;j++)
        {
            q[i][j]=sc.nextInt();
        }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                r[i][j]=p[i][j]+q[i][j];

            }
        }
    
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(r[i][j]+ " ");
            }
            System.out.println("");
        }
    }

    }
}
