public class Radio {
    int currentStationNumber;
    int currentVolumeLevel;

    //StationNumber (next|previous)
    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > 9) {
            newCurrentStationNumber = 9;
        }
        if (newCurrentStationNumber < 0) {
            newCurrentStationNumber = 0;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void toNextStation(int newCurrentStationNumber) {
        if (currentStationNumber < 9 & currentStationNumber >= 0) {
            newCurrentStationNumber = currentStationNumber + 1;
        } else {
            if (newCurrentStationNumber >= 9) {
                newCurrentStationNumber = 0;
            }
            if (newCurrentStationNumber < 0) {
                newCurrentStationNumber = 0;
            }
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void toPrevStation(int newCurrentStationNumber) {
        if (currentStationNumber <= 9 & currentStationNumber > 0) {
            newCurrentStationNumber = currentStationNumber - 1;
        } else {
            if (newCurrentStationNumber > 9) {
                newCurrentStationNumber = 9;
            }
            if (newCurrentStationNumber <= 0) {
                newCurrentStationNumber = 9;
            }
        }
        currentStationNumber = newCurrentStationNumber;
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