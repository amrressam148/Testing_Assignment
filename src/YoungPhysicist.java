import java.util.*;
public class YoungPhysicist
{
    public static Boolean youngPhysicist(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] X = new int[n][3];
        int x=0, y=0, z=0;
        for(int i=0; i<n; i++)
            for(int j=0; j<3; j++)
                X[i][j] = input.nextInt();
        for(int i=0; i<n; i++){
            x += X[i][0];
            y += X[i][1];
            z += X[i][2];
        }
        if(x==0 && y==0 && z==0) {
            System.out.println("YES");
            return true;
        }
        else{
            System.out.println("NO");
            return false;
        }
    }
}
