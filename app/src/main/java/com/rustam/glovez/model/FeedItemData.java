package com.rustam.glovez.model;

/**
 * Created by Rustam on 2/7/2016.
 */
public class FeedItemData {
    private String login;
    private int avatar;
    private int photo;

    public FeedItemData(String login, int avatar, int photo) {
        this.login = login;
        this.avatar = avatar;
        this.photo = photo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
