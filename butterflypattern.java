
class Loopy {
    public static void main(String[] args) {
        int i,j,k;
      for(i=1;i<=5;i++){
          for (j=1;j<=i;j++){
              System.out.print("*");
          }
          for(j=1;j<=10-2*i;j++){
                          System.out.print(" ");
          }
          for(j=1;j<=i;j++){
                          System.out.print("*");

          }
          System.out.println();
      }
      for(i=1;i<=4;i++){
          for(j=1;j<=5-i;j++){
                          System.out.print("*");
          }
          for(j=1;j<=2*i-1+1;j++){
                          System.out.print(" ");
          }
          for (j=1;j<=5-i;j++){
                          System.out.print("*");

          }
                      System.out.println();

      }
    }}