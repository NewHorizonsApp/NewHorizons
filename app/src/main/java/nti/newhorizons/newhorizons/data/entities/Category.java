package nti.newhorizons.newhorizons.data.entities;

import nti.newhorizons.newhorizons.R;

public class Category {

    private int image;
    private String name;


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category() {
        image = R.drawable.logo_app;
        name = "none vendor";
    }
}
