package com.example.pruebatecnicabold.interfaces;

import com.example.pruebatecnicabold.model.Location;
import com.example.pruebatecnicabold.model.Weather;

import java.util.ArrayList;
import java.util.List;

public interface WeatherInterfaces {

    interface Interactor {
        void getUserPosts(String woeid, String year, String month, String day);
    }

    interface Presenter{
        void showUserPosts(List<Weather> weathers);
        void getUserPosts(String woeid, String year, String month, String day);
        void showMessage(String message);
    }

    interface View{
        void showUserPosts(List<Weather> weathers);
        void showMessage(String message);
    }

}
