/**
 * Created by wgw on 2/13/2015.
 */
public class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int origin = x, rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (rev == origin) {
            return true;
        } else {
            return false;
        }
    }
}