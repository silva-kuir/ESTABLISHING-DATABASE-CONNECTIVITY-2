package com.swingapp.controllers;

import com.swingapp.models.User;
import com.swingapp.views.AccountCreationScreen;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        new AccountCreationScreen(users).setVisible(true);
    }
}