public class TwoDimensionalArray{
    public static void main(String[]args){
        System.out.println("Program for Creation of 2D Array");
        int[][]array=new int[3][3];
 

            for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                array[i][j]=(int)(Math.random()*10);  //random value assign to the Array
                // math.random is converted into int because it gives values in double 
            }
            System.out.println();
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }

    
    }
}