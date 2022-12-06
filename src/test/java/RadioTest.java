import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //setCurrentStation
    @Test
    public void setCurrentStationAboveNullUnderNine() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(5);

        int expected = 5;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNull() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);

        int expected = 0;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationUnderNull() {
        Radio radio = new Radio();

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
    public void setCurrentStationAboveNine() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(10);

        int expected = 9;
        int actual = radio.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    //toNextStation
    @Test
    public void toNextStationNull() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);
        radio.toNextStation(radio.currentStationNumber);

        int expected = 1;
        int actual = radio.toNextStation(radio.currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toNextStationAboveNine() {
        Radio radio = new Radio();

        radio.toNextStation(radio.setCurrentStationNumber(10));

        int expected = 0;
        int actual = radio.toNextStation(radio.currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toNextStationUnderNull() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(-1);
        radio.toNextStation(radio.currentStationNumber);

        int expected = 1;
        int actual = radio.toNextStation(radio.currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void toNextStationNine() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);
        radio.toNextStation(radio.currentStationNumber);

        int expected = 0;
        int actual = radio.toNextStation(radio.currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toNextStationEight() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(8);
        radio.toNextStation(radio.currentStationNumber);

        int expected = 9;
        int actual = radio.toNextStation(radio.currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toNextStationOne() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(1);
        radio.toNextStation(radio.currentStationNumber);

        int expected = 2;
        int actual = radio.toNextStation(radio.currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }


    //toPrevStation
    @Test
    public void toPrevStationValidRange() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(5);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 4;
        int actual = radio.toPrevStation(radio.currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toPrevStationNine() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 8;
        int actual = radio.toPrevStation(radio.currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toPrevStationAboveNine() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(10);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 8;
        int actual = radio.toPrevStation(radio.currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toPrevStationNull() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 9;
        int actual = radio.toPrevStation(radio.currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void toPrevStationUnderNull() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(-1);
        radio.toPrevStation(radio.currentStationNumber);

        int expected = 9;
        int actual = radio.toPrevStation(radio.currentStationNumber);

        Assertions.assertEquals(expected, actual);
    }

    //VolumeLevel increase
    @Test
    public void increaseVolumeLevelValidRange() {
        Radio radio = new Radio();
        radio.currentVolumeLevel = 5;

        int expected = 6;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLevelTen() {
        Radio radio = new Radio();
        radio.currentVolumeLevel = 10;

        int expected = 10;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLevelAboveTen() {
        Radio radio = new Radio();
        radio.currentVolumeLevel = 11;

        int expected = 10;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUnderNull() {
        Radio radio = new Radio();
        radio.currentVolumeLevel = -1;

        int expected = 0;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    //VolumeLevel decrease
    @Test
    public void decreaseVolumeLevelValidRange() {
        Radio radio = new Radio();
        radio.currentVolumeLevel = 5;

        int expected = 4;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLevelNull() {
        Radio radio = new Radio();
        radio.currentVolumeLevel = 0;

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLevelUnderNull() {
        Radio radio = new Radio();
        radio.currentVolumeLevel = -1;

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLevelAboveTen() {
        Radio radio = new Radio();
        radio.currentVolumeLevel = 11;

        int expected = 10;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
}
