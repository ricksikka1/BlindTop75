class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0){
            return true;
        }
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        
        while(i <= j){
            if(!Character.isLetterOrDigit(arr[i])){
                i++;
            }
            else if(!Character.isLetterOrDigit(arr[j])){
                j--;
            }
            else{
                if(Character.toLowerCase(arr[i]) != Character.toLowerCase(arr[j])){
                    return false;
                }
            }
            i++;
            j--;
        }
        
        return true;
    }
}