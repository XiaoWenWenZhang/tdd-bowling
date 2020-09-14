public class BowlingGame {

    public int calulate(String s) {
        if(s.equals("0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0"))        return 0;
        String[] str= s.split(",");
        for(int i=0;i<str.length;i++){
    //        System.out.println(str[i]);
        }
        int[] ints = new int[str.length];
   //     System.out.println(str.length);

        for(int i=0;i<str.length;i++){
            ints[i] = Integer.parseInt(str[i]);
      //      System.out.println(ints[i]);
        }

        int sum = 0;
        int[] score =new int[11];
        int rond=0;
        for(int i=0;rond<10;){
            if(ints[i]==10){
                score[rond] = ints[i]+ints[i+1]+ints[i+2];
                System.out.println(score[rond]);
                rond++;
                i+=1;
            }else if(ints[i] + ints[i+1] == 10){
                score[rond] = ints[i]+ints[i+1]+ints[i+2];
                System.out.println(score[rond]);
                rond++;
                i+=2;
            }else {
                score[rond] = ints[i]+ints[i+1];
                System.out.println(score[rond]);
                rond++;
                i+=2;
            }
        }
        for (int c:score){
            sum+=c;
        }
return  sum;
    }
}
