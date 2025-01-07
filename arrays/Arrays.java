public class Arrays {
    public static void main(String[] args){
        int[] myArray;
        int sum = 0;
        myArray = new int[1000];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;
        }
        
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
            if (i != (myArray.length - 1)){
                System.out.print(myArray[i] + ", ");
            }
            else{
                System.out.print(myArray[i] + " and sum of these numbers is:  " + sum );

            }
        }

    }
    
}
