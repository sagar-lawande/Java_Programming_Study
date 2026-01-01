public class EnhancedForLoop{
    public static void main(String[]args){
        System.out.println("Program for the Creation of 2D array using Enhanced for Loop");
        int[][]array=new int[3][5];
        

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
            array[i][j]=(int)(Math.random()*10);
            }

        }
        

        for(int[]row:array){
            for(int value:row){
                System.out.print(value+" ");
            }System.out.println();
        }
    }
}       