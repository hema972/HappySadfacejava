import java.util.Scanner;
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
    }

