package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldIncreaseStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);

        radio.nextStation();

        int expected = 4;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldDecreaseStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);

        radio.prevStation();

        int expected = 2;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetStationCorrectly() {
        Radio radio = new Radio();

        radio.setStation(5);

        int expected = 5;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseStationNumberIf9() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldDecreaseStationNumberIf0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldIncreaseStationNumberIf0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldIncreaseStationNumberIf8() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldDecreaseStationNumberIf1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetStationNumberIfBelow0() {
        Radio radio = new Radio();
        int expected = radio.currentStation;

        radio.setStation(-1);

        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetStationNumberIfAbove9() {
        Radio radio = new Radio();
        int expected = radio.currentStation;

        radio.setStation(10);

        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetStationNumberIf0() {
        Radio radio = new Radio();

        radio.setStation(0);
        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetStationNumberIf9() {
        Radio radio = new Radio();

        radio.setStation(9);
        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseVolumeCorrectly() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreaseVolumeCorrectly() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.decreaseVolume();

        int expected = 4;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotIncreaseVolumeIf10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotDecreaseVolumeIf0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseVolumeIf9() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreaseVolumeIf1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }



}
