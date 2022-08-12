package ru.netology.radio;

public class Radio {

    public int currentStation;
    public int currentVolume;
    public int stationCount;
    public int maxVolume = 100;
    public int minVolume = 0;

    public Radio (int stationCount) {
        this.stationCount = stationCount;
    }

    public Radio () {
        this.stationCount = 10;
    }

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentStation == stationCount - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = stationCount - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setStation(int stationNum) {
        if (stationNum > stationCount - 1) {
            return;
        }
        if (stationNum < 0) {
            return;
        }
        currentStation = stationNum;
    }



    }





