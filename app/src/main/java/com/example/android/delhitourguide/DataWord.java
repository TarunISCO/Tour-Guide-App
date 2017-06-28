package com.example.android.delhitourguide;

public class DataWord {

    /*
    mName can be the name of the hospitals, Metro station name, hotels, etc.
     */
    private String mName;

    /*
    mLocation is the name of the place where the particular hospital, metro station is.
     */
    private String mLocation;

    /*
    mImageResourceId is the resource id of the Image assets.
    Default it is set to -1 (No image).
     */
    private int mImageResourceId = NO_IMAGE_RESOURCE;

    /*
    NO_IMAGE_RESOURCE constant for image,
    If their will be no image then mImageResourceId will be set to this.
     */
    private static final int NO_IMAGE_RESOURCE = -1;

    /**
     * DataWord constructor, this constructor with 2 parameters will be called when there will be no
     * image to place in the list.
     *
     * @param name
     * @param location
     */
    public DataWord(String name, String location) {
        mName = name;
        mLocation = location;
    }

    /**
     * This constructor with 3 parameters will be called when there will be an image.
     *
     * @param name
     * @param location
     * @param imageResourceId
     */
    public DataWord(String name, String location, int imageResourceId) {
        mName = name;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    /**
     * getName() function is used to get the Name of the place, hospital etc.
     *
     * @return mName
     */
    public String getName() {
        return mName;
    }

    /**
     * getLocation() function is used to get the location of the place,hospitals etc.
     *
     * @return mLocation
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * getImageResourceId() function is used to get the Image Resource.
     *
     * @return mImageResourceId
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @return boolean value
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_RESOURCE;
    }


}
