package com.mycompany.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.User;

public class Main {
    private User getUser() {
        return new User("Eugene", "Ponomarenko");
    }

    public void stringsToUser() {
        jsonMakerAndPrinter(getUser());
    }

    private void jsonMakerAndPrinter(User user) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(user);

        System.out.println(json);
    }
}