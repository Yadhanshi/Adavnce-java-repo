public class R2 {
public static int count(int i, int j,int n,int m)
{
    if(i ==n || j == m){
        return 0;
    }
    if(i == n-1 && j == m-1){
        return 1;
    }
    int downPaths = count(i+1, j, n, m);
    int rightPaths = count(i, j+1, n, m);

    return downPaths + rightPaths;
}

    public static void main(String[] args) {
        int n = 3,m=3;
int totalPaths = count(0,0, n, m);
System.out.println(totalPaths);    
}
}
