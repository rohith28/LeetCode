class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length =0;
        int res=0;
        Set<Character> set = new HashSet<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(! set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                length++;
                
            }else{
                if(length > res){
                    res = length;
                }
                set.clear();
                i = i-length;
                length=0;
                
                 
            }
            
            
        }
            if(length>res) res = length;
            
        return res;      
    }
}