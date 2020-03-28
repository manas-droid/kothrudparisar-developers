

class Solution{

   static int queensAttack(int n,int k, int r_q, int c_q, int[][] obstacles) {
         int tempR_q = r_q; int tempC_q = c_q;
         int totalLength = 0;
         while(tempC_q<n && tempR_q<n) //for upper right diagonals
         {
           tempC_q++; tempR_q++;
           if(checkQueries(tempR_q,tempC_q,obstacles))
           {
             System.out.println(tempR_q+"  "+tempC_q);
             break;
           }
           else
               totalLength++;
         }
         tempC_q = c_q; tempR_q = r_q;

         while(tempR_q<n && tempC_q>1)//for upper left diagonals
         {
           tempC_q--; tempR_q++;
           if(checkQueries(tempR_q,tempC_q,obstacles))
           {
               System.out.println(tempR_q+"  "+tempC_q);
             break;
           }
           else
               totalLength++;
         }
         tempC_q = c_q; tempR_q = r_q;
         while(tempR_q>1 && tempC_q<n)//lower right diagonals
         {
            tempR_q--; tempC_q++;
            if(checkQueries(tempR_q,tempC_q,obstacles))
            {
             System.out.println(tempR_q+"  "+tempC_q);
              break;
            }
            else
                 totalLength++;

         }
         tempC_q = c_q; tempR_q = r_q;
         while(tempR_q>1 && tempC_q>1)//lower left diagonals
         {
           tempC_q--;tempR_q--;
           if(checkQueries(tempR_q,tempC_q,obstacles))
           {
             System.out.println(tempR_q+"  "+tempC_q);
             break;
           }
           else
               totalLength++;
         }
         tempC_q = c_q - 1  ; tempR_q = r_q;
         while(tempC_q>=1)//row
         {
           if(checkQueries(tempR_q,tempC_q,obstacles))
           {
             System.out.println(tempR_q+"  "+tempC_q);
             break;
           }
           else
               totalLength++;

            tempC_q--;
         }
         tempC_q = c_q+1 ; tempR_q = r_q;
         while(tempC_q<=n)//row
         {
           if(checkQueries(tempR_q,tempC_q,obstacles))
           {
             System.out.println(tempR_q+"  "+tempC_q);
             break;
           }
           else
               totalLength++;

           tempC_q++;
         }
         tempR_q = r_q-1; tempC_q = c_q;
         while(tempR_q>=1)//column
         {
           if(checkQueries(tempR_q,tempC_q,obstacles))
           {
             System.out.println(tempR_q+"  "+tempC_q);
             break;
           }
           else
               totalLength++;
           tempR_q--;
         }
         tempR_q = r_q+1; tempC_q = c_q;
         while(tempR_q<=n)//column
         {
           if(checkQueries(tempR_q,tempC_q,obstacles))
           {
             System.out.println(tempR_q+"  "+tempC_q);
             break;
           }
           else
             totalLength++;
           tempR_q++;
         }
         return totalLength;

    }
 static boolean checkQueries(int r_q, int c_q,int obstacles[][])
 {
  for(int i=0;i<obstacles.length;i++)
  {
    if(obstacles[i][0] == r_q && obstacles[i][1] == c_q)
        return true;
  }
  return false;
 }

public static void main(String[] args) {
  int obstacles[][] = new int[0][0];

  System.out.println(queensAttack(8,0,5,4,obstacles));//just to check.


}






}
