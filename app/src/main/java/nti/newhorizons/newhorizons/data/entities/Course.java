package nti.newhorizons.newhorizons.data.entities;

import nti.newhorizons.newhorizons.R;

public class Course {
    private int Id;
    private String Name;
    private String Code;
    private String Category;
    private String Description;
    private String Outline;
    private int Hours;
    private int Cost;
    private float Disc;
    private int image;

    public Course() {
        Name="none";
        Code="none";
        Category="none";
        Description="none";
        Outline="none";
        Hours=0;
        Cost=0;
        Disc=0;
        image=R.drawable.logo_app;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getOutline() {
        return Outline;
    }

    public void setOutline(String outline) {
        Outline = outline;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int hours) {
        Hours = hours;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    public float getDisc() {
        return Disc;
    }

    public void setDisc(float disc) {
        Disc = disc;
    }
}
