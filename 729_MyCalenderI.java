class MyCalendar {
    private List<int[]> list;

    public MyCalendar() {
        list = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int[] a : list) {
            if(Math.max(a[0],start)<Math.min(a[1],end))
                return false;
        }
        list.add(new int[]{start, end});
        return true;
    }
}