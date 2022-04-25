package assignment;

public class RobotReturnOrigin {
    public static boolean judgeCircle(String moves) {
        int up,down,right,left;
        up=down=right=left=0;

        for(int i = 0; i<moves.length(); i++)
        {
            switch(moves.charAt(i))
            {
                case 'U':
                    up++;
                    down--;
                    break;
                case 'L':
                    left++;
                    right--;
                    break;
                case 'R':
                    right++;
                    left--;
                    break;
                case 'D':
                    down++;
                    up--;
                    break;
            }
        }
        if(up == 0 && down == 0 && right == 0 && left == 0)
            return true;
        else
            return false;
    }
    public static void main(String []args)
    {
        String moves = "LL";
        System.out.println(judgeCircle(moves));
    }
}
