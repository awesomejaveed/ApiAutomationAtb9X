package com.javeedshaik.tests.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {

//    create a booking, create a token
//    verify that get booking
//    update the booking
//    delete the booking

    @Test(groups = "qa", priority = 1)
    @Owner("javeed")
    @Description("TC#INT1  - Step 1. Verify That the Booking Can be created")
    public void testCreateBooking(){

        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 2)
    @Owner("javeed")
    @Description("TC#INT1  - Step 2. Verify That the Booking by ID")
    public void testVerifyBookingId(){

        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 3)
    @Owner("javeed")
    @Description("TC#INT1  - Step 3. Verify Updated Booking by ID")
    public void testUpdateBookingByID(){

        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 4)
    @Owner("javeed")
    @Description("TC#INT1  - Step 4. Delete The Booking By ID")
    public void testDeleteBookingByID(){

        Assert.assertTrue(true);
    }





}
