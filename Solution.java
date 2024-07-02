import java.util.*;


public class Solution {
    public static void main(String[] args){
      
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        boolean b = true;
        
        for(int i=0 ; i < s.length() ; i++){
          if(s.charAt(i)!= '7' && s.charAt(i) != '4'){
            b = false;break;
          }
        }
      
        int n = Integer.parseInt(s);
      
        if( n%4 == 0 || n%7 == 0 || n%44 == 0 || n%77 == 0 || n%74 == 0 || n%47 == 0 || b ){
          System.out.println("YES");
        }
        else System.out.println("NO");
    }    
}
