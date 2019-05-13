package igallery.igallery.model;

import android.os.Parcel;

import java.util.ArrayList;


public class Model_videos {

    ArrayList<Boolean> al_video_checked = new ArrayList();
    ArrayList<String> al_videopath;
    ArrayList<Float> al_videopath_rotation;
    ArrayList<String> video_date;
    String str_folder;

    public ArrayList<Boolean> al_video_checked() {
        return this.al_video_checked;
    }

    public void setAl_video_checked(ArrayList<Boolean> al_video_checked) {
        this.al_video_checked = al_video_checked;
    }

    public String getStr_folder() {
        return str_folder;
    }

    public void setStr_folder(String str_folder) {
        this.str_folder = str_folder;
    }

    public ArrayList<String> getAl_videopath() {
        return al_videopath;
    }

    public void setAl_videopath(ArrayList<String> al_videopath) {
        this.al_videopath = al_videopath;
    }

    public ArrayList<Float> getAl_videopath_rotation() {
        return this.al_videopath_rotation;
    }

    public void setAl_videopath_rotation(ArrayList<Float> al_videopath_rotation) {
        this.al_videopath_rotation = al_videopath_rotation;
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

    public ArrayList<String> getVideo_date() {
        return this.video_date;
    }

    public void setVideo_date(ArrayList<String> video_date) {
        this.video_date = video_date;
    }

}
