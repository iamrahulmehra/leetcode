class Solution {
    public boolean isHappy(int n) {
        int count=0;
        
        while(true){
            int sum=0;
            while(n!=0){
                int rem = n%10;
                
                sum+=rem*rem;
                n/=10;
            }
            n=sum;
            if(n==1){
                return true;
            }
            count++;
            if(count>50){
                return false;
            }
        }
         
    }
}