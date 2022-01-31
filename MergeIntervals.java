class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> result=new ArrayList<>();
        if(intervals.length==0||intervals==null){
            return result.toArray(new int[0][]);
        }
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        int begin=intervals[0][0],finish=intervals[0][1];
        
        for(int[] i:intervals){
            if(i[0]<=finish) finish = Math.max(finish,i[1]);
            else{
                result.add(new int[]{begin,finish});
                begin=i[0];
                finish=i[1];
            }
        }
        result.add(new int[]{begin,finish});
        return result.toArray(new int[0][]);
    }
}