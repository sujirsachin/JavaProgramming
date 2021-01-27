package Problems;
/*
* Source: HackerRank
* There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . The player must avoid the thunderheads. Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud. It is always possible to win the game.
* For each game, you will get an array of clouds numbered  if they are safe or  if they must be avoided.
* Complete the jumpingOnClouds function in the editor below.
* jumpingOnClouds has the following parameter(s):
    * int c[n]: an array of binary integers
* Returns
    * int: the minimum number of jumps required
* Sample Input
    * 7
    * 0 0 1 0 0 1 0
* Sample Output
    * 4
 */
public class JumpingOnClouds
{
    static int jumpingOnClouds(int[] c)
    {
        int numOfJumps=0;
        int i=0;
        while(i<c.length-1) {
            if (i + 2 == c.length || c[i + 2] == 1)
            {
                i+=1;
                numOfJumps+=1;
            }
            else
            {
                i+=2;
                numOfJumps++;
            }
        }
        return numOfJumps;
    }
    public static void main(String[] args)
    {

    }
}
