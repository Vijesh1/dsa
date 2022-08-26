

public class bottomup {
    public static void main(String []args){
        int coins[]={5,2,1};
        int sum=11;
        int arr[]=new int[sum+1];
        arr[0]=0;
        for(int i=1;i<=sum;i++){
            int sum1=i,count=0,j=0;
            while(sum1>0){
                if(sum1>=coins[j]){
                    sum1-=coins[j];
                    count+=1;
                }
                else{
                    j+=1;

                }

            }
            arr[i]=count;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[arr.length-1]);
    }
}
