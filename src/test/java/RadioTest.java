import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void getDefaultMaxStation() {
        Radio radio = new Radio();
        Assertions.assertEquals(9, radio.getInfoStations());
    }

    @Test
    public void getCustomMaxStation() {
        Radio radio = new Radio(20);
        Assertions.assertEquals(19, radio.getInfoStations());
    }


    //setCurrentStation
    @Test
    public void setCurrentStationAboveNullUnderNineDefault() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(5);

        int expected = 5;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationAboveMinUnderMax() {
        Radio radio = new Radio(50);

        radio.setCurrentStationNumber(49);

        int expected = 49;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNullDefault() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);

        int expected = 0;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNull() {
        Radio radio = new Radio(61);

        radio.setCurrentStationNumber(0);

        int expected = 0;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationUnderNullDefault() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationUnderNull() {
        Radio radio = new Radio(0);

        radio.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNine() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);

        int expected = 9;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStationMax() {
        Radio radio = new Radio(34);

        radio.setCurrentStationNumber(34);

        int expected = 33;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationAboveNine() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(10);

        int expected = 9;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    //toNextStation
    @Test
    public void toNextStationNullDefault() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);
        radio.toNextStation(radio.currentStationNumber);

        int expected = 1;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void toNextStationNull() {
        Radio radio = new Radio(50);

        radio.setCurrentStationNumber(0);
        radio.toNextStation(radio.currentStationNumber);

        int expected = 1;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toNextStationAboveNineDefault() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(10);
        radio.toNextStation(radio.currentStationNumber);

        int expected = 0;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void toNextStationAboveMax() {
        Radio radio = new Radio(50);

        radio.setCurrentStationNumber(50);
        radio.toNextStation(radio.currentStationNumber);

        int expected = 0;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toNextStationUnderNullDefault() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(-1);
        radio.toNextStation(radio.currentStationNumber);

        int expected = 1;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toNextStationUnderNull() {
        Radio radio = new Radio(50);

        radio.setCurrentStationNumber(-1);
        radio.toNextStation(radio.currentStationNumber);

        int expected = 1;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    //toPrevStation
    @Test
    public void toPrevStationValidRangeDefault() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(5);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 4;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void toPrevStationValidRange() {
        Radio radio = new Radio(50);

        radio.setCurrentStationNumber(47);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 46;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toPrevStationNine() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 8;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void toPrevStationMax() {
        Radio radio = new Radio(66);

        radio.setCurrentStationNumber(66);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 64;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toPrevStationAboveNine() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(10);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 8;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void toPrevStationAboveMax() {
        Radio radio = new Radio(77);

        radio.setCurrentStationNumber(78);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 75;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toPrevStationNullDefault() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 9;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toPrevStationNull() {
        Radio radio = new Radio(83);

        radio.setCurrentStationNumber(0);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 82;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toPrevStationUnderNullDefault() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(-1);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 9;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void toPrevStationUnderNull() {
        Radio radio = new Radio(56);

        radio.setCurrentStationNumber(-1);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 55;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    //VolumeLevel increase
    @Test
    public void increaseVolumeLevelValidRange() {
        Radio radio = new Radio();
        radio.currentVolumeLevel = 5;

        int expected = radio.increaseVolume();
        int actual = radio.currentVolumeLevel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.currentVolumeLevel = 100;

        int expected = radio.increaseVolume();
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    //VolumeLevel decrease
    @Test
    public void decreaseVolumeLevelValidRange() {
        Radio radio = new Radio();
        radio.currentVolumeLevel = 5;

        int expected = radio.decreaseVolume();
        int actual = radio.currentVolumeLevel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLevelNull() {
        Radio radio = new Radio();
        radio.currentVolumeLevel = 0;

        int expected = radio.decreaseVolume();
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
}
