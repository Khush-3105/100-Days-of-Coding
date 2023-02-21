class Solution {
    public static double slope(int x1,int y1,int x2,int y2){
            return (y2-y1)/(x2-x1);
        }
    public boolean checkStraightLine(int[][] coordinates) {
        boolean b=false;
        double s= slope(coordinates[0][0],coordinates[0][1],coordinates[1][0],coordinates[1][1]);
        for(int i=1;i<coordinates.length-1;i++){
            double d= slope(coordinates[i][0],coordinates[i][1],coordinates[i+1][0],coordinates[i+1][1]);
            if(s==d)b=true;
            else {
                b=false;
                break;
            }
        }
        return b;
    }
}