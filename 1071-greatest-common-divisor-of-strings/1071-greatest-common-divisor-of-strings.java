class Solution {
    private int check(int n1,int n2){
        while(n2!=0){
            int temp=n1%n2;
            n1=n2;
            n2=temp;
        }
        return n1;
    }

    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int n1=str1.length();
        int n2=str2.length();

        int result=check(n1,n2);
        return str1.substring(0,result);
    }
}