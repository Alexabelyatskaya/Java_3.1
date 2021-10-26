package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    private final Radio radio = new Radio();

        // setCurrentStation

        @Test
        public void shouldSetCurrentStation() {
            radio.setCurrentStation(4);
            int expected = 4;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetCurrentStationUnderMin() {
            radio.setCurrentStation(-3);
            int expected = 0;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetCurrentStationMoreMax() {
            radio.setCurrentStation(19);
            int expected = 0;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        // setCurrentVolume

        @Test
        public void shouldSetCurrentVolume() {
            radio.setCurrentVolume(4);
            int expected = 4;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetCurrentVolumeUnderMin() {
            radio.setCurrentVolume(-1);
            int expected = 0;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldSetCurrentVolumeMoreMax() {
            radio.setCurrentVolume(11);
            int expected = 0;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        // raisingStation

        @Test
        public void shouldRaisingStation() {
            radio.setCurrentStation(3);
            radio.raisingStation();
            int expected = 4;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldRaisingStationMax() {
            radio.setCurrentStation(9);
            radio.raisingStation();
            int expected = 0;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        // downgradeStation

        @Test
        public void shouldDowngradeStation() {
            radio.setCurrentStation(3);
            radio.downgradeStation();
            int expected = 2;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldDowngradeStationMin() {
            radio.setCurrentStation(0);
            radio.downgradeStation();
            int expected = 9;
            int actual = radio.getCurrentStation();
            assertEquals(expected, actual);
        }

        // raisingVolume

        @Test
        public void shouldRaisingVolume() {
            radio.setCurrentVolume(5);
            radio.raisingVolume();
            int expected = 6;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldRaisingVolumeMax() {
            radio.setCurrentVolume(10);
            radio.raisingVolume();
            int expected = 10;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        // downgradeVolume

        @Test
        public void shouldDowngradeVolumeVolume() {
            radio.setCurrentVolume(8);
            radio.downgradeVolume();
            int expected = 7;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }

        @Test
        public void shouldDowngradeVolumeVolumeMin() {
            radio.setCurrentVolume(0);
            radio.downgradeVolume();
            int expected = 0;
            int actual = radio.getCurrentVolume();
            assertEquals(expected, actual);
        }
}