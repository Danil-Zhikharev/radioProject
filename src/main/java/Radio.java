public class Radio {
    int currentStationNumber;
    int currentVolumeLevel;

    //StationNumber (setter|next|previous)
    public int setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > 9) {
            newCurrentStationNumber = 9;
        }
        if (newCurrentStationNumber < 0) {
            newCurrentStationNumber = 0;
        }
        currentStationNumber = newCurrentStationNumber;
        return currentStationNumber;
    }

    public int toNextStation(int currentStationNumber) {
        if (currentStationNumber < 9) {
            currentStationNumber = currentStationNumber + 1;
        } else {
            currentStationNumber = 0;
        }
        return currentStationNumber;
    }

    public int toPrevStation(int currentStationNumber) {
        if (currentStationNumber > 0) {
            currentStationNumber = currentStationNumber - 1;
        } else {
            currentStationNumber = 9;
        }
        return currentStationNumber;
    }

    //VolumeLevel (next|previous)
    public int increaseVolume() {
        if (currentVolumeLevel < 10 & currentVolumeLevel >= 0) {
            currentVolumeLevel = currentVolumeLevel + 1;
        } else {
            if (currentVolumeLevel >= 10) {
                currentVolumeLevel = 10;
            }
            if (currentVolumeLevel < 0) {
                currentVolumeLevel = 0;
            }
        }
        return currentVolumeLevel;
    }

    public int decreaseVolume() {
        if (currentVolumeLevel <= 10 & currentVolumeLevel > 0) {
            currentVolumeLevel = currentVolumeLevel - 1;
        } else {
            if (currentVolumeLevel > 10) {
                currentVolumeLevel = 10;
            }
            if (currentVolumeLevel <= 0) {
                currentVolumeLevel = 0;
            }
        }
        return currentVolumeLevel;
    }
}