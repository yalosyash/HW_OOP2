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

    public Radio() {
    }

    public Radio(int currentRadioStation, int quantityRadioStation, int currentVolume, int maxVolume, int minVolume) {
        this.currentRadioStation = currentRadioStation;
        this.quantityRadioStation = quantityRadioStation;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public int getCurrentRadioStation() {
        return this.currentRadioStation;
    }

    public int getQuantityRadioStation() {
        return this.quantityRadioStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public int getMinVolume() {
        return this.minVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public void setQuantityRadioStation(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCurrentRadioStation() != other.getCurrentRadioStation()) {
                return false;
            } else if (this.getQuantityRadioStation() != other.getQuantityRadioStation()) {
                return false;
            } else if (this.getCurrentVolume() != other.getCurrentVolume()) {
                return false;
            } else if (this.getMaxVolume() != other.getMaxVolume()) {
                return false;
            } else {
                return this.getMinVolume() == other.getMinVolume();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        result = result * 59 + this.getCurrentRadioStation();
        result = result * 59 + this.getQuantityRadioStation();
        result = result * 59 + this.getCurrentVolume();
        result = result * 59 + this.getMaxVolume();
        result = result * 59 + this.getMinVolume();
        return result;
    }

    public String toString() {
        int var10000 = this.getCurrentRadioStation();
        return "Radio(currentRadioStation=" + var10000 + ", quantityRadioStation=" + this.getQuantityRadioStation() + ", currentVolume=" + this.getCurrentVolume() + ", maxVolume=" + this.getMaxVolume() + ", minVolume=" + this.getMinVolume() + ")";
    }

}