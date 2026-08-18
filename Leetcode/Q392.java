class Q392 {
    public boolean isSubsequence(String s, String t) {
        return Check(s,t,0,0);
    }
    public boolean Check(String s,String t, int i, int j){
        if(i==s.length()){
            return true;
        }
        if(j==t.length()){
            return false;
        }
        if(s.charAt(i)==t.charAt(j)){
            return Check(s,t,i+1,j+1);
        }
        return Check(s,t,i,j+1); // this is to skip the current t char if they dont match with s
    }

}