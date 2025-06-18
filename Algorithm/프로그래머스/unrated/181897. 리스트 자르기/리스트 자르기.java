class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        int length = 0;
        int start = 0;
        
        switch(n) {
            case 1:
                length = b+1;
                break;
                
            case 2:
                length = num_list.length-a;
                start = a;
                break;
                
            case 3:
                length = b-a+1;
                start = a;
                break;
                
            case 4:
                int[] answer = new int[(b-a)/c+1];
                
                for(int i=0; i<answer.length; i++) {
                    answer[i] = num_list[a+i*c];
                }
                
                return answer;
        }
        
        int[] answer = new int[length];
        System.arraycopy(num_list, start, answer, 0, length);
        
        return answer;
    }
}