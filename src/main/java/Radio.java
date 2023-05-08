public class Radio {

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;
    private int currentStation;
    private int minStation;
    private int maxStation;

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public Radio(int minStation, int countStation) {
        this.minStation = minStation;
        this.maxStation = minStation + countStation - 1;
    }

    public Radio() {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {

        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {

        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void customStation() {
        int newCurrentStation = getCurrentStation();
        setCurrentStation(newCurrentStation);
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = ++currentVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = --currentVolume;
        }
    }

}
