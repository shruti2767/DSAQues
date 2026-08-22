class Solution {
    public boolean checkDivisibility(int n) {
        String str = String.valueOf(n);
        // int arr[] = new int [str.length()];
        int sum = 0;
        int mul = 1;
                for (int i = 0 ;i<str.length();i++){
// arr[i] = str.charAt(i);
 sum += str.charAt(i)-'0';
 mul *= str.charAt(i)-'0';

        }

        int total = sum + mul;
        if(n % total == 0){
            return true;
        }
      return false;
    }
    
}
