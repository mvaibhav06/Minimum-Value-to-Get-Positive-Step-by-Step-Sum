class MinStartValue {
    public int minStartValue(int[] nums) {
        int out = 1;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum+out < 1){    
                out += 1-(sum+out);
            }
        }
        return out;
    }
}
