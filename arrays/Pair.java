public class Pair {
    public static void main(String[] args){
        int[] pairArray;
        pairArray = new int[100];
        
        for (int i = 0; i < pairArray.length; i++){
            if (i % 2 == 0){
                pairArray[i] = i;  
                System.out.println(pairArray[i]);
            }
        }
    }
    
}
