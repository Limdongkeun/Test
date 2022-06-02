package SoloTest;
class Solution {
    public String letterCapitalize(String str) {
        // TODO:
        String result = "";
        if(str.length()==0){return result;}

        String[] words = str.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].equals("")){
                result += " ";
            }else{
                words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1,words[i].length());
                result = String.join(" ",words);
            }
        }
        return result.trim();
    }
}

public class Test1 {
    public static void main(String[] args) {
     Solution s = new Solution();

     System.out.println(s.letterCapitalize("nEVER  gIve uP"));
    }
}
