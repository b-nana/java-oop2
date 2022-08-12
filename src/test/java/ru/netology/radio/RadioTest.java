package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void shouldIncreaseStationNumberConstructor() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(3);

        radio.nextStation();

        int expected = 4;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);

    }


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

    public void shouldDecreaseStationNumberConstructor() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(3);

        radio.prevStation();

        int expected = 2;
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

    public void shouldSetStationCorrectlyConstructor() {
        Radio radio = new Radio(20);

        radio.setStation(5);

        int expected = 5;
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

    public void shouldIncreaseStationNumberIfMax() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(19);

        radio.nextStation();

        int expected = 0;
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

    public void shouldDecreaseStationNumberIfMin() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = radio.stationCount - 1;
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

    public void shouldIncreaseStationNumberIfMin() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(0);

        radio.nextStation();

        int expected = 1;
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

    public void shouldIncreaseStationNumberIfNotMax() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(radio.stationCount - 2);

        radio.nextStation();

        int expected = 19;
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

    public void shouldDecreaseStationNumberIf1Constructor() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(1);

        radio.prevStation();

        int expected = 0;
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

    public void shouldNotSetStationNumberIfBelow0Constructor() {
        Radio radio = new Radio(20);
        int expected = radio.currentStation;

        radio.setStation(-1);

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

    public void shouldNotSetStationNumberIfAboveMax() {
        Radio radio = new Radio(20);
        int expected = radio.currentStation;

        radio.setStation(20);

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

    public void shouldSetStationNumberIf0Constructor() {
        Radio radio = new Radio(20);

        radio.setStation(0);
        int expected = 0;
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

    public void shouldSetStationNumberIfMax() {
        Radio radio = new Radio(20);

        radio.setStation(19);
        int expected = 19;
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

        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreaseVolumeCorrectly() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotIncreaseVolumeIfMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.maxVolume);
        radio.increaseVolume();

        int expected = radio.maxVolume;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotDecreaseVolumeIfMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.minVolume);
        radio.decreaseVolume();

        int expected = radio.minVolume;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseVolumeIfNotMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.maxVolume - 1);
        radio.increaseVolume();

        int expected = radio.maxVolume;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreaseVolumeIfNotMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.minVolume + 1);
        radio.decreaseVolume();

        int expected = radio.minVolume;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }



}
