public class quicksort{
    public static int[] quick(int arr[],int left,int right){
        if(arr.length==1){
            return arr;
        }
        if(left<right){
            int part_pos=part(arr,left,right);
            quick(arr,left,part_pos-1);
            quick(arr,part_pos+1,right);
        }
        return arr;
    }
    public static int part(int arr[],int left,int right){
        int i=left, j=right-1,pivot=arr[right];
        
        while(i<j){
            while(i<right && arr[i]<pivot){
                i++;
            }
            while(j>left && arr[j]>=pivot){
                j--;
            }
            if(i<j){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        if(arr[i]>pivot){
            int t2=arr[i];
            arr[i]=arr[right];
            arr[right]=t2;
        }    
        return i;
    }    
    
    public static void main(String []args){
        int arr[]={9,1,8,2,7,3,6,4,5};
        quick(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
