import java.util.Scanner;

public class SumOfThreeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("plz enter size of array -");
        int size= input.nextInt();
        int[] array =new int[size];
        System.out.println("enter elements");
        for(int i=0; i<size; i++){
            array[i]=input.nextInt();
        }
        int count=0;
        for(int i=0; i<size-2; i++){
            for(int j=i+1; j<size-1; j++){
                for(int k=j+1; k<size; k++){
                    if(array[i]+array[j]+array[k]==0){
                        System.out.println(array[i]+", "+array[j]+", "+array[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Count = "+count);
    }
}