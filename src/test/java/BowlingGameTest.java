import org.junit.jupiter.api.Test;

import static  org.junit.jupiter.api.Assertions.*;
public class BowlingGameTest {

    @Test
    void should_return_0_when_calculate_given_no_knockdown(){
        BowlingGame bowlingGame =new BowlingGame();
        int result = bowlingGame.calulate("0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0");
        assertEquals(0,result);
    }

    @Test
    void should_return_300_when_strike(){
        BowlingGame bowlingGame =new BowlingGame();
        int result = bowlingGame.calulate("10,10,10,10,10,10,10,10,10,10,10,10,10");
        assertEquals(300,result);
    }

    @Test
    void  should_return_number_when_tenth_rond_strike(){
        BowlingGame bowlingGame =new BowlingGame();
        int result = bowlingGame.calulate("5,3,10,7,3,4,4,10,5,2,4,2,7,2,5,5,10,6,3");
        assertEquals(128,result);
    }

    @Test
    void  should_return_number_when_tenth_rond_spare(){
        BowlingGame bowlingGame =new BowlingGame();
        int result = bowlingGame.calulate("5,3,10,7,3,4,4,10,5,2,4,2,7,2,5,5,7,3,8");
        assertEquals(124,result);
    }

    @Test
    void  should_return_number_when_tenth_rond_neither_strike_nor_spare(){
        BowlingGame bowlingGame =new BowlingGame();
        int result = bowlingGame.calulate("5,3,10,7,3,4,4,10,5,2,4,2,7,2,5,5,4,4");
        assertEquals(111,result);
    }




}
