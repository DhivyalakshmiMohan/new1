
class Diagloop {
    public static void main(String[] args) {
        int i,j,k,count;
        count=1;
       int  n=4;
        for(i=1;i<=n;i++)
        {
        int temp=count;
        k=n-1;
            for(j=1;j<=i;j++){
             
                   System.out.print(temp + " ");
                    temp = temp + k;
                k--;     
            }
             count++;
             System.out.println();

        }               

    }
}