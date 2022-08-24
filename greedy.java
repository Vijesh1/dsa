import java.util.*;
public class greedy {
	public static void Greedy(int n,int arr[],int sum) {
		int i, count = 0;
        ArrayList<Integer> al=new ArrayList<>();
        for(i = n-1; i >= 0; i--){
        while(sum >= arr[i]){
            sum -= arr[i];
            al.add(arr[i]);
            count++;
        }
        if(sum == 0)
            break;

    }
    System.out.println(al);
    System.out.print(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        Greedy(n,arr,sum);
	}
}