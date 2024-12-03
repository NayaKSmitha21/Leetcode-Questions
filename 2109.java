//2109. Adding Spaces to a String

class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res=new StringBuilder();
        int spaceindex=0;

        for(int i=0;i<s.length();i++){
            if(spaceindex<spaces.length && i==spaces[spaceindex]){
                res.append(" ");
                spaceindex++;
            }
            res.append(s.charAt(i));

        
    }

    return res.toString();
}
}
