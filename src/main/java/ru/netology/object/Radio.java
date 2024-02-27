package ru.netology.object;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setRadioStation(int newNumberCurrentRadio) {
        if (newNumberCurrentRadio < 0 || newNumberCurrentRadio > 9) {
            return;
        } currentRadioStation = newNumberCurrentRadio;
    }

    public void next() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void volumeUp() {
        if (currentVolume == 100) {
            return;
        } currentVolume++;
    }

    public void volumeDown() {
        if (currentVolume == 0) {
            return;
        } currentVolume--;
    }
}