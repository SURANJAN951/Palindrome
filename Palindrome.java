public class Palindrome {
    public static void main(String[] args) {
        int array[]={1,2,3,2,1};
        int flag=0;
        int n = array.length;
        for(int i=0; i<n/2; i++){
            if(array[i]!=array[n-i-1]){
                System.out.println(" Not a Palindromic array");
                flag=1;
                break;
            }

        }
        if(flag==0){
            System.out.println("It a palindromic array");
        }
    }
}
