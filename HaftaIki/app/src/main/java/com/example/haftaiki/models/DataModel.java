package com.example.haftaiki.models;

public class DataModel {
    int Image;
    String Name, Username;

    public DataModel(int Image, String Name, String Username) {
        this.Image = Image;
        this.Name = Name;
        this.Username = Username;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
}
