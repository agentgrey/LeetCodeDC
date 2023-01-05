class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points==null || points.length==0 || points[0].length==0) 
            return 0;
        
        Arrays.sort(points,(a,b)->{
            if(a[1]>b[1]) return 1;
            else return -1;
        });

        int minArrows = 1;
        int arrowLimit = points[0][1];
        for(int i=1;i<points.length;i++) {
            int[] baloon = points[i];
            if(baloon[0]<=arrowLimit) {
                arrowLimit=Math.min(arrowLimit, baloon[1]);
            } else {
                minArrows++;
                arrowLimit=baloon[1];
            }
        }
        return minArrows;
    }
}