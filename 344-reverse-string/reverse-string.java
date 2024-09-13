class Solution {
    public void reverseString(char[] s) {          //s={"h","e","l","l","o"}
    //     Stack <Character> st = new Stack<>();
    //     for(char c : s){
    //         st.push(c);                   //st = {h,e,l,l,o}
    //     }
    //     for(int i=0;i<s.length;i++){
    //         s[i]=st.pop();          //pop the element from the stack and fill the string s with it
    //     }                              //s={o,e,l,l,o}  {o,l,l,l,o}  {o,l,l,l,o} {o,l,l,e,o} {o,l,l,e,h}(print this)
    //     System.out.print(s);
    // }
        int l=0;
        int h = s.length-1;
        while(l<h){
            char temp = s[l];
            s[l]=s[h];
            s[h]=temp;
            l++;
            h--;
        }
        System.out.print(s);
    }
}