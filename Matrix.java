import java.util.Scanner;

class javaFile{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int Mat_1[][] = new int[3][3]; //Initaializing array1
        int Mat_2[][] = new int[3][3]; //Initaializing array2
        int i,j,result1=0,result2=0,result3=0;

        System.out.println("Enter the elements of 1st array: ");
        //Taking input of arr1
        for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
                Mat_1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the elements of 2nd array: ");
        //Taking input of arr2
        for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
                Mat_2[i][j] = input.nextInt();
            }
        }

        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                result1 = ( Mat_1[i][j] * 3 ) + ( Mat_2[i][j] * 2 ) ;   
                result2 = ( Mat_2[i][j] - 3 ) * 2 ;
                result3 = ( Mat_2[i][j] * 5 ) - ( Mat_1[i][j] - 2 );
                
            }
        }
        System.out.println("Resullt of first equation is => " + result1);
        System.out.println("Resullt of second equation is => " + result2);
        System.out.println("Resullt of third equation is => " + result3);
    }
}