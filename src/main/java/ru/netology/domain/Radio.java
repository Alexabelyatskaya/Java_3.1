package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int numberOfStation = 10;

    public Radio() {
    }

    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
    }

    // numberOfStation

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public void setNumberOfStation(int numberOfStation) {
        if (numberOfStation < 0) {
            return;
        }
        this.numberOfStation = numberOfStation;
    }

    // currentStation

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > numberOfStation - 1) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void raisingStation() {
        if (currentStation < numberOfStation - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void downgradeStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = numberOfStation - 1;
        }
    }

    // currentVolume

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void raisingVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void downgradeVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}