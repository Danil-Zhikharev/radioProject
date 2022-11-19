public class Radio {
    int currentStationNumber;
    int currentVolumeLevel;

    private int maxNumberOfStations = 10;
    private int valueOfMaxStation = maxNumberOfStations - 1;
    private  int valueOfMinStation = 0;

    public Radio() {
        this.maxNumberOfStations = maxNumberOfStations;
        this.valueOfMaxStation = maxNumberOfStations - 1;
    }

    public Radio(int maxNumberOfStations) {
        this.valueOfMaxStation = maxNumberOfStations - 1;
        this.maxNumberOfStations = maxNumberOfStations;
    }

    public int getInfoStations() {
        System.out.println("Минимальный номер станции: " + valueOfMinStation);
        System.out.println("Максимальный номер станции: " + valueOfMaxStation);
        System.out.println("Общее количество станций: " + maxNumberOfStations);
        return valueOfMaxStation;
    }



//    //StationNumber (next|previous)
//    public void setCurrentStationNumber(int newCurrentStationNumber) {
//        if (newCurrentStationNumber > valueOfMaxStation) {
//            newCurrentStationNumber = valueOfMaxStation;
//        }
//        if (newCurrentStationNumber < 0) {
//            newCurrentStationNumber = 0;
//        }
//        currentStationNumber = newCurrentStationNumber;
//    }
//
//    public void toNextStation(int newCurrentStationNumber) {
//        if (currentStationNumber < 9 & currentStationNumber >= 0) {
//            newCurrentStationNumber = currentStationNumber + 1;
//        } else {
//            if (newCurrentStationNumber >= 9) {
//                newCurrentStationNumber = 0;
//            }
//            if (newCurrentStationNumber < 0) {
//                newCurrentStationNumber = 0;
//            }
//        }
//        currentStationNumber = newCurrentStationNumber;
//    }
//
//    public void toPrevStation(int newCurrentStationNumber) {
//        if (currentStationNumber <= 9 & currentStationNumber > 0) {
//            newCurrentStationNumber = currentStationNumber - 1;
//        } else {
//            if (newCurrentStationNumber > 9) {
//                newCurrentStationNumber = 9;
//            }
//            if (newCurrentStationNumber <= 0) {
//                newCurrentStationNumber = 9;
//            }
//        }
//        currentStationNumber = newCurrentStationNumber;
//    }
//
//    //VolumeLevel (next|previous)
//    public int increaseVolume() {
//        if (currentVolumeLevel < 10 & currentVolumeLevel >= 0) {
//            currentVolumeLevel = currentVolumeLevel + 1;
//        } else {
//            if (currentVolumeLevel >= 10) {
//                currentVolumeLevel = 10;
//            }
//            if (currentVolumeLevel < 0) {
//                currentVolumeLevel = 0;
//            }
//        }
//        return currentVolumeLevel;
//    }
//
//    public int decreaseVolume() {
//        if (currentVolumeLevel <= 10 & currentVolumeLevel > 0) {
//            currentVolumeLevel = currentVolumeLevel - 1;
//        } else {
//            if (currentVolumeLevel > 10) {
//                currentVolumeLevel = 10;
//            }
//            if (currentVolumeLevel <= 0) {
//                currentVolumeLevel = 0;
//            }
//        }
//        return currentVolumeLevel;
//    }
}