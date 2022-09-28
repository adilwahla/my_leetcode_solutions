class Solution {
    
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String strChar="123456789";
        char[] ch=strChar.toCharArray();
        String os="";
        for(int i=0;i<words.length;i++){
            for(String w:words){
                if(w.charAt(w.length()-1)==ch[i]){
                    os+=w.substring(0,w.length()-1)+" ";
                }
            }
        }
        return os.strip();
    }
}
