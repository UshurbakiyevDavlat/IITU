import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int m = sc.nextInt();
      int n = sc.nextInt();
      
      int arr[][] = new int[m][n];
      int arrSec[][] = new int[n][m];
      
      for(int i = 0;i < m; i++){
          for(int j = 0;j < n; j++){
              arr[i][j] = sc.nextInt();
          }
      }
   
      int temp = n-1;
      int temp1 = m-1;
      for(int i = 0; i < n; i++){
         
          for(int j = 0; j < m; j++,temp1--){
          
              arrSec[i][j] = arr[temp1][i];
                
          }
          temp--;
         temp1 = m-1;
      }
      
      for(int i = 0; i < n; i++){
          for(int j = 0; j < m; j++){
              System.out.print(arrSec[i][j] + " ");
          }   System.out.println();
      }
      
    }
}
