class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        while(left<=right){
            if(check(left)){
                list.add(left);
            }
            left++;
        }
        return list;

    }
    private boolean check(int left){
        int temp =left;
        while(temp!=0 ){
            int rem = temp%10;
            if(rem!=0 && left%rem==0){
                temp/=10;
            }else{
                return false;
            }

        }
        if(left%10==0){
            return false;
        }
         return true;
       

    }
}