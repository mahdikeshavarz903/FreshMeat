package com.freshmeat.model;

import android.widget.ImageView;

public class ButcherPermissions
{
    private int butcherPermissionsId;
    private String title;
    private ImageView[] permissionsImage;

    public int getButcherPermissionsId() {
        return butcherPermissionsId;
    }

    public void setButcherPermissionsId(int butcherPermissionsId) {
        this.butcherPermissionsId = butcherPermissionsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageView[] getPermissionsImage() {
        return permissionsImage;
    }

    public void setPermissionsImage(ImageView[] permissionsImage) {
        this.permissionsImage = permissionsImage;
    }
}
