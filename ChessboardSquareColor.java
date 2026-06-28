class Solution {
    public boolean squareIsWhite(String coordinates) {
       char letter=coordinates.charAt(0);
       char number=coordinates.charAt(1);

       int col=letter-'a'+1;
       int row=number-'0';

       return(row+col)%2==1; 
    }
}
