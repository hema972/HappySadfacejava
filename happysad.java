/*import java.util.Scanner;
public class happysad {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            String split[]=str.split(" ");
            int hyp=0;
            for(int i=0;i<split.length;i++)
            {
                if(split[i].equals(":)")||split[i].equals("^_^"))
                {
                    hyp++;
                }
                else if(split[i].equals(":(")||split[i].equals(">_<"))
                {
                    hyp--;
                }
                System.out.println(hyp);
            }
            sc.close();
        }
    }*/

//Abundant number

/*import java.util.Scanner;
class happysad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n / 2) {            //for(int i=1;i<=n;i++){
            if (n % i == 0) {           //if(n%i==0)
                sum += i;               //{  sum+=i;
            }                           //}
            i++;                        //}
        }

        if (sum > n)
            System.out.println("Abundant Number");
        else
            System.out.println("Not an Abundant Number");
    }
}*/

//max digit in number 12345 digit is 5

/*import java.util.Scanner;
class happysad
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int temp=n;
        while(temp!=0)
        {
            temp=n%10;
            if(temp>max)
            {
                max=temp;
            }
            temp=temp/10;
        }
        System.out.println(max);
        sc.close();
    }
}*/


/*import java.util.Scanner;
class happysad{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            int n=sc.nextInt();
            for(int i=0;i<n;i++)                //for(int i=n;i>0;i--)
            {                                  //{
                for(int j=i;j<n;j++)           //for(int j=1;j<=i;j++)
                {                              //{
                    if(j%2!=0)                 //if(j%2==0)  //for 1 0 1 0 1
                    {                                        //    1 0 1 0
                        System.out.print("0 ");             //     1 0 1
                    }                                       //     1  0
                    else if(j%2==0)                         //     1
                    {
                        System.out.print("1 ");
                    }
                }
                System.out.println();
            }
        }
    }
}*/

//Bethord number 

/*import java.util.Scanner;
class happysad{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int suma=0;
            int sumb=0;
            int b=sc.nextInt();
            for(int i=1;i<=a;i++) //for(int i=1;i<a;i++)
            {                     //{
                if(a%i==0&&i!=a)  //if(a%i==0)
                {                 
                    suma+=i;
                }
            }
            for(int i=1;i<=b;i++)
            {
                if(b%i==0&&i!=b)
                {
                    sumb+=i;
                }
            }
            if(suma==b+1&&sumb==a+1)
            {
                System.out.println("Its a bethrod number");
            }
            else{
                System.out.println("Not a bethrod number");
            }
            sc.close();
        }
    }*/

//magic matrix or not
//magic number is the diagonal sum. magic matrix is the two opposite diagonals sum 00 to 22 sum and 20 to 02.

/*import java.util.Scanner;
class happysad{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int sum=0;
            int sum1=0;
            int[][]arr=new int[n][n];
            for(int i=0;i<n;i++)                     
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<n;i++)                       //1
            {                                               //2
                for(int j=0;j<n;j++)                             //3
                {
                    if(i==j)
                    {
                        sum+=arr[i][j];
                        //System.out.println(arr[i][j]);
                    }
                }
            }
            for(int i=n-1;i>=0;i--)                                         
            {
                for(int j=0;j<n;j++)                                 //6
                {                                               //5
                    if(i + j == n - 1)                    //4
                    {
                        sum1+=arr[i][j];
                        //System.out.println(arr[i][j]);
                    }
                }
            }
            if(sum==sum1)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
            sc.close();
        }
    }*/
            
            