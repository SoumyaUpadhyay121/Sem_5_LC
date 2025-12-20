class Solution {
    public String largestTimeFromDigits(int[] arr) {
        int max=-1;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int a=0;a<4;a++){
                    for(int b=0;b<4;b++){
                        if(i==j || i==a || i==b || j==a || j==b || a==b){
                            continue;
                        }

                        int hours=arr[i]*10+arr[j];
                        int min=arr[a]*10+arr[b];

                        if(hours<24 && min<60){
                            max=Math.max(max,hours*60+min);
                        }
                    }
                }
            }
        }


        if(max==-1) return "";

        int hh=max/60;
        int mm=max%60;

        return String.format("%02d:%02d", hh, mm);

    }
}