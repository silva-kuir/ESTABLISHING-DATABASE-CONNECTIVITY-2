package com.swingapp.views;

import javax.swing.*;

public class DashboardScreen extends JFrame {
    public DashboardScreen() {
        setTitle("Dashboard");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Welcome to the Dashboard!"));
        add(panel);
    }
}