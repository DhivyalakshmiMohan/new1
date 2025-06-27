class Complex{
    public static void main(String[]args){
        int i,j,k,count;
        for(i=1;i<=5;i++){
                    count=1;
            for(j=1;j<=i;j++){
                System.out.print(count++  );

            }
                for(k=1;k<=4-i;k++){
                    System.out.print(" ");
                }
                count=1;
                 for(j=1;j<=i;j++){
                System.out.print(count++  );

            }
                            System.out.println();
        }
    }
    
}
