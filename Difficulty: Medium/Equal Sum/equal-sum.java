// User function Template for Java

class Solution {
    String equilibrium(int arr[]) {
        // code here
        int n=arr.length;
        int total=0;
        for(int x:arr){
            total+=x;
        }
        int left=0;
        for(int i=0;i<n;i++){
           int right=total-left-arr[i];
           if(right == left )return "true";
           left+=arr[i];
        }
        return "false";
    }
}