package com.mycompany.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    class User {
        private String name;
        private String lastName;

        public User(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }
    }

    private User getUsers() {
        User user = new User("Eugene", "Ponomarenko");
        return user;
    }

    public void stringsToUser() {
        jsonMakerAndPrinter(getUsers());
    }

    private void jsonMakerAndPrinter(User user) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(user);

        System.out.println(json);
    }
}