public class Radio {
    private int currentVolume;
    private int currentStation;
    private int countStation = 10;

    public Radio(int countStation) {

        this.countStation = countStation;
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
            currentStation = countStation - 1;
        }
        if (currentStation > countStation - 1) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation < countStation - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = countStation - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = ++currentVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = --currentVolume;
        }
    }

}
