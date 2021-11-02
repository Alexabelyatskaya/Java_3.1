package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    // with argument

        // setNumberOfStation

        @Test
        public void shouldSetNumberOfStation() {
            Radio radio = new Radio();
            radio.setNumberOfStation(4);
            int expected = 4;
            int actual = radio.getNumberOfStation();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetNumberOfStationUnderMin() {
            Radio radio = new Radio();
            radio.setNumberOfStation(-1);
            int expected = 10;
            int actual = radio.getNumberOfStation();
            assertEquals(expected, actual);
        }

        // setCurrentStation

        @Test
        public void shouldSetCurrentStation() {
            Radio radio = new Radio();
            radio.setCurrentStation(4);
            int expected = 4;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetCurrentStationUnderMin() {
            Radio radio = new Radio();
            radio.setCurrentStation(-3);
            int expected = 0;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetCurrentStationMoreMax() {
            Radio radio = new Radio();
            radio.setCurrentStation(19);
            int expected = 0;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        // raisingStation

        @Test
        public void shouldRaisingStation() {
            Radio radio = new Radio();
            radio.setCurrentStation(3);
            radio.raisingStation();
            int expected = 4;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldRaisingStationMax() {
            Radio radio = new Radio();
            radio.setCurrentStation(9);
            radio.raisingStation();
            int expected = 0;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        // downgradeStation

        @Test
        public void shouldDowngradeStation() {
            Radio radio = new Radio();
            radio.setCurrentStation(3);
            radio.downgradeStation();
            int expected = 2;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldDowngradeStationMin() {
            Radio radio = new Radio();
            radio.setCurrentStation(0);
            radio.downgradeStation();
            int expected = 9;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        // setCurrentVolume

        @Test
        public void shouldSetCurrentVolume() {
            Radio radio = new Radio();
            radio.setCurrentVolume(4);
            int expected = 4;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetCurrentVolumeUnderMin() {
            Radio radio = new Radio();
            radio.setCurrentVolume(-1);
            int expected = 0;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetCurrentVolumeMoreMax() {
            Radio radio = new Radio();
            radio.setCurrentVolume(101);
            int expected = 0;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        // raisingVolume

        @Test
        public void shouldRaisingVolume() {
            Radio radio = new Radio();
            radio.setCurrentVolume(5);
            radio.raisingVolume();
            int expected = 6;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldRaisingVolumeMax() {
            Radio radio = new Radio();
            radio.setCurrentVolume(100);
            radio.raisingVolume();
            int expected = 100;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        // downgradeVolume

        @Test
        public void shouldDowngradeVolume() {
            Radio radio = new Radio();
            radio.setCurrentVolume(8);
            radio.downgradeVolume();
            int expected = 7;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldDowngradeVolumeMin() {
            Radio radio = new Radio();
            radio.setCurrentVolume(0);
            radio.downgradeVolume();
            int expected = 0;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }



    // with argument

        // setNumberOfStation

        @Test
        public void shouldSetNumberOfStationWithArg() {
            Radio radio = new Radio(15);
            radio.setNumberOfStation(4);
            int expected = 4;
            int actual = radio.getNumberOfStation();
            assertEquals(expected, actual);
        }

        // setCurrentStation

        @Test
        public void shouldSetCurrentStationWithArg() {
            Radio radio = new Radio(15);
            radio.setCurrentStation(4);
            int expected = 4;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetCurrentStationMoreMaxWithArg() {
            Radio radio = new Radio(15);
            radio.setCurrentStation(15);
            int expected = 0;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        // raisingStation

        @Test
        public void shouldRaisingStationWithArg() {
            Radio radio = new Radio(15);
            radio.setCurrentStation(3);
            radio.raisingStation();
            int expected = 4;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldRaisingStationMaxWithArg() {
            Radio radio = new Radio(15);
            radio.setCurrentStation(14);
            radio.raisingStation();
            int expected = 0;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        // downgradeStation

        @Test
        public void shouldDowngradeStationWithArg() {
            Radio radio = new Radio(15);
            radio.setCurrentStation(3);
            radio.downgradeStation();
            int expected = 2;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldDowngradeStationMinWithArg() {
            Radio radio = new Radio(15);
            radio.setCurrentStation(0);
            radio.downgradeStation();
            int expected = 14;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        // setCurrentVolume

        @Test
        public void shouldSetCurrentVolumeWithArg() {
            Radio radio = new Radio(15);
            radio.setCurrentVolume(4);
            int expected = 4;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetCurrentVolumeUnderMinWithArg() {
            Radio radio = new Radio(15);
            radio.setCurrentVolume(-1);
            int expected = 0;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetCurrentVolumeMoreMaxWithArg() {
            Radio radio = new Radio(15);
            radio.setCurrentVolume(101);
            int expected = 0;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        // raisingVolume

        @Test
        public void shouldRaisingVolumeWithArg() {
            Radio radio = new Radio(15);
            radio.setCurrentVolume(5);
            radio.raisingVolume();
            int expected = 6;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldRaisingVolumeMaxWithArg() {
            Radio radio = new Radio(15);
            radio.setCurrentVolume(100);
            radio.raisingVolume();
            int expected = 100;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        // downgradeVolume

        @Test
        public void shouldDowngradeVolumeWithArg() {
            Radio radio = new Radio(15);
            radio.setCurrentVolume(8);
            radio.downgradeVolume();
            int expected = 7;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldDowngradeVolumeMinWithArg() {
            Radio radio = new Radio(15);
            radio.setCurrentVolume(0);
            radio.downgradeVolume();
            int expected = 0;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }
}