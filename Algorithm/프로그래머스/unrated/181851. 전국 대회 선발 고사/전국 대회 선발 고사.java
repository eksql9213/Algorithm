class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        int[] rank_sort = new int[rank.length];
        boolean[] attendance_sort = new boolean[rank.length];
        int count = 0;
        
        for(int i=0; i<rank.length; i++) {
            if(attendance[i]) {
                count ++;
            }
            rank_sort[rank[i]-1] = i;
            attendance_sort[rank[i]-1] = attendance[i];
        }
        
        int[] student = new int[count];
        int index = 0;
        for(int i=0; i<student.length; i++) {
            for(int j=index; j<rank.length; j++) {
                if(attendance_sort[j]) {
                    student[i] = rank_sort[j];
                    index = j+1;
                    break;
                }    
            }
        }
        
        int a = student[0];
        int b = student[1];
        int c = student[2];
        
        return 10000*a+100*b+c;
    }
}