/**
 * Created by Skylifee7 on 18/05/2017.
 * Given a collection of intervals. Find out how many intervals should we delete to make intervals non-overlapping.
 * We can assume that: [1,2] and [2,3] is not overlapping.
 */
public int eraseOverlapIntervals(Interval[] intervals){

        if (intervals == null || intervals.length < 2){
            return 0;
        }
        Arrays.sort(intervals,new Comparator<Interval>(){
        @Override
        public int compare(Interval x,Interval y){
            return Integer.compare(x.start,y.start);
        }
        });

        int length = intervals.length;
        int end = intervals[0].end;
        int result = 0;

        for (int i=1; i<length; i++){
            int incremental = end > intervals[i].start ? +1 : 0;
            end = incremental==1 ? Math.min(end,intervals[i].end) : intervals[i].end;
            result += incremental;
        }
        return result;
}
