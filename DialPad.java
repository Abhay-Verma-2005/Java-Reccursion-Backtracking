Public class DialPad {
    static String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String ques) {
		List<String> ll = new ArrayList<>();
      List<String> ll = new ArrayList<>();
      if (ques.isEmpty()) return ll;
      KeyPad(ques, new StringBuilder(), 0, ll);
      return ll;   
	}
	public void KeyPad(String ques, String ans,int i, List<String> ll) {
        int n = ques.length();
        if(i==n){
            ll.add(ans);
            return;
        }
        int idx=ques.charAt(i) - '0';
        String str=map[idx];
        for(int j=0;j<str.length();j++){
            ans=ans+str.charAt(j);
            KeyPad(ques,ans,i+1,ll);
            ans = ans.replaceAll(".$", "");
        }
	}
  public static void main(String[] args) {
        DialPad dp = new DialPad();
        System.out.println(dp.letterCombinations("23")); 
    }
}
