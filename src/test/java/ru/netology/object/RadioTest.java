package ru.netology.object;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void setNumberRadio() {
        Radio radio = new Radio();
        int expect = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void setNewNumberRadio() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        int expect = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void setMaxNumberRadio() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        int expect = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void setOverMaxNumberRadio() {
        Radio radio = new Radio();
        radio.setRadioStation(10);
        int expect = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void setMinNumberRadio() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        int expect = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void setUnderMinNumberRadio() {
        Radio radio = new Radio();
        radio.setRadioStation(-1);
        int expect = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void nextNumberRadioIfMax() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.next();
        int expect = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void nextNumberRadio() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        radio.next();
        int expect = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void prevNumberRadioIfMin() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.prev();
        int expect = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void prevNumberRadio() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        radio.prev();
        int expect = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void getCurrentVolume() {
        Radio radio = new Radio();
        radio.volumeUp();
        int expect = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void volumeUp() {
        Radio radio = new Radio();
        radio.volumeUp();
        int expect = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void volumeDown() {
        Radio radio = new Radio();
        radio.volumeUp();
        radio.volumeUp();
        radio.volumeDown();

        int expect = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void volumeUpIfMax() {
        Radio radio = new Radio();
        for (int i = 0; i <= 100; i++) {
            radio.volumeUp();
        }
        int expect = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }

    @Test
    void volumeDownIfMin() {
        Radio radio = new Radio();
        radio.volumeDown();

        int expect = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expect, actual);
    }
}