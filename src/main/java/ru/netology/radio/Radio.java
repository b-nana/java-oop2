package ru.netology.radio;

public class Radio {

    public int currentStation;
    public int currentVolume;

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setStation(int stationNum) {
        if (stationNum > 9) {
            return;
        }
        if (stationNum < 0) {
            return;
        }
        currentStation = stationNum;
    }



    }





