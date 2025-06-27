
class Main {
    public static void main(String[] args) {
        int i,j;
 char count='A';
for(i=1;i<=5;i++){
        if(i%2==0)
{
 char chrev=(char)(count+i-1);
    for(j=1;j<=i;j++){
             System.out.print((char)chrev-- + " ");
             count++;
}}

else{
    for(j=1;j<=i;j++){
                     System.out.print((char)count++ + " ");

    }
}
                    System.out.println();
}
    }
}