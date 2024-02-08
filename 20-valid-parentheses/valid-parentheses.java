class Solution {
    public boolean isValid(String str) {
        char[] ch=str.toCharArray();

        Stack<Character> s=new Stack<>();

        for(int i=0;i<ch.length;i++){
            if(isOpening(ch[i])){
                s.push(ch[i]);
            }
            else{
                if(s.isEmpty())
                return false;
                else if(!isMatching(s.peek(),ch[i]))
                return false;
                else
                s.pop();
            }
        }

        return s.isEmpty();
    }

    boolean isOpening(char c){
        return c=='(' || c== '{' || c=='[';
    }
    
     boolean isMatching(char a,char b){
        return (a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}');
    }

}