package net.mojeipdynu;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class MainTest {

    private Main main=new Main();

    @Test
    public void countDigitOneFor13(){

        //when
        int i = main.countDigitOne(13);
        //then
        assertEquals(6,i);


    }
    @Test
    public void countDigitOneFor22(){
        int i = main.countDigitOne(22);
        assertEquals(13,i);
    }

}