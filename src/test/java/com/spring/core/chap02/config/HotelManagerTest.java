package com.spring.core.chap02.config;

import com.spring.core.chap02.Hotel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelManagerTest {

    @Test
    void diTest() {

        HotelManager manager = new HotelManager();
        Hotel hotel = manager.hotel();
        hotel.inform();

    }

}