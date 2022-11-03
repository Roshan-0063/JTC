import java.util.*;
public class Main
{
    
    public static void arrangePosAndNeg(int arr[],int  pos,int neg){
        int n = arr.length;
        
        int negArr[] = new int[neg];
        int posArr[] = new int[pos];
        int posLen =0;
        int negLen =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                posArr[posLen] = arr[i];
                posLen++;
            }
            else{
                negArr[negLen] =arr[i];
                negLen++;
            }
        }
        
        printArrays(posArr,negArr,arr);
    }
    
    
    
    
    
    static void printArrays(int posArr[],int negArr[],int arr[]){
        int posLen=0;
        int negLen=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=posArr[posLen];
                posLen++;
            }
            else{
                arr[i] =negArr[negLen];
                negLen++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
        
    
	public static void main(String[] args) {
		int arr[] ={-3, 1, 2, 4, -6, 8, -8, -1};
		
		int pos =0;
		int neg =0;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>=0){
		        pos++;
		    }
		    else{
		        neg++;
		    }
		}
		arrangePosAndNeg(arr,pos,neg);
	}
}
