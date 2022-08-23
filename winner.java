import java.util.*;
class Main {
    public static void main( String []args){
        Scanner sc= new Scanner(System.in);
        int count=1,j=0;
        int n=sc.nextInt();
        ArrayList<Character> el= new ArrayList<Character>();
        for(int i=0;i<n;i++){
            char s=sc.next().charAt(0);
            el.add(s);
        } 
        while(el.size()!=1){
            if(j==el.size()){
                j=0;
            }
            if(count%2==0 || count%10==2){
                el.remove(j);
                j=j-1;
            }
            count++;
            j=j+1;
        }
        System.out.println(el.get(0));
        
    }
}