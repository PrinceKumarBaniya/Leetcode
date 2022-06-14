class Solution {
    public String reverseWords(String s) {
       // s=s.trim();
        String st[] = s.split(" ");
        String ans = "";
        for (int i = st.length - 1; i >= 0; i--)
        {
            ans += st[i];
            ans=ans.trim()+" ";
        }
        return ans.substring(0,ans.length() - 1);
    }
}
