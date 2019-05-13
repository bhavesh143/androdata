package igallery.igallery.model;

import android.os.Parcel;

import java.util.ArrayList;



public class Model_images {

    ArrayList<Boolean> al_image_checked = new ArrayList();
    ArrayList<String> al_imagepath;
    ArrayList<Float> al_imagepath_rotation;
    ArrayList<String> image_date;
    String str_folder;

    public ArrayList<Boolean> getAl_image_checked() {
        return this.al_image_checked;
    }

    public void setAl_image_checked(ArrayList<Boolean> al_image_checked) {
        this.al_image_checked = al_image_checked;
    }

    public String getStr_folder() {
        return str_folder;
    }

    public void setStr_folder(String str_folder) {
        this.str_folder = str_folder;
    }

    public ArrayList<String> getAl_imagepath() {
        return al_imagepath;
    }

    public void setAl_imagepath(ArrayList<String> al_imagepath) {
        this.al_imagepath = al_imagepath;
    }

    public ArrayList<Float> getAl_imagepath_rotation() {
        return this.al_imagepath_rotation;
    }

    public void setAl_imagepath_rotation(ArrayList<Float> al_imagepath_rotation) {
        this.al_imagepath_rotation = al_imagepath_rotation;
    }

    public int getColumnSpan() {
        return 1;
    }

    public int getRowSpan() {
        return 1;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public ArrayList<String> getImage_date() {
        return this.image_date;
    }

    public void setImage_date(ArrayList<String> image_date) {
        this.image_date = image_date;
    }

}
