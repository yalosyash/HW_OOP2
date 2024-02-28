package ru.netology.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentRadioStation;
    private int quantityRadioStation = 10;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public void setRadioStation(int newNumberCurrentRadio) {
        if (newNumberCurrentRadio < 0 || newNumberCurrentRadio >= quantityRadioStation) {
            return;
        } currentRadioStation = newNumberCurrentRadio;
    }

    public void next() {
        if (currentRadioStation == quantityRadioStation - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = quantityRadioStation - 1;
        } else {
            currentRadioStation--;
        }
    }

    public void volumeUp() {
        if (currentVolume == maxVolume) {
            return;
        } currentVolume++;
    }

    public void volumeDown() {
        if (currentVolume == minVolume) {
            return;
        } currentVolume--;
    }
}