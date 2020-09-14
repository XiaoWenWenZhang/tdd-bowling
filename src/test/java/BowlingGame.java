public class BowlingGame {

    public int calulate(String s) {
        if(s.equals("0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0"))        return 0;
        String[] str= s.split(",");

        int[] its = new int[str.length];

        for(int i=0;i<str.length;i++){
            its[i] = Integer.parseInt(str[i]);
        }

        int sum = 0;
        int[] score =new int[11];
        int rond=0;
        for(int i=0;rond<10;){
            if(its[i]==10){
                score[rond++] = its[i]+its[i+1]+its[i+2];
                i+=1;
            }else if(its[i] + its[i+1] == 10){
                score[rond++] = its[i]+its[i+1]+its[i+2];
                i+=2;
            }else {
                score[rond++] = its[i]+its[i+1];
                i+=2;
            }
        }
        for (int c:score){
            sum+=c;
        }
        return  sum;
    }
}
