import org.junit.jupiter.api.Test;

import static  org.junit.jupiter.api.Assertions.*;
public class BowlingGameTest {
    //情况1：全部没有击倒球： 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
    //情况2：每次都全中： 10，10，10，10，10，10，10，10，10，10，10，10, 10
    //情况3：一般情形+第十轮第一次全中
    //情况4：一般情形+第十轮第二次补中
    //情况5：一般情形+第十轮无全中无补中
    @Test
    void should_return_0_when_calculate_given_no_knockdown(){
        BowlingGame bowlingGame =new BowlingGame();
        int result = bowlingGame.calulate("0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0");
        assertEquals(0,result);
    }


}
