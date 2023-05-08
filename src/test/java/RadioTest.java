import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation2() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation3() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetStation4() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation5() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation6() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation7() {
        Radio radio = new Radio(0,10);

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation2() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation3() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(4);
        radio.next();

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation4() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation2() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation3() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation4() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCustomStation() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(0);
        radio.customStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCustomStation2() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(10);
        radio.customStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCustomStation3() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(8);
        radio.customStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCustomStation4() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(9);
        radio.customStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCustomStation5() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(1);
        radio.customStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCustomStation6() {
        Radio radio = new Radio(0,10);
        radio.setCurrentStation(5);
        radio.customStation();

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

       @Test
    public void shouldSetCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

        @Test
    public void shouldSetCurrentVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetMaxVolume() {
        Radio radio = new Radio();
        radio.getMaxVolume();

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetMinVolume() {
        Radio radio = new Radio();
        radio.getMinVolume();

        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.decreaseVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseCurrentVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }





}