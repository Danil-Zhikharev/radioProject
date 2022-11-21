public class Radio {
    int currentStationNumber;
    int currentVolumeLevel = 50;
    private int maxVolumeLevel = 100;
    private int maxNumberOfStations = 10;
    private int valueOfMaxStation = maxNumberOfStations - 1;
    private int valueOfMinStation = 0;
    private int minVolumeLevel = valueOfMinStation;


    public Radio() {
        this.maxNumberOfStations = maxNumberOfStations;
        this.valueOfMaxStation = maxNumberOfStations - 1;
    }

    public int getInfoStations() {
        return valueOfMaxStation;
    }

    public Radio(int maxNumberOfStations) {
        this.valueOfMaxStation = maxNumberOfStations - 1;
        this.maxNumberOfStations = maxNumberOfStations;
    }

    //StationNumber (set|next|previous)
    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > valueOfMaxStation) {
            newCurrentStationNumber = valueOfMaxStation;
        }
        if (newCurrentStationNumber < valueOfMinStation) {
            newCurrentStationNumber = valueOfMinStation;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void toNextStation(int newCurrentStationNumber) {
        if (currentStationNumber < valueOfMaxStation & currentStationNumber >= valueOfMinStation) {
            newCurrentStationNumber = currentStationNumber + 1;
        }
        if (newCurrentStationNumber >= valueOfMaxStation) {
            newCurrentStationNumber = valueOfMinStation;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void toPrevStation(int newCurrentStationNumber) {
        if (currentStationNumber <= valueOfMaxStation & currentStationNumber > valueOfMinStation) {
            newCurrentStationNumber = currentStationNumber - 1;
        }
        if (newCurrentStationNumber <= valueOfMinStation) {
            newCurrentStationNumber = valueOfMaxStation;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    //VolumeLevel (next|previous)
    public int increaseVolume() {
        if (currentVolumeLevel < maxVolumeLevel & currentVolumeLevel >= minVolumeLevel) {
            currentVolumeLevel = currentVolumeLevel + 1;
        }
        if (currentVolumeLevel >= maxVolumeLevel) {
            currentVolumeLevel = maxVolumeLevel;
        }
        return currentVolumeLevel;
    }

    public int decreaseVolume() {
        if (currentVolumeLevel <= maxVolumeLevel & currentVolumeLevel > minVolumeLevel) {
            currentVolumeLevel = currentVolumeLevel - 1;
        }
        if (currentVolumeLevel <= minVolumeLevel) {
            currentVolumeLevel = minVolumeLevel;
        }
        return currentVolumeLevel;
    }
}