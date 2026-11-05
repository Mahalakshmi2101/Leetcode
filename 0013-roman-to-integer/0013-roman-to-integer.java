class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int current=romanSum(s.charAt(i));
            if(i<s.length()-1){
                int next=romanSum(s.charAt(i+1));

                if(current<next){
                    sum-=current;
                }
                else{
                     sum+=current;
                }
            }
            else{
 sum+=current;
            }
           
        }
         return sum;
        }
       


            public int romanSum(char ch){
            if(ch=='I') return 1;
            else if(ch=='V') return 5;
             else if(ch=='X') return 10;
              else if(ch=='L') return 50;
               else if(ch=='C') return 100;
                else if(ch=='D') return 500;
                 else if(ch=='M') return 1000;
                 return 0;
        }
}